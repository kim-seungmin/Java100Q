//��� ���� ���� �Է¹޾� �迭�� ������ �迭�� ���� �Է� �ް� ����Ͻÿ�
import java.util.Scanner;
public class Java100_05{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �� �Է�: ");
		int R = sc.nextInt();
		System.out.println("���� �� �Է�: ");
		int C = sc.nextInt();
		char[][] arr= new char[R][C];
		for(int i=0;i<R;i++){
			System.out.println(i+"���� �� �Է�:");
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
		