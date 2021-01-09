package creationalP.Factory.PizzaStore;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing VeggiePizza pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking VeggiePizza pizza");

	}

	@Override
	public void cut() {
		System.out.println("Cutting VeggiePizza pizza");

	}

}
