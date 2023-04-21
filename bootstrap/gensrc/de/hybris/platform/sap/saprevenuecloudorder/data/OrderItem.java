/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:14 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.data;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.data.AspectsData;
import de.hybris.platform.sap.saprevenuecloudorder.data.Price;
import de.hybris.platform.sap.saprevenuecloudorder.data.Product;
import de.hybris.platform.sap.saprevenuecloudorder.data.Quantity;


import java.util.Objects;
public  class OrderItem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderItem.itemType</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String itemType;

	/** <i>Generated property</i> for <code>OrderItem.product</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Product product;

	/** <i>Generated property</i> for <code>OrderItem.quantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity quantity;

	/** <i>Generated property</i> for <code>OrderItem.price</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Price price;

	/** <i>Generated property</i> for <code>OrderItem.aspectsData</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private AspectsData aspectsData;
	
	public OrderItem()
	{
		// default constructor
	}
	
	public void setItemType(final String itemType)
	{
		this.itemType = itemType;
	}

	public String getItemType() 
	{
		return itemType;
	}
	
	public void setProduct(final Product product)
	{
		this.product = product;
	}

	public Product getProduct() 
	{
		return product;
	}
	
	public void setQuantity(final Quantity quantity)
	{
		this.quantity = quantity;
	}

	public Quantity getQuantity() 
	{
		return quantity;
	}
	
	public void setPrice(final Price price)
	{
		this.price = price;
	}

	public Price getPrice() 
	{
		return price;
	}
	
	public void setAspectsData(final AspectsData aspectsData)
	{
		this.aspectsData = aspectsData;
	}

	public AspectsData getAspectsData() 
	{
		return aspectsData;
	}
	

}