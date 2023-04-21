/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.data;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.data.SubscriptionItem;


import java.util.Objects;
public  class AspectsData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AspectsData.subscriptionItem</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private SubscriptionItem subscriptionItem;
	
	public AspectsData()
	{
		// default constructor
	}
	
	public void setSubscriptionItem(final SubscriptionItem subscriptionItem)
	{
		this.subscriptionItem = subscriptionItem;
	}

	public SubscriptionItem getSubscriptionItem() 
	{
		return subscriptionItem;
	}
	

}