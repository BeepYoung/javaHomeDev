
public class Snake extends Creature implements Wriggle {
	
	private String name = new String("Snake");
	
	public void whoAmI(){
		System.out.println("I'm " + name);
	}

	@Override
	public void activity() {
		whoAmI();
		creep();
		wriggle();
	}

	@Override
	public void creep() {
		System.out.println("I can creep");
	}

	@Override
	public void wriggle() {
		System.out.println("I can wriggle");
	}
	
}
