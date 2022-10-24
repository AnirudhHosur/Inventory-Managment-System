package com.anirudh.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager implements StoreManagerInterface {

	int sportShoeStock = 0, trainersStock = 0, casualShoesStock = 0, bootsStock = 0;
	Store store = new Store();
	HashMap<String, Integer> map = store.getStockDetails();

	void managerScreen() {
		System.out.println("Welcome dear Manager!");
		System.out.println("Please choose one of these shoes and update it's stock-->");
		System.out.println("1. Sport Shoes - $50");
		System.out.println("2. Trainers - $60");
		System.out.println("3. Casual Shoes - $60");
		System.out.println("4. Boots - $70");
		System.out.println("");
		System.out.println("Or, please choose the following -->");
		System.out.println("4. View Stock");
		System.out.println("5. Exit to main screen");
		Scanner sc = new Scanner(System.in);
		int managerChoice = sc.nextInt();
		System.out.println("Please enter the stock amount");
		int managerStockAmount = sc.nextInt();
		if (managerChoice == 1) {
			sportShoeStock = sportShoeStock + managerStockAmount;
			map.put("Sport Shoes", sportShoeStock);
			System.out.println("Thanks for adding");
		} else if (managerChoice == 2) {
			trainersStock = trainersStock + managerStockAmount;

			System.out.println("Thanks for adding");
		} else if (managerChoice == 3) {
			casualShoesStock = casualShoesStock + managerStockAmount;
			System.out.println("Thanks for adding");
		} else if (managerChoice == 4) {
			bootsStock = bootsStock + managerStockAmount;
			System.out.println("Thanks for adding");
		} else if (managerChoice == 5) {
			System.out.println("Your current Stock -->");
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				String key = entry.getKey();
				int value = entry.getValue();
				System.out.println(key + " -> " + value);
			}
			System.out.println("Exiting to the Manager's menu.....");
			System.out.println("");
			managerScreen();
		} else if (managerChoice == 5) {
			mainScreen();
		}
	}

	@Override
	public HashMap<String, Integer> getStockDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public void product() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payement() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mainScreen() {
		System.out.println("Please select your role --> ");
		System.out.println("1. Store Manager");
		System.out.println("2. Customer");
	}

}
