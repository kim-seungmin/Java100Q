import java.util.Arrays;

public class Java100_03{
	public static void main(String[] args){
		int[] ar1={1,2,3,4,5};
		int[] ar2={1,2,3,4,5,6,7,8};
		
		System.arraycopy(ar1,2,ar2,4,3);
		System.out.println(Arrays.toString(ar1)); //[1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(ar2)); //[1, 2, 3, 4, 3, 4, 5, 8]
	}
}