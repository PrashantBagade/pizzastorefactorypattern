package com.factorypattern.pizzastoredesignpattern;

public class CheesePizza extends AbsPizza {

	@Override
	public void prepare() {
		System.out.println(" cheese pizza Prepared");
	}

	@Override
	public void bake() {
		System.out.println(" cheese pizza bake");

	}

	@Override
	public void cut() {
		System.out.println(" cheese pizza cut");

	}

	@Override
	public void box() {
		System.out.println(" cheese pizza box");
		
	}

}
