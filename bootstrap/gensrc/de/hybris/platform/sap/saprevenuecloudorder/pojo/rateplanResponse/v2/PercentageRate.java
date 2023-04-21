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
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.PricePerUnit;


import java.util.Objects;
public  class PercentageRate  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PercentageRate.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>PercentageRate.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String metricId;

	/** <i>Generated property</i> for <code>PercentageRate.pricePerUnit</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PricePerUnit pricePerUnit;

	/** <i>Generated property</i> for <code>PercentageRate.billedInAdvance</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billedInAdvance;

	/** <i>Generated property</i> for <code>PercentageRate.ratio</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String ratio;
	
	public PercentageRate()
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
	
	public void setPricePerUnit(final PricePerUnit pricePerUnit)
	{
		this.pricePerUnit = pricePerUnit;
	}

	public PricePerUnit getPricePerUnit() 
	{
		return pricePerUnit;
	}
	
	public void setBilledInAdvance(final String billedInAdvance)
	{
		this.billedInAdvance = billedInAdvance;
	}

	public String getBilledInAdvance() 
	{
		return billedInAdvance;
	}
	
	public void setRatio(final String ratio)
	{
		this.ratio = ratio;
	}

	public String getRatio() 
	{
		return ratio;
	}
	

}