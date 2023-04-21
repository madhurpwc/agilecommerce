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
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPExternalId first defined at extension sapmodel.
 * <p>
 * Type for storing external UUIDs.
 */
@SuppressWarnings("all")
public class SAPExternalIdModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPExternalId";
	
	/**<i>Generated relation code constant for relation <code>Product2SAPExternalIds</code> defining source attribute <code>item</code> in extension <code>sapmodel</code>.</i>*/
	public static final String _PRODUCT2SAPEXTERNALIDS = "Product2SAPExternalIds";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPExternalId.application</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String APPLICATION = "application";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPExternalId.externalId</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String EXTERNALID = "externalId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPExternalId.tenantId</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String TENANTID = "tenantId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPExternalId.versionId</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String VERSIONID = "versionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPExternalId.item</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ITEM = "item";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPExternalIdModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPExternalIdModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _application initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 * @param _externalId initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 * @param _tenantId initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPExternalIdModel(final String _application, final String _externalId, final String _tenantId)
	{
		super();
		setApplication(_application);
		setExternalId(_externalId);
		setTenantId(_tenantId);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _application initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 * @param _externalId initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 * @param _item initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _tenantId initial attribute declared by type <code>SAPExternalId</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPExternalIdModel(final String _application, final String _externalId, final ProductModel _item, final ItemModel _owner, final String _tenantId)
	{
		super();
		setApplication(_application);
		setExternalId(_externalId);
		setItem(_item);
		setOwner(_owner);
		setTenantId(_tenantId);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPExternalId.application</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the application - Application Identifier like S4, MDI
	 */
	@Accessor(qualifier = "application", type = Accessor.Type.GETTER)
	public String getApplication()
	{
		return getPersistenceContext().getPropertyValue(APPLICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPExternalId.externalId</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the externalId - Unique item identifier value in the external system
	 */
	@Accessor(qualifier = "externalId", type = Accessor.Type.GETTER)
	public String getExternalId()
	{
		return getPersistenceContext().getPropertyValue(EXTERNALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPExternalId.item</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the item - Product entry
	 */
	@Accessor(qualifier = "item", type = Accessor.Type.GETTER)
	public ProductModel getItem()
	{
		return getPersistenceContext().getPropertyValue(ITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPExternalId.tenantId</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the tenantId - Specific instance id of the external system
	 */
	@Accessor(qualifier = "tenantId", type = Accessor.Type.GETTER)
	public String getTenantId()
	{
		return getPersistenceContext().getPropertyValue(TENANTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPExternalId.versionId</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the versionId - Version id of the item used for replication
	 */
	@Accessor(qualifier = "versionId", type = Accessor.Type.GETTER)
	public String getVersionId()
	{
		return getPersistenceContext().getPropertyValue(VERSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPExternalId.application</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the application - Application Identifier like S4, MDI
	 */
	@Accessor(qualifier = "application", type = Accessor.Type.SETTER)
	public void setApplication(final String value)
	{
		getPersistenceContext().setPropertyValue(APPLICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPExternalId.externalId</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the externalId - Unique item identifier value in the external system
	 */
	@Accessor(qualifier = "externalId", type = Accessor.Type.SETTER)
	public void setExternalId(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALID, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPExternalId.item</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the item - Product entry
	 */
	@Accessor(qualifier = "item", type = Accessor.Type.SETTER)
	public void setItem(final ProductModel value)
	{
		getPersistenceContext().setPropertyValue(ITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPExternalId.tenantId</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the tenantId - Specific instance id of the external system
	 */
	@Accessor(qualifier = "tenantId", type = Accessor.Type.SETTER)
	public void setTenantId(final String value)
	{
		getPersistenceContext().setPropertyValue(TENANTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPExternalId.versionId</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the versionId - Version id of the item used for replication
	 */
	@Accessor(qualifier = "versionId", type = Accessor.Type.SETTER)
	public void setVersionId(final String value)
	{
		getPersistenceContext().setPropertyValue(VERSIONID, value);
	}
	
}
