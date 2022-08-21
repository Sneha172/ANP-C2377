package com.mybank.view;
import com.mybank.service.LoanAccountService;
public class MainView {
	
   public static void main(String[] arg) {
	LoanAccountService loanAccServiceobj=new LoanAccountService();
	double interest=loanAccServiceobj.calculateinterest(1, 1000,5, 2);
			System.out.println(interest);
}
}
