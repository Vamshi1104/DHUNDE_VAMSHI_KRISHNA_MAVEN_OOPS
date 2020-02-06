package tasksweets;

//OtherSweets class extending sweets

public class OtherSweets extends Sweets{
	static protected float OtherSweetsWeight;//To store total other sweets weight
	
	//Constructor for initialization
	
	OtherSweets(float price,float hp,float weight,String name)
	{
		this.price=price;
		healthpoint=hp;
		this.weight=weight;
		OtherSweetsWeight+=weight;
		totalGiftWeight+=weight;
		this.name=name;
		totsweetweight+=weight;
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
	public float getOtherSweetsWeight()
	{
		return OtherSweetsWeight;
	}
	public String getName()
	{
		return name;
	}
}
