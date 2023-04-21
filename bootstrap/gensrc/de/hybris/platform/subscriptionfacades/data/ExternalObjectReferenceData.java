/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:14 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;


import java.util.Objects;
public  class ExternalObjectReferenceData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ExternalObjectReferenceData.externalIdTypeCode</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String externalIdTypeCode;

	/** <i>Generated property</i> for <code>ExternalObjectReferenceData.externalId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String externalId;

	/** <i>Generated property</i> for <code>ExternalObjectReferenceData.externalSystemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String externalSystemId;
	
	public ExternalObjectReferenceData()
	{
		// default constructor
	}
	
	public void setExternalIdTypeCode(final String externalIdTypeCode)
	{
		this.externalIdTypeCode = externalIdTypeCode;
	}

	public String getExternalIdTypeCode() 
	{
		return externalIdTypeCode;
	}
	
	public void setExternalId(final String externalId)
	{
		this.externalId = externalId;
	}

	public String getExternalId() 
	{
		return externalId;
	}
	
	public void setExternalSystemId(final String externalSystemId)
	{
		this.externalSystemId = externalSystemId;
	}

	public String getExternalSystemId() 
	{
		return externalSystemId;
	}
	

}