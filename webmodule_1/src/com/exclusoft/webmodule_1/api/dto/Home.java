package src.com.exclusoft.webmodule_1.api.dto;

public class Home {

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
