package work.aijiu.redisom.mapper;

import com.redis.om.spring.repository.RedisDocumentRepository;
import work.aijiu.redisom.entry.Product;

import java.util.List;

/**
 * 商品管理Repository
 * Created by macro on 2022/3/1.
 */
public interface ProductRepository extends RedisDocumentRepository<Product, Long> {


    /**
     * 根据商品名称查询
     * @param name
     * @return
     */
    List<Product> findByName(String name);
    
    
    
}
