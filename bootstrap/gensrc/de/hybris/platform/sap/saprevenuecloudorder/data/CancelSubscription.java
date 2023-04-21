/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:18 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.data;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.data.MetaData;


import java.util.Objects;
public  class CancelSubscription  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CancelSubscription.metaData</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MetaData metaData;

	/** <i>Generated property</i> for <code>CancelSubscription.requestedCancellationDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String requestedCancellationDate;

	/** <i>Generated property</i> for <code>CancelSubscription.cancellationReason</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String cancellationReason;
	
	public CancelSubscription()
	{
		// default constructor
	}
	
	public void setMetaData(final MetaData metaData)
	{
		this.metaData = metaData;
	}

	public MetaData getMetaData() 
	{
		return metaData;
	}
	
	public void setRequestedCancellationDate(final String requestedCancellationDate)
	{
		this.requestedCancellationDate = requestedCancellationDate;
	}

	public String getRequestedCancellationDate() 
	{
		return requestedCancellationDate;
	}
	
	public void setCancellationReason(final String cancellationReason)
	{
		this.cancellationReason = cancellationReason;
	}

	public String getCancellationReason() 
	{
		return cancellationReason;
	}
	

}