package org.denguetrace.user.domain;

import org.denguetrace.user.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {return userRepository.findAll();}

    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
    }

    public void createUser(User newUser) {
        if (userRepository.existsById(newUser.getId())) {
            throw new IllegalArgumentException("User with id " + newUser.getId() + " already exists");
        }
        userRepository.save(newUser);
    }
}
