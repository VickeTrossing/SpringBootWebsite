package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    //@Autowired private UserRepository repo;


    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> listAll(){
        return  userRepository.findAll();
    }



    public void addNewUser(User user){
        Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("User with email " + user.getEmail() + " already exist.");
        }
        userRepository.save(user);
    }
}
