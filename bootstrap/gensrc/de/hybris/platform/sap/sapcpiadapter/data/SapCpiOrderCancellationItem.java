/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
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
@XmlRootElement(name="sapCpiOrderCancellationItem")
public  class SapCpiOrderCancellationItem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellationItem.productCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellationItem.entryNumber</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String entryNumber;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellationItem.quantity</code> property defined at extension <code>c4hisb2borderexchange</code>. */
	
	private String quantity;
	
	public SapCpiOrderCancellationItem()
	{
		// default constructor
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
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
	

}