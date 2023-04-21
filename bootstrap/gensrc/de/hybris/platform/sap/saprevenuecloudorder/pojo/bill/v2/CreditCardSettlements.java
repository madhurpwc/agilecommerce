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
public  class CreditCardSettlements  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CreditCardSettlements.charges</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CreditCardSettlementTransactionDetail> charges;

	/** <i>Generated property</i> for <code>CreditCardSettlements.refunds</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CreditCardSettlementTransactionDetail> refunds;
	
	public CreditCardSettlements()
	{
		// default constructor
	}
	
	public void setCharges(final List<CreditCardSettlementTransactionDetail> charges)
	{
		this.charges = charges;
	}

	public List<CreditCardSettlementTransactionDetail> getCharges() 
	{
		return charges;
	}
	
	public void setRefunds(final List<CreditCardSettlementTransactionDetail> refunds)
	{
		this.refunds = refunds;
	}

	public List<CreditCardSettlementTransactionDetail> getRefunds() 
	{
		return refunds;
	}
	

}