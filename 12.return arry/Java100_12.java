//2���� ������ ���� �����ϴ� �޼��带 �����Ͻÿ�
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