package FinalLab;

import java.io.*;

public abstract class Account implements Serializable {
	protected int ID;
	protected String Name;
	protected double Balance;

	public Account(int ID, String Name, double Balance) {
		this.ID = ID;
		this.Name = Name;
		this.Balance = Balance;
	}

	public Account(Account a) {
		ID = a.ID;
		Name = a.Name;
		Balance = a.Balance;
	}

	public abstract double calculateCharges();

	public String toString() {
		return " ID : " + ID + "NAME : " + Name + "Balance " + Balance;

	}
}
