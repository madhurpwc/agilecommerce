/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.catalog.data;

import de.hybris.platform.commercefacades.catalog.data.AbstractCatalogItemData;
import de.hybris.platform.commercefacades.catalog.data.CatalogVersionData;
import java.util.Collection;


import java.util.Objects;
public  class CatalogData extends AbstractCatalogItemData 

{



	/** <i>Generated property</i> for <code>CatalogData.catalogVersions</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<CatalogVersionData> catalogVersions;
	
	public CatalogData()
	{
		// default constructor
	}
	
	public void setCatalogVersions(final Collection<CatalogVersionData> catalogVersions)
	{
		this.catalogVersions = catalogVersions;
	}

	public Collection<CatalogVersionData> getCatalogVersions() 
	{
		return catalogVersions;
	}
	

}