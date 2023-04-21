/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.c4his.b2c.facades.data;

import java.io.Serializable;


import java.util.Objects;
public  class DownloadDocType  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>DownloadDocType.docType</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String docType;

	/** <i>Generated property</i> for <code>DownloadDocType.orderstatus</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String orderstatus;
	
	public DownloadDocType()
	{
		// default constructor
	}
	
	public void setDocType(final String docType)
	{
		this.docType = docType;
	}

	public String getDocType() 
	{
		return docType;
	}
	
	public void setOrderstatus(final String orderstatus)
	{
		this.orderstatus = orderstatus;
	}

	public String getOrderstatus() 
	{
		return orderstatus;
	}
	

}