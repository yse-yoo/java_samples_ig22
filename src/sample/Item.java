package sample;

public class Item {
	public static void main(String[] args) {
		//変数(variable)
		//商品名
		String itemName = "コーヒー";
		//価格
		int price;
		//個数
		int amount;
		//セール中(yes or no)
		boolean is_sale;

		itemName = "コーヒー";
		price = 120;
		amount = 10;
		is_sale = true;
		
		System.out.println(itemName);
		System.out.println(price);
		System.out.println(amount);
		System.out.println(is_sale);
		
		//小数
		float rate = 0.1f;
		System.out.println(rate);

		//定数（決まった数）
		//constant
		final float TAX_RATE = 0.8f;
		System.out.println(TAX_RATE);
	}

}
