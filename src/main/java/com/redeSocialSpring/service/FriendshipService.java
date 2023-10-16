package com.redeSocialSpring.service;

import com.redeSocialSpring.model.Friendship;
import com.redeSocialSpring.repository.FriendshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendshipService {

	@Autowired
	private FriendshipRepository friendshipRepository;

	public Friendship addFriend(Friendship friendship) {
		return friendshipRepository.save(friendship);
	}

	public List<Friendship> getAllFriendsByUserId(Integer userId) {
		return friendshipRepository.findAllByUserId(userId);
	}

	public void removeFriend(Integer friendshipId) {
		friendshipRepository.deleteById(friendshipId);
	}
}
