/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplan.v2.PricingParameter;
import java.util.List;


import java.util.Objects;
public  class RatePlanViewBatchRequestBody  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatePlanViewBatchRequestBody.pricingParameters</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<PricingParameter> pricingParameters;
	
	public RatePlanViewBatchRequestBody()
	{
		// default constructor
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