package com.example.online_bookstore.service;
import com.example.online_bookstore.model.User;
import com.example.online_bookstore.repository.UserRepository;
import com.example.online_bookstore.dto.RegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    @Transactional
    public boolean registerUser(RegistrationDto registrationDto) {
        try {
            // Check if username or email already exists
            if (userRepository.existsByUsername(registrationDto.getUsername()) ||
                userRepository.existsByEmail(registrationDto.getEmail())) {
                return false;
            }
            
            // Create new user
            User user = new User();
            user.setUsername(registrationDto.getUsername());
            user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
            user.setEmail(registrationDto.getEmail());
            user.setFullName(registrationDto.getFullName());
            user.setRole(UserRole.USER);
            user.setActive(true);
            
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            // Log the error
            e.printStackTrace();
            return false;
        }
    }
}