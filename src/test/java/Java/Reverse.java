package Java;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Mahindra";
		String	rstr = "";
		
		for (int i=0; i<str.length(); i++) { 
			
			char ch = str.charAt(i);
			rstr = ch+rstr;
		}
		
			System.out.println(rstr);
		
		
		
		


	}

}
