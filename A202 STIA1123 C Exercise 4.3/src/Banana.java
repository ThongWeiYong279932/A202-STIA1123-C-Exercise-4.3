
public class Banana extends Fruits {
	private int number;
	private double weight = 0.5, price;
	Banana(){
		super();
		this.name = "banana";
		System.out.println("Banana is constructed");
		System.out.println("Price per kg of banana = " + CalculatePrice());
		System.out.println("Weight per banana = " + weight + "kg");
		System.out.print("Please enter the amount of banana you want: ");
		number = scan.nextInt();
	}
	
	public double CalculatePrice(int number, double weight) {
		return price = number * weight * CalculatePrice();
	}
	
	public double CalculateDiscountedPrice() {
		System.out.println("Banana have 15% off today");
		discountprice = price * 0.85;
		return discountprice;
	}
	
	public String toString() {
		return ("Total Price of Banana = RM" + CalculatePrice(number,weight) + "\n" + "Discounted Price = RM" + CalculateDiscountedPrice() );
	}
}
