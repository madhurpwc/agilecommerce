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
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundOrderItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundReturnOrderItem first defined at extension sapcpireturnsexchange.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundReturnOrderItemModel extends SAPCpiOutboundOrderItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundReturnOrderItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrderItem.rejectionReason</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String REJECTIONREASON = "rejectionReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrderItem.warehouse</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String WAREHOUSE = "warehouse";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrderItem.cancellationCode</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String CANCELLATIONCODE = "cancellationCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrderItem.cancellationReasonDescription</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String CANCELLATIONREASONDESCRIPTION = "cancellationReasonDescription";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundReturnOrderItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundReturnOrderItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundReturnOrderItemModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrderItem.cancellationCode</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the cancellationCode
	 */
	@Accessor(qualifier = "cancellationCode", type = Accessor.Type.GETTER)
	public String getCancellationCode()
	{
		return getPersistenceContext().getPropertyValue(CANCELLATIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrderItem.cancellationReasonDescription</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the cancellationReasonDescription
	 */
	@Accessor(qualifier = "cancellationReasonDescription", type = Accessor.Type.GETTER)
	public String getCancellationReasonDescription()
	{
		return getPersistenceContext().getPropertyValue(CANCELLATIONREASONDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrderItem.rejectionReason</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.GETTER)
	public String getRejectionReason()
	{
		return getPersistenceContext().getPropertyValue(REJECTIONREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrderItem.warehouse</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the warehouse
	 */
	@Accessor(qualifier = "warehouse", type = Accessor.Type.GETTER)
	public String getWarehouse()
	{
		return getPersistenceContext().getPropertyValue(WAREHOUSE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrderItem.cancellationCode</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the cancellationCode
	 */
	@Accessor(qualifier = "cancellationCode", type = Accessor.Type.SETTER)
	public void setCancellationCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CANCELLATIONCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrderItem.cancellationReasonDescription</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the cancellationReasonDescription
	 */
	@Accessor(qualifier = "cancellationReasonDescription", type = Accessor.Type.SETTER)
	public void setCancellationReasonDescription(final String value)
	{
		getPersistenceContext().setPropertyValue(CANCELLATIONREASONDESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrderItem.rejectionReason</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.SETTER)
	public void setRejectionReason(final String value)
	{
		getPersistenceContext().setPropertyValue(REJECTIONREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrderItem.warehouse</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the warehouse
	 */
	@Accessor(qualifier = "warehouse", type = Accessor.Type.SETTER)
	public void setWarehouse(final String value)
	{
		getPersistenceContext().setPropertyValue(WAREHOUSE, value);
	}
	
}
