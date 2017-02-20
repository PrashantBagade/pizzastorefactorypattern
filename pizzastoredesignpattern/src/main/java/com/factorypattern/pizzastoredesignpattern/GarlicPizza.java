package com.factorypattern.pizzastoredesignpattern;

public class GarlicPizza extends AbsPizza {

	public void orderPizza(){
		
	}

	@Override
	public void prepare() {
		System.out.println(" garlic pizza Prepared");
	}

	@Override
	public void bake() {
		System.out.println(" garlic pizza bake");

	}

	@Override
	public void cut() {
		System.out.println(" garlic pizza cut");

	}

	@Override
	public void box() {
		System.out.println(" garlic pizza box");
		
	}
}
