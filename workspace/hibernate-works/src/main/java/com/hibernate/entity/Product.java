package com.hibernate.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 1. Single Table (This is by default if you dont specify anything) 
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="PRODUCT_TYPE", 
//	discriminatorType=DiscriminatorType.STRING)


//2. Table per class 
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

// 3. Joined O(this is called normalized strategy)
 @Inheritance(strategy=InheritanceType.JOINED)
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private int pId; 
	private String pName; 
	private String pDesc; 
	private double pPrice;
	
}