package com.arya.bank;
import com.arya.bank.entities.Account;
import com.arya.bank.utility.BankUtility;

public class BankApp {
	public static void main(String[] args) {
	    Account	account = new Account(1001,"Akshat", 100000);
	    BankUtility utility = new BankUtility();
	    
	    //float amount = 10000;
//		Bank bankDeposit = (account1,amount1) ->{
//			if(amount1 <= Bank.DEPOSIT_LIMIT) {
//				account1.setBalance(account1.getBalance() + amount1);
//				return " Deposit Successfully";
//			}else {
//				return "Unsuccessfully Transaction";
//			}
//		};
//		Bank bankwithdraw = (account1,amount1) ->{
//			if(Bank.MIN_BALANCE < account.getBalance()-amount1) {
//				account1.setBalance(account1.getBalance()  - amount1);
//				return "Withdraw Successful";
//			}else {
//				return "Unsuccessfully Transaction"; 
//			}
//		};
		
		 String depositMessage = utility.deposit(account, 1000);
		 if(depositMessage == "Success") {
		 System.out.println(account);
		 }
		 else {
			 System.out.println(depositMessage); }
		 String withdrawMessage = utility.withdraw(account, 99500);
		 if(withdrawMessage == "Success")
			 System.out.println(account);
			 else 
				 System.out.println(withdrawMessage);
		 
		 System.out.println(depositMessage + withdrawMessage);
	}
}
