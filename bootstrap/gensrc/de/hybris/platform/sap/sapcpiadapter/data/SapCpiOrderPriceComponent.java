/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:18 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.Objects;
@XmlRootElement(name="sapCpiOrderPriceComponent")
public  class SapCpiOrderPriceComponent  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.orderId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String orderId;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.entryNumber</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String entryNumber;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.value</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String value;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.unit</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String unit;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.absolute</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String absolute;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.conditionCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String conditionCode;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.conditionCounter</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String conditionCounter;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.currencyIsoCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String currencyIsoCode;

	/** <i>Generated property</i> for <code>SapCpiOrderPriceComponent.priceQuantity</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String priceQuantity;
	
	public SapCpiOrderPriceComponent()
	{
		// default constructor
	}
	
	public void setOrderId(final String orderId)
	{
		this.orderId = orderId;
	}

	public String getOrderId() 
	{
		return orderId;
	}
	
	public void setEntryNumber(final String entryNumber)
	{
		this.entryNumber = entryNumber;
	}

	public String getEntryNumber() 
	{
		return entryNumber;
	}
	
	public void setValue(final String value)
	{
		this.value = value;
	}

	public String getValue() 
	{
		return value;
	}
	
	public void setUnit(final String unit)
	{
		this.unit = unit;
	}

	public String getUnit() 
	{
		return unit;
	}
	
	public void setAbsolute(final String absolute)
	{
		this.absolute = absolute;
	}

	public String getAbsolute() 
	{
		return absolute;
	}
	
	public void setConditionCode(final String conditionCode)
	{
		this.conditionCode = conditionCode;
	}

	public String getConditionCode() 
	{
		return conditionCode;
	}
	
	public void setConditionCounter(final String conditionCounter)
	{
		this.conditionCounter = conditionCounter;
	}

	public String getConditionCounter() 
	{
		return conditionCounter;
	}
	
	public void setCurrencyIsoCode(final String currencyIsoCode)
	{
		this.currencyIsoCode = currencyIsoCode;
	}

	public String getCurrencyIsoCode() 
	{
		return currencyIsoCode;
	}
	
	public void setPriceQuantity(final String priceQuantity)
	{
		this.priceQuantity = priceQuantity;
	}

	public String getPriceQuantity() 
	{
		return priceQuantity;
	}
	

}