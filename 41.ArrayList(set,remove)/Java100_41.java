import java.util.ArrayList;
public class Java100_41{
	public static void main(String[] args){
		ArrayList<String> al1 = new ArrayList<String>();

		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		
		System.out.println(al1.get(0));
		String str = al1.get(0); //not err cause generic <String>
		
		al1.set(0,"A1");
		System.out.println(al1.get(0));
		
		al1.remove(0);
		System.out.println(al1.get(0));
		
		System.out.println("-----------");
		for(String al1In: al1)
			System.out.println(al1In);
		al1.removeAll(al1);
		
		System.out.println("-----------");
		for(String al1In: al1)
			System.out.println(al1In);
	}
}