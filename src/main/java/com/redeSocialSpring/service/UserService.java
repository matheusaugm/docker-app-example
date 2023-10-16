package com.redeSocialSpring.service;

import com.redeSocialSpring.model.User;
import com.redeSocialSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User registerUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmail(email).filter(u -> u.getPassword().equals(password));
	}

	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
}
