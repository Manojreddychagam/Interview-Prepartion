/*
In the Below example  we achieve MultiThreading Concept.
We have 3 Classes(expect main class) every class override the run method.
Every run method calls method which is inside the same class to execute some code.
Now we create three class object and the start method for each and every class by using particular reference variable.
In between that we write sleep to execute in flow 
By class the start method by reference variable of the particular class which inherits the properties of Thread Class .
On calling of start method it executes the run method inside that paticular class.
 */



package multithreading;

class One extends Thread{
	public void run() {
		try {
			this.firstValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void firstValue() throws InterruptedException {
		for(int i=1;i<10;i++) {
		System.out.print("1*");
		Thread.sleep(500);
		}
	}
}
class Two extends Thread{
	public void run() {
		try {
			this.secondvalue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void secondvalue() throws InterruptedException {
		
		for(int i=1;i<10;i++) {
		System.out.print(i+"=");
		Thread.sleep(500);
		}
	}
}
 class Three extends Thread{
	public void run() {
		try {
			this.thirdvalue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void thirdvalue() throws InterruptedException {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			
			Thread.sleep(500);
			
			}
	}
}

public class ByThreeClasses {
public static void main(String[] args) throws Exception {
	One one = new One();
	Two two = new Two();
	Three three = new Three();
	
	
	one.start();
	Thread.sleep(10);
	two.start();
	Thread.sleep(10);
	three.start();
	

	
}
}
