/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
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
public  class Product  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Product.code</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("code") 	
	private String code;

	/** <i>Generated property</i> for <code>Product.name</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("name") 	
	private String name;

	/** <i>Generated property</i> for <code>Product.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("id") 	
	private String id;
	
	public Product()
	{
		// default constructor
	}
	
@JsonProperty("code") 	public void setCode(final String code)
	{
		this.code = code;
	}

@JsonProperty("code") 	public String getCode() 
	{
		return code;
	}
	
@JsonProperty("name") 	public void setName(final String name)
	{
		this.name = name;
	}

@JsonProperty("name") 	public String getName() 
	{
		return name;
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