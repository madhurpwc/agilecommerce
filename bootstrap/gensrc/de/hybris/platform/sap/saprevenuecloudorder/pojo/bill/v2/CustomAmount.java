/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class CustomAmount  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomAmount.code</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>CustomAmount.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount amount;
	
	public CustomAmount()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setAmount(final MonetaryAmount amount)
	{
		this.amount = amount;
	}

	public MonetaryAmount getAmount() 
	{
		return amount;
	}
	

}