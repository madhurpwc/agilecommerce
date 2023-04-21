/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
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
public  class ConsumedQuantity  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsumedQuantity.unit</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("unit") 	
	private String unit;

	/** <i>Generated property</i> for <code>ConsumedQuantity.value</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("value") 	
	private int value;
	
	public ConsumedQuantity()
	{
		// default constructor
	}
	
@JsonProperty("unit") 	public void setUnit(final String unit)
	{
		this.unit = unit;
	}

@JsonProperty("unit") 	public String getUnit() 
	{
		return unit;
	}
	
@JsonProperty("value") 	public void setValue(final int value)
	{
		this.value = value;
	}

@JsonProperty("value") 	public int getValue() 
	{
		return value;
	}
	

}