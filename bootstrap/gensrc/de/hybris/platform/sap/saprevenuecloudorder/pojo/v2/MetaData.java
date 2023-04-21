/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
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
public  class MetaData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>MetaData.createdAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("createdAt") 	
	private String createdAt;
	
	public MetaData()
	{
		// default constructor
	}
	
@JsonProperty("createdAt") 	public void setCreatedAt(final String createdAt)
	{
		this.createdAt = createdAt;
	}

@JsonProperty("createdAt") 	public String getCreatedAt() 
	{
		return createdAt;
	}
	

}