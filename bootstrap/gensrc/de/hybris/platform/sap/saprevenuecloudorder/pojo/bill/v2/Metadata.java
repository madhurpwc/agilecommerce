/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import java.util.Date;


import java.util.Objects;
public  class Metadata  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Metadata.createdBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String createdBy;

	/** <i>Generated property</i> for <code>Metadata.createdAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date createdAt;
	
	public Metadata()
	{
		// default constructor
	}
	
	public void setCreatedBy(final String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getCreatedBy() 
	{
		return createdBy;
	}
	
	public void setCreatedAt(final Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Date getCreatedAt() 
	{
		return createdAt;
	}
	

}