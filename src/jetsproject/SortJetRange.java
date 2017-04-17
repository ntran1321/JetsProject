package jetsproject;

public class SortJetRange {
	public void jetRange(Jet[] j) {
		Jet temp = new Jet();

		for (int i = 0; i < j.length; i++) {
			for (int n = 0; n < j.length; n++)
				if (j[i] != null && j[n] != null && (j[i].getRange() > j[n].getRange())) {
					temp = j[n];
					j[n] = j[i];
					j[i] = temp;
				}
		}
		System.out.println("Longest range jet: " + j[0]);

//		for (int i = 0; i < j.length; i++) {
//			if (j[i] != null) {
//				System.out.println(j[i]);
			}
//		}
	}
//}