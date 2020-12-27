package luvina;

import luvina.CustomerType.Type;

public class Customer {
	private Type customerType;
	
	public Customer(Type PayAsYouGo) {
		this.customerType = PayAsYouGo;
	}
	
	public Type getCustomerType() {
		return customerType;
	}
}
