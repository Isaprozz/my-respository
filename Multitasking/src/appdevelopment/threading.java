package appdevelopment;

public class threading extends Thread {
	//first program under threading
	@Override
	public void run() {
	
		for(int j=0;j<60;j++) {
			//changing the minutes
			for(int i=0;i<60;i++) {
				//this is counting seconds that count a minute
			System.out.println("Seconds:"+i);
			//this makes the figures sleep for some time before changing
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			}
			System.out.println("Minutes:"+(j+1));
		}
		
	}
	public static void main(String[] args) {
		threading thread=new threading();
		//threading thread2=new threading();
		
		thread.start();
		//thread2.start();
	}

}
