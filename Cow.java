import java.util.Calendar;
/**
 * Cow child class for OOP Farm
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/10/06
 */
public class Cow extends Animal {
	// Attribute
	protected Calendar lastMilked = null;
	protected boolean noseRing = false;
	
	/**
	 * Constructor
	 * @param newName
	 * @param whenBorn
	 */
	public Cow(String newName, int whenBorn, boolean nose) {
		super(newName, whenBorn);
		this.noseRing = nose;
		this.lastMilked = Calendar.getInstance();
	}

	// Behaviors
	/**
	 * toString function
	 */
	public String toString() {
		return super.toString()+" noseRing:"+this.noseRing;
	}
	
	/**
	 * Ask Cow to produce milk
	 * @return amount of milk in L
	 */
	public int produceMilk() {
		System.out.println("The cow produced milk today");
		this.lastMilked = Calendar.getInstance();		
		return 10;
	}

	
	/**
	 * Make some Noise
	 */
	public String makeNoise() {
		System.out.println("moo");
		return "moo";
	}
}