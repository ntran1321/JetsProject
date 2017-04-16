package jetsproject;

public class ListJets {
	
	public void printJets(Jet[] j) {
		for (int i = 0; i < j.length; i++) {
			if (j[i] != null) {
				System.out.println(j[i]);
			}
		}
	}
}
