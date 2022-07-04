package com.project.lockedme;


public class Main {

	/*Enter your desired Directory path */
	public static final String path = "C:\\Users\\bharani\\Pictures"; 

	public static void main(String[] args) {
		Menus menu = new Menus();
		menu.introScreen();
		menu.mainMenu();
	}

}