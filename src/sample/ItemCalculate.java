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
		// float point = (float) price * pointRate;
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

		// 問題1
		int hp = 5;
		hp++;
		hp -= 4;
		hp *= 4;
		hp /= 2;

		System.out.println(hp);

		// 問題2
		String user_name = "Yoshikawa";
		int age = 46;

		String profile_message = user_name + "の年齢は" + age + "歳です。";
		System.out.println(profile_message);

		// 問題3
		// ex.1
		int water_price = 88;
		int water_amount = 5;
		int coffee_price = 120;
		int coffee_amount = 3;

		int water_total_price = water_price * water_amount;
		int coffee_total_price = coffee_price * coffee_amount;
		float total_price = (water_total_price + coffee_total_price) * (1.0f - 0.1f);
		System.out.println("Total Price:" + (int) total_price);

		// ex.2
		int itemPrice;
		int itemAmount;
		int totalPrice1;
		int totalPrice2;

		itemPrice = 88;
		itemAmount = 5;
		totalPrice1 = itemPrice * itemAmount;

		itemPrice = 120;
		itemAmount = 3;
		totalPrice2 = itemPrice * itemAmount;

		float totalPrice = (totalPrice1 + totalPrice2) * 0.9f;
		System.out.println("Total Price:" + (int) totalPrice);

		// 問題4
		/*
		 * 国語：76点
		 * 数学：83点
		 * 理科：69点
		 * 社会：91点
		 */

		int score1 = 76;
		int score2 = 83;
		int score3 = 69;
		int score4 = 91;

		float average = (score1 + score2 + score3 + score4) / 4;
		System.out.println("Average:" + average);

		// 比較演算（ひかくえんざん）
		boolean is_match;
		price = 100;
		is_match = (price == 50);
		System.out.println(is_match);

		price = 100;
		is_match = (price > 50);
		System.out.println(is_match);

		price = 50;
		is_match = (price <= 50);
		System.out.println(is_match);

		price = 50;
		is_match = (price > 50);
		System.out.println(is_match);

		price = 50;
		is_match = (price != 50);
		System.out.println(is_match);

		String str1 = "20";
		String str2 = "20";
		int number1 = 20;
		int number2 = 30;
		// String同士の比較
		is_match = (str1 == str2);
		System.out.println(is_match);
		// int同士の比較
		is_match = (number1 == number2);
		System.out.println(is_match);

		// is_match = (str1 == number2);
		// System.out.println(is_match);

		int temperature = 30;
		boolean is_hot = (temperature > 30);
		boolean is_cold = (temperature < 10);
		System.out.println(is_hot);
		System.out.println(is_cold);

		String character_name = "Tokyo";
		String monster_name = "スライム";
		int character_hp = 20;
		int monster_hp = 5;
		int damage = 10;
		String battle_message = character_name + "のこうげき！";
		String attack_message = (monster_hp > damage) ? "に" + damage + "のダメージ" : "はたおれた！";
		battle_message += monster_name + attack_message;
		System.out.println(battle_message);
	}

}
