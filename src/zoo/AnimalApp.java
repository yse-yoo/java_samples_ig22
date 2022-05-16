package zoo;

public class AnimalApp {

	public static void main(String[] args) {
		Animal dog = new Animal();
		
		dog.type = "dog";
		dog.name = "タロー";
		dog.crying = "わん！";

		System.out.println(dog.type);
		System.out.println(dog.name);
		System.out.println(dog.crying);
	}

}
