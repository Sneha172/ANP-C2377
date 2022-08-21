package com.mybank.service;

public class LoanAccountService {
	
	private int LoanId;
	private int rateOfInterest;
	private int period;
	
	public double calculateinterest(int loanid, int loanAmount, int rateOfInterest, int period) {
		
	double Interest = (loanAmount*rateOfInterest*period)/100;
	return Interest;
	
	}
}

