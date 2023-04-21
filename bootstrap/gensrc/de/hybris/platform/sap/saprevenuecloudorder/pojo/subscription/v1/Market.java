/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Market  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Market.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>Market.timeZone</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String timeZone;

	/** <i>Generated property</i> for <code>Market.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String currency;
	
	public Market()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setTimeZone(final String timeZone)
	{
		this.timeZone = timeZone;
	}

	public String getTimeZone() 
	{
		return timeZone;
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