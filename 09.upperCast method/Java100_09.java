//��ȯ���� �ְ� �޴� ���ڰ��� �ִ� �빮�� ��� �޼��带 �����Ͽ� ���ÿ�
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