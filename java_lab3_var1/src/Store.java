import java.util.Random;

public class Store {
	
	public void read() throws InterruptedException{
			info();
			System.out.println("I have read new integer: " + currInt);
			System.out.println();
	}
	
	public void write() throws InterruptedException{
			info();
			currInt = r.nextInt(9999);
			System.out.println("Number " + currInt + " just writed");
			System.out.println();
	}
	
	public void info(){
		System.out.println("I works last. My name is " + Thread.currentThread().getName());
	}
	
	private Integer currInt;
	private Random r = new Random();
	
}
