/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class MonetaryAmount  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>MonetaryAmount.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("amount") 	
	private int amount;

	/** <i>Generated property</i> for <code>MonetaryAmount.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("currency") 	
	private String currency;
	
	public MonetaryAmount()
	{
		// default constructor
	}
	
@JsonProperty("amount") 	public void setAmount(final int amount)
	{
		this.amount = amount;
	}

@JsonProperty("amount") 	public int getAmount() 
	{
		return amount;
	}
	
@JsonProperty("currency") 	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}

@JsonProperty("currency") 	public String getCurrency() 
	{
		return currency;
	}
	

}