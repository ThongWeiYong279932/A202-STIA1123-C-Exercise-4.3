public class Apple extends Fruits {
	private int number;
	Apple(){
		super();
		this.name = "apple";
		System.out.println("Apple is constructed");
		System.out.println("Price per apple = RM" + CalculatePrice());
		System.out.print("Please enter the amount of apple you want: ");
		number = scan.nextInt();
	}
	
	public double CalculatePrice(int number) {
		return price = number * CalculatePrice();
	}
	
	public double CalculateDiscountedPrice() {
		System.out.println("Apple have 20% off today");
		discountprice = price * 0.8;
		return discountprice;
	}
	
	public String toString() {
		return ("Total Price of Apple = RM" + CalculatePrice(number) + "\n" + "Discounted Price = RM" + CalculateDiscountedPrice());
	}
}
