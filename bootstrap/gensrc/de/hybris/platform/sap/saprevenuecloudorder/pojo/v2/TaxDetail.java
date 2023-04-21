/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
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
public  class TaxDetail  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TaxDetail.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("amount") 	
	private double amount;

	/** <i>Generated property</i> for <code>TaxDetail.code</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("code") 	
	private String code;

	/** <i>Generated property</i> for <code>TaxDetail.rate</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("rate") 	
	private int rate;

	/** <i>Generated property</i> for <code>TaxDetail.name</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("name") 	
	private String name;
	
	public TaxDetail()
	{
		// default constructor
	}
	
@JsonProperty("amount") 	public void setAmount(final double amount)
	{
		this.amount = amount;
	}

@JsonProperty("amount") 	public double getAmount() 
	{
		return amount;
	}
	
@JsonProperty("code") 	public void setCode(final String code)
	{
		this.code = code;
	}

@JsonProperty("code") 	public String getCode() 
	{
		return code;
	}
	
@JsonProperty("rate") 	public void setRate(final int rate)
	{
		this.rate = rate;
	}

@JsonProperty("rate") 	public int getRate() 
	{
		return rate;
	}
	
@JsonProperty("name") 	public void setName(final String name)
	{
		this.name = name;
	}

@JsonProperty("name") 	public String getName() 
	{
		return name;
	}
	

}