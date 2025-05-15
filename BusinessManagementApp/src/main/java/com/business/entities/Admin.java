package com.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer adminId;
	
	@NonNull
	@Column(length = 30)
	private String aName;
	
	@NonNull
	@Column(length = 30)
	private String aEmail;
	
	@NonNull
	@Column(length = 30)
	private String aPassword;
	
	@NonNull
	private Long aPhoneno;
	
}
