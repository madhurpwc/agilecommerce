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
public  class Customer  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Customer.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("id") 	
	private String id;

	/** <i>Generated property</i> for <code>Customer.type</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("type") 	
	private String type;
	
	public Customer()
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
	
@JsonProperty("type") 	public void setType(final String type)
	{
		this.type = type;
	}

@JsonProperty("type") 	public String getType() 
	{
		return type;
	}
	

}