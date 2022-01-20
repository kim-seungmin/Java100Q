public class Java100_04{
	public static void main(String[] args){
		int[] ar={1,2,3,4,5};
		for(int i: ar){
			System.out.println(i);
		}
		
		String[][] arr = {{"1-1","1-2","1-3","1-4","1-5"},{"2-1","2-2","2-3","2-4","2-5"}};
		for(String[] arrs : arr) {
			for(String s : arrs) {
				System.out.println(s);
			}
		}
	}
}
		