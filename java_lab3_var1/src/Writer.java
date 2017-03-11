
public class Writer implements Runnable{
	private int comandCounter;
	private Store store;
	private Object sync = new Object();
	
	public Writer(Store store,int comandCounter, Object o){
		this.store = store;
		this.comandCounter = comandCounter;
		this.sync = o;
	}
	
	public void run() {

		while(comandCounter>0){
			try {
				synchronized(sync){
					store.write();
					sync.wait();
					sync.notify();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			comandCounter--;
		}
	}
}
