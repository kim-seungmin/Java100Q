//객체 생성시 초기값을 생성자 메서드에서 설정하는 클래스를 구현해 보시오
class Person{
	int age;
	String name;

	Person(int age, String name){
		this.age=age;
		this.name=name;
	}

	void printPerson(){
		System.out.println(this.age+" "+this.name);
	}
}
public class Java100_16{
	public static void main(String[] args){
		Person p1 = new Person(20,"홍길동");
		p1.printPerson();
	}
}
