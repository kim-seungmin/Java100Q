//메인 메서드에서 정수 100을 Call by reference 방식으로 메서드를 호출하는 코드를 구현 하시오.
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