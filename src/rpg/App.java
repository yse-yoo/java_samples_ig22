package rpg;

public class App {

	public static void man(String[] args) {
		//インスタンス（instance）
		Character wizard = new Character();
		System.out.println(wizard);
		
		System.out.println(wizard.name);
		System.out.println(wizard.job);
		System.out.println(wizard.hp);
	}

}
