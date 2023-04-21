/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Pricing  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Pricing.pricingDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date pricingDate;

	/** <i>Generated property</i> for <code>Pricing.pricingParameters</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<PricingParameter> pricingParameters;
	
	public Pricing()
	{
		// default constructor
	}
	
	public void setPricingDate(final Date pricingDate)
	{
		this.pricingDate = pricingDate;
	}

	public Date getPricingDate() 
	{
		return pricingDate;
	}
	
	public void setPricingParameters(final List<PricingParameter> pricingParameters)
	{
		this.pricingParameters = pricingParameters;
	}

	public List<PricingParameter> getPricingParameters() 
	{
		return pricingParameters;
	}
	

}