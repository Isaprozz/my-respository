package multithreading;

public class lambda4 implements Runnable{
	public void run() {
		
	}

	public static void main(String[] args) {
		//these two threads can be implemented using the lambda expression in the main thread
		
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++){
			System.out.println("from thread 1: "+(i+1));
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
		
		//this second thread prints from 1 to 5
		}
		      );
		System.out.println("The name of the first thread:"+t1.getName());
		Thread t2=new Thread(() ->
		{
			for(int i=0;i<5;i++) {
				System.out.println("from thread 2: "+i);
				try {Thread.sleep(1000);}catch(InterruptedException e) {}
			}
			
			//this thread prints numbers from 0 to 4
		}
				);
		System.out.println("is thread one alive"+t1.isAlive());
		System.out.println("The name of the second thread:"+t2.getName());
		t1.start();
		t1.setPriority(9);//setting the priority of the first thread to 9
		t1.setName("thread one");
		System.out.println("The name of the first thread:"+t1.getName());
		System.out.println("is thread one alive"+t1.isAlive());
		t2.start();
		t2.setName("thread two");
		t2.setPriority(1);//setting the thread two to 1
		System.out.println("The name of the second thread:"+t2.getName());
		System.out.println("is thread two alive"+t2.isAlive());
		try{t1.join();}catch(InterruptedException e) {};
		try{t2.join();}catch(InterruptedException e) {};
		
		System.out.println("This is the main thread");//this is the main thread
		
		

	}

}
