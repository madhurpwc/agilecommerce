/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.configuration.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type SAPAdministration first defined at extension sapcoreconfiguration.
 */
@SuppressWarnings("all")
public class SAPAdministrationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPAdministration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String CORE_LASTDATAHUBINITIALLOAD = "core_lastDataHubInitialLoad";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPAdministrationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPAdministrationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPAdministrationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the core_lastDataHubInitialLoad - Last Data Hub Initial Load
	 */
	@Accessor(qualifier = "core_lastDataHubInitialLoad", type = Accessor.Type.GETTER)
	public Date getCore_lastDataHubInitialLoad()
	{
		return getPersistenceContext().getPropertyValue(CORE_LASTDATAHUBINITIALLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPAdministration.core_lastDataHubInitialLoad</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the core_lastDataHubInitialLoad - Last Data Hub Initial Load
	 */
	@Accessor(qualifier = "core_lastDataHubInitialLoad", type = Accessor.Type.SETTER)
	public void setCore_lastDataHubInitialLoad(final Date value)
	{
		getPersistenceContext().setPropertyValue(CORE_LASTDATAHUBINITIALLOAD, value);
	}
	
}
