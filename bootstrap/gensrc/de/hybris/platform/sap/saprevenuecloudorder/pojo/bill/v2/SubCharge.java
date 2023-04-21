/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class SubCharge  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubCharge.tier</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Tier tier;

	/** <i>Generated property</i> for <code>SubCharge.consumedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity consumedQuantity;

	/** <i>Generated property</i> for <code>SubCharge.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netAmount;

	/** <i>Generated property</i> for <code>SubCharge.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossAmount;
	
	public SubCharge()
	{
		// default constructor
	}
	
	public void setTier(final Tier tier)
	{
		this.tier = tier;
	}

	public Tier getTier() 
	{
		return tier;
	}
	
	public void setConsumedQuantity(final Quantity consumedQuantity)
	{
		this.consumedQuantity = consumedQuantity;
	}

	public Quantity getConsumedQuantity() 
	{
		return consumedQuantity;
	}
	
	public void setNetAmount(final MonetaryAmount netAmount)
	{
		this.netAmount = netAmount;
	}

	public MonetaryAmount getNetAmount() 
	{
		return netAmount;
	}
	
	public void setGrossAmount(final MonetaryAmount grossAmount)
	{
		this.grossAmount = grossAmount;
	}

	public MonetaryAmount getGrossAmount() 
	{
		return grossAmount;
	}
	

}