package com.factorypattern.pizzastoredesignpattern;

import java.util.Scanner;

public class TestPizzaStore {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		PizzaStore ps=new PizzaStore();
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to pizza store :" );
		System.out.println("Enter type of pizza :" );
		String str=sc.next();
		
		ps.orderPizza(str);
		
		
	
		
	}

}
