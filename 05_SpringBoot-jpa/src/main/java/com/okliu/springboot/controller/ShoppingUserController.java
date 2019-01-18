package com.okliu.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okliu.springboot.dao.ShoppingUserRepository;
import com.okliu.springboot.entity.ShoppingUser;

@RestController
public class ShoppingUserController {

	private @Autowired ShoppingUserRepository repository;
	@RequestMapping("/")
	public List<ShoppingUser> findAll(){
		return repository.findAll();
			
		
	}
	
	@RequestMapping("/{id}")
	public ShoppingUser findById(@PathVariable Integer id){
		return repository.findById(id).get();
	}
	
}
