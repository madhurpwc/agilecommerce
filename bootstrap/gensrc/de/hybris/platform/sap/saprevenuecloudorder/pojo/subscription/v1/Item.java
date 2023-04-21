/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Item  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Item.itemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String itemId;

	/** <i>Generated property</i> for <code>Item.parentItemId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String parentItemId;

	/** <i>Generated property</i> for <code>Item.lineNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String lineNumber;

	/** <i>Generated property</i> for <code>Item.product</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Product product;

	/** <i>Generated property</i> for <code>Item.ratePlan</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RatePlan ratePlan;

	/** <i>Generated property</i> for <code>Item.pricing</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Pricing pricing;

	/** <i>Generated property</i> for <code>Item.technicalResources</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<TechnicalResource> technicalResources;

	/** <i>Generated property</i> for <code>Item.subscriptionParameters</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<SubscriptionParameter> subscriptionParameters;

	/** Valid Values are [ Test, Trial/Beta, Internal Billing, Commercial ]<br/><br/><i>Generated property</i> for <code>Item.subscriptionType</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionType;

	/** <i>Generated property</i> for <code>Item.createRating</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean createRating;

	/** <i>Generated property</i> for <code>Item.createBill</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean createBill;

	/** <i>Generated property</i> for <code>Item.createInvoice</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean createInvoice;

	/** <i>Generated property</i> for <code>Item.billItemGroupingElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billItemGroupingElement;

	/** <i>Generated property</i> for <code>Item.numberOfWaiverPeriods</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer numberOfWaiverPeriods;

	/** <i>Generated property</i> for <code>Item.customReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CustomReference> customReferences;

	/** <i>Generated property</i> for <code>Item.externalObjectReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<ExternalObjectReference> externalObjectReferences;
	
	public Item()
	{
		// default constructor
	}
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemId() 
	{
		return itemId;
	}
	
	public void setParentItemId(final String parentItemId)
	{
		this.parentItemId = parentItemId;
	}

	public String getParentItemId() 
	{
		return parentItemId;
	}
	
	public void setLineNumber(final String lineNumber)
	{
		this.lineNumber = lineNumber;
	}

	public String getLineNumber() 
	{
		return lineNumber;
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
	
	public void setPricing(final Pricing pricing)
	{
		this.pricing = pricing;
	}

	public Pricing getPricing() 
	{
		return pricing;
	}
	
	public void setTechnicalResources(final List<TechnicalResource> technicalResources)
	{
		this.technicalResources = technicalResources;
	}

	public List<TechnicalResource> getTechnicalResources() 
	{
		return technicalResources;
	}
	
	public void setSubscriptionParameters(final List<SubscriptionParameter> subscriptionParameters)
	{
		this.subscriptionParameters = subscriptionParameters;
	}

	public List<SubscriptionParameter> getSubscriptionParameters() 
	{
		return subscriptionParameters;
	}
	
	public void setSubscriptionType(final String subscriptionType)
	{
		this.subscriptionType = subscriptionType;
	}

	public String getSubscriptionType() 
	{
		return subscriptionType;
	}
	
	public void setCreateRating(final Boolean createRating)
	{
		this.createRating = createRating;
	}

	public Boolean getCreateRating() 
	{
		return createRating;
	}
	
	public void setCreateBill(final Boolean createBill)
	{
		this.createBill = createBill;
	}

	public Boolean getCreateBill() 
	{
		return createBill;
	}
	
	public void setCreateInvoice(final Boolean createInvoice)
	{
		this.createInvoice = createInvoice;
	}

	public Boolean getCreateInvoice() 
	{
		return createInvoice;
	}
	
	public void setBillItemGroupingElement(final String billItemGroupingElement)
	{
		this.billItemGroupingElement = billItemGroupingElement;
	}

	public String getBillItemGroupingElement() 
	{
		return billItemGroupingElement;
	}
	
	public void setNumberOfWaiverPeriods(final Integer numberOfWaiverPeriods)
	{
		this.numberOfWaiverPeriods = numberOfWaiverPeriods;
	}

	public Integer getNumberOfWaiverPeriods() 
	{
		return numberOfWaiverPeriods;
	}
	
	public void setCustomReferences(final List<CustomReference> customReferences)
	{
		this.customReferences = customReferences;
	}

	public List<CustomReference> getCustomReferences() 
	{
		return customReferences;
	}
	
	public void setExternalObjectReferences(final List<ExternalObjectReference> externalObjectReferences)
	{
		this.externalObjectReferences = externalObjectReferences;
	}

	public List<ExternalObjectReference> getExternalObjectReferences() 
	{
		return externalObjectReferences;
	}
	

}