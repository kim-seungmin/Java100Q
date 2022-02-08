class Sample<T>{
	private T obj;
	Sample(T x){this.obj=x;}
	T getObj(){return obj;}
	void printInfo(){System.out.println(obj.getClass().getName());}
}

public class Java100_39{
	public static void main(String[] args){

	Sample<String> s1 = new Sample<String>("Hi");
	s1.printInfo();
	System.out.println(s1.getObj());
	
	System.out.println("------------------------------------");
	Sample<Integer> s2 = new Sample<Integer>(100);
	s2.printInfo();
	System.out.println(s2.getObj());
	System.out.println("------------------------------------");
	
	System.out.println(s1.getObj());
	System.out.println(s2.getObj()+10);
	}
}
