/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundOrderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundOrderCancellation first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundOrderCancellationModel extends SAPCpiOutboundOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundOrderCancellation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderCancellation.rejectionReason</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String REJECTIONREASON = "rejectionReason";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundOrderCancellationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundOrderCancellationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundOrderCancellationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderCancellation.rejectionReason</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.GETTER)
	public String getRejectionReason()
	{
		return getPersistenceContext().getPropertyValue(REJECTIONREASON);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderCancellation.rejectionReason</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.SETTER)
	public void setRejectionReason(final String value)
	{
		getPersistenceContext().setPropertyValue(REJECTIONREASON, value);
	}
	
}
