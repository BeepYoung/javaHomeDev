import java.util.Random;

public class Store {
	public synchronized void read() throws InterruptedException{

			this.wait();	
			info();
			System.out.println("I have read new integer: " + currInt);
			System.out.println();
			this.notify();
		
			
	}
	
	public synchronized void write() throws InterruptedException{
		synchronized(this){
			info();
			this.currInt = r.nextInt(9999);
			System.out.println("Number " + currInt + " just writed");
			System.out.println();
			this.notify();
			this.wait();
		}
	}
	
	public void info(){
		System.out.println("I works last. My name is " + Thread.currentThread().getName());
	}
	
	private Integer currInt;
	private Random r = new Random();
	
}
