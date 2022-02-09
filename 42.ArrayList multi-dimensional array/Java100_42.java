import java.util.ArrayList;

public class Java100_42{
	public static void main(String[] args){
		ArrayList<Integer[]> ar = new ArrayList<Integer []>();
		ar.add(new Integer[] {1,2,3});
		ar.add(new Integer[] {1,4,5});

		for(int i=0;i<ar.size();i++){
			System.out.println(i);
			for(int j=0;j<ar.get(i).length;j++){
				System.out.print(ar.get(i)[j]+" ");
			}
		}
	}
}
