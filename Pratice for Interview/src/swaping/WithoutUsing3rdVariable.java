package swaping;

public class WithoutUsing3rdVariable {

	public void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a:"+a+" b: "+b);
	}
	
	
	public static void main(String[] args) {
		int a=7;
		int b=5;
		System.out.println("Before Swapping a:"+a+" b: "+b);
		new WithoutUsing3rdVariable().swap(a,b);
	}

}
