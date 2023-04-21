/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
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
@XmlRootElement(name="sapCpiOrderItem")
public  class SapCpiOrderItem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.orderId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String orderId;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.entryNumber</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String entryNumber;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.quantity</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String quantity;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.currencyIsoCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String currencyIsoCode;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.unit</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String unit;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.productCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.productName</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String productName;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.plant</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String plant;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.namedDeliveryDate</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String namedDeliveryDate;

	/** <i>Generated property</i> for <code>SapCpiOrderItem.itemCategory</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String itemCategory;
	
	public SapCpiOrderItem()
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
	
	public void setQuantity(final String quantity)
	{
		this.quantity = quantity;
	}

	public String getQuantity() 
	{
		return quantity;
	}
	
	public void setCurrencyIsoCode(final String currencyIsoCode)
	{
		this.currencyIsoCode = currencyIsoCode;
	}

	public String getCurrencyIsoCode() 
	{
		return currencyIsoCode;
	}
	
	public void setUnit(final String unit)
	{
		this.unit = unit;
	}

	public String getUnit() 
	{
		return unit;
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
	}
	
	public void setProductName(final String productName)
	{
		this.productName = productName;
	}

	public String getProductName() 
	{
		return productName;
	}
	
	public void setPlant(final String plant)
	{
		this.plant = plant;
	}

	public String getPlant() 
	{
		return plant;
	}
	
	public void setNamedDeliveryDate(final String namedDeliveryDate)
	{
		this.namedDeliveryDate = namedDeliveryDate;
	}

	public String getNamedDeliveryDate() 
	{
		return namedDeliveryDate;
	}
	
	public void setItemCategory(final String itemCategory)
	{
		this.itemCategory = itemCategory;
	}

	public String getItemCategory() 
	{
		return itemCategory;
	}
	

}