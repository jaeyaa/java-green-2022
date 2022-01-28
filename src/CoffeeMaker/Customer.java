package CoffeeMaker;

public class Customer {
	public void order(String menuName, Menu menu, Barista barista) {

		MenuItem menuItem = menu.choose(menuName);
		if (menuItem == null) {
			System.out.println("");
		}

		Coffee coffee = barista.makeCoffee(menuItem);

		System.out.println("홍길동이" + coffee.getPrice() + "원" + coffee.getName() + "를 받았습니다");
	}
}
