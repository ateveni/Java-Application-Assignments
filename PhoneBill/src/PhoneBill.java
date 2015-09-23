public abstract class PhoneBill 
{
	private double monthlyRate;
	private double callRate;
	
	public PhoneBill(double monthlyRate, double callRate) 
	{
		super();
		this.monthlyRate = monthlyRate;
		this.callRate = callRate;
	}

	public PhoneBill(double monthlyRate) 
	{
		this.monthlyRate = monthlyRate;
	}
	
	public double getMonthlyRate() 
	{
		return monthlyRate;
	}
	
	public double getCallRate() {
		return callRate;
	}

	public void setCallRate(double callRate) {
		this.callRate = callRate;
	}

	public abstract double calculateBill(int time);
}
