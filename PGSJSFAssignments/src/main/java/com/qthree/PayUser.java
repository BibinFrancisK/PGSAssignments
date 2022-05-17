package com.qthree;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@SessionScoped
public class PayUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double amount;
	private long creditcard;
	private Date expdate;
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public long getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(long creditcard) {
		this.creditcard = creditcard;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	
/*	public String validatePaymentInfo() {	
		return "SubmittedPayForm";
	}
	
	public void validateNumber(FacesContext facesContext, UIComponent toValidate, String value) throws ValidatorException{
		Double dValue = Double.parseDouble(value);	
		if(!(dValue instanceof Double)) {
			FacesMessage message = new FacesMessage("Invalid amount");
			throw new ValidatorException(message);
		}
	}*/

	
}
