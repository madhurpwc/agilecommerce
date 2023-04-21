/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapmodel.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.ordersplitting.model.WarehouseModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.sap.sapmodel.model.SAPLogicalSystemModel;
import de.hybris.platform.sap.sapmodel.model.SAPSalesOrganizationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SAPPlantLogSysOrg first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPPlantLogSysOrgModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPPlantLogSysOrg";
	
	/**<i>Generated relation code constant for relation <code>SAPConfig2PlantLogSysOrg</code> defining source attribute <code>sapConfiguration</code> in extension <code>sapmodel</code>.</i>*/
	public static final String _SAPCONFIG2PLANTLOGSYSORG = "SAPConfig2PlantLogSysOrg";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPlantLogSysOrg.plant</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String PLANT = "plant";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPlantLogSysOrg.logSys</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String LOGSYS = "logSys";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPlantLogSysOrg.salesOrg</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SALESORG = "salesOrg";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCONFIGURATION = "sapConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPPlantLogSysOrg.warehouses</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String WAREHOUSES = "warehouses";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPPlantLogSysOrgModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPPlantLogSysOrgModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _plant initial attribute declared by type <code>SAPPlantLogSysOrg</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPPlantLogSysOrgModel(final WarehouseModel _plant)
	{
		super();
		setPlant(_plant);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _plant initial attribute declared by type <code>SAPPlantLogSysOrg</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPPlantLogSysOrgModel(final ItemModel _owner, final WarehouseModel _plant)
	{
		super();
		setOwner(_owner);
		setPlant(_plant);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.logSys</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the logSys - SAP Logical System
	 */
	@Accessor(qualifier = "logSys", type = Accessor.Type.GETTER)
	public SAPLogicalSystemModel getLogSys()
	{
		return getPersistenceContext().getPropertyValue(LOGSYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.plant</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the plant - Warehouse
	 */
	@Accessor(qualifier = "plant", type = Accessor.Type.GETTER)
	public WarehouseModel getPlant()
	{
		return getPersistenceContext().getPropertyValue(PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.salesOrg</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the salesOrg - SAP Sales Organization
	 */
	@Accessor(qualifier = "salesOrg", type = Accessor.Type.GETTER)
	public SAPSalesOrganizationModel getSalesOrg()
	{
		return getPersistenceContext().getPropertyValue(SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.GETTER)
	public SAPConfigurationModel getSapConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPPlantLogSysOrg.warehouses</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the warehouses
	 */
	@Accessor(qualifier = "warehouses", type = Accessor.Type.GETTER)
	public Collection<WarehouseModel> getWarehouses()
	{
		return getPersistenceContext().getPropertyValue(WAREHOUSES);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPlantLogSysOrg.logSys</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the logSys - SAP Logical System
	 */
	@Accessor(qualifier = "logSys", type = Accessor.Type.SETTER)
	public void setLogSys(final SAPLogicalSystemModel value)
	{
		getPersistenceContext().setPropertyValue(LOGSYS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPlantLogSysOrg.plant</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the plant - Warehouse
	 */
	@Accessor(qualifier = "plant", type = Accessor.Type.SETTER)
	public void setPlant(final WarehouseModel value)
	{
		getPersistenceContext().setPropertyValue(PLANT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPlantLogSysOrg.salesOrg</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the salesOrg - SAP Sales Organization
	 */
	@Accessor(qualifier = "salesOrg", type = Accessor.Type.SETTER)
	public void setSalesOrg(final SAPSalesOrganizationModel value)
	{
		getPersistenceContext().setPropertyValue(SALESORG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPlantLogSysOrg.sapConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.SETTER)
	public void setSapConfiguration(final SAPConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPPlantLogSysOrg.warehouses</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the warehouses
	 */
	@Accessor(qualifier = "warehouses", type = Accessor.Type.SETTER)
	public void setWarehouses(final Collection<WarehouseModel> value)
	{
		getPersistenceContext().setPropertyValue(WAREHOUSES, value);
	}
	
}
