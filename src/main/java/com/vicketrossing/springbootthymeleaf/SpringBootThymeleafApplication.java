package com.vicketrossing.springbootthymeleaf;

import com.vicketrossing.springbootthymeleaf.store.StoreRepository;
import com.vicketrossing.springbootthymeleaf.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = StoreRepository.class)

public class SpringBootThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafApplication.class, args);
    }

}
