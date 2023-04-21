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
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundB2BCustomerModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundB2BContact first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundB2BContactModel extends SAPCpiOutboundB2BCustomerModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundB2BContact";
	
	/**<i>Generated relation code constant for relation <code>SAPCpiOutboundB2BCustomer2SAPCpiOutboundB2BContact</code> defining source attribute <code>sapCpiOutboundB2BCustomer</code> in extension <code>sapcpiadapter</code>.</i>*/
	public static final String _SAPCPIOUTBOUNDB2BCUSTOMER2SAPCPIOUTBOUNDB2BCONTACT = "SAPCpiOutboundB2BCustomer2SAPCpiOutboundB2BContact";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundB2BContact.sapCpiOutboundB2BCustomer</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDB2BCUSTOMER = "sapCpiOutboundB2BCustomer";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundB2BContactModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundB2BContactModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundB2BContactModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundB2BContact.sapCpiOutboundB2BCustomer</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiOutboundB2BCustomer
	 */
	@Accessor(qualifier = "sapCpiOutboundB2BCustomer", type = Accessor.Type.GETTER)
	public SAPCpiOutboundB2BCustomerModel getSapCpiOutboundB2BCustomer()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDB2BCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundB2BContact.sapCpiOutboundB2BCustomer</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundB2BCustomer
	 */
	@Accessor(qualifier = "sapCpiOutboundB2BCustomer", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundB2BCustomer(final SAPCpiOutboundB2BCustomerModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDB2BCUSTOMER, value);
	}
	
}
