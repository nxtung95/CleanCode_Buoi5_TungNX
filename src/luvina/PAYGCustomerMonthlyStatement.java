package luvina;

public class PAYGCustomerMonthlyStatement extends MonthlyStatement {

	public PAYGCustomerMonthlyStatement(MonthlyUsage monthlyUsage) {
		super(monthlyUsage);
	}

	@Override
	public void generate() {
        this.callCost = 0.12f * this.monthlyUsage.getCallMinutes();
        this.smsCost = 0.12f * this.monthlyUsage.getSmsCount();
        this.totalCost = this.callCost + this.smsCost;
	}
	

}
