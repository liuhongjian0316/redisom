package work.aijiu.redisom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import work.aijiu.redisom.common.CommonResult;
import work.aijiu.redisom.entry.Product;
import work.aijiu.redisom.mapper.ProductRepository;
import work.aijiu.redisom.utils.LocalJsonUtil;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/import")
    public CommonResult importList() {
        productRepository.deleteAll();
        List<Product> productList = LocalJsonUtil.getListFromJson("json/product.json", Product.class);
        for (Product product : productList) {
            productRepository.save(product);
        }
        return CommonResult.ok(null);
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody Product entity) {
        productRepository.save(entity);
        return CommonResult.ok(null);
    }

    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        productRepository.deleteById(id);
        return CommonResult.ok(null);
    }

    @GetMapping("/detail/{id}")
    public CommonResult detail(@PathVariable Long id) {
        Optional<Product> result = productRepository.findById(id);
        return CommonResult.ok(result.orElse(null));
    }

    @GetMapping("/page")
    public CommonResult page(@RequestParam(defaultValue = "1") Integer pageNum,
                                            @RequestParam(defaultValue = "5") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        Page<Product> pageResult = productRepository.findAll(pageable);
        return CommonResult.ok(pageResult.getContent());
    }

    @GetMapping("/get/{name}")
    public CommonResult getByName(@PathVariable String name){
        List<Product> list = productRepository.findByName(name);
        return CommonResult.ok(list);
    }


}
