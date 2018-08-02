package model;

public class Application{

	public static void main(String[] args) {
		
		AccountPEL pierre = new AccountPEL();
		
		AccountMain pierreMain = new AccountMain();
		pierreMain.setBalance(5000);
		System.out.println("Solde de Pierre avant: "+ pierreMain.getBalance() );
		AccountMain aureliaMain = new AccountMain();
		aureliaMain.setBalance(400);
		System.out.println("Solde de Aurelia  avant: "+ aureliaMain.getBalance() );
		
		//add Money to the balance of aureliaMain
		pierreMain.virement(aureliaMain, 100);
		
		System.out.println("Solde de Aurelia après: "+ pierreMain.getBalance() );
		System.out.println("Solde de Aurelia  après: "+ aureliaMain.getBalance() );
		
		
		
		
		
		
	}


}
