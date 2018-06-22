package swaping;

public class SwappingUsing3rdVariable {

	public void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a:"+a+" b: "+b);
	}
	
	
	
	public static void main(String[] args) {
		int a=7;
		int b=5;
		System.out.println("Before Swapping a:"+a+" b: "+b);
		new SwappingUsing3rdVariable().swap(a,b);

	}
	

}
