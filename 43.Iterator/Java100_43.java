import java.util.ArrayList;
import java.util.Iterator;

public class Java100_43{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		Iterator<String> iter = list.iterator();

		while(iter.hasNext()){
			String str = iter.next();
			if("C".equals(str)){
				System.out.println("delet C");
				iter.remove();
			}else System.out.println(str);
		}
		for(String str: list)System.out.print(str+" ");
	}
}
