package com.redeSocialSpring.controller;

import com.redeSocialSpring.model.Friendship;
import com.redeSocialSpring.service.FriendshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friendship")
public class FriendshipController {

	@Autowired
	private FriendshipService friendshipService;

	@PostMapping("/add")
	public ResponseEntity<Friendship> addFriend(@RequestBody Friendship friendship) {
		return ResponseEntity.ok(friendshipService.addFriend(friendship));
	}

	@GetMapping("/{userId}")
	public ResponseEntity<List<Friendship>> getAllFriendsByUserId(@PathVariable Integer userId) {
		return ResponseEntity.ok(friendshipService.getAllFriendsByUserId(userId));
	}

	@DeleteMapping("/remove/{friendshipId}")
	public ResponseEntity<Void> removeFriend(@PathVariable Integer friendshipId) {
		friendshipService.removeFriend(friendshipId);
		return ResponseEntity.ok().build();
	}
}
