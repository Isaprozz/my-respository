package multithreading;

public class lambda implements Runnable{
	//the lambda expression summarizes code especially when code is to be used only one time
	

	public static void main(String[] args) {
		Thread one=(() ->
				for(int i=0; i<10;i++) {
			System.out.println("first thread in multithreading that implements runnable class");
			
		}
		try {Thread.sleep(100);} catch (InterruptedException e) {}//100  milliseconds
		,"thread one");
		Thread two =(() ->
				for(int j=0;j<5;j++) {
			System.out.println("Second program to be implemented by the runnable class");
		}
		try {Thread.sleep(100);}catch(InterruptedException e){}
		,"thread two");
one.start();
try {Thread.sleep(100);}catch(Interrupted e) {}
two.start();
one.join();
two.join();

System.out.println(one.getName());
System.out.println(two.getName());
one.setName("first thread");
two.setName("Second thread");
System.out.println(one.getName());
System.out.println(two.getName());
one.setPriority(2);
two.setPriority(8);

System.out.println(one.getName());
System.out.println(two.getName());

System.out.println(one.getPriority());
System.out.println(two.getPriority());


System.out.println("Am the main thread");
	
}
	}

}
