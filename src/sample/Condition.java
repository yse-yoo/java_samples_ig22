package sample;

public class Condition {

	public static void main(String[] args) {
		//距離（きょり）km
		float distance = 3.0f;
		//移動手段（いどうしゅだん）
		String movingMethod;
		
		if (distance >= 5) {
			//5km以上
			movingMethod = "電車";
		} else if (distance >= 1 && distance < 5) {
			//1km以上 and 5km未満（みまん）
			movingMethod = "自転車";
		} else {
			//それ以外
			movingMethod = "徒歩";
		}
		System.out.println(movingMethod);
	}

}
