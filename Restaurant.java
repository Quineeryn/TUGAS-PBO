package com.Example1_restaurant;

import java.util.logging.Logger;

public class Restaurant {
	private String[] menuNames;
    private double[] menuPrices;
    private int[] menuStocks;
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());
    private static int nextId = 0;

    public Restaurant() {
        menuNames = new String[10];
        menuPrices = new double[10];
        menuStocks = new int[10];
    }

    public void addMenuItem(String name, double price, int stock) {
        menuNames[nextId] = name;
        menuPrices[nextId] = price;
        menuStocks[nextId] = stock;
        nextId++;
    }

    public void displayMenu() {
        for (int i = 0; i < nextId; i++) {
            if (!isOutOfStock(i)) {
                logger.info(String.format("%s[%d]\tRp.%.2f", menuNames[i] 
                		+ "[" + menuStocks[i] + "]\tRp." + menuPrices[i]));
            }
        }
    }

    public boolean isOutOfStock(int itemId) {
        return menuStocks[itemId] == 0;
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem("Nasi Goreng", 25000.0, 10);
        restaurant.addMenuItem("Mie Ayam", 20000.0, 5);
        restaurant.addMenuItem("Sate Ayam", 30000.0, 0);
        restaurant.displayMenu();
    }
}
