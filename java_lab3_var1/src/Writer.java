
public class Writer implements Runnable{
	private int comandCounter;
	private Store store;
//	private final Object sync = new Object();
	
	public Writer(Store store,int comandCounter){
		this.store = store;
		this.comandCounter = comandCounter;
	}
	
	public void run() {
//		while(comandCounter>0){
	//		synchronized(sync){
				try {
					store.write();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				comandCounter--;
	//			System.out.println(comandCounter);
	//			System.out.println();
	//		}
	//	}
	}
	
}
