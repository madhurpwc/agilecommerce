/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class ExternalObjectReference  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ExternalObjectReference.externalIdTypeCode</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String externalIdTypeCode;

	/** <i>Generated property</i> for <code>ExternalObjectReference.externalId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String externalId;

	/** <i>Generated property</i> for <code>ExternalObjectReference.externalSystemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String externalSystemId;
	
	public ExternalObjectReference()
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