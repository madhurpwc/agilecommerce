/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;
import java.util.Date;


import java.util.Objects;
public  class RenewalTermData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RenewalTermData.period</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer period;

	/** <i>Generated property</i> for <code>RenewalTermData.endDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date endDate;
	
	public RenewalTermData()
	{
		// default constructor
	}
	
	public void setPeriod(final Integer period)
	{
		this.period = period;
	}

	public Integer getPeriod() 
	{
		return period;
	}
	
	public void setEndDate(final Date endDate)
	{
		this.endDate = endDate;
	}

	public Date getEndDate() 
	{
		return endDate;
	}
	

}