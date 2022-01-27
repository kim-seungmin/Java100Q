//static 선언이 없는 메서드를 활용하는 방법에 대해서 코드로 구현해 보시오
public class Java100_10{
	public void helloWorld(){
		System.out.println("Hello World");
	}
	public static void main(String[] args){
		Java100_10 hi = new Java100_10();
		hi.helloWorld();
	}
}