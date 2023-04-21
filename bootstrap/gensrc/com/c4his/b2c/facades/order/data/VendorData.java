/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.c4his.b2c.facades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.AddressData;


import java.util.Objects;
public  class VendorData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>VendorData.code</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>VendorData.name</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String name;

	/** <i>Generated property</i> for <code>VendorData.email</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String email;

	/** <i>Generated property</i> for <code>VendorData.warehouses</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String warehouses;

	/** <i>Generated property</i> for <code>VendorData.address</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private AddressData address;
	
	public VendorData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getEmail() 
	{
		return email;
	}
	
	public void setWarehouses(final String warehouses)
	{
		this.warehouses = warehouses;
	}

	public String getWarehouses() 
	{
		return warehouses;
	}
	
	public void setAddress(final AddressData address)
	{
		this.address = address;
	}

	public AddressData getAddress() 
	{
		return address;
	}
	

}