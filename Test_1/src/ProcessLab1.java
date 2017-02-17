
public class ProcessLab1 {
	
	
	public int process(String args[]){
		if(args.length !=3){
			System.err.println("Wrong number of arguments!");
			return 1;
		}
		Integer[] proc_data = new Integer[args.length];
		
		for(int i=0;i < args.length;i++){
			proc_data[i] = Integer.parseInt(args[i]);
			if(proc_data[i]<=0){
				System.err.println("Wrong arguments. Negative value");
				return 2;
			}
		}
		System.out.println("List of arguments:");//just print
		for(int i=0;i < proc_data.length;i++){
			System.out.println(proc_data[i]);
		}
		System.out.println();
		Sorting.Sort(proc_data);
		Integer divider = new Integer(proc_data[0]);
		while(divider!=1){
			Boolean condition = new Boolean(true);
			for(int i=0;i < proc_data.length;i++){
				if((proc_data[i] % divider)!=0){
					condition = false;
				}
			}
			if(condition){
				break;
			}
			--divider;
		}
		System.out.println("The highest divider is:");
		System.out.println(divider);
		return 0;
	}
}
