/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


import java.util.Objects;
public  class BillItem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>BillItem.subscription</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Subscription subscription;

	/** <i>Generated property</i> for <code>BillItem.product</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Product product;

	/** <i>Generated property</i> for <code>BillItem.ratePlan</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RatePlan ratePlan;

	/** <i>Generated property</i> for <code>BillItem.groupingElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("groupingEelement") 	
	private String groupingElement;

	/** <i>Generated property</i> for <code>BillItem.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netAmount;

	/** <i>Generated property</i> for <code>BillItem.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossAmount;

	/** <i>Generated property</i> for <code>BillItem.netCreditAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netCreditAmount;

	/** <i>Generated property</i> for <code>BillItem.grossCreditAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossCreditAmount;

	/** <i>Generated property</i> for <code>BillItem.taxAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount taxAmount;

	/** <i>Generated property</i> for <code>BillItem.taxDetails</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<TaxDetail> taxDetails;

	/** <i>Generated property</i> for <code>BillItem.customReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CustomReference> customReferences;

	/** <i>Generated property</i> for <code>BillItem.charges</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<Charge> charges;

	/** <i>Generated property</i> for <code>BillItem.credits</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<Credit> credits;
	
	public BillItem()
	{
		// default constructor
	}
	
	public void setSubscription(final Subscription subscription)
	{
		this.subscription = subscription;
	}

	public Subscription getSubscription() 
	{
		return subscription;
	}
	
	public void setProduct(final Product product)
	{
		this.product = product;
	}

	public Product getProduct() 
	{
		return product;
	}
	
	public void setRatePlan(final RatePlan ratePlan)
	{
		this.ratePlan = ratePlan;
	}

	public RatePlan getRatePlan() 
	{
		return ratePlan;
	}
	
@JsonProperty("groupingEelement") 	public void setGroupingElement(final String groupingElement)
	{
		this.groupingElement = groupingElement;
	}

@JsonProperty("groupingEelement") 	public String getGroupingElement() 
	{
		return groupingElement;
	}
	
	public void setNetAmount(final MonetaryAmount netAmount)
	{
		this.netAmount = netAmount;
	}

	public MonetaryAmount getNetAmount() 
	{
		return netAmount;
	}
	
	public void setGrossAmount(final MonetaryAmount grossAmount)
	{
		this.grossAmount = grossAmount;
	}

	public MonetaryAmount getGrossAmount() 
	{
		return grossAmount;
	}
	
	public void setNetCreditAmount(final MonetaryAmount netCreditAmount)
	{
		this.netCreditAmount = netCreditAmount;
	}

	public MonetaryAmount getNetCreditAmount() 
	{
		return netCreditAmount;
	}
	
	public void setGrossCreditAmount(final MonetaryAmount grossCreditAmount)
	{
		this.grossCreditAmount = grossCreditAmount;
	}

	public MonetaryAmount getGrossCreditAmount() 
	{
		return grossCreditAmount;
	}
	
	public void setTaxAmount(final MonetaryAmount taxAmount)
	{
		this.taxAmount = taxAmount;
	}

	public MonetaryAmount getTaxAmount() 
	{
		return taxAmount;
	}
	
	public void setTaxDetails(final List<TaxDetail> taxDetails)
	{
		this.taxDetails = taxDetails;
	}

	public List<TaxDetail> getTaxDetails() 
	{
		return taxDetails;
	}
	
	public void setCustomReferences(final List<CustomReference> customReferences)
	{
		this.customReferences = customReferences;
	}

	public List<CustomReference> getCustomReferences() 
	{
		return customReferences;
	}
	
	public void setCharges(final List<Charge> charges)
	{
		this.charges = charges;
	}

	public List<Charge> getCharges() 
	{
		return charges;
	}
	
	public void setCredits(final List<Credit> credits)
	{
		this.credits = credits;
	}

	public List<Credit> getCredits() 
	{
		return credits;
	}
	

}