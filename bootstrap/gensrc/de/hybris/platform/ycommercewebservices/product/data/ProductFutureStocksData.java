/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.product.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.product.data.FutureStockData;
import java.util.List;


import java.util.Objects;
public  class ProductFutureStocksData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductFutureStocksData.productCode</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>ProductFutureStocksData.futureStocks</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<FutureStockData> futureStocks;
	
	public ProductFutureStocksData()
	{
		// default constructor
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
	}
	
	public void setFutureStocks(final List<FutureStockData> futureStocks)
	{
		this.futureStocks = futureStocks;
	}

	public List<FutureStockData> getFutureStocks() 
	{
		return futureStocks;
	}
	

}