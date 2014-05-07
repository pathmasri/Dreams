package src.com.exclusoft.ejbmodule1.api.modle;

import java.io.Serializable;

public class Home implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int size ;
	private String city;
	private String village;
	
	public Home (int size, String city, String village){
		this.size = size ;
		this.city = city ;
		this.village = village;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
	
	public String toString (){
		return "A house in" + village + "for sale";
		
	}
		
}
