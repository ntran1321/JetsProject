package jetsproject;

import java.util.Scanner;

public class PilotMenu {
	int choice = 0;
	
	public void menuPilot(Jet [] j, Pilot [] p, int numberofjets, int numberofpilots) {
		Scanner input = new Scanner(System.in);
		
		AssignJetPilot assign = new AssignJetPilot();
		HirePilot hire = new HirePilot();
		
		while (choice != 3) {
			System.out.println("****Pilot Menu****");
			System.out.println("1. Jet pilot assignment");
			System.out.println("2. Hire pilot");
			System.out.println("3. Quit");
			System.out.println("Choose option: ");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				assign.listJetPilot(j, p, numberofjets);
				break;
			
			case 2:
				hire.addPilot(p, numberofpilots, input);
				numberofpilots++;
				break;
			}
		}

	}
}
