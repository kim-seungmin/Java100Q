public class Java100_31{
	public static void main(String[] args){
		int num=1;
		while(num<=30){
			if(num%2==1){
				num++;
				continue;
			}
			System.out.print(num+" ");
			num++;
		}
	}
}
