package multithreading;



public class SecondClass {
public static void main(String[] args) throws Exception {
	PraticThread praticThread = new PraticThread();
	System.out.println(praticThread.isDaemon());
	praticThread.display();
	new PraticThreadClass().hello();
	System.out.println("in Secomd Class");
	System.out.println(praticThread.isDaemon());
}
}
