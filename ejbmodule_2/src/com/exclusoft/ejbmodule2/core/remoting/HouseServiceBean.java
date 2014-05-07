package com.exclusoft.houseinventory.core.remoting;

import javax.ejb.Stateless;

import com.exclusoft.houseinventory.api.modle.House;
import com.exclusoft.houseinventory.core.service.HouseBDImplLocal;
import com.exclusoft.houseinventory.core.service.HouseBDImplRemote;

@Stateless 
public class HouseServiceBean implements HouseBDImplLocal, HouseBDImplRemote{

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return null;
	}

}
