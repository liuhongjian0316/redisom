package work.aijiu.redisom.entry;


import com.redis.om.spring.annotations.Indexed;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@RedisHash
@Data
public class User {

    @Id
    private String id;

    @Indexed
    @NonNull
    private String name;
}
