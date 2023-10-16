package com.redeSocialSpring.repository;

import com.redeSocialSpring.model.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FriendshipRepository extends JpaRepository<Friendship, Integer> {
	@Query("SELECT f FROM Friendship f WHERE f.user.id = :userId OR f.friend.id = :userId")
	List<Friendship> findAllByUserId(@Param("userId") Integer userId);
}
