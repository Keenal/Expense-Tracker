package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Expense;


public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}