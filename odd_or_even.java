import java.util.Scanner;
public class Odd_or_even {

	public static void main(String[] args) {
		Scanner havoic = new Scanner(System.in);
		System.out.println("Give number please!");
		double b = havoic.nextDouble();
		if(b%2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		

	}

}
