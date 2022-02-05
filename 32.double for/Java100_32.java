public class Java100_32{
	public static void main(String[] args){
		for(int i=0;i<=3;i++){
			for(int j=0;j<10;j++){
				int output=i*10+j;
				if(output%2==1)continue;
				System.out.print(output+" ");
			}
		System.out.println("");
		}
	}
}
