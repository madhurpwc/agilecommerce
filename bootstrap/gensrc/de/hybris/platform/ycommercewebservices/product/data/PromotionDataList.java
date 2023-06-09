/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:07 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.PromotionData;
import java.util.List;


import java.util.Objects;
public  class PromotionDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PromotionDataList.promotions</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<PromotionData> promotions;
	
	public PromotionDataList()
	{
		// default constructor
	}
	
	public void setPromotions(final List<PromotionData> promotions)
	{
		this.promotions = promotions;
	}

	public List<PromotionData> getPromotions() 
	{
		return promotions;
	}
	

}