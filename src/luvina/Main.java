package luvina;

public class Main {

	public static void main(String[] args) {
		Customer payAsYouGoCustomer = new Customer(CustomerType.Type.PAY_AS_YOU_GO);
		MonthlyUsage PAYGMonthlyUsage = new MonthlyUsage(payAsYouGoCustomer, 100, 500);
		MonthlyStatement PAYGMonthlyStatement = new PAYGCustomerMonthlyStatement(PAYGMonthlyUsage);
		PAYGMonthlyStatement.generate();
		System.out.println("Pay as you go: " + PAYGMonthlyStatement.getTotalCost());
		
		Customer unlimitedCustomer = new Customer(CustomerType.Type.UNLIMITED);
		MonthlyUsage unlimitedMonthlyUsage = new MonthlyUsage(unlimitedCustomer);
		MonthlyStatement unlimitedMonthlyStatement = new UnlimitedCustomerMonthlyStatement(unlimitedMonthlyUsage);
		unlimitedMonthlyStatement.generate();
		
		System.out.println("Unlimited: " + unlimitedMonthlyStatement.getTotalCost());
	}

}
