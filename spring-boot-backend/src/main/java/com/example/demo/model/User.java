package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String email;
	    private String password;
//	    private String role;  // STUDENT, FACULTY, RESEARCHER

	    // Getters and Setters
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

}
