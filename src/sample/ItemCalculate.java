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

		// ポイントの計算
		int price = 270;
		float pointRate = 0.03f;
//		float point = (float) price * pointRate;
		float point = price * pointRate;

		System.out.println(point + "pt");
		System.out.println(point);
		System.out.println((int) point + "pt");

		String itemName = "コーヒー";
		String message = itemName + "の価格は" + price + "円です。";
		System.out.println(message);

		// 単項演算
		int amount = 5;
		amount++;
		System.out.println(amount);

		amount--;
		System.out.println(amount);

		// 複合演算
		price = 110;
		amount = 3;
		price -= 10;
		System.out.println(price);

		// price = price * amount;
		price *= amount;
		System.out.println(price);

		message = itemName + "の価格は" + price + "円です。";
		message += "購入しますか？";
		System.out.println(message);

		//問題1
		int hp = 5;
		hp++;
		hp -= 4;
		hp *= 4;
		hp /= 2;
		
		System.out.println(hp);

		//問題2
		String user_name = "Yoshikawa";
		int age = 46;

		String profile_message = user_name + "の年齢は" + age + "歳です。";
		System.out.println(profile_message);

		//問題3
		//ex.1
		int water_price = 88;
		int water_amount = 5;
		int coffee_price = 120;
		int coffee_amount = 3;

		int water_total_price = water_price * water_amount;
		int coffee_total_price = coffee_price * coffee_amount;
		float total_price = (water_total_price + coffee_total_price) * 0.9f;
		System.out.println("Total Price:" + (int) total_price);


	}

}
