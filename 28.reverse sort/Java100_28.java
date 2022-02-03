import java.util.Arrays;
import java.util.Collections;

class Java100_28{
	public static void main(String[] args){
		Integer [] arr = {40,50,10,30,70,80};
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i: arr)System.out.println(i);
	}
}
