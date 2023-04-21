/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.user.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.user.data.RegionData;
import java.util.List;


import java.util.Objects;
public  class RegionDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RegionDataList.regions</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<RegionData> regions;
	
	public RegionDataList()
	{
		// default constructor
	}
	
	public void setRegions(final List<RegionData> regions)
	{
		this.regions = regions;
	}

	public List<RegionData> getRegions() 
	{
		return regions;
	}
	

}