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
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.Price;


import java.util.Objects;
public  class FixedRate  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>FixedRate.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>FixedRate.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String metricId;

	/** <i>Generated property</i> for <code>FixedRate.price</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Price price;

	/** <i>Generated property</i> for <code>FixedRate.billedInAdvance</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billedInAdvance;

	/** <i>Generated property</i> for <code>FixedRate.proratable</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String proratable;
	
	public FixedRate()
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
	
	public void setPrice(final Price price)
	{
		this.price = price;
	}

	public Price getPrice() 
	{
		return price;
	}
	
	public void setBilledInAdvance(final String billedInAdvance)
	{
		this.billedInAdvance = billedInAdvance;
	}

	public String getBilledInAdvance() 
	{
		return billedInAdvance;
	}
	
	public void setProratable(final String proratable)
	{
		this.proratable = proratable;
	}

	public String getProratable() 
	{
		return proratable;
	}
	

}