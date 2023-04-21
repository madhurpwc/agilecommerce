/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:14 AM
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
public  class CustomAmount  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomAmount.code</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("code") 	
	private String code;

	/** <i>Generated property</i> for <code>CustomAmount.monetaryAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("monetaryAmount") 	
	private MonetaryAmount monetaryAmount;
	
	public CustomAmount()
	{
		// default constructor
	}
	
@JsonProperty("code") 	public void setCode(final String code)
	{
		this.code = code;
	}

@JsonProperty("code") 	public String getCode() 
	{
		return code;
	}
	
@JsonProperty("monetaryAmount") 	public void setMonetaryAmount(final MonetaryAmount monetaryAmount)
	{
		this.monetaryAmount = monetaryAmount;
	}

@JsonProperty("monetaryAmount") 	public MonetaryAmount getMonetaryAmount() 
	{
		return monetaryAmount;
	}
	

}