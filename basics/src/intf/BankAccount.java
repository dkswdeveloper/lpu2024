package intf;
class BankAccount 
{
	private static int nextAcno = 101;
	
	int acno;
	double balance;
	int custid;
	String ifsc;
	public BankAccount(double balance, int custid, String ifsc) {
		super();
		this.acno = nextAcno++;
		this.balance = balance;
		this.custid = custid;
		this.ifsc = ifsc;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", balance=" + balance + ", custid=" + custid + ", ifsc=" + ifsc + "]";
	}
	 
}
