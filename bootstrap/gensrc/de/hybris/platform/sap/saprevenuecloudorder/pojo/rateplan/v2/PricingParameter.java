/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2;

import java.io.Serializable;


import java.util.Objects;
public  class PricingParameter  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PricingParameter.code</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>PricingParameter.value</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String value;
	
	public PricingParameter()
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
	
	public void setValue(final String value)
	{
		this.value = value;
	}

	public String getValue() 
	{
		return value;
	}
	

}