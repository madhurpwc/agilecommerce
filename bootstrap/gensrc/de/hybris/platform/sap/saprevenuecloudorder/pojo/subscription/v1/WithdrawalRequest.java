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
public  class WithdrawalRequest  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>WithdrawalRequest.metadata</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("metaData") 	
	private Metadata metadata;

	/** <i>Generated property</i> for <code>WithdrawalRequest.changedAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date changedAt;

	/** <i>Generated property</i> for <code>WithdrawalRequest.changedBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String changedBy;
	
	public WithdrawalRequest()
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