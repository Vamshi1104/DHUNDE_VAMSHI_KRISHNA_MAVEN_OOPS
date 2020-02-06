package tasksweets;

//candy class extending sweets

public class Candy extends Sweets{

	static protected float TotalCandyWeight;  //to store total candy weight
	
	//Constructor
	Candy(float price,float hp,float weight,String name)
	{
		this.price=price;
		healthpoint=hp;
		this.weight=weight;
		TotalCandyWeight+=weight;
		totalGiftWeight+=weight;
		this.name=name;
		totsweetweight+=weight;
	}
	
	//Implementing abstract methods  of parent class sweets
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
		return TotalCandyWeight;
	}
	public String getName()
	{
		return name;
	}
	
}
