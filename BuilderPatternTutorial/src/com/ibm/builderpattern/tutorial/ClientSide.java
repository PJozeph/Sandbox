package com.ibm.builderpattern.tutorial;

import com.ibm.builderpattern.tutorial.NYPizza.Size;
import com.ibm.builderpattern.tutorial.Pizza.Topping;

public class ClientSide {

	public static void main(String[] args) {
		
		Pizza nyPizza =  new NYPizza.Builder(Size.SMALL)
				.addTopping(Topping.HAM)
				.addTopping(Topping.PEPER)
				.build();
		
		Pizza calzonePizza = new CalzonePizza.Builder()
				.addTopping(Topping.HAM)
				.addTopping(Topping.MASHROOM)
				.addTopping(Topping.ONION)
				.souceInside()
				.build();
		
 		System.out.println(nyPizza);
 		System.out.println(calzonePizza);
	}
}
