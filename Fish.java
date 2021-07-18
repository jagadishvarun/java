package inheritance;

public class Fish extends Animal{

	public Fish(String eat, String rest, String move, String sleep) {
		super(eat, rest, move, sleep);
		// TODO Auto-generated constructor stub
		
	}

	
	public void name() {
		System.out.println("fish name is Goldfish");
	}
	public void eat() {
		System.out.println("fish eat sludge worms and water fleas");
	}
	public void move() {
		System.out.println("fish move by flexing their bodies and tail back and forth");
	}
	public void sleep() {
		System.out.println("fish sleeps in water only");
	}
	
	
	
}
