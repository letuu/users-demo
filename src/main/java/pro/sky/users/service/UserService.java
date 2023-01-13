package pro.sky.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.users.entity.User;
import pro.sky.users.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    public List<User> getUsersByName(String name) {
        return userRepository.getUsersByName(name);
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }
}
