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
	}

}