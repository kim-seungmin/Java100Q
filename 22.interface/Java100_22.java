interface Animal{
	public abstract void cry();
	public abstract void move();
}
interface Worker{
	public abstract int morePay(int more);
	int lesspay=10000;
}

class Human implements Animal, Worker{
	public void cry(){System.out.println("HI");}
	public void move(){System.out.println("on foot");}
	public int morePay(int more){return lesspay+more;}
}

class Java100_02{
	public static void main(String[] args){
		Human James = new Human();
		James.cry();
		System.out.println(James.morePay(1000));
	}
}
