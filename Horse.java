import java.util.Calendar;
/**
 * Horse child class for OOP Farm
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/06
 */
public class Horse extends Animal {
	// Attributes
	protected int milesTravelledToday = 0;
	protected Calendar lastTookBath = null;


	/**
	 * Constructor
	 * @param newName
	 * @param whenBorn
	 */
	public Horse(String newName, int whenBorn) {
		super(newName, whenBorn);
		milesTravelledToday = 7;
		this.lastTookBath = Calendar.getInstance();
	}

	// Behaviors
	/**
	 * toString function
	 */
	public String toString() {
		return super.toString()+" numOfMiles:"+this.milesTravelledToday;
	}

	/**
	 * Ask Horse to Travel miles
	 * @param howMuch
	 */
	public int travelMiles() {
		System.out.println("The horse travelled "+this.milesTravelledToday+" miles");
		return this.milesTravelledToday;
	}

	/**
	 * Ask Horse to take a bath
	 * @return amount of L used
	 */
	public int takeBath() {
		System.out.println("The horse took a bath today");
		this.lastTookBath = Calendar.getInstance();		
		return 4;
	}


	/**
	 * Make some Noise
	 */
	public String makeNoise() {
		System.out.println("neigh");
		return "neigh";
	}
}
