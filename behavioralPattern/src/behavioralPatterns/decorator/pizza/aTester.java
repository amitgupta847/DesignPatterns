package behavioralPatterns.decorator.pizza;

public class aTester {
	public static void main(String[] args) {
		Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();

		System.out.println("decorator done");
	}
}
