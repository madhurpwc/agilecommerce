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
public  class Market  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Market.priceType</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("priceType") 	
	private String priceType;

	/** <i>Generated property</i> for <code>Market.timeZone</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("timeZone") 	
	private String timeZone;

	/** <i>Generated property</i> for <code>Market.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("currency") 	
	private String currency;

	/** <i>Generated property</i> for <code>Market.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("id") 	
	private String id;
	
	public Market()
	{
		// default constructor
	}
	
@JsonProperty("priceType") 	public void setPriceType(final String priceType)
	{
		this.priceType = priceType;
	}

@JsonProperty("priceType") 	public String getPriceType() 
	{
		return priceType;
	}
	
@JsonProperty("timeZone") 	public void setTimeZone(final String timeZone)
	{
		this.timeZone = timeZone;
	}

@JsonProperty("timeZone") 	public String getTimeZone() 
	{
		return timeZone;
	}
	
@JsonProperty("currency") 	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}

@JsonProperty("currency") 	public String getCurrency() 
	{
		return currency;
	}
	
@JsonProperty("id") 	public void setId(final String id)
	{
		this.id = id;
	}

@JsonProperty("id") 	public String getId() 
	{
		return id;
	}
	

}