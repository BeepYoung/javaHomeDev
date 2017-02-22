import java.util.Random;

public class Main {

	public static void main(String[] args) {
		try{
			Integer ArraySize = new Integer(args[0]);
			Creature[] creeps = new Creature[ArraySize];
			Random rand = new Random();
			for(int i = 0; i<ArraySize;i++){
				if(rand.nextInt(2) == 0){
					creeps[i] = new Snake();
				}
				else{
					creeps[i] = new Dog();
				}
			}

			for(int i = 0;i<ArraySize;i++){
				creeps[i].activity();
				System.out.println();
			}
			
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		
	}

}
