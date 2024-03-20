package com.model;

import java.sql.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.model.Payments;

public class Payments {
    private int paymentID;
	private int contractID;
    private Date paymentDate;
    private double amount;
    private String paymentMethod;
    private String status;
    
    
    
    @ManyToOne
    @JoinColumn(name = "payments")
    private Contracts contracts;



	/**
	 * @return the paymentID
	 */
	public int getPaymentID() {
		return paymentID;
	}



	/**
	 * @param paymentID the paymentID to set
	 */
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}



	/**
	 * @return the contractID
	 */
	public int getContractID() {
		return contractID;
	}



	/**
	 * @param contractID the contractID to set
	 */
	public void setContractID(int contractID) {
		this.contractID = contractID;
	}



	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}



	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}



	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}



	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}



	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}



	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}



	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}



	/**
	 * @return the contracts
	 */
	public Contracts getContracts() {
		return contracts;
	}



	/**
	 * @param contracts the contracts to set
	 */
	public void setContracts(Contracts contracts) {
		this.contracts = contracts;
	}



	/**
	 * @param paymentID
	 * @param contractID
	 * @param paymentDate
	 * @param amount
	 * @param paymentMethod
	 * @param status
	 * @param contracts
	 */
	public Payments(int paymentID, int contractID, Date paymentDate, double amount, String paymentMethod, String status,
			Contracts contracts) {
		super();
		this.paymentID = paymentID;
		this.contractID = contractID;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.contracts = contracts;
	}



	@Override
	public String toString() {
		return "Payments [paymentID=" + paymentID + ", contractID=" + contractID + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", status=" + status + ", contracts="
				+ contracts + "]";
	}

    	
    
}

