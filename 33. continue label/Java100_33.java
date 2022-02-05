public class Java100_33{
	public static void main(String[] args){
		outerloop:
		for(int i=0;i<=3;i++){
			for(int j=0;j<10;j++){
				int output=i*10+j;
				if(output%2==1){
					if(j==1){
						continue outerloop;
					}
					continue;
				}
				System.out.print(output+" ");
			}
		System.out.println("");
		}
	}
}
