package findsduplicationinstring;

import java.util.HashMap;
import java.util.Set;

public class FindStringDuplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> hs=new HashMap<>();
		String s1="manojreddychagam";
		s1=s1.toLowerCase();
		char[] cs = s1.toCharArray();
		for (char c : cs) {
			if(hs.containsKey(c)){
                hs.put(c, hs.get(c)+1);
            } 
			else {
                hs.put(c, 1);
            }
		}
		Set<Character> keySet = hs.keySet();
		for (Character character : keySet) {
			if(hs.get(character)> 1) {
				System.out.println(character  +"  :  "+hs.get(character));
			}
		}
	
	}

}
