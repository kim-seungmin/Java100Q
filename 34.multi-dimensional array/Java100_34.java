public class Java100_34{
	public static void main(String[] args){
		char[][] ar = new char[][]{
			{'O','O','O','O','O'},
			{'O','O','O','O','O'},
			{'O','O','X','O','O'},
			{'O','O','O','O','O'},
			{'O','O','O','O','O'}
		};
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]);
			}
			System.out.println("");
		}
	}
}
