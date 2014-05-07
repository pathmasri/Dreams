package src.com.exclusoft.ejbmodule1.core.bl;

import java.util.ArrayList;
import java.util.List;

import src.com.exclusoft.ejbmodule1.api.modle.Home;



public class HouseBL {

	public static List<Home> getHomes(int size, String city) {
		
		System.out.print("test ##############################################");

		 List<Home> homes = new ArrayList<Home>();
			if (city.equals("Colombo")) {
				if (size == 7) {
					Home h1 = new Home(7, "Colombo", "Mount");
					homes.add(h1);
				}
			} else if (city.equals("Kandy")) {
				if (size == 7) {
					Home h1 = new Home(7, "Kandy", "Pilimatalawa");
					homes.add(h1);
				}
			} else if (city.equals("Jaffna")) {
				if (size == 7) {
					Home h1 = new Home(7, "Jaffna", "Thirukkowil");
					homes.add(h1);
				}
			} else {
				if (size == 7) {
					Home h1 = new Home(7, "Galle", "Habarana");
					homes.add(h1);
				}
			}
		  return homes;
		}

}
