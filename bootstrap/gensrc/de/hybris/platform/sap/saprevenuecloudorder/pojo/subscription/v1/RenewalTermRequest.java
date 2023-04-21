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


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class RenewalTermRequest  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RenewalTermRequest.period</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer period;
	
	public RenewalTermRequest()
	{
		// default constructor
	}
	
	public void setPeriod(final Integer period)
	{
		this.period = period;
	}

	public Integer getPeriod() 
	{
		return period;
	}
	

}