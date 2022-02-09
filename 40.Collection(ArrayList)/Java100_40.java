import java.util.ArrayList;
public class Java100_40{
	public static void main(String[] args){

		ArrayList list1 = new ArrayList();

		list1.add("kim");
		list1.add(13);
		list1.add("J");
		list1.add(1425);

		System.out.println((String)list1.get(0)); //.get() = object
		System.out.println((int)list1.get(1));
		
		System.out.println(list1.size());
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i)+" ");
		}
	}
}