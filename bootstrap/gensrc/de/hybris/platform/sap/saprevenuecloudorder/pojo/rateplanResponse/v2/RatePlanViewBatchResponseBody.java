/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.Snapshot;
import java.util.List;


import java.util.Objects;
public  class RatePlanViewBatchResponseBody  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseBody.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseBody.description</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String description;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseBody.periodicity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String periodicity;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseBody.currency</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String currency;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseBody.tags</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String tags;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseBody.snapshots</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<Snapshot> snapshots;
	
	public RatePlanViewBatchResponseBody()
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
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setPeriodicity(final String periodicity)
	{
		this.periodicity = periodicity;
	}

	public String getPeriodicity() 
	{
		return periodicity;
	}
	
	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}

	public String getCurrency() 
	{
		return currency;
	}
	
	public void setTags(final String tags)
	{
		this.tags = tags;
	}

	public String getTags() 
	{
		return tags;
	}
	
	public void setSnapshots(final List<Snapshot> snapshots)
	{
		this.snapshots = snapshots;
	}

	public List<Snapshot> getSnapshots() 
	{
		return snapshots;
	}
	

}