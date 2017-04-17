package jetsproject;

public class AssignJetPilot {

	public void listJetPilot(Jet[] j, Pilot[] p) {
		for (int i = 0; i < j.length; i++) {
			if (j[i] != null && p[i] != null) {
				System.out.println("Jet: " + j[i].getModel() + "\tPilot: " + p[i].getFname() + " " + p[i].getLname());
			}
		}
	}

}
