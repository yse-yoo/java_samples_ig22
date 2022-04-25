package sample;

import java.util.Arrays;

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

	}

}
