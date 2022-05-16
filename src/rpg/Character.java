package rpg;

public class Character {
	
	//キャラクター名
	public String name;
	//職業
	public String job;
	//体力
	public int hp;
	

	//インスタンスメソッド（instance method）
	//歩く
	public void walk(String direction) {
		String message = this.name + " move " + direction;
		System.out.println(message);
	}
	
	//話す
	public void talk(Character character, String message) {
		message = character.name + "!" + message;
		System.out.println(message);
	}
	
	//戦う
	public void attack(Character character) {
		int damage = 1;
		//ダメージをあたえる
		character.hp -= damage;
	}
	
	
	
}
