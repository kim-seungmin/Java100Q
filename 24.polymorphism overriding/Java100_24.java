class human{
	void sayHi(){System.out.println("Hello");}
}
class student extends human{
	void sayHi(){System.out.println("HI");}
	void sayBye(){System.out.println("Bye");}
}

class Java100_24{
	public static void main(String[] args){
		human james = new student();
		james.sayHi();	//HI
		//james.sayBye(); //err
		((student)james).sayBye(); //Bye
	}
}
