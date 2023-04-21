/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class CancellationReversalResponse  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CancellationReversalResponse.validUntil</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date validUntil;

	/** <i>Generated property</i> for <code>CancellationReversalResponse.validUntilIsUnlimited</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean validUntilIsUnlimited;
	
	public CancellationReversalResponse()
	{
		// default constructor
	}
	
	public void setValidUntil(final Date validUntil)
	{
		this.validUntil = validUntil;
	}

	public Date getValidUntil() 
	{
		return validUntil;
	}
	
	public void setValidUntilIsUnlimited(final Boolean validUntilIsUnlimited)
	{
		this.validUntilIsUnlimited = validUntilIsUnlimited;
	}

	public Boolean getValidUntilIsUnlimited() 
	{
		return validUntilIsUnlimited;
	}
	

}