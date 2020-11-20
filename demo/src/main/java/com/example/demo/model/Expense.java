package com.example.demo.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="expense")
public class Expense {
	
	@Id
	private Long id;
	
	private Instant expensedata;
	
	private String descipt;
	
	
	

}
