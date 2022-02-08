class Person{

	public Object obj;

	Person(Object obj){this.obj=obj;}
}

class Student {

	public int grade;

	Student(int grade){this.grade=grade;}
}


class Teacher {}

public class Java100_38{
	public static void main(String[] args){
		Person p1 = new Person(new Student(2));
		System.out.println(p1.obj); //Student@address
		Teacher t1 = (Teacher)p1.obj; //not err in compile but in excute
	}
}
