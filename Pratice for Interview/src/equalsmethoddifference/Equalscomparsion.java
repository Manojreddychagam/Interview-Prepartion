package equalsmethoddifference;

public class Equalscomparsion {

 
 
 
	public static void main(String[] args) {
		String s1 = "Hello";
		   String s2 = new String(s1);
		   String s3 = "Hello";
		 //equals() compares actual string in the variable.
		   System.out.println(s1 + " equals " + s2 + "--> " +  s1.equals(s2)); //true
		 // == compares hashcode of the variable.
		   System.out.println(s1 + " == " + s2 + " --> " + (s1 == s2)); //false
		   /* it shows true because the two reference variable are ponting the same 
		   string "hello" so the hashcode of the two variables are same.
		   when we create string without using new the intern method is invoke then equales method is invoked .
		   .because to check  whether the the same string is present in heap memory or not. */
		   System.out.println(s1 + " == " + s3+ " --> " + (s1 == s3)); //true
		  
	}
	
	
	

}
