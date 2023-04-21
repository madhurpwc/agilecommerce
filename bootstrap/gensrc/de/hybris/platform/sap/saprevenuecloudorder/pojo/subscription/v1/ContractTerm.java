/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class ContractTerm  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ContractTerm.startDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date startDate;

	/** <i>Generated property</i> for <code>ContractTerm.period</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer period;

	/** <i>Generated property</i> for <code>ContractTerm.endDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date endDate;
	
	public ContractTerm()
	{
		// default constructor
	}
	
	public void setStartDate(final Date startDate)
	{
		this.startDate = startDate;
	}

	public Date getStartDate() 
	{
		return startDate;
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