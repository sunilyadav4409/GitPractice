package com.example.SpringBootApp1.controller;

public class WelcomeController {

	public String welcomeController() {
		return "welcome to github";

	}

	public int addition(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c;
		c = a - b;
		return c;
	}

	public String message() {
		return "dev branch";
	}
}
