package jetsproject;
import java.util.Scanner;

public class AddJet {
	public void addJet(Jet[] j, int numberofjets, Scanner input) {
		System.out.println("****Input Information for new Jet****");
		System.out.println("Model: ");
		input.nextLine();
		String m = input.nextLine();
		System.out.println("Speed (mph): ");
		Double s = input.nextDouble();
		System.out.println("Range (miles): ");
		Double r = input.nextDouble();
		System.out.println("Price (millions): ");
		Double p = input.nextDouble();
		
		double convertspeed = s * .0013;
		
		j [numberofjets] = new Jet();
		j [numberofjets].setModel(m);
		j [numberofjets].setSpeed(convertspeed);
		j [numberofjets].setRange(r);
		j [numberofjets].setPrice(p);
		
		System.out.println("New jet info: ");
		System.out.println(j[numberofjets]);
	}
}
