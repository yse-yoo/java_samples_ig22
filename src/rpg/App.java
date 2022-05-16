package rpg;

public class App {

	public static void main(String[] args) {
		//インスタンス（instance）
		Character wizard = new Character();
		System.out.println(wizard);
		
		wizard.name = "アリス";
		wizard.job = "wizard";
		wizard.hp = 50;
		
		System.out.println(wizard.name);
		System.out.println(wizard.job);
		System.out.println(wizard.hp);
		
		//インスタンスメソッドの実行
		wizard.walk("left");
		
		//キャラクター作成
		Character warrior = new Character();
		warrior.name = "ボブ";
		warrior.job = "warrior";
		warrior.hp = 50;
		
		wizard.talk(warrior, "バトルしよう！");
		
		//wizardがwarriorに攻撃
		wizard.attack(warrior);
		System.out.println(warrior.hp);
		
		
	}

}