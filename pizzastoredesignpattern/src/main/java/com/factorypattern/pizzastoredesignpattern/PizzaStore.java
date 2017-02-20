package com.factorypattern.pizzastoredesignpattern;

public class PizzaStore {

	SimplePizzaFactory factory=null;

	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}
	  public PizzaStore() {
		super();
	}
	public AbsPizza orderPizza(String type){
		  AbsPizza pizza;
		  
		  pizza=SimplePizzaFactory.createPizza(type);
		  
		  if(null==pizza){
			 System.exit(0);
		    }
		  pizza.prepare();
		  pizza.bake();
		  pizza.cut();
		  pizza.box();
		return pizza;
		
	
		
	}
}
