
public class Reader extends Thread{
	private int comandCounter;
	private Store store;
    
	
	public Reader(Store store,int comandCounter){
		this.setName("Reader");
		this.store = store;
		this.comandCounter = comandCounter;

	}
	
	public void run() {
		for(int i=0;i<comandCounter;i++){
			try {
				store.read();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
