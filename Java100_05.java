//행과 열의 수를 입력받아 배열을 만든후 배열의 값을 입력 받고 출력하시오
import java.util.Scanner;
public class Java100_05{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행의 수 입력: ");
		int R = sc.nextInt();
		System.out.println("열의 수 입력: ");
		int C = sc.nextInt();
		char[][] arr= new char[R][C];
		for(int i=0;i<R;i++){
			System.out.println(i+"행의 값 입력:");
			String tempString=sc.next();
			for(int j=0;j<C;j++){				
				arr[i][j]= tempString.charAt(j);
			}
		}
		System.out.println("--------------------------------------------");
		for(char[] arrC: arr){
			for(char arrValue: arrC){
				System.out.println(arrValue);
			}
		}
		System.out.println("--------------------------------------------");
	}
}
		