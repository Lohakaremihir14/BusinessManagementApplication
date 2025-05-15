package com.business.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Product 
{
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "SEQ_PRO",initialValue = 101,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pId;
	
	@NonNull
	@Column(length = 30)
	private String pName;
	
	@NonNull
	private Double pPrice;
	
	@NonNull
	@Column(length = 30)
	private String pDescription;
}
