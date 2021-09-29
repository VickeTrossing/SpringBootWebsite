package com.vicketrossing.springbootthymeleaf;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    //@Autowired private UserRepository userRepository;


    /*@Autowired
    private UserRepository repository;

    public UserRepositoryTest(UserRepository repository) {
        this.repository = repository;
    }


    @Test
    public void test(){
        User user = new User();
        user.setEmail("test.email@email.com");
        user.setPassword("test123");
        user.setFistName("Test");
        user.setLastName("Testson");

       User savedUser = repository.save(user);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }*/
}
