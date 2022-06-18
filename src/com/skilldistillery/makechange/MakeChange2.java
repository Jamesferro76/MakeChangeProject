package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double tendered, itemCost;

		System.out.println("What is the price of the item?");
		itemCost = sc.nextDouble();

		System.out.println("How much money was tendered by the customer?");
		tendered = sc.nextDouble();

		String displayMessage = tendered - itemCost == 0 ? "Exact" : tendered - itemCost > 0 ? "Change" : "NotEnough";

		switch (displayMessage) {
		case "Exact":
			System.out.println("Your item was paid for and there is no change. Have a great day!");
			break;

		case "Change":
			changeForCustomer(tendered, itemCost);
			// work on getting this to work with the method
			break;

		case "NotEnough":
			System.out.println("You do not have enough money to purchase this item.");
			break;
			
			
		}

		sc.close();
	}

	public static void changeForCustomer(double tendered, double itemCost) {
		// work on getting this to create change for customer
		int bill20, bill10, bill5, bill1, quarter, dime, nickle, penny;
		bill20 = bill10 = bill5 = bill1 = quarter = dime = nickle = penny = 0;

		double originalTendered = tendered;

		System.out.println(tendered);
		System.out.println(itemCost);

		while (tendered >= itemCost) {
			double changeLeftOver = tendered - itemCost;

			if (changeLeftOver >= 20.00) {
				bill20 = bill20 + 1;
				tendered = tendered - 20;

			} else if (changeLeftOver >= 10 && changeLeftOver < 20) {
				bill10++;
				tendered = tendered - 10;
			} else if (changeLeftOver >= 5 && changeLeftOver < 10) {
				bill5++;
				tendered -= 5;
			} else if (changeLeftOver >= 1 && changeLeftOver < 5) {
				bill1++;
				tendered -= 1;
			} else if (changeLeftOver >= .25 && changeLeftOver < 1) {
				quarter++;
				tendered -= .25;
			} else if (changeLeftOver >= .10 && changeLeftOver < .25) {
				dime++;
				tendered -= .10;
			} else if (changeLeftOver >= .05 && changeLeftOver < .10) {
				nickle++;
				tendered -= .05;
			} else if (changeLeftOver >= .01 && changeLeftOver < .05) {
				penny++;
				tendered -= .01;
			} else {
//				System.out.println("Amount: " + itemCost + ", Tendered: " + originalTendered + ", Result: " + bill20
//						+ " Twenty dollar bills, " + bill10 + " Ten dollar bills, " + bill5 + " Five dollar bills, "
//						+ bill1 + " One dollar bills, " + quarter + " quarters, " + dime + " dimes, " + nickle
//						+ " nickles, " + penny + " pennies");
				
				
				
				printOutChange(bill20, bill10, bill5, bill1, quarter, dime, nickle, penny);
				break;

			}

		}
	}

	public static void printOutChange(int bill20, int bill10, int bill5, int bill1, int quarter, int dime, int nickle,int penny) {
		
		if(bill20>=2) {
			System.out.print(bill20 + " Twenty dollar bills, ");
		} else if(bill20==1) {
			System.out.print(bill20 + " Twenty dollar bill,");
		}
		if(bill10>=2) {
			System.out.print(bill10 + " Ten dollar bills, ");
		} else if(bill10==1){
			System.out.print(bill10 + " Ten dollar bill, ");
		}
		if(bill5>=2) {
			System.out.print(bill5 + " Five dollar bills, ");
		} else if(bill5==1) {
			System.out.print(bill5+ " five dollar bill, ");
		}
		if(bill1>=2) {
			System.out.print(bill1 + " One dollar bills, ");
		}else if(bill1==1) {
			System.out.print(bill1 + " One dollar bill, ");
		}
		if(quarter>=2) {
			System.out.print(quarter + " Quarters, ");
		}else if(quarter==1) {
			System.out.print(quarter + " Quarter, ");
		}
		if(dime>=2) {
			System.out.print(dime + " Dimes, ");
		}else if(dime==1) {
			System.out.print(dime + " Dime, ");
		}
		if(nickle>=2) {
			System.out.print(nickle + " Nickles, ");
		}else if(nickle==1) {
			System.out.print(nickle + " Nickle, ");
		}
		if(penny>=2) {
			System.out.print(penny + " Pennies.");
		}else if(penny==1) {
			System.out.print(penny + " Penny.");
		}else {
			System.out.print(".");
		}
		
	}

}
