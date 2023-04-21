/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.saprevenuecloudorder.data;

import java.io.Serializable;
import java.util.Date;


import java.util.Objects;
public  class SubscriptionExtensionData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionExtensionData.validUntil</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date validUntil;

	/** <i>Generated property</i> for <code>SubscriptionExtensionData.validUntilIsUnlimited</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean validUntilIsUnlimited;
	
	public SubscriptionExtensionData()
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