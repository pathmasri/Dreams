package com.exclusoft.model;

import java.util.ArrayList;
import java.util.List;

public class HomeFinder {

	public static List<Home> getHomes(int size, String city) {

	 List<Home> homes = new ArrayList<Home>();
		if (city.equals("Colombo")) {
			if (size == 7) {
				Home h1 = new Home(7, "Colombo", "Mount Lavinia");
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
