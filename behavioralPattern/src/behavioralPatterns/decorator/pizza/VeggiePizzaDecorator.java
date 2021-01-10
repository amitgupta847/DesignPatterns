package behavioralPatterns.decorator.pizza;

public class VeggiePizzaDecorator extends PizzaDecorator {

	private Pizza pizza;

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
		this.pizza = pizza;
	}

	@Override
	public void bake() {
		super.bake();
		System.out.println("Adding veggie topings");
	}
}
