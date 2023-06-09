/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:06 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.product.data;

import  de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.catalog.enums.ProductReferenceTypeEnum;
import de.hybris.platform.commerceservices.product.data.ReferenceData;


import java.util.Objects;
public  class ProductReferenceData extends ReferenceData<ProductReferenceTypeEnum,ProductData> 

{



	/** <i>Generated property</i> for <code>ProductReferenceData.preselected</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean preselected;
	
	public ProductReferenceData()
	{
		// default constructor
	}
	
	public void setPreselected(final Boolean preselected)
	{
		this.preselected = preselected;
	}

	public Boolean getPreselected() 
	{
		return preselected;
	}
	

}