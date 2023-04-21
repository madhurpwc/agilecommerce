/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.saprevenuecloudproduct.model;

import com.sap.hybris.saprevenuecloudproduct.model.SAPRevenueCloudConfigurationModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPMarketToCatalogMapping first defined at extension saprevenuecloudproduct.
 */
@SuppressWarnings("all")
@Deprecated(since = "1905.09", forRemoval = true)
public class SAPMarketToCatalogMappingModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPMarketToCatalogMapping";
	
	/**<i>Generated relation code constant for relation <code>SAPRevenueCloudConfiguration2SAPMarketToCatalogMapping</code> defining source attribute <code>revenueCloudConfig</code> in extension <code>saprevenuecloudproduct</code>.</i>*/
	public static final String _SAPREVENUECLOUDCONFIGURATION2SAPMARKETTOCATALOGMAPPING = "SAPRevenueCloudConfiguration2SAPMarketToCatalogMapping";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPMarketToCatalogMapping.marketId</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String MARKETID = "marketId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPMarketToCatalogMapping.catalog</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String CATALOG = "catalog";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPMarketToCatalogMapping.revenueCloudConfig</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String REVENUECLOUDCONFIG = "revenueCloudConfig";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPMarketToCatalogMappingModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPMarketToCatalogMappingModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalog initial attribute declared by type <code>SAPMarketToCatalogMapping</code> at extension <code>saprevenuecloudproduct</code>
	 * @param _marketId initial attribute declared by type <code>SAPMarketToCatalogMapping</code> at extension <code>saprevenuecloudproduct</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPMarketToCatalogMappingModel(final CatalogModel _catalog, final String _marketId)
	{
		super();
		setCatalog(_catalog);
		setMarketId(_marketId);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalog initial attribute declared by type <code>SAPMarketToCatalogMapping</code> at extension <code>saprevenuecloudproduct</code>
	 * @param _marketId initial attribute declared by type <code>SAPMarketToCatalogMapping</code> at extension <code>saprevenuecloudproduct</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPMarketToCatalogMappingModel(final CatalogModel _catalog, final String _marketId, final ItemModel _owner)
	{
		super();
		setCatalog(_catalog);
		setMarketId(_marketId);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPMarketToCatalogMapping.catalog</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the catalog - Catalog in SAP Hybris commerce
	 */
	@Accessor(qualifier = "catalog", type = Accessor.Type.GETTER)
	public CatalogModel getCatalog()
	{
		return getPersistenceContext().getPropertyValue(CATALOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPMarketToCatalogMapping.marketId</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the marketId - Market Id maintained at Revenue Cloud
	 */
	@Accessor(qualifier = "marketId", type = Accessor.Type.GETTER)
	public String getMarketId()
	{
		return getPersistenceContext().getPropertyValue(MARKETID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPMarketToCatalogMapping.revenueCloudConfig</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the revenueCloudConfig
	 */
	@Accessor(qualifier = "revenueCloudConfig", type = Accessor.Type.GETTER)
	public SAPRevenueCloudConfigurationModel getRevenueCloudConfig()
	{
		return getPersistenceContext().getPropertyValue(REVENUECLOUDCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPMarketToCatalogMapping.catalog</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the catalog - Catalog in SAP Hybris commerce
	 */
	@Accessor(qualifier = "catalog", type = Accessor.Type.SETTER)
	public void setCatalog(final CatalogModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPMarketToCatalogMapping.marketId</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the marketId - Market Id maintained at Revenue Cloud
	 */
	@Accessor(qualifier = "marketId", type = Accessor.Type.SETTER)
	public void setMarketId(final String value)
	{
		getPersistenceContext().setPropertyValue(MARKETID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPMarketToCatalogMapping.revenueCloudConfig</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the revenueCloudConfig
	 */
	@Accessor(qualifier = "revenueCloudConfig", type = Accessor.Type.SETTER)
	public void setRevenueCloudConfig(final SAPRevenueCloudConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(REVENUECLOUDCONFIG, value);
	}
	
}
