package com.bookstore.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(CreditCard.CreditCardKey.class)
public class CreditCard {

	@Id
	private CreditCardType type;
	@Id
	private String number;
	private Integer expirationMonth;
	private Integer expirationYear;

	public CreditCard() {
	}

	public CreditCard(CreditCardType type, String number, Integer expirationMonth, Integer expirationYear) {
		this.type = type;
		this.number = number;
		this.expirationMonth = expirationMonth;
		this.expirationYear = expirationYear;
	}

	public CreditCardType getType() {
		return type;
	}

	public void setType(CreditCardType type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public Integer getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}

	class CreditCardKey implements Serializable {
		private CreditCardType type;
		private String number;
	}
}
