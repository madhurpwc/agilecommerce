/*
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapmodel.enums;

import de.hybris.platform.core.HybrisEnumValue;

/**
 * Generated enum SAPOrderStatus declared at extension sapmodel.
 */
public enum SAPOrderStatus implements HybrisEnumValue
{
	/**
	 * Generated enum value for SAPOrderStatus.NOT_SENT_TO_ERP declared at extension sapmodel.
	 */
	NOT_SENT_TO_ERP("NOT_SENT_TO_ERP"),
	/**
	 * Generated enum value for SAPOrderStatus.SENT_TO_REVENUE_CLOUD declared at extension saprevenuecloudorder.
	 */
	SENT_TO_REVENUE_CLOUD("SENT_TO_REVENUE_CLOUD"),
	/**
	 * Generated enum value for SAPOrderStatus.SENT_TO_ERP declared at extension sapmodel.
	 */
	SENT_TO_ERP("SENT_TO_ERP"),
	/**
	 * Generated enum value for SAPOrderStatus.SUBSCRIPTION_ORDER_CREATED declared at extension saprevenuecloudorder.
	 */
	SUBSCRIPTION_ORDER_CREATED("SUBSCRIPTION_ORDER_CREATED"),
	/**
	 * Generated enum value for SAPOrderStatus.CONFIRMED_FROM_ERP declared at extension sapmodel.
	 */
	CONFIRMED_FROM_ERP("CONFIRMED_FROM_ERP"),
	/**
	 * Generated enum value for SAPOrderStatus.CANCELLED_FROM_ERP declared at extension sapmodel.
	 */
	CANCELLED_FROM_ERP("CANCELLED_FROM_ERP");
	 
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "SAPOrderStatus";
	
	/**<i>Generated simple class name constant.</i>*/
	public final static String SIMPLE_CLASSNAME = "SAPOrderStatus";
	
	/** The code of this enum.*/
	private final String code;
	
	/**
	 * Creates a new enum value for this enum type.
	 *  
	 * @param code the enum value code
	 */
	private SAPOrderStatus(final String code)
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
