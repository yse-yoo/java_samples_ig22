package sample;

import java.util.Arrays;
import java.util.Random;

public class Drink {

	public static void main(String[] args) {
		
		//配列（Array)
		String[] drinks = {"コーヒー", "紅茶", "ほうじ茶"};
		System.out.println(drinks);
		System.out.println(Arrays.toString(drinks));
		
		//index = 1を選択
		String selectDrink = drinks[1];
		System.out.println(selectDrink);

		drinks[1] = "ウーロン茶";
		System.out.println(Arrays.toString(drinks));
		System.out.println(drinks[1]);
		

		//配列の初期化（initialize)
		int[] numbers = new int[3];
		numbers[0] = 50;
		numbers[1] = 25;
		numbers[2] = 18;
//		numbers[3] = 10;
		System.out.println(Arrays.toString(numbers));
		
		//グー、チョキ、パー、Rock & Scissors & Paper
		String[] hands = {"グー", "チョキ", "パー"};

		//0 - 2 までの整数(せいすう)
		Random rand = new Random();
		int handIndex = rand.nextInt(3);
		System.out.println(handIndex);

		String pcHand = hands[handIndex];
		System.out.println(pcHand);


	}

}
