/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2.RatePlanViewBatchRequestBody;


import java.util.Objects;
public  class RatePlanViewBatchRequestElement  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatePlanViewBatchRequestElement.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>RatePlanViewBatchRequestElement.method</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String method;

	/** <i>Generated property</i> for <code>RatePlanViewBatchRequestElement.url</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String url;

	/** <i>Generated property</i> for <code>RatePlanViewBatchRequestElement.body</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RatePlanViewBatchRequestBody body;
	
	public RatePlanViewBatchRequestElement()
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
	
	public void setMethod(final String method)
	{
		this.method = method;
	}

	public String getMethod() 
	{
		return method;
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setBody(final RatePlanViewBatchRequestBody body)
	{
		this.body = body;
	}

	public RatePlanViewBatchRequestBody getBody() 
	{
		return body;
	}
	

}