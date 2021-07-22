/**
 * Chicken child class for OOP Farm
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/06
 */

public class Chicken extends Animal {
	// Attribute
	protected int numEggsPerWeek = 0;
	
	/**
	 * Constructor
	 * @param newName
	 * @param whenBorn
	 */
	public Chicken(String newName, int whenBorn) {
		super(newName, whenBorn);
		numEggsPerWeek = 2;
	}

	// Behaviors
	/**
	 * toString function
	 */
	public String toString() {
		return super.toString()+" numEggs:"+this.numEggsPerWeek;
	}
	
	/**
	 * Ask Chicken to Lay Eggs
	 * @param howMuch
	 */
	public int layEggs() {
		System.out.println("The chicken laid "+this.numEggsPerWeek+" eggs");
		return this.numEggsPerWeek;
	}

	/**
	 * Make some Noise
	 */
	public String makeNoise() {
		System.out.println("cluck");
		return "cluck";
	}
}