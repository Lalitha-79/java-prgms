package assignment3;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
				Set<String> ts = new TreeSet<>();

				ts.add("Lalitha");
				ts.add("Prapoorna");
				ts.add("Priya");
				ts.add("Mahendra");
				ts.add("Vijaya");
				ts.add("Teja");

				for (String value : ts)

					System.out.print( value + "  ");

				System.out.println();
			}
	
	}


