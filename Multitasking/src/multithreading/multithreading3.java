package multithreading;

public class multithreading3 implements Runnable {
	//this is the second class that implements the runnable class
	public void run() {
for(int j=0;j<5;j++) {
	System.out.println("Second program to be implemented by the runnable class");
}
try {Thread.sleep(100);}catch(InterruptedException e){}
}
	
	
	public static void main(String[] args) {
		//In this case we need to create objects for the two multithreading classes
		multithreading2 obj1=new multithreading2();
		multithreading3 obj2=new multithreading3();
		Thread t1=new Thread(obj1);
		Thread t2 =new Thread(obj2);
		t1.start();
		try {Thread.sleep(10);}catch(InterruptedException e) {}
		t2.start();
		try {t1.join();} catch (InterruptedException e) {}
		try{t2.join();}catch(InterruptedException e) {}
		System.out.println("I am printed by the main thread");
	}
}
