/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;


import java.util.Objects;
public  class PaymentData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaymentData.paymentMethod</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String paymentMethod;

	/** <i>Generated property</i> for <code>PaymentData.paymentCardToken</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String paymentCardToken;
	
	public PaymentData()
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