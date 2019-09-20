package com.revature.service;

import com.revature.pojos.Loan;
import com.revature.util.Calculator;

public interface LoanService {
	
	public Double calculatePaymentAmount(Loan loan);
	
	public Double makeScheduledPayment(Loan loan);
	
	public void setCalc(Calculator<Double> calc);

}
