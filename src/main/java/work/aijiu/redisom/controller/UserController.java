package work.aijiu.redisom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import work.aijiu.redisom.entry.User;
import work.aijiu.redisom.mapper.UserRepository;

import java.util.Optional;

/**
 * @author Tiger
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/name/{lastName}")
    Optional<User> byName(@PathVariable("lastName") String lastName) {
        return userRepository.findOneByName(lastName);
    }

    @GetMapping("/exists")
    boolean isEmailTaken(@RequestParam("name") String name) {
        return userRepository.existsByName(name);
    }

}
