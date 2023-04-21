/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
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
public  class CancellationResponse  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CancellationResponse.metadata</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("metaData") 	
	private Metadata metadata;

	/** The requested cancellation date of a subscription, format YYYY-MM-DD.<br/><br/><i>Generated property</i> for <code>CancellationResponse.requestedCancellationDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String requestedCancellationDate;

	/** <i>Generated property</i> for <code>CancellationResponse.cancellationReason</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String cancellationReason;

	/** <i>Generated property</i> for <code>CancellationResponse.changedAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date changedAt;

	/** <i>Generated property</i> for <code>CancellationResponse.changedBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String changedBy;

	/** <i>Generated property</i> for <code>CancellationResponse.overruleTerms</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean overruleTerms;
	
	public CancellationResponse()
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
	
	public void setRequestedCancellationDate(final String requestedCancellationDate)
	{
		this.requestedCancellationDate = requestedCancellationDate;
	}

	public String getRequestedCancellationDate() 
	{
		return requestedCancellationDate;
	}
	
	public void setCancellationReason(final String cancellationReason)
	{
		this.cancellationReason = cancellationReason;
	}

	public String getCancellationReason() 
	{
		return cancellationReason;
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
	
	public void setOverruleTerms(final Boolean overruleTerms)
	{
		this.overruleTerms = overruleTerms;
	}

	public Boolean getOverruleTerms() 
	{
		return overruleTerms;
	}
	

}