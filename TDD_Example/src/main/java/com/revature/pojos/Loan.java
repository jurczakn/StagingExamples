package com.revature.pojos;

public class Loan {
	
	public enum InterestType {
		SIMPLE, COMPOUND;
	}
	
	public enum Period {
		WEEKLY, MONTHLY, YEARLY;
	}
	
	private double principle;
	
	private double interest;
	
	private int length;  // in years
	
	private Period period;
	
	private InterestType interestType;

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public InterestType getInterestType() {
		return interestType;
	}

	public void setInterestType(InterestType interestType) {
		this.interestType = interestType;
	}

	public Loan(double principle, double interest, int length, Period period, InterestType interestType) {
		super();
		this.principle = principle;
		this.interest = interest;
		this.length = length;
		this.period = period;
		this.interestType = interestType;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Loan [principle=" + principle + ", interest=" + interest + ", length=" + length + ", period=" + period
				+ ", interestType=" + interestType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(interest);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((interestType == null) ? 0 : interestType.hashCode());
		result = prime * result + length;
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		temp = Double.doubleToLongBits(principle);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (Double.doubleToLongBits(interest) != Double.doubleToLongBits(other.interest))
			return false;
		if (interestType != other.interestType)
			return false;
		if (length != other.length)
			return false;
		if (period != other.period)
			return false;
		if (Double.doubleToLongBits(principle) != Double.doubleToLongBits(other.principle))
			return false;
		return true;
	}
	
}
