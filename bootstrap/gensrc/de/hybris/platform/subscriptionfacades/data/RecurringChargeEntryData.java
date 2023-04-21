/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:07 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;


import java.util.Objects;
public  class RecurringChargeEntryData extends ChargeEntryData 

{



	/** <i>Generated property</i> for <code>RecurringChargeEntryData.cycleStart</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private int cycleStart;

	/** <i>Generated property</i> for <code>RecurringChargeEntryData.cycleEnd</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private int cycleEnd;

	/** <i>Generated property</i> for <code>RecurringChargeEntryData.subscriptionBillingId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionBillingId;
	
	public RecurringChargeEntryData()
	{
		// default constructor
	}
	
	public void setCycleStart(final int cycleStart)
	{
		this.cycleStart = cycleStart;
	}

	public int getCycleStart() 
	{
		return cycleStart;
	}
	
	public void setCycleEnd(final int cycleEnd)
	{
		this.cycleEnd = cycleEnd;
	}

	public int getCycleEnd() 
	{
		return cycleEnd;
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