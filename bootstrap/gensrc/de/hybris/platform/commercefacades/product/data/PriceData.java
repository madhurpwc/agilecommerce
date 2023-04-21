/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import java.math.BigDecimal;


import java.util.Objects;
public  class PriceData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PriceData.currencyIso</code> property defined at extension <code>commercefacades</code>. */
	
	private String currencyIso;

	/** <i>Generated property</i> for <code>PriceData.value</code> property defined at extension <code>commercefacades</code>. */
	
	private BigDecimal value;

	/** <i>Generated property</i> for <code>PriceData.priceType</code> property defined at extension <code>commercefacades</code>. */
	
	private PriceDataType priceType;

	/** <i>Generated property</i> for <code>PriceData.formattedValue</code> property defined at extension <code>commercefacades</code>. */
	
	private String formattedValue;

	/** <i>Generated property</i> for <code>PriceData.minQuantity</code> property defined at extension <code>commercefacades</code>. */
	
	private Long minQuantity;

	/** <i>Generated property</i> for <code>PriceData.maxQuantity</code> property defined at extension <code>commercefacades</code>. */
	
	private Long maxQuantity;
	
	public PriceData()
	{
		// default constructor
	}
	
	public void setCurrencyIso(final String currencyIso)
	{
		this.currencyIso = currencyIso;
	}

	public String getCurrencyIso() 
	{
		return currencyIso;
	}
	
	public void setValue(final BigDecimal value)
	{
		this.value = value;
	}

	public BigDecimal getValue() 
	{
		return value;
	}
	
	public void setPriceType(final PriceDataType priceType)
	{
		this.priceType = priceType;
	}

	public PriceDataType getPriceType() 
	{
		return priceType;
	}
	
	public void setFormattedValue(final String formattedValue)
	{
		this.formattedValue = formattedValue;
	}

	public String getFormattedValue() 
	{
		return formattedValue;
	}
	
	public void setMinQuantity(final Long minQuantity)
	{
		this.minQuantity = minQuantity;
	}

	public Long getMinQuantity() 
	{
		return minQuantity;
	}
	
	public void setMaxQuantity(final Long maxQuantity)
	{
		this.maxQuantity = maxQuantity;
	}

	public Long getMaxQuantity() 
	{
		return maxQuantity;
	}
	

}