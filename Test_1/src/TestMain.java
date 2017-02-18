
public class TestMain {
	public static void main(String argv[]){
		try{
		ProcessLab1 task1 = new ProcessLab1();
		task1.process(argv);
		}
		catch(Exception ex){
			System.err.println(ex.getMessage());
			System.exit(1);
		}
		System.out.println("It works!!!");
	}
}
