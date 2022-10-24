package com.anirudh.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer implements StoreManagerInterface {

	void customer() {
		Scanner sc0 = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = sc0.nextLine();
		System.out.println("Please enter your shoe size " + name + " :");
		int shoeSize = sc0.nextInt();
		menu();
	}

	@Override
	public HashMap<String, Integer> getStockDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void menu() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Welcome to Hosur's Shoes");
		System.out.println("Please choose one of these options--");
		System.out.println("1. Browse Shoes");
		System.out.println("2. Checkout");
		System.out.println("3. Cancel");
		int choiceMenu = sc1.nextInt();
		if (choiceMenu == 1)
			product();
		else if (choiceMenu == 2)
			check();
		else if (choiceMenu == 3)
			System.exit(0);
		else
			System.out.println("Invalid Input");
	}

	@Override
	public void product() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please choose one of these shoes--");
		System.out.println("1. Sport Shoes - $50");
		System.out.println("2. Trainers - $60");
		System.out.println("3. Casual Shoes - $60");
		System.out.println("4. Boots - $70");
		int choiceProduct = sc2.nextInt();
		menu();
	}

	@Override
	public void check() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Your cart contains the following items -->");
		HashMap<String, Integer> map = getStockDetails();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " -> " + value);
		}
		System.out.println("Proceed to payement? (Y/N)");
		char checkChoice = sc3.nextLine().charAt(0);
		if (checkChoice == 'Y' || checkChoice == 'y')
			payement();
		else if (checkChoice == 'N' || checkChoice == 'n') {
			System.out.println("You have exited checkout option");
			menu();
		}
	}

	@Override
	public void payement() {
		System.out.println("Your total bill -->");
	}

	@Override
	public void mainScreen() {
		// TODO Auto-generated method stub
		
	}
}
