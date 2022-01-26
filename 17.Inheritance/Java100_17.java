class car{
	int speed;
	int passenger;
	String name;
	void car(String name){
		this.name=name;
	}
}
class truck extends car{
	int carryWeight;
	truck(String name,int carryWeight){
		this.name=name;
		this.carryWeight=carryWeight;
	}
}
class Java100_17{
	public static void main(String[] args){
		truck cyber = new truck("AOSLC",500);
		cyber.passenger=4;
		System.out.print(cyber.name+" "+cyber.carryWeight+" "+cyber.passenger);
	}
}
