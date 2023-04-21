/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:07 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.Objects;
@XmlRootElement(name="sapCpiCreditCardPayment")
public  class SapCpiCreditCardPayment  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.orderId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String orderId;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.requestId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String requestId;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.ccOwner</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String ccOwner;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.validToMonth</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String validToMonth;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.validToYear</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String validToYear;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.subscriptionId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String subscriptionId;

	/** <i>Generated property</i> for <code>SapCpiCreditCardPayment.paymentProvider</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String paymentProvider;
	
	public SapCpiCreditCardPayment()
	{
		// default constructor
	}
	
	public void setOrderId(final String orderId)
	{
		this.orderId = orderId;
	}

	public String getOrderId() 
	{
		return orderId;
	}
	
	public void setRequestId(final String requestId)
	{
		this.requestId = requestId;
	}

	public String getRequestId() 
	{
		return requestId;
	}
	
	public void setCcOwner(final String ccOwner)
	{
		this.ccOwner = ccOwner;
	}

	public String getCcOwner() 
	{
		return ccOwner;
	}
	
	public void setValidToMonth(final String validToMonth)
	{
		this.validToMonth = validToMonth;
	}

	public String getValidToMonth() 
	{
		return validToMonth;
	}
	
	public void setValidToYear(final String validToYear)
	{
		this.validToYear = validToYear;
	}

	public String getValidToYear() 
	{
		return validToYear;
	}
	
	public void setSubscriptionId(final String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionId() 
	{
		return subscriptionId;
	}
	
	public void setPaymentProvider(final String paymentProvider)
	{
		this.paymentProvider = paymentProvider;
	}

	public String getPaymentProvider() 
	{
		return paymentProvider;
	}
	

}