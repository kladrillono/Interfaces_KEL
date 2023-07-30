
public class RationalApplication {

	public static void main(String[] args) {
		
		//test code for compareTo
        
        RationalNumber r8 = new RationalNumber(3,4);
        RationalNumber r9 = new RationalNumber(7,8);
        
        System.out.println(r8);
        System.out.println(r9);
        
        System.out.println(r9.compareTo(r8));

	}//end main

}//end class
