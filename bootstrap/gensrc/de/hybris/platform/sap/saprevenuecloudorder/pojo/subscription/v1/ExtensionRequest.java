/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class ExtensionRequest  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ExtensionRequest.metadata</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("metaData") 	
	private Metadata metadata;

	/** <i>Generated property</i> for <code>ExtensionRequest.extensionDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date extensionDate;

	/** <i>Generated property</i> for <code>ExtensionRequest.numberOfBillingPeriods</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer numberOfBillingPeriods;

	/** <i>Generated property</i> for <code>ExtensionRequest.unlimited</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean unlimited;

	/** <i>Generated property</i> for <code>ExtensionRequest.changedAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date changedAt;

	/** <i>Generated property</i> for <code>ExtensionRequest.changedBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String changedBy;
	
	public ExtensionRequest()
	{
		// default constructor
	}
	
@JsonProperty("metaData") 	public void setMetadata(final Metadata metadata)
	{
		this.metadata = metadata;
	}

@JsonProperty("metaData") 	public Metadata getMetadata() 
	{
		return metadata;
	}
	
	public void setExtensionDate(final Date extensionDate)
	{
		this.extensionDate = extensionDate;
	}

	public Date getExtensionDate() 
	{
		return extensionDate;
	}
	
	public void setNumberOfBillingPeriods(final Integer numberOfBillingPeriods)
	{
		this.numberOfBillingPeriods = numberOfBillingPeriods;
	}

	public Integer getNumberOfBillingPeriods() 
	{
		return numberOfBillingPeriods;
	}
	
	public void setUnlimited(final Boolean unlimited)
	{
		this.unlimited = unlimited;
	}

	public Boolean getUnlimited() 
	{
		return unlimited;
	}
	
	public void setChangedAt(final Date changedAt)
	{
		this.changedAt = changedAt;
	}

	public Date getChangedAt() 
	{
		return changedAt;
	}
	
	public void setChangedBy(final String changedBy)
	{
		this.changedBy = changedBy;
	}

	public String getChangedBy() 
	{
		return changedBy;
	}
	

}