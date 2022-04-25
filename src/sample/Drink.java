package sample;

import java.util.Arrays;
import java.util.Random;

public class Drink {

	public static void main(String[] args) {

		// 配列（Array)
		String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
		System.out.println(drinks);
		System.out.println(Arrays.toString(drinks));

		// index = 1を選択
		String selectDrink = drinks[1];
		System.out.println(selectDrink);

		drinks[1] = "ウーロン茶";
		System.out.println(Arrays.toString(drinks));
		System.out.println(drinks[1]);

		// 配列の初期化（initialize)
		int[] numbers = new int[3];
		numbers[0] = 50;
		numbers[1] = 25;
		numbers[2] = 18;
//		numbers[3] = 10;
		System.out.println(Arrays.toString(numbers));

		// グー、チョキ、パー、Rock & Scissors & Paper
		String[] hands = { "グー", "チョキ", "パー" };

		// 0 - 2 までの整数(せいすう)
		Random rand = new Random();
		int handIndex = rand.nextInt(3);
		System.out.println(handIndex);

		String pcHand = hands[handIndex];
		System.out.println(pcHand);

		// loto6
		int[] loto6 = new int[6];
		loto6[0] = rand.nextInt(43) + 1;
		loto6[1] = rand.nextInt(43) + 1;
		loto6[2] = rand.nextInt(43) + 1;
		loto6[3] = rand.nextInt(43) + 1;
		loto6[4] = rand.nextInt(43) + 1;
		loto6[5] = rand.nextInt(43) + 1;

		// 1 - 43 数字を６つ答えてください
		System.out.println(Arrays.toString(loto6));

		int[] prices = { 350, 400, 300 };
		// int prices[] = {350, 400, 300};
		System.out.println(Arrays.toString(prices));
		
		String[] priceStrings = {"350", "400", "300"};
		System.out.println(priceStrings);
		System.out.println(Arrays.toString(priceStrings));

		
		int[] prices2 = new int[3];
		prices2[0] = 350;
		prices2[1] = 400;
		prices2[2] = 300;


		//２番目 => index = 1
		System.out.println(prices[1]);
	}

}
