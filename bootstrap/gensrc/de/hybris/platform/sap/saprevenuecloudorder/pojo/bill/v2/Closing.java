/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class Closing  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** `AUTO` if the bill will be closed on the predetermined billing date.`MANUAL` if the bill will
                stay open until closed manually.")
            <br/><br/><i>Generated property</i> for <code>Closing.method</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String method;

	/** <i>Generated property</i> for <code>Closing.metaData</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Metadata metaData;
	
	public Closing()
	{
		// default constructor
	}
	
	public void setMethod(final String method)
	{
		this.method = method;
	}

	public String getMethod() 
	{
		return method;
	}
	
	public void setMetaData(final Metadata metaData)
	{
		this.metaData = metaData;
	}

	public Metadata getMetaData() 
	{
		return metaData;
	}
	

}