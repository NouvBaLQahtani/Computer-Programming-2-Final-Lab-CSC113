package FinalLab;

import java.io.*;
import java.util.*;

public class Bank implements Finance {
	private String Name;
	private int nbA;
	Account[] AccList;

	public Bank(String Name, int size) {
		this.Name = Name;
		AccList = new Account[size];
		nbA = 0;
	}

	public Account[] readAccounts(String file) {

		Account[] list = new Account[2];
		int j = 0;
		try {

			File f = new File(file);
			FileInputStream i = new FileInputStream(f);
			ObjectInputStream s = new ObjectInputStream(i);
			try {
				while (true) {
					Account a = (Account) s.readObject();
					list[j++] = a;

				}

			} catch (EOFException e) {
				s.close();

			}
		} catch (IOException e) {
			System.out.println(e);

		} catch (ClassNotFoundException e) {
			System.out.println("casting error in method read");
		}
		return list;
	}

	public void writeAccounts(String file, Account[] list) {
		try {
			File n = new File(file);
			FileOutputStream ff = new FileOutputStream(n);
			PrintWriter f = new PrintWriter(ff);

			f.println("Number of Accounts:" + list.length);
			for (int i = 0; i < list.length; i++) {
				f.println("Account " + (i + 1) + getClass().getName());
				f.println(list[i].toString());
			}

		} catch (IOException e) {
			System.out.println("Error file ");
		}

	}

	public boolean addAccount(Account a) {
		if (nbA == AccList.length) {
			System.out.println("Can't add Account ");
			return false;
		} else if (a instanceof CurrentAccount) {

			AccList[nbA++] = (CurrentAccount) a;

		}
		return true;
	}

	public Account[] getGoldMembers() {
		Account[] list = new Account[AccList.length];
		int j = 0;
		for (int i = 0; i < nbA; i++)
			if (AccList[i] instanceof CurrentAccount)
				if (((CurrentAccount) AccList[i]).getCredit() > 7)
					list[j++] = AccList[i];

		return list;

	}

	public int countGoldMembers() {
		int gold = 0;
		for (int i = 0; i < nbA; i++)
			if (AccList[i] instanceof CurrentAccount)
				if (((CurrentAccount) AccList[i]).getCredit() > 7)
					gold++;

		return gold;
	}

	public int getNbA() {
		return nbA;
	}

	public void setNbA(int nbA) {
		this.nbA = nbA;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
