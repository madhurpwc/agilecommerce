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
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPInboundVariant first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPInboundVariantModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPInboundVariant";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPInboundVariant.code</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPInboundVariant.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPInboundVariant.baseProduct</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String BASEPRODUCT = "baseProduct";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPInboundVariantModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPInboundVariantModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SAPInboundVariant</code> at extension <code>sapmodel</code>
	 * @param _code initial attribute declared by type <code>SAPInboundVariant</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPInboundVariantModel(final CatalogVersionModel _catalogVersion, final String _code)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>SAPInboundVariant</code> at extension <code>sapmodel</code>
	 * @param _code initial attribute declared by type <code>SAPInboundVariant</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPInboundVariantModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPInboundVariant.baseProduct</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the baseProduct - Base Product
	 */
	@Accessor(qualifier = "baseProduct", type = Accessor.Type.GETTER)
	public ProductModel getBaseProduct()
	{
		return getPersistenceContext().getPropertyValue(BASEPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPInboundVariant.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the catalogVersion - Catalog Version
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPInboundVariant.code</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the code - Product Code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPInboundVariant.baseProduct</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the baseProduct - Base Product
	 */
	@Accessor(qualifier = "baseProduct", type = Accessor.Type.SETTER)
	public void setBaseProduct(final ProductModel value)
	{
		getPersistenceContext().setPropertyValue(BASEPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPInboundVariant.catalogVersion</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the catalogVersion - Catalog Version
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.SETTER)
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPInboundVariant.code</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the code - Product Code
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
}
