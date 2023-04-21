/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.scpiconnector.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type IflowConfiguration first defined at extension scpiconnector.
 */
@SuppressWarnings("all")
public class IflowConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "IflowConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>IflowConfiguration.iflowKey</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String IFLOWKEY = "iflowKey";
	
	/** <i>Generated constant</i> - Attribute key of <code>IflowConfiguration.iflowUrl</code> attribute defined at extension <code>scpiconnector</code>. */
	public static final String IFLOWURL = "iflowUrl";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public IflowConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public IflowConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public IflowConfigurationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IflowConfiguration.iflowKey</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the iflowKey - The Key of the Iflow.
	 */
	@Accessor(qualifier = "iflowKey", type = Accessor.Type.GETTER)
	public String getIflowKey()
	{
		return getPersistenceContext().getPropertyValue(IFLOWKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IflowConfiguration.iflowUrl</code> attribute defined at extension <code>scpiconnector</code>. 
	 * @return the iflowUrl - The URL of the Iflow
	 */
	@Accessor(qualifier = "iflowUrl", type = Accessor.Type.GETTER)
	public String getIflowUrl()
	{
		return getPersistenceContext().getPropertyValue(IFLOWURL);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IflowConfiguration.iflowKey</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the iflowKey - The Key of the Iflow.
	 */
	@Accessor(qualifier = "iflowKey", type = Accessor.Type.SETTER)
	public void setIflowKey(final String value)
	{
		getPersistenceContext().setPropertyValue(IFLOWKEY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>IflowConfiguration.iflowUrl</code> attribute defined at extension <code>scpiconnector</code>. 
	 *  
	 * @param value the iflowUrl - The URL of the Iflow
	 */
	@Accessor(qualifier = "iflowUrl", type = Accessor.Type.SETTER)
	public void setIflowUrl(final String value)
	{
		getPersistenceContext().setPropertyValue(IFLOWURL, value);
	}
	
}
