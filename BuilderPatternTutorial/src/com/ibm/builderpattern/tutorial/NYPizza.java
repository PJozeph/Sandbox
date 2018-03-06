package com.ibm.builderpattern.tutorial;

import java.util.Objects;

public class NYPizza extends Pizza {

	public enum Size {SMALL,LARGE,MEDIUM}
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder>{
		private final Size size;
		
		public Builder(Size size){
			this.size = Objects.requireNonNull(size);
		}
		
		@Override
		Pizza build() {
			return new NYPizza(this);
		}
		
		@Override
		protected Builder self() {
			return this;
		}
		
	}
	NYPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
	}
	@Override
	public String toString() {
		return "NYPizza [size=" + size + ", toppings=" + toppings + "]";
	}

}



