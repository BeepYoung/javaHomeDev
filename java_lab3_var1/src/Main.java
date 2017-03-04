
public class Main {

	public static void main(String[] args) {
		try{
			int counter = new Integer(Integer.parseInt(args[0]));
			Store store = new Store();
			Writer writer = new Writer(store,counter);
			Reader reader = new Reader(store,counter);
			Thread t1 = new Thread(writer,"writer thread");
			t1.start();
			Thread.sleep(1000);
			Thread t2 = new Thread(reader,"reader thread");
			t2.start();
		//	System.out.println("Programm done!");
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
			System.exit(1);
		}
	}

}
