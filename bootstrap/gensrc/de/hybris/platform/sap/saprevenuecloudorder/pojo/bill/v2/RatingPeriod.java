/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:07 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import java.util.Date;


import java.util.Objects;
public  class RatingPeriod  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatingPeriod.start</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date start;

	/** <i>Generated property</i> for <code>RatingPeriod.end</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date end;
	
	public RatingPeriod()
	{
		// default constructor
	}
	
	public void setStart(final Date start)
	{
		this.start = start;
	}

	public Date getStart() 
	{
		return start;
	}
	
	public void setEnd(final Date end)
	{
		this.end = end;
	}

	public Date getEnd() 
	{
		return end;
	}
	

}