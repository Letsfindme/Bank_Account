package model;

public class AccountMain extends  Account {

	
	//solde are heritated 
	
	public void virement(AccountMain comptDept,double mentantDeVirement) {
		comptDept.setSolde(comptDept.getSolde()- mentantDeVirement);
		solde+=mentantDeVirement;
	}
}
