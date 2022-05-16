package zoo;

public class Animal {
	//フィールド（プロパティ）	
	public String type;
	public String name;
	public String crying;

	//インスタンスメソッド
	//歩く
	public void walk() {
		String message = this.name + "が歩いた";
		System.out.println(message);
	}

	//鳴（な）く
	public void cry() {
		System.out.println(this.crying);
	}

	//逃（に）げる
	public void escape() {
		String message = this.name + "が逃げた！";
		System.out.println(message);
	}

}
