/*
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapmodel.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum SAPProductType declared at extension sapmodel.
 */
public enum SAPProductType implements HybrisEnumValue
{
	/**
	 * Generated enum value for SAPProductType.PHYSICAL declared at extension sapmodel.
	 */
	PHYSICAL("PHYSICAL"),
	/**
	 * Generated enum value for SAPProductType.SERVICE declared at extension sapmodel.
	 */
	SERVICE("SERVICE"),
	/**
	 * Generated enum value for SAPProductType.SUBSCRIPTION declared at extension sapmodel.
	 */
	SUBSCRIPTION("SUBSCRIPTION");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPProductType";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "SAPProductType";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SAPProductType(final String code)
	{
		this.code = code.intern();
	}
	
	
	/**
	 * Gets the code of this enum value.
	 *  
	 * @return code of value
	 */
	@Override
	public String getCode()
	{
		return this.code;
	}
	
	/**
	 * Gets the type this enum value belongs to.
	 *  
	 * @return code of type
	 */
	@Override
	public String getType()
	{
		return SIMPLE_CLASSNAME;
	}
	
}
