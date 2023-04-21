/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.saprevenuecloudorder.data;

import java.io.Serializable;
import de.hybris.platform.saprevenuecloudorder.data.MetadataData;
import java.util.Date;


import java.util.Objects;
public  class SubscriptionExtensionFormData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionExtensionFormData.metadata</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MetadataData metadata;

	/** <i>Generated property</i> for <code>SubscriptionExtensionFormData.extensionDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date extensionDate;

	/** <i>Generated property</i> for <code>SubscriptionExtensionFormData.numberOfBillingPeriods</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer numberOfBillingPeriods;

	/** <i>Generated property</i> for <code>SubscriptionExtensionFormData.unlimited</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean unlimited;

	/** <i>Generated property</i> for <code>SubscriptionExtensionFormData.changedAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date changedAt;

	/** <i>Generated property</i> for <code>SubscriptionExtensionFormData.changedBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String changedBy;
	
	public SubscriptionExtensionFormData()
	{
		// default constructor
	}
	
	public void setMetadata(final MetadataData metadata)
	{
		this.metadata = metadata;
	}

	public MetadataData getMetadata() 
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