package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}
	public boolean login(User user) {
        // Perform validation and business logic for login
        // Example: Check if the user exists in the database and if the credentials are valid
        User existingUser = userRepository.findByName(user.getName());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return true; // User is authenticated
        }
        return false; // Invalid credentials
    }
	
	public User findUserByName(String name) {
		User result = userRepository.findByName(name);
		return result;
	}
	
}
