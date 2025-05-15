package com.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.business.entities.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Integer> 
{
	public Admin findByaEmail(String email);
}
