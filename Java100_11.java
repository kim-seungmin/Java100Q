//���� �޼��忡�� ���� 100�� Call by reference ������� �޼��带 ȣ���ϴ� �ڵ带 ���� �Ͻÿ�.
class TestNumber{
	int num;
	TestNumber(int num){this.num=num;}
}

class Java100_11{
	
	public static void sum(TestNumber a){
		a.num += 400;
		System.out.println(a.num);
	}
	
	public static void main(String[] args){		
		TestNumber a = new TestNumber(100);
		sum(a);
		System.out.println(a.num);
	}
	
}