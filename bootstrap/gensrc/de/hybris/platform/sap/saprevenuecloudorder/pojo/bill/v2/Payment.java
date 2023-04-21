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


import java.util.Objects;
public  class Payment  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** The payment method. Valid values are [ Invoice, Payment Card, External Card ]<br/><br/><i>Generated property</i> for <code>Payment.method</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String method;

	/** <i>Generated property</i> for <code>Payment.token</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String token;

	/** The payment method. Valid values are [ UNKNOWN, NOT_SETTLED, SUCCESS, FAILED, ERROR ]
            <br/><br/><i>Generated property</i> for <code>Payment.paymentStatus</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String paymentStatus;

	/** <i>Generated property</i> for <code>Payment.creditCardSettlements</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private CreditCardSettlements creditCardSettlements;
	
	public Payment()
	{
		// default constructor
	}
	
	public void setMethod(final String method)
	{
		this.method = method;
	}

	public String getMethod() 
	{
		return method;
	}
	
	public void setToken(final String token)
	{
		this.token = token;
	}

	public String getToken() 
	{
		return token;
	}
	
	public void setPaymentStatus(final String paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatus() 
	{
		return paymentStatus;
	}
	
	public void setCreditCardSettlements(final CreditCardSettlements creditCardSettlements)
	{
		this.creditCardSettlements = creditCardSettlements;
	}

	public CreditCardSettlements getCreditCardSettlements() 
	{
		return creditCardSettlements;
	}
	

}