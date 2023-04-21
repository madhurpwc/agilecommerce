/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.RatePlanViewBatchResponseBody;


import java.util.Objects;
public  class RatePlanViewBatchResponseElement  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseElement.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseElement.status</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String status;

	/** <i>Generated property</i> for <code>RatePlanViewBatchResponseElement.body</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RatePlanViewBatchResponseBody body;
	
	public RatePlanViewBatchResponseElement()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setBody(final RatePlanViewBatchResponseBody body)
	{
		this.body = body;
	}

	public RatePlanViewBatchResponseBody getBody() 
	{
		return body;
	}
	

}