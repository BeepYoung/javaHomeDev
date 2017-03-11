
public class Reader implements Runnable{
	private int comandCounter;
	private Store store;
	private Object sync = new Object();
	
	public Reader(Store store,int comandCounter, Object o){
		this.store = store;
		this.comandCounter = comandCounter;
		this.sync = o;
	}
	
	public void run() {
		while(comandCounter>0){
			try {
				synchronized(sync){
					store.read();
					sync.notify();
					sync.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			comandCounter--;
		}
	}
	
}
