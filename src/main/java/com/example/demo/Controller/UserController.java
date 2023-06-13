package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/user")
	public ResponseEntity<?> createCountry(@RequestBody User user) {
		userService.addUser(user);	
		return ResponseEntity.ok(user);		
	}
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        // Validation and business logic for login
        try {
            boolean isAuthenticated = userService.login(user);
            if (isAuthenticated) {
                // Successful login
                return ResponseEntity.ok(user);
            }
                else {
                // Invalid credentials
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(user);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(user);
        }
    }
    @GetMapping("/users") 
	public User getUser(@RequestBody User user) {
		User user1= userService.findUserByName(user.getName());
		return user1;
	}
    

}
