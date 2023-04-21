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
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundConfig first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.url</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String URL = "url";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.username</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String USERNAME = "username";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.senderName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SENDERNAME = "senderName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.senderPort</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SENDERPORT = "senderPort";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.receiverName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String RECEIVERNAME = "receiverName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.receiverPort</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String RECEIVERPORT = "receiverPort";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundConfig.client</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CLIENT = "client";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundConfigModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.client</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the client
	 */
	@Accessor(qualifier = "client", type = Accessor.Type.GETTER)
	public String getClient()
	{
		return getPersistenceContext().getPropertyValue(CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.receiverName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the receiverName
	 */
	@Accessor(qualifier = "receiverName", type = Accessor.Type.GETTER)
	public String getReceiverName()
	{
		return getPersistenceContext().getPropertyValue(RECEIVERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.receiverPort</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the receiverPort
	 */
	@Accessor(qualifier = "receiverPort", type = Accessor.Type.GETTER)
	public String getReceiverPort()
	{
		return getPersistenceContext().getPropertyValue(RECEIVERPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.senderName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the senderName
	 */
	@Accessor(qualifier = "senderName", type = Accessor.Type.GETTER)
	public String getSenderName()
	{
		return getPersistenceContext().getPropertyValue(SENDERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.senderPort</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the senderPort
	 */
	@Accessor(qualifier = "senderPort", type = Accessor.Type.GETTER)
	public String getSenderPort()
	{
		return getPersistenceContext().getPropertyValue(SENDERPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.url</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the url
	 */
	@Accessor(qualifier = "url", type = Accessor.Type.GETTER)
	public String getUrl()
	{
		return getPersistenceContext().getPropertyValue(URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundConfig.username</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the username
	 */
	@Accessor(qualifier = "username", type = Accessor.Type.GETTER)
	public String getUsername()
	{
		return getPersistenceContext().getPropertyValue(USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.client</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the client
	 */
	@Accessor(qualifier = "client", type = Accessor.Type.SETTER)
	public void setClient(final String value)
	{
		getPersistenceContext().setPropertyValue(CLIENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.receiverName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the receiverName
	 */
	@Accessor(qualifier = "receiverName", type = Accessor.Type.SETTER)
	public void setReceiverName(final String value)
	{
		getPersistenceContext().setPropertyValue(RECEIVERNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.receiverPort</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the receiverPort
	 */
	@Accessor(qualifier = "receiverPort", type = Accessor.Type.SETTER)
	public void setReceiverPort(final String value)
	{
		getPersistenceContext().setPropertyValue(RECEIVERPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.senderName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the senderName
	 */
	@Accessor(qualifier = "senderName", type = Accessor.Type.SETTER)
	public void setSenderName(final String value)
	{
		getPersistenceContext().setPropertyValue(SENDERNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.senderPort</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the senderPort
	 */
	@Accessor(qualifier = "senderPort", type = Accessor.Type.SETTER)
	public void setSenderPort(final String value)
	{
		getPersistenceContext().setPropertyValue(SENDERPORT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.url</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the url
	 */
	@Accessor(qualifier = "url", type = Accessor.Type.SETTER)
	public void setUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(URL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundConfig.username</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the username
	 */
	@Accessor(qualifier = "username", type = Accessor.Type.SETTER)
	public void setUsername(final String value)
	{
		getPersistenceContext().setPropertyValue(USERNAME, value);
	}
	
}
