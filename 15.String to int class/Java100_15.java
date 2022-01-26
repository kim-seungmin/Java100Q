//문자열을 숫자로 바꿔서 연산해 보시오. 이떄 인자값으로 진수를 지정해서 출력해 보시오
public class Java100_15{
	public static int sum(String a,String b,int c){
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		int c1=Integer.parseInt(Integer.toString(a1+b1),c);
		return c1;
	}
	public static void main(String[] args){
		String numA = "1";
		String numB = "2";
		int c=10;
		System.out.println(sum(numA,numB,c));
	}
}
