package tasksweets;
import java.util.*;
public class Main {
	
	//function to print all weights of all categories
	public void printAllWeights()
	{
		System.out.println("The total weight of Gifts: "+Gifts.totalGiftWeight);
		System.out.println("The total weight of Chocolates: "+Chocolate.TotalChocoWeight);
		System.out.println("The total weight of Candies: "+Candy.TotalCandyWeight);
		System.out.println("The total weight of Other Sweets:"+OtherSweets.OtherSweetsWeight);
	}
	
	//function to sort by price
	public void sortByPrice(List<Chocolate> chocolist)
	{
		Collections.sort(chocolist,(a,b)->Float.compare(b.getPrice(),a.getPrice()));
	}
	
	//function to sort by weight
	public void sortByWeight(List<Chocolate> chocolist)
	{
		Collections.sort(chocolist,(a,b)->Float.compare(b.getWeight(),a.getWeight()));
	}
	
	//function to display chocolates
	public void displaychoco(List<Chocolate> chocolist)
	{
		if(chocolist.size()==0)
		{
			System.out.println("No chocolates found");
			return;
		}
		
		for(Chocolate obj:chocolist)
		{
			System.out.println(obj.getName());
		}
		
	}
	
	//function to display candies
	public void displaycandy(List<Candy> candylist)
	{
		if(candylist.size()==0)
		{
			System.out.println("No candies found");
			return;
		}
		
		for(Candy obj:candylist)
		{
			System.out.println(obj.getName());
		}
		
	}
	public static void main(String[] args)
	{
		int giftno,type;
		float price,hp,weight;
		String name;
		Main driver=new Main();
		//ArrayLists for storing objects
		List<Chocolate> chocolist=new ArrayList<Chocolate>();
		List<Candy> candylist=new ArrayList<Candy>();
		List<OtherSweets> otherlist=new ArrayList<OtherSweets>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of gifts");
		giftno=sc.nextInt();
		
		//Taking gifts as input
		
		while(giftno!=0)
		{
			System.out.println("Enter:\n 1 for Chocolate \n 2 for Candy \n 3 for other Sweets");
			type=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name of gift:");
			name=sc.nextLine();
			System.out.println("Enter Price:");
			price=sc.nextFloat();
			System.out.println("Enter health points(1-10):");
			hp=sc.nextFloat();
			System.out.println("Enter weight:");
			weight=sc.nextFloat();
			switch(type)
			{
			case 1:chocolist.add(new Chocolate(price,hp,weight,name));
					break;
			case 2:candylist.add(new Candy(price,hp,weight,name));
					break;
			case 3:otherlist.add(new OtherSweets(price,hp,weight,name));
					break;
			default:System.out.println("Invalid input");
			}
			giftno-=1;
		}
		
		//Printing total registered weight of each category
		driver.printAllWeights();
		
		//Sorting chocolates according to price
		driver.sortByPrice(chocolist);
		System.out.println("Chocolates after sorting(desc) according to their Price:");
		driver.displaychoco(chocolist);
		
		//Sorting chocolates according to weight
		driver.sortByWeight(chocolist);
		System.out.println("Chocolates after sorting(desc) according to their weight:");
		driver.displaychoco(chocolist);
		
		//Printing candies present
		System.out.println("List of candies present:");
		driver.displaycandy(candylist);
		sc.close();
  }
}
