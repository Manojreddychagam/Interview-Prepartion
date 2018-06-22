package multithreading;

/*The class which extends the Thread class must run by using run method then only we achieve the threads concept.
In the below example main class ByThreadClass and The First is extends the Thread class and having two methods i.e
run() ,display() by using method we can call the display method the we achieve the thread concept.
In display method we another method i.e sleep by  the sleep() we stop the execution of the program for a particular time and
the time must in mile seconds (1sec=1000ms).If we stop the program from second we pass value 1000 by a method parameter
we use start method to call the run then we achieve the Thread Concept
*/
class First extends Thread{
	int j;
	int b=0;
	public void run() {
		try {
			this.dispaly();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void dispaly() throws Exception {
		for(int i=1;i<10;i++) {
			for (j=1;j<=i;j++) {
				b=b+1;
			System.out.print(b +" ");
			Thread.sleep(500);
		}
		
		System.out.println(" ");
	}
}
}
public class ByThreadClass {

	
public static void main(String[] args) {
	First first = new First();
	first.start();
}
}
