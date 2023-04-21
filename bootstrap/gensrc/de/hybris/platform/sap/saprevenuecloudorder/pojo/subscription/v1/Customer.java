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


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Customer  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Customer.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>Customer.structureElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String structureElement;

	/** <i>Generated property</i> for <code>Customer.addressId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String addressId;
	
	public Customer()
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
	
	public void setStructureElement(final String structureElement)
	{
		this.structureElement = structureElement;
	}

	public String getStructureElement() 
	{
		return structureElement;
	}
	
	public void setAddressId(final String addressId)
	{
		this.addressId = addressId;
	}

	public String getAddressId() 
	{
		return addressId;
	}
	

}