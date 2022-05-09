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
		String[] marks = {"〇", "●"};


		for (int x = 1; x <= 5; x++) {

			for (int y = 1; y < 5; y++) {
				int markIndex = rand.nextInt(marks.length);
				String mark = marks[markIndex];
				String result = "|" + mark;
				
				System.out.print(result);
			}

			System.out.println();
		}

	}

}
