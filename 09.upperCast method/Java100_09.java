//반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현하여 보시오
public class Java100_09{
	public static String capitalMethod(String inputString){
		inputString=inputString.toUpperCase();
		return inputString;
	}
	public static void main(String[] args){
		String rst;
		rst=capitalMethod("korea");
		System.out.print(rst);
	}
}	