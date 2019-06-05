package com.gabrielperes.userauthserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "user", schema = "user")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "recoveryEmail", nullable = false)
	private String recoveryEmail;
	
	

}
