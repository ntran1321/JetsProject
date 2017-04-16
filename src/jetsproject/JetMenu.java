package jetsproject;

import java.util.*;

public class JetMenu {
	public static Jet[] j = new Jet[100];
	public static int numberofjets = 5;

	public static void main(String[] args) {
		j[0] = new Jet("Boeing 737", .67, 3115, 260);
		j[1] = new Jet("Mig 15", .87, 750, 3.5);
		j[2] = new Jet("SR 71", 2.87, 3355, 34);
		j[3] = new Jet("F 16", 1.95, 2622, 18.8);
		j[4] = new Jet("F 14", 2.01, 1841, 38);

		JetMenu run = new JetMenu();
		run.start();
	}

	public void start() {
		int option = 0;
		while (option != 5) {
			ListJets list = new ListJets();
			SortJetSpeed speed = new SortJetSpeed();
			SortJetRange range = new SortJetRange();
			AddJet add = new AddJet();
			
			System.out.println("*****FLEET OF JETS*****");
			System.out.println("1. List fleet");
			System.out.println("2. View fastest jet");
			System.out.println("3. View longest range jet");
			System.out.println("4. Add jet to fleet");
			System.out.println("5. Quit");
			System.out.println("Choose option: ");

			Scanner input = new Scanner(System.in);
			option = input.nextInt();
			

			switch (option) {
			case 1:
				list.printJets(j);
				break;

			case 2:
				speed.jetSpeed(j);
				break;

			case 3:
				range.jetRange(j);
				break;

			case 4:
				numberofjets++;
				add.addJet(j, numberofjets, input);
				break;

			case 5:
				System.out.println("Goodbye.");

				break;

			default:
				System.out.println("Invalid Selection");
				break;
			}
			System.out.println();
		}
	}
}
