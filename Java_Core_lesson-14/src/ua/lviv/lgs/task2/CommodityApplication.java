package ua.lviv.lgs.task2;

import java.util.Scanner;

public class CommodityApplication {

	public static void main(String[] args) {

		Commodity cmm = new Commodity(null, 0, 0, 0);

		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				cmm.addProduct();
				cmm.printList();
				break;
			}
			case "2": {
				cmm.deleteProduct();
				cmm.printList();
				break;
			}
			case "3": {
				cmm.changeProduct();
				cmm.printList();
				break;
			}
			case "4": {
				cmm.sortByName();
				cmm.printList();
				break;
			}
			case "5": {
				cmm.sortByLength();
				cmm.printList();
				break;
			}
			case "6": {
				cmm.sortByWidth();
				cmm.printList();
				break;
			}
			case "7": {
				cmm.sortByWeight();
				cmm.printList();
				break;
			}
			case "8": {
				cmm.consoleElement();
				cmm.printList();
				break;
			}
			case "9": {
				System.exit(0);
				break;
			}
			}
		}
	}

	public static void menu() {
		System.out.println("Press 1 to add product:");
		System.out.println("Press 2 to delete product:");
		System.out.println("Press 3 to change product:");
		System.out.println("Press 4 to sort by name:");
		System.out.println("Press 5 to sort by length product:");
		System.out.println("Press 6 to sort by width:");
		System.out.println("Press 7 to sort by weight:");
		System.out.println("Press 8 to print the product by index number: ");
		System.out.println("Press 9 to exit");
	}

}
