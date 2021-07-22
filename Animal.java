import java.time.Year;

/**
 * Animal parent class for our OOP Farm
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/06
 */
public class Animal {
	// Attributes
	protected String name = "";
	protected int yearBorn = 0;
	
	/**
	 * Constructor - born this year
	 * @param newName
	 * @param whenBorn
	 */
	public Animal(String newName, int whenBorn) {
		this.name = newName;
		this.yearBorn = whenBorn;
	}

	// Behaviors

	/**
	 * toString function
	 */
	public String toString() {
		return this.name+" born:"+yearBorn;
	}

	/**
	 * Eating
	 * @param howMuch
	 */
	public void eat(int howMuch) {
		System.out.println(this.name + " is eating");
	}

	/**
	 * Sleeping
	 * @param howMuch
	 */
	public void sleep(int howLong) {
		System.out.println(this.name + " is sleeping");
	}
	
	/**
	 * To Make noise
	 * @return
	 */
	public String makeNoise() {
		return "nothing";
	}
}