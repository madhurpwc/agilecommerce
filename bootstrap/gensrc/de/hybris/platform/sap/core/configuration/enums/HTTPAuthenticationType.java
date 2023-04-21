/*
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.configuration.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum HTTPAuthenticationType declared at extension sapcoreconfiguration.
 * <p/>
 * This type determines the authentication type.
 */
public enum HTTPAuthenticationType implements HybrisEnumValue
{
	/**
	 * Generated enum value for HTTPAuthenticationType.NO_AUTHENTICATION declared at extension sapcoreconfiguration.
	 */
	NO_AUTHENTICATION("NO_AUTHENTICATION"),
	/**
	 * Generated enum value for HTTPAuthenticationType.BASIC_AUTHENTICATION declared at extension sapcoreconfiguration.
	 */
	BASIC_AUTHENTICATION("BASIC_AUTHENTICATION");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "HTTPAuthenticationType";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "HTTPAuthenticationType";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private HTTPAuthenticationType(final String code)
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
