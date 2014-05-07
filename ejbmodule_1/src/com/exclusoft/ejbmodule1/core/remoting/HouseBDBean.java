package src.com.exclusoft.ejbmodule1.core.remoting;

import java.util.List;

import javax.ejb.Stateless;

import src.com.exclusoft.ejbmodule1.api.modle.Home;
import src.com.exclusoft.ejbmodule1.core.bl.HouseBL;
import src.com.exclusoft.ejbmodule1.core.service.HouseBDLocal;
import src.com.exclusoft.ejbmodule1.core.service.HouseBDRemote;




@Stateless 
public class HouseBDBean implements HouseBDLocal, HouseBDRemote{

	@Override
	public List<Home> getHouse() {
		// TODO Auto-generated method stub
		return HouseBL.getHomes(7, "Kandy");
	}

}
