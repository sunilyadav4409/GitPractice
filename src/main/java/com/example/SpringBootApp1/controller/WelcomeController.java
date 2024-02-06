package com.example.SpringBootApp1.controller;


public class WelcomeController {

	public String welcomeController() {
		return "welcome to github";

	}
	
	public int addition(int a,int b) {
		int c;
		c=a+b;
		return c;
	}
}
