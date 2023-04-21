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
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundB2BContactModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundCustomerModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type SAPCpiOutboundB2BCustomer first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundB2BCustomerModel extends SAPCpiOutboundCustomerModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundB2BCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundB2BCustomer.email</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String EMAIL = "email";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundB2BCustomer.defaultB2BUnit</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DEFAULTB2BUNIT = "defaultB2BUnit";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundB2BCustomer.groups</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String GROUPS = "groups";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundB2BCustomer.sapCpiOutboundB2BContacts</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDB2BCONTACTS = "sapCpiOutboundB2BContacts";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundB2BCustomerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundB2BCustomerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundB2BCustomerModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundB2BCustomer.defaultB2BUnit</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the defaultB2BUnit
	 */
	@Accessor(qualifier = "defaultB2BUnit", type = Accessor.Type.GETTER)
	public String getDefaultB2BUnit()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundB2BCustomer.email</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the email
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.GETTER)
	public String getEmail()
	{
		return getPersistenceContext().getPropertyValue(EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundB2BCustomer.groups</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the groups
	 */
	@Accessor(qualifier = "groups", type = Accessor.Type.GETTER)
	public String getGroups()
	{
		return getPersistenceContext().getPropertyValue(GROUPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundB2BCustomer.sapCpiOutboundB2BContacts</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCpiOutboundB2BContacts
	 */
	@Accessor(qualifier = "sapCpiOutboundB2BContacts", type = Accessor.Type.GETTER)
	public Set<SAPCpiOutboundB2BContactModel> getSapCpiOutboundB2BContacts()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDB2BCONTACTS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundB2BCustomer.defaultB2BUnit</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the defaultB2BUnit
	 */
	@Accessor(qualifier = "defaultB2BUnit", type = Accessor.Type.SETTER)
	public void setDefaultB2BUnit(final String value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTB2BUNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundB2BCustomer.email</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the email
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.SETTER)
	public void setEmail(final String value)
	{
		getPersistenceContext().setPropertyValue(EMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundB2BCustomer.groups</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the groups
	 */
	@Accessor(qualifier = "groups", type = Accessor.Type.SETTER)
	public void setGroups(final String value)
	{
		getPersistenceContext().setPropertyValue(GROUPS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundB2BCustomer.sapCpiOutboundB2BContacts</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundB2BContacts
	 */
	@Accessor(qualifier = "sapCpiOutboundB2BContacts", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundB2BContacts(final Set<SAPCpiOutboundB2BContactModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDB2BCONTACTS, value);
	}
	
}
