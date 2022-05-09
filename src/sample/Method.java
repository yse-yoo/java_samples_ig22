package sample;

public class Method {

	public static void main(String[] args) {
		Float answer = calculate(3f);
		System.out.println(answer);

		answer = calculate(5f);
		System.out.println(answer);

	}
	
	public static Float calculate(Float x) {
		Float y = x + 8;
		return y;
	}
}
