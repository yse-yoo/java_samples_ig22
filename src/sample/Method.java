package sample;

public class Method {

	public static void main(String[] args) {
		Float answer = calculate(3f);
		System.out.println(answer);

		answer = calculate(5f);
		System.out.println(answer);

		int totalPrice = 0;
		totalPrice = calculateTotalPrice(100, 5);
		System.out.println(totalPrice);

		totalPrice = calculateTotalPrice(170, 7);
		System.out.println(totalPrice);
	}
	
	public static Float calculate(Float x) {
		Float y = x + 8;
		return y;
	}
	
	public static int calculateTotalPrice(int price, int amount) {
		int totalPrice = price * amount;
		return totalPrice;
	}
}
