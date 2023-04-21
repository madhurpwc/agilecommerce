/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpireturnsexchange.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundPriceComponentModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundReturnOrderPriceComponent first defined at extension sapcpireturnsexchange.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundReturnOrderPriceComponentModel extends SAPCpiOutboundPriceComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundReturnOrderPriceComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrderPriceComponent.refundDeliveryCost</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String REFUNDDELIVERYCOST = "refundDeliveryCost";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrderPriceComponent.shippingConditionType</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String SHIPPINGCONDITIONTYPE = "shippingConditionType";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundReturnOrderPriceComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundReturnOrderPriceComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundReturnOrderPriceComponentModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrderPriceComponent.refundDeliveryCost</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the refundDeliveryCost
	 */
	@Accessor(qualifier = "refundDeliveryCost", type = Accessor.Type.GETTER)
	public String getRefundDeliveryCost()
	{
		return getPersistenceContext().getPropertyValue(REFUNDDELIVERYCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrderPriceComponent.shippingConditionType</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the shippingConditionType
	 */
	@Accessor(qualifier = "shippingConditionType", type = Accessor.Type.GETTER)
	public String getShippingConditionType()
	{
		return getPersistenceContext().getPropertyValue(SHIPPINGCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrderPriceComponent.refundDeliveryCost</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the refundDeliveryCost
	 */
	@Accessor(qualifier = "refundDeliveryCost", type = Accessor.Type.SETTER)
	public void setRefundDeliveryCost(final String value)
	{
		getPersistenceContext().setPropertyValue(REFUNDDELIVERYCOST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrderPriceComponent.shippingConditionType</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the shippingConditionType
	 */
	@Accessor(qualifier = "shippingConditionType", type = Accessor.Type.SETTER)
	public void setShippingConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SHIPPINGCONDITIONTYPE, value);
	}
	
}
