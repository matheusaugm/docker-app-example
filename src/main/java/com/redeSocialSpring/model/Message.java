package com.redeSocialSpring.model;
import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "sender_id")
	private User sender;

	@ManyToOne
	@JoinColumn(name = "receiver_id")
	private User receiver;

	@Column(name = "message_text")
	private String text;

	// getters, setters, constructors, etc.
}