/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.core.configuration.model.SAPRFCDestinationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type RFCDestinationAttribute first defined at extension sapcore.
 */
@SuppressWarnings("all")
public class RFCDestinationAttributeModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "RFCDestinationAttribute";
	
	/**<i>Generated relation code constant for relation <code>JCoAttrForJCODestination</code> defining source attribute <code>SAPRFCDestination</code> in extension <code>sapcoreconfiguration</code>.</i>*/
	public static final String _JCOATTRFORJCODESTINATION = "JCoAttrForJCODestination";
	
	/** <i>Generated constant</i> - Attribute key of <code>RFCDestinationAttribute.jcoattr_name</code> attribute defined at extension <code>sapcore</code>. */
	public static final String JCOATTR_NAME = "jcoattr_name";
	
	/** <i>Generated constant</i> - Attribute key of <code>RFCDestinationAttribute.jcoattr_value</code> attribute defined at extension <code>sapcore</code>. */
	public static final String JCOATTR_VALUE = "jcoattr_value";
	
	/** <i>Generated constant</i> - Attribute key of <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SAPRFCDESTINATION = "SAPRFCDestination";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public RFCDestinationAttributeModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public RFCDestinationAttributeModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public RFCDestinationAttributeModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.jcoattr_name</code> attribute defined at extension <code>sapcore</code>. 
	 * @return the jcoattr_name - Name
	 */
	@Accessor(qualifier = "jcoattr_name", type = Accessor.Type.GETTER)
	public String getJcoattr_name()
	{
		return getPersistenceContext().getPropertyValue(JCOATTR_NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.jcoattr_value</code> attribute defined at extension <code>sapcore</code>. 
	 * @return the jcoattr_value - Value
	 */
	@Accessor(qualifier = "jcoattr_value", type = Accessor.Type.GETTER)
	public String getJcoattr_value()
	{
		return getPersistenceContext().getPropertyValue(JCOATTR_VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the SAPRFCDestination
	 */
	@Accessor(qualifier = "SAPRFCDestination", type = Accessor.Type.GETTER)
	public SAPRFCDestinationModel getSAPRFCDestination()
	{
		return getPersistenceContext().getPropertyValue(SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RFCDestinationAttribute.jcoattr_name</code> attribute defined at extension <code>sapcore</code>. 
	 *  
	 * @param value the jcoattr_name - Name
	 */
	@Accessor(qualifier = "jcoattr_name", type = Accessor.Type.SETTER)
	public void setJcoattr_name(final String value)
	{
		getPersistenceContext().setPropertyValue(JCOATTR_NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RFCDestinationAttribute.jcoattr_value</code> attribute defined at extension <code>sapcore</code>. 
	 *  
	 * @param value the jcoattr_value - Value
	 */
	@Accessor(qualifier = "jcoattr_value", type = Accessor.Type.SETTER)
	public void setJcoattr_value(final String value)
	{
		getPersistenceContext().setPropertyValue(JCOATTR_VALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>RFCDestinationAttribute.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the SAPRFCDestination
	 */
	@Accessor(qualifier = "SAPRFCDestination", type = Accessor.Type.SETTER)
	public void setSAPRFCDestination(final SAPRFCDestinationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPRFCDESTINATION, value);
	}
	
}
