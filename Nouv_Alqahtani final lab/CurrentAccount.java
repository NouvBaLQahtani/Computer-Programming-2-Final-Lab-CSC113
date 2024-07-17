package FinalLab;

public class CurrentAccount extends Account {
	private float Credit;

	public CurrentAccount(int ID, String Name, double Balance, float Credit) {
		super(ID, Name, Balance);
		this.setCredit(Credit);
	}

	public CurrentAccount(CurrentAccount c) {
		super(c.ID, c.Name, c.Balance);
		this.Credit = c.getCredit();
	}

	public String toString() {
		return super.toString() + "Credit :" + Credit;
	}

	public double calculateCharges() {
		if (Credit > 6.6)
			return 0;
		else if (Credit == 0)
			return 110;
		else
			return (1 / Credit * 100);

	}

	public float getCredit() {
		return Credit;
	}

	public void setCredit(float credit) {
		Credit = credit;
	}
}
