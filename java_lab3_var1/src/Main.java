
public class Main {

	public static void main(String[] args) {
		try{
			int numComands = new Integer(args[0]);
			Store someStore = new Store();
			Writer writer = new Writer(someStore,numComands);
			Reader reader = new Reader(someStore,numComands);
			
			reader.start();
			writer.start();
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
		}
	}

}
