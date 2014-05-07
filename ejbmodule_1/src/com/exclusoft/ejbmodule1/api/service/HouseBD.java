package src.com.exclusoft.ejbmodule1.api.service;

import java.util.List;

import src.com.exclusoft.ejbmodule1.api.modle.Home;




public interface HouseBD {
	
	public static final String SERVICE_NAME = "HouseServiceBean";
	
	public List <Home> getHouse();

}
