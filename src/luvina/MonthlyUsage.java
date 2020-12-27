package luvina;

public class MonthlyUsage {
    private Customer customer;
    private int callMinutes;
    private int smsCount;
    
    public MonthlyUsage(Customer customer) {
    	this.customer = customer;
    }

    public MonthlyUsage(Customer customer, int callMinutes, int smsCount) {
        this.customer = customer;
        this.callMinutes = callMinutes;
        this.smsCount = smsCount;
    }

	public Customer getCustomer() {
		return customer;
	}

	public int getCallMinutes() {
		return callMinutes;
	}

	public int getSmsCount() {
		return smsCount;
	}
    
    
}
