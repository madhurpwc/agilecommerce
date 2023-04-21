/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class MonetaryAmount  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>MonetaryAmount.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Float amount;

	/** ISO 4217 currency code, for example USD, EUR, CHF<br/><br/><i>Generated property</i> for <code>MonetaryAmount.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String currency;
	
	public MonetaryAmount()
	{
		// default constructor
	}
	
	public void setAmount(final Float amount)
	{
		this.amount = amount;
	}

	public Float getAmount() 
	{
		return amount;
	}
	
	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}

	public String getCurrency() 
	{
		return currency;
	}
	

}