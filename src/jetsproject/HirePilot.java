package jetsproject;

import java.util.Scanner;

public class HirePilot {
	
	public void addPilot(Pilot[] p, int numberofpilots, Scanner input) {
		System.out.println("****Input Information for new Pilot****");
		System.out.println("First Name: ");
		String first = input.next();
		System.out.println("Last Name: ");
		String last = input.next();
		
		p [numberofpilots] = new Pilot(first, last);
		p [numberofpilots].setFname(first);
		p [numberofpilots].setLname(last);
	}

}
