/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import de.hybris.platform.commercefacades.product.data.PriceData;


import java.util.Objects;
public  class UsageChargeEntryData extends ChargeEntryData 

{



	/** <i>Generated property</i> for <code>UsageChargeEntryData.fixedPrice</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PriceData fixedPrice;
	
	public UsageChargeEntryData()
	{
		// default constructor
	}
	
	public void setFixedPrice(final PriceData fixedPrice)
	{
		this.fixedPrice = fixedPrice;
	}

	public PriceData getFixedPrice() 
	{
		return fixedPrice;
	}
	

}