package com.Example1_restaurant;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.addMenuItem("Bala-Bala", 1_000, 20);
		menu.addMenuItem("Gehu", 1_000, 20);
		menu.addMenuItem("Tahu", 1_000, 30);
		menu.addMenuItem("Molen", 1_000, 20);
		
		menu.displayMenu();
		
	}
}
