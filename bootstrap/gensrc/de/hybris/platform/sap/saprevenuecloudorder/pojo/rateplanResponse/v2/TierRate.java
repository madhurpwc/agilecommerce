/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.Tier;
import java.util.List;


import java.util.Objects;
public  class TierRate  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>TierRate.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>TierRate.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String metricId;

	/** <i>Generated property</i> for <code>TierRate.billedInAdvance</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billedInAdvance;

	/** <i>Generated property</i> for <code>TierRate.minimumBlocks</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String minimumBlocks;

	/** <i>Generated property</i> for <code>TierRate.blockSize</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String blockSize;

	/** <i>Generated property</i> for <code>TierRate.tiers</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<Tier> tiers;
	
	public TierRate()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setMetricId(final String metricId)
	{
		this.metricId = metricId;
	}

	public String getMetricId() 
	{
		return metricId;
	}
	
	public void setBilledInAdvance(final String billedInAdvance)
	{
		this.billedInAdvance = billedInAdvance;
	}

	public String getBilledInAdvance() 
	{
		return billedInAdvance;
	}
	
	public void setMinimumBlocks(final String minimumBlocks)
	{
		this.minimumBlocks = minimumBlocks;
	}

	public String getMinimumBlocks() 
	{
		return minimumBlocks;
	}
	
	public void setBlockSize(final String blockSize)
	{
		this.blockSize = blockSize;
	}

	public String getBlockSize() 
	{
		return blockSize;
	}
	
	public void setTiers(final List<Tier> tiers)
	{
		this.tiers = tiers;
	}

	public List<Tier> getTiers() 
	{
		return tiers;
	}
	

}