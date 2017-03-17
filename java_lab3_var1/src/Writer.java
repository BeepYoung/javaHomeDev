
public class Writer extends Thread{
	private int comandCounter;
	private Store store;
	
	public Writer(Store store,int comandCounter){
		this.setName("Writer");
		this.store = store;
		this.comandCounter = comandCounter;
	}
	

	
	public void run() {
		for(int i = 1;i<=comandCounter;i++){
			System.out.println("Number of operation is " + i);
			try {
				store.write();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
