/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SAPSubscriptionConfiguration first defined at extension saprevenuecloudorder.
 */
@SuppressWarnings("all")
public class SAPSubscriptionConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPSubscriptionConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSubscriptionConfiguration.id</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSubscriptionConfiguration.endpoint</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String ENDPOINT = "endpoint";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSubscriptionConfiguration.oauthUrl</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String OAUTHURL = "oauthUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSubscriptionConfiguration.clientId</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String CLIENTID = "clientId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSubscriptionConfiguration.clientSecret</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String CLIENTSECRET = "clientSecret";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPSubscriptionConfiguration.warehouses</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String WAREHOUSES = "warehouses";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPSubscriptionConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPSubscriptionConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>SAPSubscriptionConfiguration</code> at extension <code>saprevenuecloudorder</code>
	 * @param _warehouses initial attribute declared by type <code>SAPSubscriptionConfiguration</code> at extension <code>saprevenuecloudorder</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPSubscriptionConfigurationModel(final String _id, final Collection<WarehouseModel> _warehouses)
	{
		super();
		setId(_id);
		setWarehouses(_warehouses);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>SAPSubscriptionConfiguration</code> at extension <code>saprevenuecloudorder</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _warehouses initial attribute declared by type <code>SAPSubscriptionConfiguration</code> at extension <code>saprevenuecloudorder</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPSubscriptionConfigurationModel(final String _id, final ItemModel _owner, final Collection<WarehouseModel> _warehouses)
	{
		super();
		setId(_id);
		setOwner(_owner);
		setWarehouses(_warehouses);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSubscriptionConfiguration.clientId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the clientId - client Id
	 */
	@Accessor(qualifier = "clientId", type = Accessor.Type.GETTER)
	public String getClientId()
	{
		return getPersistenceContext().getPropertyValue(CLIENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSubscriptionConfiguration.clientSecret</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the clientSecret - client secret
	 */
	@Accessor(qualifier = "clientSecret", type = Accessor.Type.GETTER)
	public String getClientSecret()
	{
		return getPersistenceContext().getPropertyValue(CLIENTSECRET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSubscriptionConfiguration.endpoint</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the endpoint - subscription billing provisioning request endpoint
	 */
	@Accessor(qualifier = "endpoint", type = Accessor.Type.GETTER)
	public String getEndpoint()
	{
		return getPersistenceContext().getPropertyValue(ENDPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSubscriptionConfiguration.id</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the id - tenant id
	 */
	@Accessor(qualifier = "id", type = Accessor.Type.GETTER)
	public String getId()
	{
		return getPersistenceContext().getPropertyValue(ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSubscriptionConfiguration.oauthUrl</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the oauthUrl - oauth url
	 */
	@Accessor(qualifier = "oauthUrl", type = Accessor.Type.GETTER)
	public String getOauthUrl()
	{
		return getPersistenceContext().getPropertyValue(OAUTHURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPSubscriptionConfiguration.warehouses</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the warehouses
	 */
	@Accessor(qualifier = "warehouses", type = Accessor.Type.GETTER)
	public Collection<WarehouseModel> getWarehouses()
	{
		return getPersistenceContext().getPropertyValue(WAREHOUSES);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSubscriptionConfiguration.clientId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the clientId - client Id
	 */
	@Accessor(qualifier = "clientId", type = Accessor.Type.SETTER)
	public void setClientId(final String value)
	{
		getPersistenceContext().setPropertyValue(CLIENTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSubscriptionConfiguration.clientSecret</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the clientSecret - client secret
	 */
	@Accessor(qualifier = "clientSecret", type = Accessor.Type.SETTER)
	public void setClientSecret(final String value)
	{
		getPersistenceContext().setPropertyValue(CLIENTSECRET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSubscriptionConfiguration.endpoint</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the endpoint - subscription billing provisioning request endpoint
	 */
	@Accessor(qualifier = "endpoint", type = Accessor.Type.SETTER)
	public void setEndpoint(final String value)
	{
		getPersistenceContext().setPropertyValue(ENDPOINT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSubscriptionConfiguration.id</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the id - tenant id
	 */
	@Accessor(qualifier = "id", type = Accessor.Type.SETTER)
	public void setId(final String value)
	{
		getPersistenceContext().setPropertyValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSubscriptionConfiguration.oauthUrl</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the oauthUrl - oauth url
	 */
	@Accessor(qualifier = "oauthUrl", type = Accessor.Type.SETTER)
	public void setOauthUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(OAUTHURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPSubscriptionConfiguration.warehouses</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the warehouses
	 */
	@Accessor(qualifier = "warehouses", type = Accessor.Type.SETTER)
	public void setWarehouses(final Collection<WarehouseModel> value)
	{
		getPersistenceContext().setPropertyValue(WAREHOUSES, value);
	}
	
}
