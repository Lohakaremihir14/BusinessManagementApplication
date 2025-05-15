package com.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.business.entities.User;
import com.business.repositories.IUserRepository;

@Component
public class UserServices 
{
	@Autowired
	private IUserRepository userRepository;
		
	//Get All Users
	public List<User> getAllUser()
	{
		List<User> users = (List<User>) this.userRepository.findAll();
		return users;
	}
	
	//Get Single User
	public User getUser(int id)
	{
		Optional<User> optional = this.userRepository.findById(id);
		User user = optional.get();
		return user;
	}
	
	//Get Single User By Email
	public User getUserByEmail(String email)
	{
	 User user=	this.userRepository.findUserByuEmail(email);
	 return user;
	}
	
	//Update
	public void updateUser(User user,int id)
	{
		user.setUId(id);
		 this.userRepository.save(user);
	}
	
	//delete single User
	public void deleteUser(int id)
	{
		this.userRepository.deleteById(id);
	}

	//Add User
	public void addUser(User user)
	{
	this.userRepository.save(user);
	}
	
	public boolean validateLoginCredentials(String email,String password)
	{
		List<User> users = (List<User>) this.userRepository.findAll();
		for(User u:users)
		{
		if(u!=null && u.getUpassword().equals(password) && u.getUEmail().equals(email))
		{
			return true;
		}
		}
		return false;
	}
	
	

}
