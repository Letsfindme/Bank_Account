package model;

public class AccountMain extends  Account {

	
	//solde are heritated 
	
	public void virement(AccountMain comptDept,double amountDeVirement) {
		comptDept.setSolde(comptDept.getSolde()- amountDeVirement);
		solde+=amountDeVirement;
	}
}
