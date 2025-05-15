package com.business.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;
	
	@NonNull
	@Column(length = 30)
	private String uName;
	
	@NonNull
	@Column(length = 30)
	private String uEmail;
	
	@NonNull
	@Column(length = 30)
	private String upassword;
	
	@NonNull
	private Long uPhoneno;
	
	@OneToMany(targetEntity = Orders.class,cascade = CascadeType.ALL,mappedBy = "user")
	private List<Orders> orders;
	
}
