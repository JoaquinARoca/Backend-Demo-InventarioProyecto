package com.example.main.service;
import com.example.main.model.User;
import com.example.main.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public User createUsuario(User user){//Create User
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setDeleted(false);
        return userRepository.save(user);
    }
        
    public List<User> getAllUsers(){//Read all valid users
        return userRepository.findByDeletedFalse();
    }

    public User getUserById(Long id){//Read specific user by his id
        return userRepository.findByIdAndDeletedFalse(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(Long id, User updatedUser){//Updates an user specified by the id parameter, and new parameters
        User user = getUserById(id);
        user.setPassword(updatedUser.getPassword());
        user.setUsername(updatedUser.getUsername());
        user.setRole(updatedUser.getRole());
        return userRepository.save(user);
    }

    public void deleteUser(Long id){//"Deletes" the user
        User user = getUserById(id);
        user.setDeleted(true);
        userRepository.save(user);
    }
}
