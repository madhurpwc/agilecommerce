/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:14 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class Success  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** original HTTP error code, should be consistent with the response HTTP code")
            <br/><br/><i>Generated property</i> for <code>Success.status</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer status;

	/** <i>Generated property</i> for <code>Success.message</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String message;
	
	public Success()
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
	
	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getMessage() 
	{
		return message;
	}
	

}