/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class PrecedingDocument  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PrecedingDocument.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>PrecedingDocument.itemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String itemId;

	/** <i>Generated property</i> for <code>PrecedingDocument.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer documentNumber;

	/** <i>Generated property</i> for <code>PrecedingDocument.source</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String source;
	
	public PrecedingDocument()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemId() 
	{
		return itemId;
	}
	
	public void setDocumentNumber(final Integer documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	public Integer getDocumentNumber() 
	{
		return documentNumber;
	}
	
	public void setSource(final String source)
	{
		this.source = source;
	}

	public String getSource() 
	{
		return source;
	}
	

}