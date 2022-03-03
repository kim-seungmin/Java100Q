import java.util.*;

class Student{
	int num;
	String name;
	
	public Student(int num, String name){
			this.num=num;
			this.name=name;
	}
	
	public String toString(Student s){
		return name;
	}
}

public class Java100_48{
	public static void main(String[] args){
		Student array[]={new Student(1, "K"), new Student(2,"S")};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list, (Student s1, Student s2)->{return (s1.num-s2.num);});
	}
}
