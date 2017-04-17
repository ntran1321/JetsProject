package jetsproject;

public class SortJetSpeed {
	public void jetSpeed(Jet[] j) {
		Jet temp = new Jet();

		for (int i = 0; i < j.length; i++) {
			for (int n = 0; n < j.length; n++)
				if (j[i] != null && j[n] != null && (j[i].getSpeed() > j[n].getSpeed())) {
					temp = j[n];
					j[n] = j[i];
					j[i] = temp;
				}
		}
		System.out.println("Fastest jet: " + j[0]);
//		for (int i = 0; i < j.length; i++) {
//			if (j[i] != null) {
//				System.out.println(j[i]);
//			}
//		}
	}
}
