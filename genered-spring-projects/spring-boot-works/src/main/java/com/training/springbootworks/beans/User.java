package com.training.springbootworks.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.RepresentationModel;

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
public class User extends RepresentationModel<User> {
	@Id
	private Integer id;
	private String userName;
	private Integer userAge;
	private String userEmail;

	private Address address;
}
