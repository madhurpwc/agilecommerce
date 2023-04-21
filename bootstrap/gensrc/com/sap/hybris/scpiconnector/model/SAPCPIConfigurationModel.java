/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.scpiconnector.model;

import com.sap.hybris.scpiconnector.model.IflowConfigurationModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type SAPCPIConfiguration first defined at extension scpiconnector.
 */
@SuppressWarnings("all")
public class SAPCPIConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCPIConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPIConfiguration.name</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPIConfiguration.username</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String USERNAME = "username";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPIConfiguration.password</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String PASSWORD = "password";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPIConfiguration.baseUrl</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String BASEURL = "baseUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPIConfiguration.proxyUrl</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String PROXYURL = "proxyUrl";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPIConfiguration.iflowConfiguration</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String IFLOWCONFIGURATION = "iflowConfiguration";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCPIConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCPIConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _baseUrl initial attribute declared by type <code>SAPCPIConfiguration</code> at extension <code>scpiconnector</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPIConfigurationModel(final String _baseUrl)
	{
		super();
		setBaseUrl(_baseUrl);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _baseUrl initial attribute declared by type <code>SAPCPIConfiguration</code> at extension <code>scpiconnector</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPIConfigurationModel(final String _baseUrl, final ItemModel _owner)
	{
		super();
		setBaseUrl(_baseUrl);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPIConfiguration.baseUrl</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the baseUrl - Base URL of the CPI tenant.
	 */
	@Accessor(qualifier = "baseUrl", type = Accessor.Type.GETTER)
	public String getBaseUrl()
	{
		return getPersistenceContext().getPropertyValue(BASEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPIConfiguration.iflowConfiguration</code> attribute defined at extension <code>scpiconnector</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the iflowConfiguration - The List if Iflow Specific Configurations.
	 */
	@Accessor(qualifier = "iflowConfiguration", type = Accessor.Type.GETTER)
	public List<IflowConfigurationModel> getIflowConfiguration()
	{
		return getPersistenceContext().getPropertyValue(IFLOWCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPIConfiguration.name</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the name - Name of the Configuration item.
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPIConfiguration.password</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the password - Password of the CPI User.
	 */
	@Accessor(qualifier = "password", type = Accessor.Type.GETTER)
	public String getPassword()
	{
		return getPersistenceContext().getPropertyValue(PASSWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPIConfiguration.proxyUrl</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the proxyUrl - Proxy if required for connection.
	 */
	@Accessor(qualifier = "proxyUrl", type = Accessor.Type.GETTER)
	public String getProxyUrl()
	{
		return getPersistenceContext().getPropertyValue(PROXYURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPIConfiguration.username</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the username - Username of the CPI User.
	 */
	@Accessor(qualifier = "username", type = Accessor.Type.GETTER)
	public String getUsername()
	{
		return getPersistenceContext().getPropertyValue(USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPIConfiguration.baseUrl</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the baseUrl - Base URL of the CPI tenant.
	 */
	@Accessor(qualifier = "baseUrl", type = Accessor.Type.SETTER)
	public void setBaseUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(BASEURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPIConfiguration.iflowConfiguration</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the iflowConfiguration - The List if Iflow Specific Configurations.
	 */
	@Accessor(qualifier = "iflowConfiguration", type = Accessor.Type.SETTER)
	public void setIflowConfiguration(final List<IflowConfigurationModel> value)
	{
		getPersistenceContext().setPropertyValue(IFLOWCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPIConfiguration.name</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the name - Name of the Configuration item.
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPIConfiguration.password</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the password - Password of the CPI User.
	 */
	@Accessor(qualifier = "password", type = Accessor.Type.SETTER)
	public void setPassword(final String value)
	{
		getPersistenceContext().setPropertyValue(PASSWORD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPIConfiguration.proxyUrl</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the proxyUrl - Proxy if required for connection.
	 */
	@Accessor(qualifier = "proxyUrl", type = Accessor.Type.SETTER)
	public void setProxyUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(PROXYURL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPIConfiguration.username</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the username - Username of the CPI User.
	 */
	@Accessor(qualifier = "username", type = Accessor.Type.SETTER)
	public void setUsername(final String value)
	{
		getPersistenceContext().setPropertyValue(USERNAME, value);
	}
	
}
