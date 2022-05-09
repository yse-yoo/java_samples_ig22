package sample;

import java.util.Random;

public class ItemRepeat {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 0; i <= 10; i++) {
			count++;
			System.out.println(i);
		}

//		System.out.println(i);
		System.out.println("count is:" + count);

		for (int x = 1; x <= 10; x++) {

			for (int y = 1; y <= 10; y++) {
				String plot = "(" + x + " , " + y + ")";
				System.out.print(plot);
			}

			System.out.println();
		}

		for (int x = 1; x <= 9; x++) {

			for (int y = 1; y <= 9; y++) {

				int answer = x * y;
				String message = answer + " ";
				System.out.print(message);

			}

			System.out.println();
		}

		Random rand = new Random();
		String[] marks = { "〇", "●" };

		for (int x = 1; x <= 5; x++) {

			for (int y = 1; y < 5; y++) {
				int markIndex = rand.nextInt(marks.length);
				String mark = marks[markIndex];
				String result = "|" + mark;

				System.out.print(result);
			}

			System.out.println();
		}

		// while
		int i = 0;
		while (i <= 10) {
			i++;
			System.out.println(i);
		}
		System.out.println(i);

		// 1から1000までの整数、7の倍数を５つ
		// 7 14 21 28 35
		int currentNumber = 1;
		int maxNumber = 1000;
		int index = 0;
		int limit = 5;
		
		while (currentNumber < maxNumber) {
			if (currentNumber % 7 == 0) {
				System.out.println(currentNumber);
				index++;
			}

			if (index == limit) {
				break;
			}
			currentNumber++;
		}
		
		
		int sum = 0;
		for (int j = 1; j <= 3000; j++) {
			sum += j;
		}
		System.out.println(sum);
		

		count = 0;
		int number = 1;
		int multiple = 17;
		
		while (number < 1000) {
			count++;
			number = multiple * count;
			if (number > 1000) {
				break;
			}
			System.out.println(count + ":" + number);
		}
		System.out.println(multiple + "の倍数は" + count);
		
		
		float money = 1000000;
		float target = 2000000;
		float interestRate = 0.01f;
		int year = 0;

		while (money < target) {
			money *= (1 + interestRate);
			year++;
		}
		System.out.println(year + "年後に" + money + "円");
	}

}
