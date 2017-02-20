package com.factorypattern.pizzastoredesignpattern;

/**
 * Prashant Bagade
 *
 */
public class SimplePizzaFactory 
{
    public static AbsPizza createPizza(String type){
    	AbsPizza pizza=null;
    	if(type.equalsIgnoreCase("cheese"))
    		 pizza=new CheesePizza();
    	else if(type.equalsIgnoreCase("onion"))
    		pizza=new OnionPizza();
    	else if(type.equalsIgnoreCase("garlic"))
    		pizza=new GarlicPizza();
    	else if(type.equalsIgnoreCase("greek"))
    		pizza=new GreekPizza();
    	else 
    	     System.out.println("Sorry!!!!!!!!! this type of pizza is not available");
		return pizza;
    }
}
