package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double tendered, itemCost;
		int x = 0;

		while (x == 0) {

			System.out.println("What is the price of the item?");
			itemCost = sc.nextDouble();

			System.out.println("How much money was tendered by the customer?");
			tendered = sc.nextDouble();

			String displayMessage = tendered - itemCost == 0 ? "Exact"
					: tendered - itemCost > 0 ? "Change" : "NotEnough";

			switch (displayMessage) {
			case "Exact":
				System.out.println("Your item was paid for and there is no change. Have a great day!");
				x = goAgain(sc, x);

				break;

			case "Change":
				changeForCustomer(tendered, itemCost);
				x = goAgain(sc, x);
				break;

			case "NotEnough":
				System.out.println("You do not have enough money to purchase this item.");
				x = goAgain(sc, x);
				break;
			}
		}
		sc.close();

	}

	public static void changeForCustomer(double tendered, double itemCost) {
		// work on getting this to create change for customer
		int bill20, bill10, bill5, bill1, quarter, dime, nickle, penny;
		bill20 = bill10 = bill5 = bill1 = quarter = dime = nickle = penny = 0;

		double originalTendered = tendered;
		double originalItemCost = itemCost;

//		To avoid double inaccuracy tender and itemCost will be multiplied by 100
		tendered *= 100;
		itemCost *= 100;

		while (tendered >= itemCost) {
			double changeLeftOver = (tendered) - (itemCost);

			if (changeLeftOver >= 2000) {
				bill20++;
				tendered -= 2000;
			} else if (changeLeftOver >= 1000 && changeLeftOver < 2000) {
				bill10++;
				tendered -= 1000;
			} else if (changeLeftOver >= 500 && changeLeftOver < 1000) {
				bill5++;
				tendered -= 500;
			} else if (changeLeftOver >= 100 && changeLeftOver < 500) {
				bill1++;
				tendered -= 100;
			} else if (changeLeftOver >= 25 && changeLeftOver < 100) {
				quarter++;
				tendered -= 25;
			} else if (changeLeftOver >= 10 && changeLeftOver < 25) {
				dime++;
				tendered -= 10;
			} else if (changeLeftOver >= 05 && changeLeftOver < 10) {
				nickle++;
				tendered -= 05;
			} else if (changeLeftOver >= 01 && changeLeftOver < 05) {
				penny++;
				tendered -= 01;
			} else {
//				System.out.println("Amount: " + itemCost + ", Tendered: " + originalTendered + ", Result: " + bill20
//						+ " Twenty dollar bills, " + bill10 + " Ten dollar bills, " + bill5 + " Five dollar bills, "
//						+ bill1 + " One dollar bills, " + quarter + " quarters, " + dime + " dimes, " + nickle
//						+ " nickles, " + penny + " pennies");

				System.out.print("Amount: " + originalItemCost + ", Tendered: " + originalTendered + ", Change: ");

				printOutChange(bill20, bill10, bill5, bill1, quarter, dime, nickle, penny);
				break;

			}

		}
	}

	public static void printOutChange(int bill20, int bill10, int bill5, int bill1, int quarter, int dime, int nickle,
			int penny) {

		if (bill20 >= 2) {
			System.out.print(bill20 + " Twenty dollar bills, ");
		} else if (bill20 == 1) {
			System.out.print(bill20 + " Twenty dollar bill, ");
		}
		if (bill10 >= 2) {
			System.out.print(bill10 + " Ten dollar bills, ");
		} else if (bill10 == 1) {
			System.out.print(bill10 + " Ten dollar bill, ");
		}
		if (bill5 >= 2) {
			System.out.print(bill5 + " Five dollar bills, ");
		} else if (bill5 == 1) {
			System.out.print(bill5 + " five dollar bill, ");
		}
		if (bill1 >= 2) {
			System.out.print(bill1 + " One dollar bills, ");
		} else if (bill1 == 1) {
			System.out.print(bill1 + " One dollar bill, ");
		}
		if (quarter >= 2) {
			System.out.print(quarter + " Quarters, ");
		} else if (quarter == 1) {
			System.out.print(quarter + " Quarter, ");
		}
		if (dime >= 2) {
			System.out.print(dime + " Dimes, ");
		} else if (dime == 1) {
			System.out.print(dime + " Dime, ");
		}
		if (nickle >= 2) {
			System.out.print(nickle + " Nickles, ");
		} else if (nickle == 1) {
			System.out.print(nickle + " Nickle, ");
		}
		if (penny >= 2) {
			System.out.print(penny + " Pennies.");
		} else if (penny == 1) {
			System.out.print(penny + " Penny.");
		} else {
			System.out.print(".");
		}

	}

	public static int goAgain(Scanner sc, int x) {
		int y = 0;

		while (y == 0) {
			
			System.out.println("Would you like to do another transaction?");
			String reply = sc.next();
			
			switch (reply) {
			case "Yes":
			case "yes":
			case "y":
			case "Y":
				y = 1;
				break;
			case "No":
			case "no":
			case "N":
			case "n":
				x = 1;
				y = 1;
				break;
			default:
				System.out.println("That was not a readable response.");
				break;
			}
		}
		return x;
	}

}
