package com.sap.hybris.saprevenuecloudproduct.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum ProductStatusEnum declared at extension saprevenuecloudproduct.
 */
public enum ProductStatusEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for ProductStatusEnum.Published declared at extension saprevenuecloudproduct.
	 */
	PUBLISHED("Published"),
	/**
	 * Generated enum value for ProductStatusEnum.NotPublished declared at extension saprevenuecloudproduct.
	 */
	NOTPUBLISHED("NotPublished");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ProductStatusEnum";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "ProductStatusEnum";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private ProductStatusEnum(final String code)
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
