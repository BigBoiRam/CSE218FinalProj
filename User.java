package p1_backend;

import java.util.UUID;

public class User{
	private String firstName;
	private String lastName;
	private String emailUser;
	private String pass;
	private String phoneNum;
	private String address;
	private String gpa;
	private int satScore;
	private String essay;
	private double famIncome;
	private UUID id;
	
	public User(String firstName, String lastName, String emailUser, String pass, String phoneNum, String address, String gpa, int satScore, String essay, double famIncome, UUID id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailUser = emailUser;
		this.pass = pass;
		this.phoneNum = phoneNum;
		this.address = address;
		this.gpa = gpa;
		this.satScore = satScore;
		this.essay = essay;
		this.famIncome = famIncome;
		this.id = id;
		//end of Constructor
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public int getSatScore() {
		return satScore;
	}

	public void setSatScore(int satScore) {
		this.satScore = satScore;
	}

	public String getEssay() {
		return essay;
	}

	public void setEssay(String essay) {
		this.essay = essay;
	}

	public double getFamIncome() {
		return famIncome;
	}

	public void setFamIncome(double famIncome) {
		this.famIncome = famIncome;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	//end of getters/setters
	public static boolean validatePass(String pass) {
		boolean containNum = false;
		boolean containLowerCase = false;
		boolean containUpperCase = false;
		
		for(int i = 0; i < pass.length(); i++) {
			if(Character.isDigit(pass.charAt(i))) {
				containNum = true;
				break;
			}
		}
		
		for(int i = 0; i < pass.length(); i++) {
			if(Character.isLowerCase(pass.charAt(i))) {
				containUpperCase = true;
				break;
			}
		}
		
		for(int i = 0; i < pass.length(); i++) {
			if(Character.isUpperCase(pass.charAt(i))) {
				containNum = true;
				break;
			}
		}
		return (pass.length() >= 7 && containNum && containLowerCase && containLowerCase);
	}
	
	//end
}
