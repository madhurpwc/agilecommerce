/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.subscriptionfacades.data.UsageUnitData;
import java.util.Date;
import java.util.List;


import java.util.Objects;
public  class UsageChargeData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>UsageChargeData.name</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String name;

	/** <i>Generated property</i> for <code>UsageChargeData.usageUnit</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private UsageUnitData usageUnit;

	/** <i>Generated property</i> for <code>UsageChargeData.usageChargeEntries</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private List<UsageChargeEntryData> usageChargeEntries;

	/** <i>Generated property</i> for <code>UsageChargeData.fromDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date fromDate;

	/** <i>Generated property</i> for <code>UsageChargeData.toDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date toDate;

	/** <i>Generated property</i> for <code>UsageChargeData.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PriceData netAmount;

	/** <i>Generated property</i> for <code>UsageChargeData.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PriceData grossAmount;

	/** <i>Generated property</i> for <code>UsageChargeData.usage</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Float usage;
	
	public UsageChargeData()
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
	
	public void setUsageUnit(final UsageUnitData usageUnit)
	{
		this.usageUnit = usageUnit;
	}

	public UsageUnitData getUsageUnit() 
	{
		return usageUnit;
	}
	
	public void setUsageChargeEntries(final List<UsageChargeEntryData> usageChargeEntries)
	{
		this.usageChargeEntries = usageChargeEntries;
	}

	public List<UsageChargeEntryData> getUsageChargeEntries() 
	{
		return usageChargeEntries;
	}
	
	public void setFromDate(final Date fromDate)
	{
		this.fromDate = fromDate;
	}

	public Date getFromDate() 
	{
		return fromDate;
	}
	
	public void setToDate(final Date toDate)
	{
		this.toDate = toDate;
	}

	public Date getToDate() 
	{
		return toDate;
	}
	
	public void setNetAmount(final PriceData netAmount)
	{
		this.netAmount = netAmount;
	}

	public PriceData getNetAmount() 
	{
		return netAmount;
	}
	
	public void setGrossAmount(final PriceData grossAmount)
	{
		this.grossAmount = grossAmount;
	}

	public PriceData getGrossAmount() 
	{
		return grossAmount;
	}
	
	public void setUsage(final Float usage)
	{
		this.usage = usage;
	}

	public Float getUsage() 
	{
		return usage;
	}
	

}