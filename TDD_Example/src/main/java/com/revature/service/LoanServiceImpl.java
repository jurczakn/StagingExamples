package com.revature.service;

import com.revature.pojos.Loan;
import com.revature.util.Calculator;

public class LoanServiceImpl implements LoanService {

	private Calculator<Double> calc;
	
	public Double calculatePaymentAmount(Loan loan) {
		Double paymentAmount = null;
		
		if (loan.getInterestType() == Loan.InterestType.SIMPLE) {
			
			double totalInterestPercent = calc.mult(loan.getInterest(), new Double(loan.getLength()));
			double totalAmount = calc.mult(loan.getPrinciple(), calc.add(1.0, totalInterestPercent));
			double payments = loan.getLength();
			if (loan.getPeriod() == Loan.Period.MONTHLY) {
				payments = calc.mult(payments, 12.0);
			}
			paymentAmount = calc.div(totalAmount, payments);
			paymentAmount = (double) Math.round(calc.mult(paymentAmount, 100.0));
			paymentAmount = calc.div(paymentAmount, 100.0);
			
		}
		
		return paymentAmount;
	}

	public Double makeScheduledPayment(Loan loan) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public LoanServiceImpl() {
		this.calc = new Calculator<Double>();
	}
	
	public void setCalc(Calculator<Double> calc) {
		this.calc = calc;
	}

}
