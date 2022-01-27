class car{
	int speed;
	int passenger;
	String name;
	car(String name){
		this.name=name;
	}
	void printState(){
		System.out.print(this.name+" "+this.speed+" "+this.passenger);
	}

	public String getName(){return name;} //getter
	public void setName(String name){this.name=name;} //setter
}
class truck extends car{
	int carryWeight;
	truck(String name,int carryWeight){
		super(name);
		this.carryWeight=carryWeight;
	}
	void printState(){
		super.printState();
		System.out.print(" "+this.carryWeight);
	}
}
class Java100_19{
	public static void main(String[] args){
		truck cyber = new truck("AOSLC",500);
		cyber.setName("DSEA");
		System.out.print(cyber.getName());
	}
}
