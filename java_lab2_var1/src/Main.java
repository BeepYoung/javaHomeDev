import java.util.Random;

public class Main {

	public static void main(String[] args) {
		try{
			Integer ArraySize = new Integer(args[0]);
			Creep[] creeps = new Creep[ArraySize];
			Random rand = new Random();
			System.out.println("Count of creeps " + ArraySize);
			for(int i = 0; i<ArraySize;i++){
				if(rand.nextInt(2) == 0){
					creeps[i] = new Snake();
				}
				else{
					creeps[i] = new Dog();
				}
			}

			for(int i = 0;i<ArraySize;i++){
				creeps[i].whoAmI();
				System.out.println();
			}
			
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		
	}

}
