/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.c4his.b2c.facades.product.data;

import java.io.Serializable;


import java.util.Objects;
public  class GenderData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>GenderData.code</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>GenderData.name</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String name;
	
	public GenderData()
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
	

}