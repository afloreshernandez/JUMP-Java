package Constructors;
/**
 * Class that represents a fraction
 * @author User
 *
 */
public class Fraction {
	
	private int num;
	private int denom;
	
	/**
	 * Default constructor. creates 0/1
	 */
	
	public Fraction() {
	this(0,1);

	}
	/**
	 * One parameter constructor, creates number/1
	 * @param int number
	 */
	
	public Fraction (int num) {
	this(num,1);
	}
	
	
	public Fraction(Fraction frac) {
		this.setNumerator(frac.getNumerator());
		this.setDenominator(frac.getDenominator());
	}
	
public Fraction(int num, int denom) {
	this.setNumerator(num);
	this.setDenominator(denom);
}


public int getNumerator() {
	return num;
}

public void setNumerator(int numerator) {
	this.num= numerator;
}

/**
 * Getter for Denominator
 * @return denominator the denominator
 */

public int getDenominator() {
	return denom;
}
/**Setter for Denominator
 * 
 * @param denominator the denominator
 */
public void setDenominator(int denom) {
	this.denom=denom;
}
/**Computes the fraction
 * 
 * @return the result of division
 */

public int compute() {
	return num/denom;
}
}