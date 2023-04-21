/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class Tier  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Tier.from</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer from;

	/** <i>Generated property</i> for <code>Tier.to</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer to;
	
	public Tier()
	{
		// default constructor
	}
	
	public void setFrom(final Integer from)
	{
		this.from = from;
	}

	public Integer getFrom() 
	{
		return from;
	}
	
	public void setTo(final Integer to)
	{
		this.to = to;
	}

	public Integer getTo() 
	{
		return to;
	}
	

}