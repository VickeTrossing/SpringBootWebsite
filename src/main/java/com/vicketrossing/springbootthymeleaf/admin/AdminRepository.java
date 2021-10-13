package com.vicketrossing.springbootthymeleaf.admin;

import com.vicketrossing.springbootthymeleaf.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<User, Long> {
}
