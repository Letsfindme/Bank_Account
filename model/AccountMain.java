package model;

public class AccountMain extends  Account {

	
	//solde are inherited 
	
	public void virement(AccountMain comptCredit,double amountDeVirement) {
		comptCredit.setBalance(comptCredit.getBalance()+ amountDeVirement);
		balance-=amountDeVirement;
	}
}
