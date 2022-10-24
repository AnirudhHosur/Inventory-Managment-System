package com.anirudh.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store implements StoreManagerInterface {
	
//	static {
//		int shoeSize = 0, sportShoeStock = 0, trainersStock = 0, casualShoesStock = 0, bootsStock = 0;
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("Sport Shoes", sportShoeStock);
//		map.put("Trainers", trainersStock);
//		map.put("Casual Shoes", casualShoesStock);
//		map.put("Boots Shock", bootsStock);
//	}
	HashMap<String, Integer> map = new HashMap<>();
	
	@Override
	public HashMap<String, Integer> getStockDetails() {
		map.put("Sport Shoes", 0);
		map.put("Trainers", 2);
		map.put("Casual Shoes", 5);
		map.put("Boots", 6);
		return map;
	}
	
	public void menu(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Welcome to Hosur's Shoes");
		System.out.println("Please choose one of these options--");
		System.out.println("1. Browse Shoes");
		System.out.println("2. Checkout");
		System.out.println("3. Cancel");
		int choiceMenu = sc1.nextInt();
		if(choiceMenu == 1)
			product();
		else if(choiceMenu == 2)
			check();
		else if(choiceMenu == 3)
			System.exit(0);
		else 
			System.out.println("Invalid Input");
	}
	
	public void product(){
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please choose one of these shoes--");
		System.out.println("1. Sport Shoes - $50");
		System.out.println("2. Trainers - $60");
		System.out.println("3. Casual Shoes - $60");
		System.out.println("4. Boots - $70");
		int choiceProduct = sc2.nextInt();
		menu();
	}
	
	public void check(){
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Your cart contains the following items -->");
		HashMap<String, Integer> map = getStockDetails();
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " -> " + value);
		}
		System.out.println("Proceed to payement? (Y/N)");
		char checkChoice = sc3.nextLine().charAt(0); 
		if(checkChoice == 'Y' || checkChoice == 'y')
			payement();
		else if(checkChoice == 'N' || checkChoice == 'n'){
			System.out.println("You have exited checkout option");
			menu();
		}
	}
	
	public void payement(){
		System.out.println("Your total bill -->");
		
	}
	
	public void mainScreen(){
		System.out.println("Please select your role --> ");
		System.out.println("1. Store Manager");
		System.out.println("2. Customer");
	}	
	
	public static void main(String[] args){
		Store s = new Store();
		s.mainScreen();
	}

}
