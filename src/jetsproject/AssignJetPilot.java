package jetsproject;

import java.util.*;

public class AssignJetPilot {

	public void listJetPilot(Jet[] j, Pilot[] p, int numberofjets) {
		int i;
//		Temp[] temp = new Temp[100];
//		Random random = new Random();
		for (i=0; i < j.length; i++){
			if (j[i] != null && p[i] != null) {
				System.out.println("Jet: " + j[i].getModel() + "\tPilot: " + 
						p[i].getFname() + " " + p[i].getLname());
			}
		}
	
	}
}
