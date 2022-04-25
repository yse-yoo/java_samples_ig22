package sample;

public class Condition {

	public static void main(String[] args) {
		// 距離（きょり）km
		float distance = 1.0f;
		// 移動手段（いどうしゅだん）
		String movingMethod;
		// 雨かどうか？
		boolean isRain = true;

		// Formatter
		// Ctrl + Shift + F

		if (!isRain) {
			// 雨でなければ
			if (distance >= 5) {
				// 5km以上
				movingMethod = "電車";
			} else if (distance >= 1 && distance < 5) {
				// 1km以上 and 5km未満（みまん）
				movingMethod = "自転車";
			} else {
				// それ以外
				movingMethod = "徒歩";
			}
		} else {
			// 雨でなければ
			movingMethod = "家にいます";
		}

		System.out.println(movingMethod);

		
		//ゴミの回収（かいしゅう）
		//曜日
		String weekday = "月";
		//ゴミの回収
		String garbage = "";
		
		//曜日を判別（はんべつ）
		switch (weekday) {
			case "月":
				garbage = "燃えるゴミ";
				break;

			case "水":
				garbage = "燃えないゴミ";
				break;

			default:
				//それ以外
				garbage = "回収なし";
				break;
		}
		
		
		System.out.println(garbage);
		
		
		
		
	}

}
