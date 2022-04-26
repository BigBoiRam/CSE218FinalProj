package p1_backend;

public class DataCenter {

	 private static DataCenter INSTANCE;
	 
	 public static DataCenter getInstance() {
		 if(INSTANCE == null) {
			 INSTANCE = new DataCenter();
		 }
		 return INSTANCE;
	 }
	
}
