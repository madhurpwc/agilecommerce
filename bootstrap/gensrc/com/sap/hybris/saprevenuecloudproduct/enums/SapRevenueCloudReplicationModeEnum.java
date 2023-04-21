package com.sap.hybris.saprevenuecloudproduct.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum SapRevenueCloudReplicationModeEnum declared at extension saprevenuecloudproduct.
 */
public enum SapRevenueCloudReplicationModeEnum implements HybrisEnumValue
{
	/**
	 * Generated enum value for SapRevenueCloudReplicationModeEnum.Full declared at extension saprevenuecloudproduct.
	 */
	FULL("Full"),
	/**
	 * Generated enum value for SapRevenueCloudReplicationModeEnum.Delta declared at extension saprevenuecloudproduct.
	 */
	DELTA("Delta"),
	/**
	 * Generated enum value for SapRevenueCloudReplicationModeEnum.NA declared at extension saprevenuecloudproduct.
	 */
	NA("NA");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SapRevenueCloudReplicationModeEnum";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "SapRevenueCloudReplicationModeEnum";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SapRevenueCloudReplicationModeEnum(final String code)
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
