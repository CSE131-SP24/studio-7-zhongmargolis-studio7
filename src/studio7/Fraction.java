package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int top, int bottom) {
		numerator = top;
		denominator = bottom;
	}
	
	public String getFraction() {
		return numerator + "/" + denominator;
	}
	
	public Fraction add(int top, int bottom) {
		int dmultiplied = this.denominator * bottom;
		int existing = this.numerator * bottom;
		int compare = top * this.denominator;
		
		int nmultiplied = existing + compare;
		
		Fraction toreturn = new Fraction(nmultiplied, dmultiplied);
		return toreturn;
	}
	
	public Fraction multiply(int top, int bottom) {
		Fraction multiplied = new Fraction(top * this.numerator, bottom * this.denominator);
		return multiplied;
	}
	
	public Fraction reciprocal() {
		Fraction reciprocal = new Fraction(this.denominator, this.numerator);
		return reciprocal;
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public Fraction simplify() {
		Fraction simple = new Fraction(this.numerator / gcd(this.numerator, this.denominator), this.denominator / gcd(this.numerator, this.denominator));
		return simple;
	}

}
