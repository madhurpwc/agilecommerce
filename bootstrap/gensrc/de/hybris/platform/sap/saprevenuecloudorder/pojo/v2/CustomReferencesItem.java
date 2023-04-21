/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
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
public  class CustomReferencesItem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CustomReferencesItem.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("id") 	
	private String id;

	/** <i>Generated property</i> for <code>CustomReferencesItem.typeCode</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("typeCode") 	
	private String typeCode;
	
	public CustomReferencesItem()
	{
		// default constructor
	}
	
@JsonProperty("id") 	public void setId(final String id)
	{
		this.id = id;
	}

@JsonProperty("id") 	public String getId() 
	{
		return id;
	}
	
@JsonProperty("typeCode") 	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

@JsonProperty("typeCode") 	public String getTypeCode() 
	{
		return typeCode;
	}
	

}