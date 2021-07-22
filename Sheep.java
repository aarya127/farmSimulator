import java.util.Calendar;

/**
 * Sheep child class for OOP Farm
 * @author Aarya Shah
 * @course ICs4UC
 * @date 2020/10/06
 */

public class Sheep extends Animal {
	// Attribute
	Calendar lastShaved = null;
	String woolColour = "white";
	
	/**
	 * Constructor
	 * @param newName
	 * @param whenBorn
	 * @param colour of the wool
	 */
	public Sheep(String newName, int whenBorn, String colour) {
		super(newName, whenBorn);
		this.woolColour = colour;
	}

	// Behaviors
	/**
	 * toString function
	 */
	public String toString() {
		return super.toString()+" colour:"+this.woolColour;
	}
	
	/**
	 * Ask to produce wool
	 * @return amount of cubic feet
	 */
	public int produceWool() {
		System.out.println("The sheep shaved wool today");
		this.lastShaved = Calendar.getInstance();		
		return 5;
	}

	
	/**
	 * Make some Noise
	 */
	public String makeNoise() {
		System.out.println("baa");
		return "baa";
	}
}