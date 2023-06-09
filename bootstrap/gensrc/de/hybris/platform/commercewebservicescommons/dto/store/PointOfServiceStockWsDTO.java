/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.store;

import de.hybris.platform.commercewebservicescommons.dto.product.StockWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.store.PointOfServiceWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.Objects;
/**
 * Representation of a Point Of Service Stock
 */
@ApiModel(value="PointOfServiceStock", description="Representation of a Point Of Service Stock")
public  class PointOfServiceStockWsDTO extends PointOfServiceWsDTO 

{



	/** Stock information about point of service<br/><br/><i>Generated property</i> for <code>PointOfServiceStockWsDTO.stockInfo</code> property defined at extension <code>commercewebservicescommons</code>. */
@ApiModelProperty(name="stockInfo", value="Stock information about point of service") 	
	private StockWsDTO stockInfo;
	
	public PointOfServiceStockWsDTO()
	{
		// default constructor
	}
	
	public void setStockInfo(final StockWsDTO stockInfo)
	{
		this.stockInfo = stockInfo;
	}

	public StockWsDTO getStockInfo() 
	{
		return stockInfo;
	}
	

}