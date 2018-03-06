package com.ibm.builderpattern.tutorial;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
	
	public enum Topping {HAM, MASHROOM, ONION, PEPER, SASAGE}
	final Set<Topping> toppings;
	/*
	 *<T extends Builder<T>> means that  I don't care what the type parameter is, as long as it is a subclass of Builder.
	  */
	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}

		abstract Pizza build();
		protected abstract T self();
	}
	/*
	 *<?> means a builder typed to an unknown type. This could be a Builder<A>, a Builder<B>, a Builder<String> etc.
	  */
	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}
}
