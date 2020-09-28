package com.training.springbootworks.beans;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class User { // extends RepresentationModel<User> {
	@Id
	private Integer id;
	private String userName;
	private Integer userAge;
	private String userEmail;
	private Address address;
	
	
//	@Transient
//	@JsonIgnore
//	@Override
//	public Links getLinks() {
//		return super.getLinks(); 
//	}
	
}
