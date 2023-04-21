/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class Market  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Market.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>Market.timeZone</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String timeZone;

	/** ISO 4217 currency code, for example USD, EUR, CHF<br/><br/><i>Generated property</i> for <code>Market.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String currency;

	/** Valid values are [Net, Gross]<br/><br/><i>Generated property</i> for <code>Market.priceType</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String priceType;
	
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
	
	public void setPriceType(final String priceType)
	{
		this.priceType = priceType;
	}

	public String getPriceType() 
	{
		return priceType;
	}
	

}