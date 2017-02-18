
public class Main {
	private static int counter;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Worker(0));
		Thread t2 = new Thread(new Worker(1));
		
		t1.start();
		t2.start();
			
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(counter);
		

	}
	
	public static synchronized void increment(){
		counter++;
	}
	public static synchronized void decrement(){
		counter--;
	}

}
