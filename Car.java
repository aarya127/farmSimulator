/**
 * This is a program with classes, attributes, objects and methods
 * @author Aarya Shah
 * @course ICS4UC
 * @date 2020/09/30
 */
public class Car {
	//Attributes
	private String make = "";
	private String model = "";
	private String colour = "";
	private String condition = "";
	private int year = 0;
	private int odometer = 0;
	private boolean gasRemaining = false;
	private boolean engineRunning = false;

	//Constructor
    public Car(String make, String model, String colour, int year, int odometer, String condition) {
		//Set data as attributes
    	this.condition = condition;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engineRunning = false;

         //Year cannot be in future
		if (year > 2020) {
			this.year = 2020;
		} 
		else {
			this.year = year;
		}
		//Set a number for odometer above or equal to 0
		if (odometer > 0) {
			this.odometer = odometer;
		}
		else {
			this.odometer = 0;
		}
    } 	

    //Default Constructor
    public Car()
	{
		//Default attributes
		this("VW", "Golf", "White", 2015, 25000, "Good");
	}
    
    /**
     *  toString function
     */
 	public String toString( ) {
 	   String result = this.condition+" "+this.year+" "+this.make+":"+this.model+" in "+this.colour+" "+this.odometer+"km driven";
 		return result;
 	}

 	/**
 	 * start the cars engine
 	 * @return did it start or not
 	 */
 	public boolean startEngine() {
		this.engineRunning  = true;
		return this.engineRunning;
	}
	
 	/**
 	 * shut off the engine
 	 */
	public void stopEngine() {
		this.engineRunning = false;
	}
	/**
	 * the gas ran out
	 */
	public void gasRanOut() {
		this.gasRemaining = false;
	}
	/**
	 * Drive the car
	 * @param howFar
	 * @return did it go that far
	 */
	public boolean drive(int howFar) {
		boolean result = false;
		if (this.engineRunning) {
			result = true;
		}
		return result;
	}
    
}