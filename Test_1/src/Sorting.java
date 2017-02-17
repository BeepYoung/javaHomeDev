
public class Sorting {
	public static void Sort(Integer[] data){
		for(int i = 0;i < data.length;i++){
			for(int j = i;j < data.length;j++){
				if(data[i]>data[j]){
					int c = data[i];
					data[i] = data[j];
					data[j] = c;
				}
			}
		}
	}
}
