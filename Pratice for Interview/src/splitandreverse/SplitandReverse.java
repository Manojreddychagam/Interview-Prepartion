package splitandreverse;

public class SplitandReverse {
	
		public static void main(String args[]){
		String s1="java string split method by java tpoint";
		String[] words=s1.split(" ");//splits the string based on string
		for(String w:words){
		StringBuilder sb=new StringBuilder(w);
		System.out.println(sb.reverse());
		
		
		}
		}
}
