package work.aijiu.redisom;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedisDocumentRepositories(basePackages = "work.aijiu.redisom.*")
public class RedisomApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisomApplication.class, args);
    }

}
