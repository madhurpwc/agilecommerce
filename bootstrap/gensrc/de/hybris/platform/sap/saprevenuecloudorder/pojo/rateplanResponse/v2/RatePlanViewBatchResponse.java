/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.RatePlanViewBatchResponseElement;
import java.util.List;


import java.util.Objects;
public  class RatePlanViewBatchResponse  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponse.responses</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<RatePlanViewBatchResponseElement> responses;
	
	public RatePlanViewBatchResponse()
	{
		// default constructor
	}
	
	public void setResponses(final List<RatePlanViewBatchResponseElement> responses)
	{
		this.responses = responses;
	}

	public List<RatePlanViewBatchResponseElement> getResponses() 
	{
		return responses;
	}
	

}