package com.sap.hybris.saprevenuecloudproduct.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum RatePlanElementType declared at extension saprevenuecloudproduct.
 */
public enum RatePlanElementType implements HybrisEnumValue
{
	/**
	 * Generated enum value for RatePlanElementType.OneTime declared at extension saprevenuecloudproduct.
	 */
	ONETIME("OneTime"),
	/**
	 * Generated enum value for RatePlanElementType.Recurring declared at extension saprevenuecloudproduct.
	 */
	RECURRING("Recurring"),
	/**
	 * Generated enum value for RatePlanElementType.Usage declared at extension saprevenuecloudproduct.
	 */
	USAGE("Usage");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "RatePlanElementType";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "RatePlanElementType";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private RatePlanElementType(final String code)
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
