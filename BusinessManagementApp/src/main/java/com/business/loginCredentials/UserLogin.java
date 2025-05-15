package com.business.loginCredentials;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserLogin 
{
	@NonNull
	private String userEmail;
	
	@NonNull
	private String userPassword;
}
