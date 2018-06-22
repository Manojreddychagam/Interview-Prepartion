package splitandreverse;

import java.util.StringTokenizer;

public class ByStringTockenizer {

	public static void main(String[] args) {
		String s="manoj reddy";
		StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreElements()) {
        	
        	 String token = tokenizer.nextToken();
        	System.out.println(new StringBuilder(token).reverse());
			
		}
	}

}
