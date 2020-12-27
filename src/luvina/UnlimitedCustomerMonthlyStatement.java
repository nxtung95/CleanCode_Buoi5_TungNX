package luvina;

public class UnlimitedCustomerMonthlyStatement extends MonthlyStatement{


	public UnlimitedCustomerMonthlyStatement(MonthlyUsage monthlyUsage) {
		super(monthlyUsage);
	}

	@Override
	public void generate() {
		this.totalCost = 54.90f;
	}

}
