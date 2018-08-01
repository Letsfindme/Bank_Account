package model;

public class Application{

	public static void main(String[] args) {

		AccountPEL pierre = new AccountPEL();

		AccountMain pierreMain = new AccountMain();
		pierreMain.setSolde(5000);
		System.out.println("Solde de Pierre avant: "+ pierreMain.getSolde() );
		AccountMain aureliaMain = new AccountMain();
		aureliaMain.setSolde(4000);
		System.out.println("Solde de Aurelia  avant: "+ aureliaMain.getSolde() );
		
		aureliaMain.virement(pierreMain, 100);
		
		System.out.println("Solde de Aurelia après: "+ pierreMain.getSolde() );
		System.out.println("Solde de Aurelia  après: "+ aureliaMain.getSolde() );
		
		
		

	}


}
