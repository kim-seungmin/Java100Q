abstract class car{
	abstract void run();
}
class truck extends car{
	void run(){System.out.println("truk BOOOOOOOO");}
}
class ambul extends car{
	void run(){System.out.println("ambul SIREN");}
}
class sport extends car{
	void run(){System.out.println("sport Bim");}
}
class Java100_25{
	public static void main(String[] args){
		car[] cars = {new truck(), new ambul(), new sport()};
		for(int i=0;i<3;i++){
			cars[i].run();
		}
		System.out.println("-----------------------------------");
		for(car obj: cars){
			obj.run();
		}
	}
}
