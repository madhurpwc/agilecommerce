/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.product.data;

import java.io.Serializable;
import de.hybris.platform.ycommercewebservices.product.data.ProductFutureStocksData;
import java.util.List;


import java.util.Objects;
public  class ProductFutureStocksDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductFutureStocksDataList.productFutureStocks</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<ProductFutureStocksData> productFutureStocks;
	
	public ProductFutureStocksDataList()
	{
		// default constructor
	}
	
	public void setProductFutureStocks(final List<ProductFutureStocksData> productFutureStocks)
	{
		this.productFutureStocks = productFutureStocks;
	}

	public List<ProductFutureStocksData> getProductFutureStocks() 
	{
		return productFutureStocks;
	}
	

}