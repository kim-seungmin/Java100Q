//��ȯ���� 2�� �ִ� �޼��带 ������ ���ÿ�
//�޼���� ("korea","USA")�Է½� �ҹ��ڴ� �빮�ڷ� �빮�ڴ� �ҹ��ڷ� ��µǵ��� �����Ѵ�
import java.util.Arrays;
class Java100_13{
	public static String[] capitalMethod(String a,String b){
		a=a.toUpperCase();
		b=b.toLowerCase();
		return new String[] {a,b};
	}
	public static void main(String[] args){
		String[] result=capitalMethod("korea","USA");
		System.out.print(Arrays.toString(result));
	}
}