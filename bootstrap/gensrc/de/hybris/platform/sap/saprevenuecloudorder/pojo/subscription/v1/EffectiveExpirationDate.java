/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class EffectiveExpirationDate  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>EffectiveExpirationDate.effectiveExpirationDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date effectiveExpirationDate;
	
	public EffectiveExpirationDate()
	{
		// default constructor
	}
	
	public void setEffectiveExpirationDate(final Date effectiveExpirationDate)
	{
		this.effectiveExpirationDate = effectiveExpirationDate;
	}

	public Date getEffectiveExpirationDate() 
	{
		return effectiveExpirationDate;
	}
	

}