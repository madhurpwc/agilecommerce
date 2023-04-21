/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:07 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class CreditCardSettlementTransactionDetail  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** Valid values are [ SUCCESS, FAILED ]<br/><br/><i>Generated property</i> for <code>CreditCardSettlementTransactionDetail.status</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String status;

	/** <i>Generated property</i> for <code>CreditCardSettlementTransactionDetail.transactionId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String transactionId;

	/** <i>Generated property</i> for <code>CreditCardSettlementTransactionDetail.providerId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String providerId;

	/** <i>Generated property</i> for <code>CreditCardSettlementTransactionDetail.merchant</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String merchant;

	/** <i>Generated property</i> for <code>CreditCardSettlementTransactionDetail.paymentDateTime</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String paymentDateTime;

	/** <i>Generated property</i> for <code>CreditCardSettlementTransactionDetail.amount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount amount;
	
	public CreditCardSettlementTransactionDetail()
	{
		// default constructor
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setTransactionId(final String transactionId)
	{
		this.transactionId = transactionId;
	}

	public String getTransactionId() 
	{
		return transactionId;
	}
	
	public void setProviderId(final String providerId)
	{
		this.providerId = providerId;
	}

	public String getProviderId() 
	{
		return providerId;
	}
	
	public void setMerchant(final String merchant)
	{
		this.merchant = merchant;
	}

	public String getMerchant() 
	{
		return merchant;
	}
	
	public void setPaymentDateTime(final String paymentDateTime)
	{
		this.paymentDateTime = paymentDateTime;
	}

	public String getPaymentDateTime() 
	{
		return paymentDateTime;
	}
	
	public void setAmount(final MonetaryAmount amount)
	{
		this.amount = amount;
	}

	public MonetaryAmount getAmount() 
	{
		return amount;
	}
	

}