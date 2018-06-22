package multithreading;
 class PraticThread extends Thread {

	
	public synchronized void display() {
		System.out.println("display method");
		
		try {wait(1000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("hello");
	}
	
	public synchronized void run() {
		display();
		
		
	}
}
public class PraticThreadClass {
public synchronized void hello() throws Exception {
	PraticThread praticThread = new PraticThread();
	praticThread.display();
		
	}
}

