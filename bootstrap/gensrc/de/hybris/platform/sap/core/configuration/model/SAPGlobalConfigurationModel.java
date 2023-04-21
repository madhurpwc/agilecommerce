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
import de.hybris.platform.sap.core.configuration.model.SAPHTTPDestinationModel;
import de.hybris.platform.sap.sapmodel.model.SAPLogicalSystemModel;
import de.hybris.platform.sap.sapmodel.model.SAPPricingSalesAreaToCatalogModel;
import de.hybris.platform.sap.sapmodel.model.SAPProductSalesAreaToCatalogMappingModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type SAPGlobalConfiguration first defined at extension sapcoreconfiguration.
 */
@SuppressWarnings("all")
public class SAPGlobalConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPGlobalConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String CORE_NAME = "core_name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String REPLICATEREGISTEREDUSER = "replicateregistereduser";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_ERPLOGICALSYSTEM = "sapcommon_erpLogicalSystem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_ERPHTTPDESTINATION = "sapcommon_erpHttpDestination";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPPRODUCTSALESAREATOCATALOGMAPPING = "sapProductSalesAreaToCatalogMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_SAPPRICINGSALESAREA = "sapcommon_sapPricingSalesArea";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPLOGICALSYSTEMGLOBALCONFIG = "sapLogicalSystemGlobalConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPGlobalConfiguration.cpqQuoteEmailEnabled</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQQUOTEEMAILENABLED = "cpqQuoteEmailEnabled";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPGlobalConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPGlobalConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _replicateregistereduser initial attribute declared by type <code>SAPGlobalConfiguration</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPGlobalConfigurationModel(final boolean _replicateregistereduser)
	{
		super();
		setReplicateregistereduser(_replicateregistereduser);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _replicateregistereduser initial attribute declared by type <code>SAPGlobalConfiguration</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPGlobalConfigurationModel(final ItemModel _owner, final boolean _replicateregistereduser)
	{
		super();
		setOwner(_owner);
		setReplicateregistereduser(_replicateregistereduser);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the core_name - Name
	 */
	@Accessor(qualifier = "core_name", type = Accessor.Type.GETTER)
	public String getCore_name()
	{
		return getPersistenceContext().getPropertyValue(CORE_NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.cpqQuoteEmailEnabled</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqQuoteEmailEnabled - Indicates if Email Feature is enabled
	 */
	@Accessor(qualifier = "cpqQuoteEmailEnabled", type = Accessor.Type.GETTER)
	public Boolean getCpqQuoteEmailEnabled()
	{
		return getPersistenceContext().getPropertyValue(CPQQUOTEEMAILENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_erpHttpDestination
	 */
	@Accessor(qualifier = "sapcommon_erpHttpDestination", type = Accessor.Type.GETTER)
	public SAPHTTPDestinationModel getSapcommon_erpHttpDestination()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_ERPHTTPDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_erpLogicalSystem
	 */
	@Accessor(qualifier = "sapcommon_erpLogicalSystem", type = Accessor.Type.GETTER)
	public String getSapcommon_erpLogicalSystem()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_ERPLOGICALSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapcommon_sapPricingSalesArea
	 */
	@Accessor(qualifier = "sapcommon_sapPricingSalesArea", type = Accessor.Type.GETTER)
	public Set<SAPPricingSalesAreaToCatalogModel> getSapcommon_sapPricingSalesArea()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_SAPPRICINGSALESAREA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapLogicalSystemGlobalConfig
	 */
	@Accessor(qualifier = "sapLogicalSystemGlobalConfig", type = Accessor.Type.GETTER)
	public Set<SAPLogicalSystemModel> getSapLogicalSystemGlobalConfig()
	{
		return getPersistenceContext().getPropertyValue(SAPLOGICALSYSTEMGLOBALCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapProductSalesAreaToCatalogMapping
	 */
	@Accessor(qualifier = "sapProductSalesAreaToCatalogMapping", type = Accessor.Type.GETTER)
	public Set<SAPProductSalesAreaToCatalogMappingModel> getSapProductSalesAreaToCatalogMapping()
	{
		return getPersistenceContext().getPropertyValue(SAPPRODUCTSALESAREATOCATALOGMAPPING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the replicateregistereduser - Replicate Registered User
	 */
	@Accessor(qualifier = "replicateregistereduser", type = Accessor.Type.GETTER)
	public boolean isReplicateregistereduser()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(REPLICATEREGISTEREDUSER));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the core_name - Name
	 */
	@Accessor(qualifier = "core_name", type = Accessor.Type.SETTER)
	public void setCore_name(final String value)
	{
		getPersistenceContext().setPropertyValue(CORE_NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.cpqQuoteEmailEnabled</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqQuoteEmailEnabled - Indicates if Email Feature is enabled
	 */
	@Accessor(qualifier = "cpqQuoteEmailEnabled", type = Accessor.Type.SETTER)
	public void setCpqQuoteEmailEnabled(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(CPQQUOTEEMAILENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.replicateregistereduser</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the replicateregistereduser - Replicate Registered User
	 */
	@Accessor(qualifier = "replicateregistereduser", type = Accessor.Type.SETTER)
	public void setReplicateregistereduser(final boolean value)
	{
		getPersistenceContext().setPropertyValue(REPLICATEREGISTEREDUSER, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.sapcommon_erpHttpDestination</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_erpHttpDestination
	 */
	@Accessor(qualifier = "sapcommon_erpHttpDestination", type = Accessor.Type.SETTER)
	public void setSapcommon_erpHttpDestination(final SAPHTTPDestinationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_ERPHTTPDESTINATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.sapcommon_erpLogicalSystem</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_erpLogicalSystem
	 */
	@Accessor(qualifier = "sapcommon_erpLogicalSystem", type = Accessor.Type.SETTER)
	public void setSapcommon_erpLogicalSystem(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_ERPLOGICALSYSTEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.sapcommon_sapPricingSalesArea</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_sapPricingSalesArea
	 */
	@Accessor(qualifier = "sapcommon_sapPricingSalesArea", type = Accessor.Type.SETTER)
	public void setSapcommon_sapPricingSalesArea(final Set<SAPPricingSalesAreaToCatalogModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_SAPPRICINGSALESAREA, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.sapLogicalSystemGlobalConfig</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapLogicalSystemGlobalConfig
	 */
	@Accessor(qualifier = "sapLogicalSystemGlobalConfig", type = Accessor.Type.SETTER)
	public void setSapLogicalSystemGlobalConfig(final Set<SAPLogicalSystemModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPLOGICALSYSTEMGLOBALCONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPGlobalConfiguration.sapProductSalesAreaToCatalogMapping</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapProductSalesAreaToCatalogMapping
	 */
	@Accessor(qualifier = "sapProductSalesAreaToCatalogMapping", type = Accessor.Type.SETTER)
	public void setSapProductSalesAreaToCatalogMapping(final Set<SAPProductSalesAreaToCatalogMappingModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPPRODUCTSALESAREATOCATALOGMAPPING, value);
	}
	
}
