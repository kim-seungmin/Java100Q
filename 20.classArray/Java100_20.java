class Person{
	private String name;
	private int age;
	
	Person() {}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	
	public int getAge(){return age;}
	public void setAge(int age){this.age=age;}
}

class Java100_20{
	public static void main(String[] args){	
		Person[] pa = new Person[5];
		pa[0]=new Person("H",20);
		pa[1]=new Person("K",21);
		pa[2]=new Person("A",15);
		pa[3]=new Person("o",24);
		pa[4]=new Person("G",42);

		for(int i=0;i<5;i++){
			System.out.println(pa[i].getName()+"\t"+pa[i].getAge());
		}
	}
}
