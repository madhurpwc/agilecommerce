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
import java.math.BigDecimal;


import java.util.Objects;
public  class TaxDetail  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TaxDetail.code</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>TaxDetail.name</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String name;

	/** <i>Generated property</i> for <code>TaxDetail.rate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private BigDecimal rate;

	/** <i>Generated property</i> for <code>TaxDetail.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Float amount;
	
	public TaxDetail()
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
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setRate(final BigDecimal rate)
	{
		this.rate = rate;
	}

	public BigDecimal getRate() 
	{
		return rate;
	}
	
	public void setAmount(final Float amount)
	{
		this.amount = amount;
	}

	public Float getAmount() 
	{
		return amount;
	}
	

}