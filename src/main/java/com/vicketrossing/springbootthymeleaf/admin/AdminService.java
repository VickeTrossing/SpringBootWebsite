package com.vicketrossing.springbootthymeleaf.admin;

import com.vicketrossing.springbootthymeleaf.user.User;
import com.vicketrossing.springbootthymeleaf.user.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final UserRepository userRepository;

    public AdminService(AdminRepository adminRepository, UserRepository userRepository) {
        this.adminRepository = adminRepository;
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

    public void saveUser(User user){
        this.userRepository.save(user);
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

    private void encodePassword(User user){}


}
