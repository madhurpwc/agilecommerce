/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sap.hybris.scpiconnector.data;

import java.io.Serializable;


import java.util.Objects;
public  class ResponseData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ResponseData.status</code> property defined at extension <code>scpiconnector</code>. */
	
	private String status;

	/** <i>Generated property</i> for <code>ResponseData.responseContent</code> property defined at extension <code>scpiconnector</code>. */
	
	private String responseContent;

	/** <i>Generated property</i> for <code>ResponseData.reason</code> property defined at extension <code>scpiconnector</code>. */
	
	private String reason;
	
	public ResponseData()
	{
		// default constructor
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setResponseContent(final String responseContent)
	{
		this.responseContent = responseContent;
	}

	public String getResponseContent() 
	{
		return responseContent;
	}
	
	public void setReason(final String reason)
	{
		this.reason = reason;
	}

	public String getReason() 
	{
		return reason;
	}
	

}