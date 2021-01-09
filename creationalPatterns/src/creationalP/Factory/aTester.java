package creationalP.Factory;

import creationalP.Factory.PizzaStore.Pizza;
import creationalP.Factory.PizzaStore.PizzaStore;

public class aTester {
	
	public static void main(String[] args)  {
		
		PizzaStore store=new PizzaStore();
		Pizza pizza= store.orderPizza("chicken");
		
		System.out.println("Factory: pizza creation test");
	}
}
