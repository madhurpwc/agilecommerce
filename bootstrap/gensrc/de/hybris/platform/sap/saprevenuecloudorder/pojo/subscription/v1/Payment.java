/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Payment  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** Possible values are [ Payment Card, Invoice, External Card ]<br/><br/><i>Generated property</i> for <code>Payment.paymentMethod</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String paymentMethod;

	/** <i>Generated property</i> for <code>Payment.paymentCardToken</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String paymentCardToken;
	
	public Payment()
	{
		// default constructor
	}
	
	public void setPaymentMethod(final String paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethod() 
	{
		return paymentMethod;
	}
	
	public void setPaymentCardToken(final String paymentCardToken)
	{
		this.paymentCardToken = paymentCardToken;
	}

	public String getPaymentCardToken() 
	{
		return paymentCardToken;
	}
	

}