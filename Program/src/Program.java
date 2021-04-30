import java.util.Scanner;
import java.util.Arrays;

public class Program {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int countOfPrices, discount, offset, readLength;
		
		countOfPrices = input.nextInt();
		discount = input.nextInt();
		offset = input.nextInt();
		readLength = input.nextInt();
		
		int [] price = new int[countOfPrices];
		int [] result = new int[readLength];
		
		for(int i = 0; i < countOfPrices; i++) {
			price[i] = input.nextInt();
		}
		
		ApplyDiscount(price, discount, offset, readLength);
		
		result = Arrays.copyOfRange(price, offset, (offset + readLength));
		
		System.out.println(Arrays.toString(result));
		
		input.close();
	}
	
	public static int[] ApplyDiscount(int[] price, int discount, int offset, int readLength) {
		double var;
		
		for(int i = offset; i < offset + readLength; i++) {
			var = price[i] - (price[i] / 100.) * discount;
			price[i] = (int) Math.floor(var);
		}
		return price;
	}
}
