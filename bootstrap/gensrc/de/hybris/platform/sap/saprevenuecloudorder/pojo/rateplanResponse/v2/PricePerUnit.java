/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;


import java.util.Objects;
public  class PricePerUnit  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PricePerUnit.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String amount;

	/** <i>Generated property</i> for <code>PricePerUnit.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String currency;
	
	public PricePerUnit()
	{
		// default constructor
	}
	
	public void setAmount(final String amount)
	{
		this.amount = amount;
	}

	public String getAmount() 
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