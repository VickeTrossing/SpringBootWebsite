package com.vicketrossing.springbootthymeleaf.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT s FROM User s where s.email =  ?1")
    Optional <User> findByEmail(String email);


}
