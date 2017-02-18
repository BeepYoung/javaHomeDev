
public class Worker implements Runnable {
	private int mod;
	
	Worker(int mod){
		this.mod = mod;
	}
	@Override
	public void run() {
		
			if(mod == 1){
				for(int i = 0; i<1000; i++){
				Main.decrement();
				}
			}
			if(mod == 0){
				for(int i = 0; i<1600; i++){
				Main.increment();
				}
			}
		
	}
	
}
