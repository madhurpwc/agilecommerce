/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.PricePerBlock;


import java.util.Objects;
public  class BlockRate  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>BlockRate.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>BlockRate.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String metricId;

	/** <i>Generated property</i> for <code>BlockRate.pricePerBlock</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PricePerBlock pricePerBlock;

	/** <i>Generated property</i> for <code>BlockRate.billedInAdvance</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billedInAdvance;

	/** <i>Generated property</i> for <code>BlockRate.includedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String includedQuantity;

	/** <i>Generated property</i> for <code>BlockRate.blockSize</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String blockSize;
	
	public BlockRate()
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
	
	public void setPricePerBlock(final PricePerBlock pricePerBlock)
	{
		this.pricePerBlock = pricePerBlock;
	}

	public PricePerBlock getPricePerBlock() 
	{
		return pricePerBlock;
	}
	
	public void setBilledInAdvance(final String billedInAdvance)
	{
		this.billedInAdvance = billedInAdvance;
	}

	public String getBilledInAdvance() 
	{
		return billedInAdvance;
	}
	
	public void setIncludedQuantity(final String includedQuantity)
	{
		this.includedQuantity = includedQuantity;
	}

	public String getIncludedQuantity() 
	{
		return includedQuantity;
	}
	
	public void setBlockSize(final String blockSize)
	{
		this.blockSize = blockSize;
	}

	public String getBlockSize() 
	{
		return blockSize;
	}
	

}