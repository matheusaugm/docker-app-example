package com.redeSocialSpring.controller;

import com.redeSocialSpring.model.User;
import com.redeSocialSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.registerUser(user));
	}

	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestParam String email, @RequestParam String password) {
		Optional<User> userOptional = userService.findByEmailAndPassword(email, password);
		return userOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.findAll());
	}
}
