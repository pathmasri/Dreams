package com.exclusoft.houseinventory.api.service;

import com.exclusoft.houseinventory.api.modle.House;

public interface HouseBD {
	
	public static final String SERVICE_NAME = "houseSerive";
	
	public House getHouse();

}
