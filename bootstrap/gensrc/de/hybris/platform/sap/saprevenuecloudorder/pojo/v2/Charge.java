/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.ConsumedQuantity;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.CustomAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.NetAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.RatingPeriod;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Charge  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Charge.reversal</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("reversal") 	
	private boolean reversal;

	/** <i>Generated property</i> for <code>Charge.metricId</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("metricId") 	
	private String metricId;

	/** <i>Generated property</i> for <code>Charge.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("netAmount") 	
	private NetAmount netAmount;

	/** <i>Generated property</i> for <code>Charge.ratingPeriod</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("ratingPeriod") 	
	private RatingPeriod ratingPeriod;

	/** <i>Generated property</i> for <code>Charge.customAmounts</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("customAmounts") 	
	private List<CustomAmount> customAmounts;

	/** <i>Generated property</i> for <code>Charge.consumedQuantity</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("consumedQuantity") 	
	private ConsumedQuantity consumedQuantity;
	
	public Charge()
	{
		// default constructor
	}
	
@JsonProperty("reversal") 	public void setReversal(final boolean reversal)
	{
		this.reversal = reversal;
	}

@JsonProperty("reversal") 	public boolean isReversal() 
	{
		return reversal;
	}
	
@JsonProperty("metricId") 	public void setMetricId(final String metricId)
	{
		this.metricId = metricId;
	}

@JsonProperty("metricId") 	public String getMetricId() 
	{
		return metricId;
	}
	
@JsonProperty("netAmount") 	public void setNetAmount(final NetAmount netAmount)
	{
		this.netAmount = netAmount;
	}

@JsonProperty("netAmount") 	public NetAmount getNetAmount() 
	{
		return netAmount;
	}
	
@JsonProperty("ratingPeriod") 	public void setRatingPeriod(final RatingPeriod ratingPeriod)
	{
		this.ratingPeriod = ratingPeriod;
	}

@JsonProperty("ratingPeriod") 	public RatingPeriod getRatingPeriod() 
	{
		return ratingPeriod;
	}
	
@JsonProperty("customAmounts") 	public void setCustomAmounts(final List<CustomAmount> customAmounts)
	{
		this.customAmounts = customAmounts;
	}

@JsonProperty("customAmounts") 	public List<CustomAmount> getCustomAmounts() 
	{
		return customAmounts;
	}
	
@JsonProperty("consumedQuantity") 	public void setConsumedQuantity(final ConsumedQuantity consumedQuantity)
	{
		this.consumedQuantity = consumedQuantity;
	}

@JsonProperty("consumedQuantity") 	public ConsumedQuantity getConsumedQuantity() 
	{
		return consumedQuantity;
	}
	

}