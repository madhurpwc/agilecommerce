/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;
import de.hybris.platform.subscriptionfacades.data.PricingParameterData;
import java.util.List;


import java.util.Objects;
public  class PricingData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PricingData.pricingDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String pricingDate;

	/** <i>Generated property</i> for <code>PricingData.pricingParameters</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<PricingParameterData> pricingParameters;
	
	public PricingData()
	{
		// default constructor
	}
	
	public void setPricingDate(final String pricingDate)
	{
		this.pricingDate = pricingDate;
	}

	public String getPricingDate() 
	{
		return pricingDate;
	}
	
	public void setPricingParameters(final List<PricingParameterData> pricingParameters)
	{
		this.pricingParameters = pricingParameters;
	}

	public List<PricingParameterData> getPricingParameters() 
	{
		return pricingParameters;
	}
	

}