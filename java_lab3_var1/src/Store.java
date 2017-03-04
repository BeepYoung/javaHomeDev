import java.util.Random;

public class Store {
	private Integer currInt;
	private Random r = new Random();
//	private final Object sync = new Object();
	
	public void read() throws InterruptedException{
/*		notify();
		info();
		System.out.println("Now we read " + currInt);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		synchronized(this){
			wait();
			System.out.println("I have read new integer: " + currInt);
			info();
		}
	}
	
	public void write() throws InterruptedException{
	/*	notify();
		info();
		currInt = r.nextInt();
		System.out.println("New integer is " + currInt);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		synchronized(this){
			currInt = r.nextInt();
			System.out.println("Number " + currInt + " just writed");
			info();
		}
		
		
	}
	
	public void info(){
		System.out.println("I works last. My name is " + Thread.currentThread().getName());
		System.out.println();
	}
}
