package Java;

import static org.testng.Assert.assertEquals;

public class Reversethestring {

	public static void main(String[] args) {

		String str = "Jagu";
		 String rstr = "";
		 
		 
		 for (int i =0; i<str.length(); i++)
		 {
			 
			 char ch = str.charAt(i);
			 
			 rstr = ch+rstr;
			 
		 }
		 
		 System.out.println(rstr);
		
		
	}

}
