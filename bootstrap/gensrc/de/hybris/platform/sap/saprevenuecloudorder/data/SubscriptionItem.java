/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.data;

import java.io.Serializable;


import java.util.Objects;
public  class SubscriptionItem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionItem.validFrom</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String validFrom;

	/** <i>Generated property</i> for <code>SubscriptionItem.validTo</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String validTo;

	/** <i>Generated property</i> for <code>SubscriptionItem.numberOfWaiverPeriods</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String numberOfWaiverPeriods;
	
	public SubscriptionItem()
	{
		// default constructor
	}
	
	public void setValidFrom(final String validFrom)
	{
		this.validFrom = validFrom;
	}

	public String getValidFrom() 
	{
		return validFrom;
	}
	
	public void setValidTo(final String validTo)
	{
		this.validTo = validTo;
	}

	public String getValidTo() 
	{
		return validTo;
	}
	
	public void setNumberOfWaiverPeriods(final String numberOfWaiverPeriods)
	{
		this.numberOfWaiverPeriods = numberOfWaiverPeriods;
	}

	public String getNumberOfWaiverPeriods() 
	{
		return numberOfWaiverPeriods;
	}
	

}