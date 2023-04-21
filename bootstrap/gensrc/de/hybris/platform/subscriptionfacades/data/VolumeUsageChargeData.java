/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;


import java.util.Objects;
public  class VolumeUsageChargeData extends UsageChargeData 

{



	/** <i>Generated property</i> for <code>VolumeUsageChargeData.minBlocks</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer minBlocks;

	/** <i>Generated property</i> for <code>VolumeUsageChargeData.subscriptionBillingId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionBillingId;
	
	public VolumeUsageChargeData()
	{
		// default constructor
	}
	
	public void setMinBlocks(final Integer minBlocks)
	{
		this.minBlocks = minBlocks;
	}

	public Integer getMinBlocks() 
	{
		return minBlocks;
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