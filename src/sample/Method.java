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
		
		greet("横浜　太郎");
		greet("横浜　太郎", "曇り");

		totalPrice = calculateTotalPrice(100, 5, 0.08f);
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
	
	public static int calculateTotalPrice(int price, int amount, float taxRate) {
		float totalPrice = price * amount * (1 + taxRate);
		return (int) totalPrice;
	}
	
	public static void greet(String name) {
		System.out.println(name + "さん、こんにちは！");
	}
	
	public static void greet(String name, String weather) {
		System.out.println(name + "さん、今日の天気は" + weather + "です");
	}
	
}
