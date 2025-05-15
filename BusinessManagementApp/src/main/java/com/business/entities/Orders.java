package com.business.entities;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
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
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Orders 
{
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "SEQ_ORD",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer oId;
	
	@NonNull
	@Column(length = 30)
	private String oName;
	
	@NonNull
	private Double oPrice;
	
	@NonNull
	private Integer oQuantity;
	
	@NonNull
	private Date orderDate;
	
	@NonNull
	private Double totalAmmount;
	
	@ManyToOne
	@JoinColumn(name = "User_Id")
	private User user;
}
