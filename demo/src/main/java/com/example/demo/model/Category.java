package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="category")
public class Category {
	
	@Id
	private Long id;
	
	private String name;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private User user; 
	
	

}
