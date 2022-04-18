package sample;

public class ItemCalculate {

	public static void main(String[] args) {
		int answer = 1 + 2;
		System.out.println(answer);
		
		answer = answer + 3;
		answer = answer - 2;
		answer = answer * 5;
		answer = answer / 2;

		System.out.println(answer);

		int mod = answer % 3;
		System.out.println(mod);

		//ポイントの計算
		int price = 270;
		float pointRate = 0.03f;
//		float point = (float) price * pointRate;
		float point = price * pointRate;

		System.out.println(point);
		System.out.println(point + "pt");
		System.out.println((int) point + "pt");
	
		String itemName = "コーヒー";
		String message = itemName + "の価格は" + price + "円です。";
		System.out.println(message);
	}

}
