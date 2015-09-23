
public class LongDistanceBill extends PhoneBill
{
	private double longDistanceTime;
		
	public LongDistanceBill(double monthlyRate, double callRate, double longDistanceTime)
	{
		super(monthlyRate, callRate);
		this.longDistanceTime = longDistanceTime;
	}

	public LongDistanceBill() {
		// TODO Auto-generated constructor stub
	}

	public double getLongDistanceTime() {
		return longDistanceTime;
	}

	public void setLongDistanceTime(double longDistanceTime) {
		this.longDistanceTime = longDistanceTime;
	}
	
}
