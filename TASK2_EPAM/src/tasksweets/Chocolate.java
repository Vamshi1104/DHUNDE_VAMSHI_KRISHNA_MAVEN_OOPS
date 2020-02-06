package tasksweets;

//Chocolate class extending sweets
public class Chocolate extends Sweets {
	
	static protected float TotalChocoWeight; //To store total chocolate weight
	
	//Constructor for initialization
	
	Chocolate(float price,float hp,float weight,String name)
	{
		this.price=price;
		healthpoint=hp;
		this.weight=weight;
		TotalChocoWeight+=weight;
		totalGiftWeight+=weight;
		totsweetweight+=weight;
		this.name=name;
	}
	
	//Implementing abstract methods of parent class sweets
	
	public float getPrice()
	{
		return price;
	}
	public float getHealthPoint()
	{
		return healthpoint;
	}
	public float getWeight()
	{
		return weight;
	}
	public float getTotalChocoWeight()
	{
		return TotalChocoWeight;
	}
	public String getName()
	{
		return name;
	}
}
