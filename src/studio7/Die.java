package studio7;

public class Die {

	private int sides;

	public Die(int mysides) {
		sides = mysides;
	}
	
	public int getDie() {
		return this.sides;
	}

	public int throwDie() {
		return (int) (Math.random() * this.sides) + 1;
	}

}