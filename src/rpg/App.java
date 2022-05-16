package rpg;

public class App {

	public static void main(String[] args) {
		//インスタンス（instance）
		Character wizard = new Character("アリス", "wizard");
		
		System.out.println(wizard.name);
		System.out.println(wizard.job);
		System.out.println(wizard.hp);
		
		//インスタンスメソッドの実行
		wizard.walk("left");
		
		//キャラクター作成
		Character warrior = new Character("ボブ", "warrior");
		
		wizard.talk(warrior, "バトルしよう！");
		
		//wizardがwarriorに攻撃
		wizard.attack(warrior);
		System.out.println(warrior.hp);
		
		
	}

}