package com.redeSocialSpring.model;


import jakarta.persistence.*;

@Entity
@Table(name = "friendship")
public class Friendship {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "friend_id")
	private User friend;

	// getters, setters, constructors, etc.
}