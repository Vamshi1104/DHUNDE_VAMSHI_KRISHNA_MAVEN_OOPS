package tasksweets;

//Second level abstract class extending gifts
public abstract class Sweets extends Gifts {

	//These parameters are common for any sweet
	protected float price;
	protected float healthpoint;
	protected static float totsweetweight; //total sweet gifts weight among all sweets
	
	//abstract methods which are implemented by child classes
	
	public abstract float getPrice();
	public abstract float getHealthPoint();
	public abstract float getWeight();
	
}
