/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.subscriptionfacades.data.BillingCycleTypeData;
import de.hybris.platform.subscriptionfacades.data.UsageChargeData;
import java.util.Date;
import java.util.List;


import java.util.Objects;
public  class SubscriptionBillingData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.billingId</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String billingId;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.billingPeriod</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String billingPeriod;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.billingDate</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String billingDate;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.paymentAmount</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String paymentAmount;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.paymentStatus</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String paymentStatus;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.subscriptionBillDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date subscriptionBillDate;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.subscriptionId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionId;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.items</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String items;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.price</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PriceData price;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.charges</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<UsageChargeData> charges;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.credits</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<UsageChargeData> credits;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.billingCycle</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private BillingCycleTypeData billingCycle;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.productCode</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>SubscriptionBillingData.productUrl</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String productUrl;
	
	public SubscriptionBillingData()
	{
		// default constructor
	}
	
	public void setBillingId(final String billingId)
	{
		this.billingId = billingId;
	}

	public String getBillingId() 
	{
		return billingId;
	}
	
	public void setBillingPeriod(final String billingPeriod)
	{
		this.billingPeriod = billingPeriod;
	}

	public String getBillingPeriod() 
	{
		return billingPeriod;
	}
	
	public void setBillingDate(final String billingDate)
	{
		this.billingDate = billingDate;
	}

	public String getBillingDate() 
	{
		return billingDate;
	}
	
	public void setPaymentAmount(final String paymentAmount)
	{
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentAmount() 
	{
		return paymentAmount;
	}
	
	public void setPaymentStatus(final String paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatus() 
	{
		return paymentStatus;
	}
	
	public void setSubscriptionBillDate(final Date subscriptionBillDate)
	{
		this.subscriptionBillDate = subscriptionBillDate;
	}

	public Date getSubscriptionBillDate() 
	{
		return subscriptionBillDate;
	}
	
	public void setSubscriptionId(final String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionId() 
	{
		return subscriptionId;
	}
	
	public void setItems(final String items)
	{
		this.items = items;
	}

	public String getItems() 
	{
		return items;
	}
	
	public void setPrice(final PriceData price)
	{
		this.price = price;
	}

	public PriceData getPrice() 
	{
		return price;
	}
	
	public void setCharges(final List<UsageChargeData> charges)
	{
		this.charges = charges;
	}

	public List<UsageChargeData> getCharges() 
	{
		return charges;
	}
	
	public void setCredits(final List<UsageChargeData> credits)
	{
		this.credits = credits;
	}

	public List<UsageChargeData> getCredits() 
	{
		return credits;
	}
	
	public void setBillingCycle(final BillingCycleTypeData billingCycle)
	{
		this.billingCycle = billingCycle;
	}

	public BillingCycleTypeData getBillingCycle() 
	{
		return billingCycle;
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
	}
	
	public void setProductUrl(final String productUrl)
	{
		this.productUrl = productUrl;
	}

	public String getProductUrl() 
	{
		return productUrl;
	}
	

}