//반환값이 2개 있는 메서드를 구현해 보시오
//메서드는 ("korea","USA")입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다
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