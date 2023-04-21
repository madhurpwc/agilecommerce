/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Subscription  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Subscription.itemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("itemId") 	
	private String itemId;

	/** <i>Generated property</i> for <code>Subscription.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("documentNumber") 	
	private int documentNumber;

	/** <i>Generated property</i> for <code>Subscription.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("id") 	
	private String id;
	
	public Subscription()
	{
		// default constructor
	}
	
@JsonProperty("itemId") 	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

@JsonProperty("itemId") 	public String getItemId() 
	{
		return itemId;
	}
	
@JsonProperty("documentNumber") 	public void setDocumentNumber(final int documentNumber)
	{
		this.documentNumber = documentNumber;
	}

@JsonProperty("documentNumber") 	public int getDocumentNumber() 
	{
		return documentNumber;
	}
	
@JsonProperty("id") 	public void setId(final String id)
	{
		this.id = id;
	}

@JsonProperty("id") 	public String getId() 
	{
		return id;
	}
	

}