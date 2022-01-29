abstract class Animal{
	abstract void cry();
}
class Dog extends Animal{
	void cry(){System.out.println("bow wow");}
}

public class Java100_21{
	public static void main(String[] args){
		Dog dd = new Dog();
		dd.cry();
	}
}
