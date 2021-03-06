package behavioralPatterns.decorator.pizza;

public class CheesePizzaDecorator extends PizzaDecorator {

	private Pizza pizza;

	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
		this.pizza = pizza;
	}

	@Override
	public void bake() {
		super.bake();
		System.out.println("Adding cheese topings");
	}
}
