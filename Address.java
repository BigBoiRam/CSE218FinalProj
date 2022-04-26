package p1_backend;

public class Address {
	private int houseNum;
	private String street;
	
	public Address(int houseNum, String street) {
		super();
		this.houseNum = houseNum;
		this.street = street;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override  
	public String toString() {
		return "Address: [House Number:" + houseNum + ", Street:" + street + "]";
					      //Ex:				23 				Demo Rd.
	}
	
	
}
