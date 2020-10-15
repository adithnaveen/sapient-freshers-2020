package com.training.steps.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		System.out.println("Hey i'm from setUp Hook ");
	}
	
	@After
	public void tearDown() {
		System.out.println("Hey i'm from tearDown Hook");
	}
}
