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
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundOrderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundReturnOrder first defined at extension sapcpireturnsexchange.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundReturnOrderModel extends SAPCpiOutboundOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundReturnOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrder.preceedingDocumentId</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String PRECEEDINGDOCUMENTID = "preceedingDocumentId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrder.cancellationCode</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String CANCELLATIONCODE = "cancellationCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrder.cancellationReasonDescription</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String CANCELLATIONREASONDESCRIPTION = "cancellationReasonDescription";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrder.rejectionReason</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String REJECTIONREASON = "rejectionReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundReturnOrder.RMA</code> attribute defined at extension <code>sapcpireturnsexchange</code>. */
	public static final String RMA = "RMA";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundReturnOrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundReturnOrderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundReturnOrderModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrder.cancellationCode</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the cancellationCode
	 */
	@Accessor(qualifier = "cancellationCode", type = Accessor.Type.GETTER)
	public String getCancellationCode()
	{
		return getPersistenceContext().getPropertyValue(CANCELLATIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrder.cancellationReasonDescription</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the cancellationReasonDescription
	 */
	@Accessor(qualifier = "cancellationReasonDescription", type = Accessor.Type.GETTER)
	public String getCancellationReasonDescription()
	{
		return getPersistenceContext().getPropertyValue(CANCELLATIONREASONDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrder.preceedingDocumentId</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the preceedingDocumentId
	 */
	@Accessor(qualifier = "preceedingDocumentId", type = Accessor.Type.GETTER)
	public String getPreceedingDocumentId()
	{
		return getPersistenceContext().getPropertyValue(PRECEEDINGDOCUMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrder.rejectionReason</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.GETTER)
	public String getRejectionReason()
	{
		return getPersistenceContext().getPropertyValue(REJECTIONREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundReturnOrder.RMA</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 * @return the RMA
	 */
	@Accessor(qualifier = "RMA", type = Accessor.Type.GETTER)
	public String getRMA()
	{
		return getPersistenceContext().getPropertyValue(RMA);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrder.cancellationCode</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the cancellationCode
	 */
	@Accessor(qualifier = "cancellationCode", type = Accessor.Type.SETTER)
	public void setCancellationCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CANCELLATIONCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrder.cancellationReasonDescription</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the cancellationReasonDescription
	 */
	@Accessor(qualifier = "cancellationReasonDescription", type = Accessor.Type.SETTER)
	public void setCancellationReasonDescription(final String value)
	{
		getPersistenceContext().setPropertyValue(CANCELLATIONREASONDESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrder.preceedingDocumentId</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the preceedingDocumentId
	 */
	@Accessor(qualifier = "preceedingDocumentId", type = Accessor.Type.SETTER)
	public void setPreceedingDocumentId(final String value)
	{
		getPersistenceContext().setPropertyValue(PRECEEDINGDOCUMENTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrder.rejectionReason</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.SETTER)
	public void setRejectionReason(final String value)
	{
		getPersistenceContext().setPropertyValue(REJECTIONREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundReturnOrder.RMA</code> attribute defined at extension <code>sapcpireturnsexchange</code>. 
	 *  
	 * @param value the RMA
	 */
	@Accessor(qualifier = "RMA", type = Accessor.Type.SETTER)
	public void setRMA(final String value)
	{
		getPersistenceContext().setPropertyValue(RMA, value);
	}
	
}
