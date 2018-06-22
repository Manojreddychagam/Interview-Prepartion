package multithreading;

class FirstRunnable {
	int a;
	boolean set=false;

	public synchronized void add(int a) throws Exception {
		while(set) {
			wait();
		}
		System.out.println("add:"+ a);
		this.a = a;
		set=true;
		notify();
	}

	public synchronized void display() throws Exception { 
		
		while(!set) {
			wait();
		}
		System.out.println("display:"+a);
		set=false;
		notify();
	}
}

class Producer implements Runnable {
	FirstRunnable firstRunnable;

	public Producer(FirstRunnable firstRunnable) {
		this.firstRunnable = firstRunnable;
		Thread thread = new Thread(this, "Producer");
		thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				firstRunnable.add(i++);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Consumer implements Runnable {
	FirstRunnable firstRunnable;
	public Consumer(FirstRunnable firstRunnable) {
this.firstRunnable=firstRunnable;
Thread thread = new Thread(this,"Consumer");
thread.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				firstRunnable.display();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class ByUsingRunnable {
public static void main(String[] args) {
	FirstRunnable firstRunnable = new FirstRunnable();
	System.out.println("1");
	new Producer(firstRunnable);
	System.out.println("2");
	new Consumer(firstRunnable);
	System.out.println("3");
}
}
