/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Snapshot  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Snapshot.effectiveDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date effectiveDate;

	/** <i>Generated property</i> for <code>Snapshot.precedingDocument</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PrecedingDocument precedingDocument;

	/** <i>Generated property</i> for <code>Snapshot.items</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<Item> items;

	/** <i>Generated property</i> for <code>Snapshot.createdAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date createdAt;

	/** <i>Generated property</i> for <code>Snapshot.createdBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String createdBy;
	
	public Snapshot()
	{
		// default constructor
	}
	
	public void setEffectiveDate(final Date effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	public Date getEffectiveDate() 
	{
		return effectiveDate;
	}
	
	public void setPrecedingDocument(final PrecedingDocument precedingDocument)
	{
		this.precedingDocument = precedingDocument;
	}

	public PrecedingDocument getPrecedingDocument() 
	{
		return precedingDocument;
	}
	
	public void setItems(final List<Item> items)
	{
		this.items = items;
	}

	public List<Item> getItems() 
	{
		return items;
	}
	
	public void setCreatedAt(final Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Date getCreatedAt() 
	{
		return createdAt;
	}
	
	public void setCreatedBy(final String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getCreatedBy() 
	{
		return createdBy;
	}
	

}