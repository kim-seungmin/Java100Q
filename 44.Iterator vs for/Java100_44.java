import java.util.ArrayList;
import java.util.Iterator;

public class Java100_44{
	public static void main(String[] args){

		ArrayList<Integer> ar = new ArrayList<>();

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);

		Iterator<Integer> iter = ar.iterator();

		// for(Integer i: ar) ar.remove(i); 		ERR cause ar size change in for loop
		// for(Integer i: ar) if(i==2) list.remve(i);  	ERR

		while(iter.hasNext()){
			Integer i = iter.next();
			if(i==2){
				iter.remove();
			}
		}

		for(Integer i: ar)System.out.print(i+" ");
	}
}
