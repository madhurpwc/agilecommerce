/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Charge;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.CustomReferencesItem;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.GrossAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.NetAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Product;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.RatePlan;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Subscription;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.TaxAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.TaxDetail;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Bill  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Bill.ratePlan</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("ratePlan") 	
	private RatePlan ratePlan;

	/** <i>Generated property</i> for <code>Bill.product</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("product") 	
	private Product product;

	/** <i>Generated property</i> for <code>Bill.charges</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("charges") 	
	private List<Charge> charges;

	/** <i>Generated property</i> for <code>Bill.taxDetails</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("taxDetails") 	
	private List<TaxDetail> taxDetails;

	/** <i>Generated property</i> for <code>Bill.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("netAmount") 	
	private NetAmount netAmount;

	/** <i>Generated property</i> for <code>Bill.subscription</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("subscription") 	
	private Subscription subscription;

	/** <i>Generated property</i> for <code>Bill.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("grossAmount") 	
	private GrossAmount grossAmount;

	/** <i>Generated property</i> for <code>Bill.taxAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("taxAmount") 	
	private TaxAmount taxAmount;

	/** <i>Generated property</i> for <code>Bill.groupingElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("groupingElement") 	
	private String groupingElement;

	/** <i>Generated property</i> for <code>Bill.customReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("customReferences") 	
	private List<CustomReferencesItem> customReferences;
	
	public Bill()
	{
		// default constructor
	}
	
@JsonProperty("ratePlan") 	public void setRatePlan(final RatePlan ratePlan)
	{
		this.ratePlan = ratePlan;
	}

@JsonProperty("ratePlan") 	public RatePlan getRatePlan() 
	{
		return ratePlan;
	}
	
@JsonProperty("product") 	public void setProduct(final Product product)
	{
		this.product = product;
	}

@JsonProperty("product") 	public Product getProduct() 
	{
		return product;
	}
	
@JsonProperty("charges") 	public void setCharges(final List<Charge> charges)
	{
		this.charges = charges;
	}

@JsonProperty("charges") 	public List<Charge> getCharges() 
	{
		return charges;
	}
	
@JsonProperty("taxDetails") 	public void setTaxDetails(final List<TaxDetail> taxDetails)
	{
		this.taxDetails = taxDetails;
	}

@JsonProperty("taxDetails") 	public List<TaxDetail> getTaxDetails() 
	{
		return taxDetails;
	}
	
@JsonProperty("netAmount") 	public void setNetAmount(final NetAmount netAmount)
	{
		this.netAmount = netAmount;
	}

@JsonProperty("netAmount") 	public NetAmount getNetAmount() 
	{
		return netAmount;
	}
	
@JsonProperty("subscription") 	public void setSubscription(final Subscription subscription)
	{
		this.subscription = subscription;
	}

@JsonProperty("subscription") 	public Subscription getSubscription() 
	{
		return subscription;
	}
	
@JsonProperty("grossAmount") 	public void setGrossAmount(final GrossAmount grossAmount)
	{
		this.grossAmount = grossAmount;
	}

@JsonProperty("grossAmount") 	public GrossAmount getGrossAmount() 
	{
		return grossAmount;
	}
	
@JsonProperty("taxAmount") 	public void setTaxAmount(final TaxAmount taxAmount)
	{
		this.taxAmount = taxAmount;
	}

@JsonProperty("taxAmount") 	public TaxAmount getTaxAmount() 
	{
		return taxAmount;
	}
	
@JsonProperty("groupingElement") 	public void setGroupingElement(final String groupingElement)
	{
		this.groupingElement = groupingElement;
	}

@JsonProperty("groupingElement") 	public String getGroupingElement() 
	{
		return groupingElement;
	}
	
@JsonProperty("customReferences") 	public void setCustomReferences(final List<CustomReferencesItem> customReferences)
	{
		this.customReferences = customReferences;
	}

@JsonProperty("customReferences") 	public List<CustomReferencesItem> getCustomReferences() 
	{
		return customReferences;
	}
	

}