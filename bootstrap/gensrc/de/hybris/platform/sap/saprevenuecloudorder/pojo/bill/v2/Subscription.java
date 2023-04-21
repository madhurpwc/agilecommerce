/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class Subscription  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Subscription.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>Subscription.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer documentNumber;

	/** <i>Generated property</i> for <code>Subscription.itemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String itemId;
	
	public Subscription()
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
	
	public void setDocumentNumber(final Integer documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	public Integer getDocumentNumber() 
	{
		return documentNumber;
	}
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemId() 
	{
		return itemId;
	}
	

}