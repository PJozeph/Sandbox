package com.ibm.builderpattern.tutorial;

public class CalzonePizza extends Pizza {

	private final boolean souceInside;
	
	public static class Builder extends Pizza.Builder<Builder>{
		
	private boolean souceInside = false; // Default
		public Builder souceInside(){
			souceInside = true;
			return this ;
		}
		
		@Override
		Pizza build() {
			return new CalzonePizza(this);
		}
		
		protected Builder self() {
			return this;
		}
	}
	
	CalzonePizza(Builder builder) {
		super(builder);
		souceInside = builder.souceInside;
	}

	@Override
	public String toString() {
		return "CalzonePizza [souceInside=" + souceInside + ", toppings=" + toppings + "]";
	}
	
	
}
