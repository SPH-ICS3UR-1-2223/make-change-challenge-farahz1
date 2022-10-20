import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Your challenge is to read in a price
		System.out.println("how much for a water bottle");
		int price = in.nextInt();
		System.out.println("price : $" + price);
		// Read in the amount paid
		System.out.println("how much will you pay btw ONLY CASH");
		int paid = in.nextInt();
		System.out.println(" Money paid: $" + paid);

		// Print out the amount of change
		if (paid < price) {
			System.out.println("I SAID ONLY CASH I DIDNT SAY PAY LESS MONEY ");
		} else {
			double change = paid - price;
			System.out.println("Your change is " + change);
			// Break the change into all denominations:
			// $100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
			if (change >= 100) {
				int num100 = (int) (change / 100);
				System.out.println(num100 + " x $100");
				change = change - num100 * 100;
			}

			if (change >= 50) {
				int num100 = (int) (change / 100);
				System.out.println(num100 + " x $100");
				change = change - num100 * 100;
			}
			if (change >= 20) {
				int num100 = (int) (change / 100);
				System.out.println(num100 + " x $100");
				change = change - num100 * 100;
			}
			if (change >= 10) {
				int num100 = (int) (change / 100);
				System.out.println(num100 + " x $100");
				change = change - num100 * 100;
			}
			if (change >= 5) {
				int num100 = (int) (change / 100);
				System.out.println(num100 + " x $100");
				change = change - num100 * 100;	
			}
			if (change >= 2) {
				int num2 = (int) (change / 100);
				System.out.println(num2 + " x $100");
				change = change - num2 * 2;	
			}
				
			// As a bonus, make your project round to the nearest $0.05 like actual stores.
			System.out.println("Enter a payment");

		}
	}
}
