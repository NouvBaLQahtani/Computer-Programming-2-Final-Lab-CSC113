package FinalLab;

public class StudentAccount extends Account {
	private String University;

	public StudentAccount(int ID, String Name, double Balance, String University) throws InvalidUniversity {
		super(ID, Name, Balance);
		if (University.equals("KSU") || University.equals("PNU "))
			this.University = University;
		else
			throw new InvalidUniversity();
	}

	public StudentAccount(StudentAccount s) throws InvalidUniversity {
		super(s.ID, s.Name, s.Balance);
		if (University.equals("KSU") || University.equals("PNU "))
			this.University = s.getUniversity();
		else
			throw new InvalidUniversity();

	}

	public String toString() {
		return super.toString() + " University : " + University;
	}

	public double calculateCharges() {

		return 0;

	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) throws InvalidUniversity {
		if (University.equals("KSU") || University.equals("PNU "))
			this.University = university;
		else
			throw new InvalidUniversity();

	}
}
