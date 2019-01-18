package com.okliu.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.okliu.springboot.entity.ShoppingUser;

@Repository
public interface ShoppingUserRepository 
	extends JpaRepository<ShoppingUser, Integer>{

	//一行代码都没有
	
}
