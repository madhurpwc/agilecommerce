/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;
public  class KymaClientIdentity  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>KymaClientIdentity.application</code> property defined at extension <code>kymaintegrationservices</code>. */
@JsonProperty("application") 	
	private String application;
	
	public KymaClientIdentity()
	{
		// default constructor
	}
	
@JsonProperty("application") 	public void setApplication(final String application)
	{
		this.application = application;
	}

@JsonProperty("application") 	public String getApplication() 
	{
		return application;
	}
	

}