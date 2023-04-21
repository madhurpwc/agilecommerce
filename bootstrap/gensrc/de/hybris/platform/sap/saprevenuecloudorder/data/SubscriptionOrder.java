/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.data;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.data.Customer;
import de.hybris.platform.sap.saprevenuecloudorder.data.Market;
import de.hybris.platform.sap.saprevenuecloudorder.data.OrderItem;
import de.hybris.platform.sap.saprevenuecloudorder.data.PaymentData;
import java.util.List;


import java.util.Objects;
public  class SubscriptionOrder  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionOrder.owner</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String owner;

	/** <i>Generated property</i> for <code>SubscriptionOrder.market</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Market market;

	/** <i>Generated property</i> for <code>SubscriptionOrder.paymentData</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PaymentData paymentData;

	/** <i>Generated property</i> for <code>SubscriptionOrder.description</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String description;

	/** <i>Generated property</i> for <code>SubscriptionOrder.customer</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Customer customer;

	/** <i>Generated property</i> for <code>SubscriptionOrder.orderItems</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<OrderItem> orderItems;
	
	public SubscriptionOrder()
	{
		// default constructor
	}
	
	public void setOwner(final String owner)
	{
		this.owner = owner;
	}

	public String getOwner() 
	{
		return owner;
	}
	
	public void setMarket(final Market market)
	{
		this.market = market;
	}

	public Market getMarket() 
	{
		return market;
	}
	
	public void setPaymentData(final PaymentData paymentData)
	{
		this.paymentData = paymentData;
	}

	public PaymentData getPaymentData() 
	{
		return paymentData;
	}
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setCustomer(final Customer customer)
	{
		this.customer = customer;
	}

	public Customer getCustomer() 
	{
		return customer;
	}
	
	public void setOrderItems(final List<OrderItem> orderItems)
	{
		this.orderItems = orderItems;
	}

	public List<OrderItem> getOrderItems() 
	{
		return orderItems;
	}
	

}