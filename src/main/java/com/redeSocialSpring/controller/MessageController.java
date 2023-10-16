package com.redeSocialSpring.controller;

import com.redeSocialSpring.model.Message;
import com.redeSocialSpring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@PostMapping("/send")
	public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
		return ResponseEntity.ok(messageService.sendMessage(message));
	}

	@GetMapping("/receiver/{receiverId}")
	public ResponseEntity<List<Message>> getMessagesByReceiverId(@PathVariable Integer receiverId) {
		return ResponseEntity.ok(messageService.getMessagesByReceiverId(receiverId));
	}

	@DeleteMapping("/delete/{messageId}")
	public ResponseEntity<Void> deleteMessage(@PathVariable Integer messageId) {
		messageService.deleteMessage(messageId);
		return ResponseEntity.ok().build();
	}
}
