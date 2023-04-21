/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class Charge  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Charge.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String metricId;

	/** <i>Generated property</i> for <code>Charge.ratingPeriod</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RatingPeriod ratingPeriod;

	/** <i>Generated property</i> for <code>Charge.consumedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity consumedQuantity;

	/** <i>Generated property</i> for <code>Charge.chargedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity chargedQuantity;

	/** <i>Generated property</i> for <code>Charge.includedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity includedQuantity;

	/** <i>Generated property</i> for <code>Charge.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netAmount;

	/** <i>Generated property</i> for <code>Charge.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossAmount;

	/** Indicator that determines whether this credit reverses a previous credit<br/><br/><i>Generated property</i> for <code>Charge.reversal</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean reversal;

	/** <i>Generated property</i> for <code>Charge.customAmounts</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CustomAmount> customAmounts;

	/** <i>Generated property</i> for <code>Charge.subCharges</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<SubCharge> subCharges;
	
	public Charge()
	{
		// default constructor
	}
	
	public void setMetricId(final String metricId)
	{
		this.metricId = metricId;
	}

	public String getMetricId() 
	{
		return metricId;
	}
	
	public void setRatingPeriod(final RatingPeriod ratingPeriod)
	{
		this.ratingPeriod = ratingPeriod;
	}

	public RatingPeriod getRatingPeriod() 
	{
		return ratingPeriod;
	}
	
	public void setConsumedQuantity(final Quantity consumedQuantity)
	{
		this.consumedQuantity = consumedQuantity;
	}

	public Quantity getConsumedQuantity() 
	{
		return consumedQuantity;
	}
	
	public void setChargedQuantity(final Quantity chargedQuantity)
	{
		this.chargedQuantity = chargedQuantity;
	}

	public Quantity getChargedQuantity() 
	{
		return chargedQuantity;
	}
	
	public void setIncludedQuantity(final Quantity includedQuantity)
	{
		this.includedQuantity = includedQuantity;
	}

	public Quantity getIncludedQuantity() 
	{
		return includedQuantity;
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
	
	public void setReversal(final Boolean reversal)
	{
		this.reversal = reversal;
	}

	public Boolean getReversal() 
	{
		return reversal;
	}
	
	public void setCustomAmounts(final List<CustomAmount> customAmounts)
	{
		this.customAmounts = customAmounts;
	}

	public List<CustomAmount> getCustomAmounts() 
	{
		return customAmounts;
	}
	
	public void setSubCharges(final List<SubCharge> subCharges)
	{
		this.subCharges = subCharges;
	}

	public List<SubCharge> getSubCharges() 
	{
		return subCharges;
	}
	

}