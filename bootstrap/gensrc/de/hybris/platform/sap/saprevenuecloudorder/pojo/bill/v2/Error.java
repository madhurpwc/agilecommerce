/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class Error  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** original HTTP error code, should be consistent with the response HTTP code")
            <br/><br/><i>Generated property</i> for <code>Error.status</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer status;

	/** <i>Generated property</i> for <code>Error.type</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String type;

	/** <i>Generated property</i> for <code>Error.message</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String message;

	/** <i>Generated property</i> for <code>Error.details</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<ErrorDetail> details;
	
	public Error()
	{
		// default constructor
	}
	
	public void setStatus(final Integer status)
	{
		this.status = status;
	}

	public Integer getStatus() 
	{
		return status;
	}
	
	public void setType(final String type)
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	
	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getMessage() 
	{
		return message;
	}
	
	public void setDetails(final List<ErrorDetail> details)
	{
		this.details = details;
	}

	public List<ErrorDetail> getDetails() 
	{
		return details;
	}
	

}