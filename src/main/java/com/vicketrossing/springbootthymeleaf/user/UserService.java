package com.vicketrossing.springbootthymeleaf.user;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;



    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return  userRepository.findAll();
    }

    public void save(User user){
        userRepository.save(user);
    }


    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }



    public User findUser(Long id){
       return userRepository.getById(id);
    }

    public void addNewUser(User user){
        Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("User with email " + user.getEmail() + " already exist.");
        }

        User newUser = new User();
        BeanUtils.copyProperties(user, newUser);
        userRepository.save(user);
    }

}
