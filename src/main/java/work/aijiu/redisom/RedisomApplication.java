package work.aijiu.redisom;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import com.redis.om.spring.annotations.EnableRedisEnhancedRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedisEnhancedRepositories(basePackages = "work.aijiu.redisom.*")
@EnableRedisDocumentRepositories(basePackages = "work.aijiu.redisom.*")
public class RedisomApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisomApplication.class, args);
    }

}
