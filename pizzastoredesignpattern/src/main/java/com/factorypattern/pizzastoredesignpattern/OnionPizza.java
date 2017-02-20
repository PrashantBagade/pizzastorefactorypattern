package com.factorypattern.pizzastoredesignpattern;

public class OnionPizza extends AbsPizza {

	@Override
	public void prepare() {
		System.out.println(" onion pizza Prepared");
	}

	@Override
	public void bake() {
		System.out.println(" onion pizza bake");

	}

	@Override
	public void cut() {
		System.out.println(" onion pizza cut");

	}

	@Override
	public void box() {
		System.out.println(" onion pizza box");
		
	}

}
