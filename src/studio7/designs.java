package studio7;

public class designs {

	public static void main(String[] args) {
		Rectangle silly = new Rectangle(4, 3);
		
		System.out.println(silly.getLength());
		System.out.println(silly.getWidth());
		
		boolean square = silly.Square();
		System.out.println(square);
		
		Rectangle sillier = new Rectangle(5,  5);
		boolean smaller = silly.smallerArea(sillier);
		System.out.println(smaller);
		
		Die wow = new Die(7);
		for (int i = 0; i < 5; i++) {
			System.out.println(wow.throwDie());
		}

	}

}
