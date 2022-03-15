package work.aijiu.redisom.mapper;

import com.redis.om.spring.repository.RedisDocumentRepository;
import work.aijiu.redisom.entry.Product;

/**
 * 商品管理Repository
 * Created by macro on 2022/3/1.
 */
public interface ProductRepository extends RedisDocumentRepository<Product, Long> {
}
