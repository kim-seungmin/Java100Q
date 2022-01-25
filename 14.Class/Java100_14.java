// FarmMachine의 속성과 동작들을 가지고 클래스를 코드로 구현하고 객체를 생성하여 동작시켜 보시오
class FarmMachine{
	//?띿꽦
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
