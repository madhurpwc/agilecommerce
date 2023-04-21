/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2bunitselectoraddon.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.contents.components.SimpleCMSComponentModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Locale;

/**
 * Generated model class for type B2BUnitSelectorComponent first defined at extension b2bunitselectoraddon.
 */
@SuppressWarnings("all")
public class B2BUnitSelectorComponentModel extends SimpleCMSComponentModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "B2BUnitSelectorComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>B2BUnitSelectorComponent.title</code> attribute defined at extension <code>b2bunitselectoraddon</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>B2BUnitSelectorComponent.selectorMessage</code> attribute defined at extension <code>b2bunitselectoraddon</code>. */
	public static final String SELECTORMESSAGE = "selectorMessage";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public B2BUnitSelectorComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public B2BUnitSelectorComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public B2BUnitSelectorComponentModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public B2BUnitSelectorComponentModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnitSelectorComponent.selectorMessage</code> attribute defined at extension <code>b2bunitselectoraddon</code>. 
	 * @return the selectorMessage - "Selector Message"
	 */
	@Accessor(qualifier = "selectorMessage", type = Accessor.Type.GETTER)
	public String getSelectorMessage()
	{
		return getSelectorMessage(null);
	}
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnitSelectorComponent.selectorMessage</code> attribute defined at extension <code>b2bunitselectoraddon</code>. 
	 * @param loc the value localization key 
	 * @return the selectorMessage - "Selector Message"
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "selectorMessage", type = Accessor.Type.GETTER)
	public String getSelectorMessage(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(SELECTORMESSAGE, loc);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUnitSelectorComponent.title</code> attribute defined at extension <code>b2bunitselectoraddon</code>. 
	 * @return the title - Title
	 */
	@Accessor(qualifier = "title", type = Accessor.Type.GETTER)
	public String getTitle()
	{
		return getPersistenceContext().getPropertyValue(TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>B2BUnitSelectorComponent.selectorMessage</code> attribute defined at extension <code>b2bunitselectoraddon</code>. 
	 *  
	 * @param value the selectorMessage - "Selector Message"
	 */
	@Accessor(qualifier = "selectorMessage", type = Accessor.Type.SETTER)
	public void setSelectorMessage(final String value)
	{
		setSelectorMessage(value,null);
	}
	/**
	 * <i>Generated method</i> - Setter of <code>B2BUnitSelectorComponent.selectorMessage</code> attribute defined at extension <code>b2bunitselectoraddon</code>. 
	 *  
	 * @param value the selectorMessage - "Selector Message"
	 * @param loc the value localization key 
	 * @throws IllegalArgumentException if localization key cannot be mapped to data language
	 */
	@Accessor(qualifier = "selectorMessage", type = Accessor.Type.SETTER)
	public void setSelectorMessage(final String value, final Locale loc)
	{
		getPersistenceContext().setLocalizedValue(SELECTORMESSAGE, loc, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>B2BUnitSelectorComponent.title</code> attribute defined at extension <code>b2bunitselectoraddon</code>. 
	 *  
	 * @param value the title - Title
	 */
	@Accessor(qualifier = "title", type = Accessor.Type.SETTER)
	public void setTitle(final String value)
	{
		getPersistenceContext().setPropertyValue(TITLE, value);
	}
	
}
