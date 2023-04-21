/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class Quantity  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Quantity.value</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Float value;

	/** The unit of measurement given using the UN/CEFACT Common Code (2-3 characters); if no unit is
                given, it is assumed to be the code 'C62', which stands for 'pieces' ('1' in math/physics terms, or also
                'each')
            <br/><br/><i>Generated property</i> for <code>Quantity.unit</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String unit;
	
	public Quantity()
	{
		// default constructor
	}
	
	public void setValue(final Float value)
	{
		this.value = value;
	}

	public Float getValue() 
	{
		return value;
	}
	
	public void setUnit(final String unit)
	{
		this.unit = unit;
	}

	public String getUnit() 
	{
		return unit;
	}
	

}