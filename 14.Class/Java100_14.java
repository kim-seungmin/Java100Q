// FarmMachine�� �Ӽ��� ���۵��� ������ Ŭ������ �ڵ�� �����ϰ� ��ü�� �����Ͽ� ���۽��� ���ÿ�
class FarmMachine{
	//?�성
	int price;
	int year;
	String color;
	
	void move(){
		System.out.println("moving");
	}
	void dig(){
		System.out.println("dig");
	}
	void grind(){
		System.out.println("grinding");
	}

}
public class Java100_14{
	public static void main(String[] args){
		FarmMachine fm  = new FarmMachine();		
		
		fm.price=10000;
		fm.year=2020;
		fm.color="blue";
		
		fm.move();
		fm.grind();
		fm.dig();
	}
}
