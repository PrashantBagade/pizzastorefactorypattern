package com.factorypattern.pizzastoredesignpattern;

public class GreekPizza extends AbsPizza{

	@Override
	public void prepare() {
		System.out.println(" greek pizza Prepared");
	}

	@Override
	public void bake() {
		System.out.println(" greek pizza bake");

	}

	@Override
	public void cut() {
		System.out.println(" greek pizza cut");

	}

	@Override
	public void box() {
		System.out.println(" greek pizza box");
		
	}
}
