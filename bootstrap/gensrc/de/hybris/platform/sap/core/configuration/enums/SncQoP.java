/*
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.configuration.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum SncQoP declared at extension sapcoreconfiguration.
 * <p/>
 * This type determines the SNC security level.
 */
public enum SncQoP implements HybrisEnumValue
{
	/**
	 * Generated enum value for SncQoP.AUTHENTICATION_ONLY declared at extension sapcoreconfiguration.
	 */
	AUTHENTICATION_ONLY("AUTHENTICATION_ONLY"),
	/**
	 * Generated enum value for SncQoP.INTEGRITY_PROTECTION declared at extension sapcoreconfiguration.
	 */
	INTEGRITY_PROTECTION("INTEGRITY_PROTECTION"),
	/**
	 * Generated enum value for SncQoP.PRIVACY_PROTECTION declared at extension sapcoreconfiguration.
	 */
	PRIVACY_PROTECTION("PRIVACY_PROTECTION");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SncQoP";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "SncQoP";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SncQoP(final String code)
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
