
public class Dog extends Creature implements Creep{
	
	private String name = new String("Dog");
	
	public void whoAmI(){
		System.out.println("I'm " + name);
	}

	@Override
	public void creep() {
		System.out.println("I can creep");
		
	}

	@Override
	public void activity() {
		whoAmI();
		creep();
		
	}
}
