/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.queues.data;

import java.io.Serializable;
import de.hybris.platform.ycommercewebservices.queues.data.ProductExpressUpdateElementData;
import java.util.List;


import java.util.Objects;
public  class ProductExpressUpdateElementDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductExpressUpdateElementDataList.productExpressUpdateElements</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<ProductExpressUpdateElementData> productExpressUpdateElements;
	
	public ProductExpressUpdateElementDataList()
	{
		// default constructor
	}
	
	public void setProductExpressUpdateElements(final List<ProductExpressUpdateElementData> productExpressUpdateElements)
	{
		this.productExpressUpdateElements = productExpressUpdateElements;
	}

	public List<ProductExpressUpdateElementData> getProductExpressUpdateElements() 
	{
		return productExpressUpdateElements;
	}
	

}