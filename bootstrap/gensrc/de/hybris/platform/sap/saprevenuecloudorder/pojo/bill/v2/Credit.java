/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class Credit  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Credit.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String metricId;

	/** <i>Generated property</i> for <code>Credit.ratingPeriod</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RatingPeriod ratingPeriod;

	/** <i>Generated property</i> for <code>Credit.consumedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity consumedQuantity;

	/** <i>Generated property</i> for <code>Credit.creditedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity creditedQuantity;

	/** <i>Generated property</i> for <code>Credit.includedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Quantity includedQuantity;

	/** <i>Generated property</i> for <code>Credit.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netAmount;

	/** <i>Generated property</i> for <code>Credit.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossAmount;

	/** Indicator that determines whether this credit reverses a previous credit<br/><br/><i>Generated property</i> for <code>Credit.reversal</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean reversal;

	/** <i>Generated property</i> for <code>Credit.customAmounts</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CustomAmount> customAmounts;

	/** <i>Generated property</i> for <code>Credit.subCharges</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<SubCharge> subCharges;
	
	public Credit()
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
	
	public void setCreditedQuantity(final Quantity creditedQuantity)
	{
		this.creditedQuantity = creditedQuantity;
	}

	public Quantity getCreditedQuantity() 
	{
		return creditedQuantity;
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