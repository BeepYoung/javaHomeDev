
public class Reader implements Runnable{
	private int comandCounter;
	private Store store;
//	private final Object sync = new Object();
	
	public Reader(Store store,int comandCounter){
		this.store = store;
		this.comandCounter = comandCounter;
	}
	
	public void run() {
	//	while(comandCounter>0){
	//		synchronized(sync){
				try {
					store.read();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				comandCounter--;
	//			System.out.println(comandCounter);
	//			System.out.println();
//			}
//		}
	}
	
}
