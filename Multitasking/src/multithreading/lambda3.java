package multithreading;

public class lambda3 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Numbers from thread 1"+i);
		}
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		//this thread prints numbers from 0 to 4
	}
	

}
