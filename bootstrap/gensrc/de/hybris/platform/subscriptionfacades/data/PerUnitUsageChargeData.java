/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;


import java.util.Objects;
public  class PerUnitUsageChargeData extends UsageChargeData 

{



	/** <i>Generated property</i> for <code>PerUnitUsageChargeData.usageChargeType</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private UsageChargeTypeData usageChargeType;

	/** <i>Generated property</i> for <code>PerUnitUsageChargeData.blockSize</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer blockSize;

	/** <i>Generated property</i> for <code>PerUnitUsageChargeData.includedQty</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer includedQty;

	/** <i>Generated property</i> for <code>PerUnitUsageChargeData.minBlocks</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer minBlocks;

	/** <i>Generated property</i> for <code>PerUnitUsageChargeData.ratio</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String ratio;

	/** <i>Generated property</i> for <code>PerUnitUsageChargeData.subscriptionBillingId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionBillingId;
	
	public PerUnitUsageChargeData()
	{
		// default constructor
	}
	
	public void setUsageChargeType(final UsageChargeTypeData usageChargeType)
	{
		this.usageChargeType = usageChargeType;
	}

	public UsageChargeTypeData getUsageChargeType() 
	{
		return usageChargeType;
	}
	
	public void setBlockSize(final Integer blockSize)
	{
		this.blockSize = blockSize;
	}

	public Integer getBlockSize() 
	{
		return blockSize;
	}
	
	public void setIncludedQty(final Integer includedQty)
	{
		this.includedQty = includedQty;
	}

	public Integer getIncludedQty() 
	{
		return includedQty;
	}
	
	public void setMinBlocks(final Integer minBlocks)
	{
		this.minBlocks = minBlocks;
	}

	public Integer getMinBlocks() 
	{
		return minBlocks;
	}
	
	public void setRatio(final String ratio)
	{
		this.ratio = ratio;
	}

	public String getRatio() 
	{
		return ratio;
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