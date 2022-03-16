package work.aijiu.redisom.mapper;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import work.aijiu.redisom.entry.User;

import java.util.List;
import java.util.Optional;

public interface  UserRepository extends CrudRepository<User, String> {

    Optional<User> findOneByName(String name);

    boolean existsByName(String name);

}
