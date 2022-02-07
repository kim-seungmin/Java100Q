class sample{
	private Object obj;
	sample(Object x){
		this.obj=x;
	}

	public Object getObj(){
		return obj;
	}

	public void printInfo(){
		System.out.println(obj.getClass().getName());
	}
}

public class Java100_37{
	public static void main(String[] args){
		int s1Input=1;
		String s2Input="S2";

		sample s1 = new sample(s1Input);
		System.out.println(s1.getObj());
		s1.printInfo();

		System.out.println("----------------");
		sample s2 = new sample(s2Input);
		System.out.println(s2.getObj());
		s2.printInfo();

		System.out.println("------------");
		//int num = s1.getObj(); err
		//String str = s2.getObj() err
		int num=(int)s1.getObj();
		String str=(String)s2.getObj();
		System.out.println(num+" "+str);
	}
}
