package javaprogram;

public class Encapsulation0_1 {
private String accountholder;
private float accountnumber;
private String type;
private double balance;
private int debit;
private int credit;
private int withdrawal;
public int currentbalance;

public Encapsulation0_1() {
	super();
	// TODO Auto-generated constructor stub
}

public Encapsulation0_1(String accountholder, float accountnumber, String type, double balance, int debit, int credit,
		int withdrawal, int currentbalance) {
	this.accountholder = accountholder;
	this.accountnumber = accountnumber;
	this.type = type;
	this.balance = balance;
	this.debit = debit;
	this.credit = credit;
	this.withdrawal = withdrawal;
	this.currentbalance = currentbalance;
}

public String getAccountholder() {
	return accountholder;
}
public void setAccountholder(String accountholder) {
	this.accountholder = accountholder;
}
public double getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(float accountnumber) {
	this.accountnumber = accountnumber;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getDebit() {
	return debit;
}
public void setDebit(int debit) {
	this.debit = debit;
}
public int getCredit() {
	return credit;
}
public void setCredit(int credit) {
	this.credit = credit;
}
public int getWithdrawal() {
	return withdrawal;
}
public void setWithdrawal(int withdrawal) {
	this.withdrawal = withdrawal;
}
public int getCurrentbalance() {
	return currentbalance;
}
public void setCurrentbalance(int currentbalance) {
	this.currentbalance = currentbalance;
}
public String getAccount0_2()
{
	return "Accounholder = "+this.accountholder  +  " Accountnumber = " +this.accountnumber +  " Type = " + this.type + " Balance = " + this.balance +" Debit = " + this.debit + " Credit = " +this.credit + " Withdrawal = " + this.withdrawal +" Currentbalance = " + this.currentbalance;
	}

@Override
public String toString() {
	return "Encapsulation0_1 [accountholder=" + accountholder + ", accountnumber=" + accountnumber + ", type=" + type
			+ ", balance=" + balance + ", debit=" + debit + ", credit=" + credit + ", withdrawal=" + withdrawal
			+ ", currentbalance=" + currentbalance + "]";
}
	     public static void main(String[] args)
	     {
	    	  Encapsulation0_1 zz = new Encapsulation0_1();
		   	   zz.setAccountholder("Nitin kumar");
		   	   zz.setAccountnumber(32408297220f);
		   	   zz.setType("Saving");
		   	   zz.setBalance(100000d);
		   	   zz.setDebit(2000);
		   	   zz.setCredit(1000);
		   	   zz.setWithdrawal(2000);
		   	   zz.setCurrentbalance(99900);
		   	   System.out.println("                Custermer ________________________ deteils");
		   	   System.out.println("Accountholder= "+zz.getAccountholder());
		   	   System.out.println("Accountnumber= "+zz.getAccountnumber());
		   	   System.out.println("Type= "+zz.getType());
		   	   System.out.println("Balance= "+zz.getBalance());
		   	   System.out.println("Debit= "+zz.getDebit());
		   	   System.out.println("Credit= "+zz.getCredit());
		   	   System.out.println("Withdrawal= "+zz.getWithdrawal());
		   	   System.out.println("Currentbalance= "+zz.getCurrentbalance());
		   	   
		   	   System.out.println("                               ##########_________________________##########");
		   	Encapsulation0_1 obj= new Encapsulation0_1("Mannu",21346788f,"current",135457d,2324,2134,456667,8887568);
		   	 System.out.println(obj.getAccount0_2());
		   	 
		   	 
	    	 
	     }
               
 }
	 
  