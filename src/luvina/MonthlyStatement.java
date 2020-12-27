package luvina;

public abstract class MonthlyStatement implements IMonthlyStatement {
    protected float callCost;
    protected float smsCost;
    protected float totalCost;
    protected MonthlyUsage monthlyUsage;
    
	public MonthlyStatement(MonthlyUsage monthlyUsage) {
		this.monthlyUsage = monthlyUsage;
	}

	public float getTotalCost() {
		return totalCost;
	}
    
}
