import java.util.Arrays;
class Java100_27{
	public static void main(String[] args){
		int[] intArry = new int[5];
		for(int i=0;i<5;i++){
			intArry[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(intArry));
		Arrays.sort(intArry);
		System.out.println(Arrays.toString(intArry));
	}
}
