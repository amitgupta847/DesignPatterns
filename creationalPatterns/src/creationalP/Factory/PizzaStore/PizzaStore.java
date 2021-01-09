package creationalP.Factory.PizzaStore;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza p = PizzaFactory.getPiza(type);
		p.prepare();
		p.bake();
		p.cut();

		return p;
	}
}
