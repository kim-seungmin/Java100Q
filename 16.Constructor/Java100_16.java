//��ü ������ �ʱⰪ�� ������ �޼��忡�� �����ϴ� Ŭ������ ������ ���ÿ�
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
		Person p1 = new Person(20,"ȫ�浿");
		p1.printPerson();
	}
}
