package com.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.business.entities.User;

public interface IUserRepository extends JpaRepository<User,Integer>
{
	public User findUserByuEmail(String email);
}
