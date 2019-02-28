/**
 * WebEdge 2018
 */
package com.webedge.casino;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mai Thành Duy An
 */
public class BetResult implements Serializable {

	private static final long serialVersionUID = -8977002821518726808L;

	private int id;
	private Date betDate;
	private int betResult;
	private int guessLow;
	private int guessHigh;
	private int betPayIn;
	private int betPayOut;
	private String depositeAddress;
	private int balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBetDate() {
		return betDate;
	}

	public void setBetDate(Date betDate) {
		this.betDate = betDate;
	}

	public int getBetResult() {
		return betResult;
	}

	public void setBetResult(int betResult) {
		this.betResult = betResult;
	}

	public int getGuessLow() {
		return guessLow;
	}

	public void setGuessLow(int guessLow) {
		this.guessLow = guessLow;
	}

	public int getGuessHigh() {
		return guessHigh;
	}

	public void setGuessHigh(int guessHigh) {
		this.guessHigh = guessHigh;
	}

	public int getBetPayIn() {
		return betPayIn;
	}

	public void setBetPayIn(int betPayIn) {
		this.betPayIn = betPayIn;
	}

	public int getBetPayOut() {
		return betPayOut;
	}

	public void setBetPayOut(int betPayOut) {
		this.betPayOut = betPayOut;
	}

	public String getDepositeAddress() {
		return depositeAddress;
	}

	public void setDepositeAddress(String depositeAddress) {
		this.depositeAddress = depositeAddress;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
