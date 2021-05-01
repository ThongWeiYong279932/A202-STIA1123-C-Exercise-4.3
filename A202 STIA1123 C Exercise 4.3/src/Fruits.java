import java.util.Scanner;

public class Fruits {
	Scanner scan = new Scanner(System.in);
	protected String name;
	protected double price, discountprice;
	public Fruits() {
			System.out.println("Fruit constructor is invoked");
		
	}
	
	public String CreateFruit() {
		System.out.print("Please choose the fruits you want (Apple/Banana): ");
		this.name = scan.nextLine();
		while (this.name.equalsIgnoreCase("Apple")== false && this.name.equalsIgnoreCase("Banana")==false) {
			System.out.println("Wrong Input! Please choose Apple or Banana only!");
			System.out.print("Please choose the fruits you want (Apple/Banana): ");
			this.name = scan.nextLine();
		}
		return this.name;
	}
	
	public double CalculatePrice() {
		if (this.name.equalsIgnoreCase("Apple")) {
			this.price = 0.35;
		}
		else if (this.name.equalsIgnoreCase("Banana")) {
			this.price = 1.5;
		}
		return this.price;
	}
	
	public double CalculateDiscountedPrice() {
		System.out.println("All fruits will have 10% off today");
		this.discountprice = this.price * 0.9;
		return this.discountprice;
	}
	
	public String toString() {
		return (CreateFruit() + " is constructed \n" + "Price of " + this.name + " = RM" + CalculatePrice() + "\n"+ 
				"Discounted Price = RM" + CalculateDiscountedPrice());
	}
}
