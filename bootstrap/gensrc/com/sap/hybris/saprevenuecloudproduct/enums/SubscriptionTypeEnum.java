package com.sap.hybris.saprevenuecloudproduct.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum SubscriptionTypeEnum declared at extension saprevenuecloudproduct.
 */
public enum SubscriptionTypeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for SubscriptionTypeEnum.commercial declared at extension saprevenuecloudproduct.
	 */
	COMMERCIAL("commercial"),
	/**
	 * Generated enum value for SubscriptionTypeEnum.internal_billing declared at extension saprevenuecloudproduct.
	 */
	INTERNAL_BILLING("internal_billing"),
	/**
	 * Generated enum value for SubscriptionTypeEnum.trial_beta declared at extension saprevenuecloudproduct.
	 */
	TRIAL_BETA("trial_beta");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SubscriptionTypeEnum";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "SubscriptionTypeEnum";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SubscriptionTypeEnum(final String code)
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
