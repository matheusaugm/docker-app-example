package com.redeSocialSpring.repository;

import com.redeSocialSpring.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
	List<Message> findByReceiverId(Integer receiverId);
}