package findduplicateswordsinsentence;

import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class WordsDuplication {

	public static void main(String[] args) {
		String s="manoj manoj reddy manoj hello reddy";
	HashMap<String, Integer> hashMap = new HashMap<>();
		
		StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreElements()) {
        	String t=tokenizer.nextToken();
        	if(hashMap.containsKey(t)){
                hashMap.put(t, hashMap.get(t)+1);
            } 
			else {
                hashMap.put(t, 1);
            }
        	
       }
        Set<String> keySet = hashMap.keySet();
        for (String string : keySet) {
        	
        	if(hashMap.get(string)>1) {
        		
        		System.out.println(string + "  :  "+ hashMap.get(string));
		}
        }
        
	}
}