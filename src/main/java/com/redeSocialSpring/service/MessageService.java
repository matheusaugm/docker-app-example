package com.redeSocialSpring.service;

import com.redeSocialSpring.model.Message;
import com.redeSocialSpring.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	public Message sendMessage(Message message) {
		return messageRepository.save(message);
	}

	public List<Message> getMessagesByReceiverId(Integer receiverId) {
		return messageRepository.findByReceiverId(receiverId);
	}

	public void deleteMessage(Integer id) {
		messageRepository.deleteById(id);
	}
}
