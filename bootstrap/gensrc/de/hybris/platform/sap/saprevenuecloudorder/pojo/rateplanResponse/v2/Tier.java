/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.FixedPrice;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.PricePerBlock;


import java.util.Objects;
public  class Tier  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Tier.bound</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String bound;

	/** <i>Generated property</i> for <code>Tier.pricePerBlock</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PricePerBlock pricePerBlock;

	/** <i>Generated property</i> for <code>Tier.fixedPrice</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private FixedPrice fixedPrice;
	
	public Tier()
	{
		// default constructor
	}
	
	public void setBound(final String bound)
	{
		this.bound = bound;
	}

	public String getBound() 
	{
		return bound;
	}
	
	public void setPricePerBlock(final PricePerBlock pricePerBlock)
	{
		this.pricePerBlock = pricePerBlock;
	}

	public PricePerBlock getPricePerBlock() 
	{
		return pricePerBlock;
	}
	
	public void setFixedPrice(final FixedPrice fixedPrice)
	{
		this.fixedPrice = fixedPrice;
	}

	public FixedPrice getFixedPrice() 
	{
		return fixedPrice;
	}
	

}