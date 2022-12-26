package multithreading;

public class multithreading2 implements Runnable{
	//in this example we are gonna create a thread using implements the runnable class
	public void run() {
for(int i=0; i<10;i++) {
	System.out.println("first thread in multithreading that implements runnable class");
	
}
try {Thread.sleep(100);} catch (InterruptedException e) {}//100  milliseconds
}
}
