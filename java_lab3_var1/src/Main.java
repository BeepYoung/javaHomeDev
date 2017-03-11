
public class Main {

	public static void main(String[] args) {
		try{
			Object sync = new Object();
			int counter = new Integer(Integer.parseInt(args[0]));
			Store store = new Store();
			Thread t1 = new Thread(new Writer(store,counter,sync),"writer");
			Thread t2 = new Thread(new Reader(store,counter,sync),"reader");
			
			t1.start();
			t2.start();
			
		//	System.out.println("Program done!");
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
			System.exit(1);
		}
	}

}
