/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2.RatePlanViewBatchRequestElement;
import java.util.List;


import java.util.Objects;
public  class RatePlanViewBatchRequest  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatePlanViewBatchRequest.requests</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<RatePlanViewBatchRequestElement> requests;
	
	public RatePlanViewBatchRequest()
	{
		// default constructor
	}
	
	public void setRequests(final List<RatePlanViewBatchRequestElement> requests)
	{
		this.requests = requests;
	}

	public List<RatePlanViewBatchRequestElement> getRequests() 
	{
		return requests;
	}
	

}