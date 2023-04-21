/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;


import java.util.Objects;
public  class OneTimeChargeEntryData extends ChargeEntryData 

{



	/** <i>Generated property</i> for <code>OneTimeChargeEntryData.name</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String name;

	/** <i>Generated property</i> for <code>OneTimeChargeEntryData.billingTime</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private BillingTimeData billingTime;

	/** <i>Generated property</i> for <code>OneTimeChargeEntryData.subscriptionBillingId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionBillingId;
	
	public OneTimeChargeEntryData()
	{
		// default constructor
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setBillingTime(final BillingTimeData billingTime)
	{
		this.billingTime = billingTime;
	}

	public BillingTimeData getBillingTime() 
	{
		return billingTime;
	}
	
	public void setSubscriptionBillingId(final String subscriptionBillingId)
	{
		this.subscriptionBillingId = subscriptionBillingId;
	}

	public String getSubscriptionBillingId() 
	{
		return subscriptionBillingId;
	}
	

}