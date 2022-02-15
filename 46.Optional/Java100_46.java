import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

class c1{
	 private static Map<Integer, String> store = new HashMap<>();
	public String returnErr(){
		return (store.get(0));
	}
	public Optional<String> returnNull(){
		return Optional.ofNullable(store.get(0));
	}
	public void setMap(){
		store.put(0, "A");
	}
}



public class Java100_46 {
	public static void main(String[] arg) {
		c1 re = new c1();
		System.out.println(re.returnNull()); //Optional.empty
		System.out.println(re.returnErr()); //null
		
		re.setMap();
		System.out.println(re.returnNull()); //Optional[A]
		System.out.println(re.returnErr()); //A
		
		Optional<String> s1 = re.returnNull();
		System.out.println(s1.get()); //A
	}
}
		