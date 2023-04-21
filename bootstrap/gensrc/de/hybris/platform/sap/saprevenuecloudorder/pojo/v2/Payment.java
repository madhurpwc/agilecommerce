/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
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
public  class Payment  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Payment.method</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("method") 	
	private String method;
	
	public Payment()
	{
		// default constructor
	}
	
@JsonProperty("method") 	public void setMethod(final String method)
	{
		this.method = method;
	}

@JsonProperty("method") 	public String getMethod() 
	{
		return method;
	}
	

}