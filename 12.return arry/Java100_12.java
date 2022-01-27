//2개의 정수형 값을 리턴하는 메서드를 구현하시오
class Java100_12{
	public static int[] testMethod(){
		int num1=100;
		int num2=200;
		return new int[] {num1,num2};		
	}	
	public static void main(String[] args){
		int result[] = testMethod();
		for(int i:result)System.out.println(i);
	}
}