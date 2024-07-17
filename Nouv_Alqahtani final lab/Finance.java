package FinalLab;

public interface Finance {
	public Account[] readAccounts(String file);

	public void writeAccounts(String file, Account[] list);
}
