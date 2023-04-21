/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.subscriptionfacades.data;

import java.io.Serializable;
import de.hybris.platform.subscriptionfacades.data.ExternalObjectReferenceData;
import de.hybris.platform.subscriptionfacades.data.PaymentData;
import de.hybris.platform.subscriptionfacades.data.PricingData;
import de.hybris.platform.subscriptionfacades.data.RenewalTermData;
import de.hybris.platform.subscriptionfacades.data.SubscriptionPricePlanData;
import de.hybris.platform.subscriptionfacades.data.UsageChargeData;
import de.hybris.platform.subscriptionservices.enums.SubscriptionStatus;
import java.util.Date;
import java.util.List;


import java.util.Objects;
public  class SubscriptionData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SubscriptionData.id</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>SubscriptionData.name</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String name;

	/** <i>Generated property</i> for <code>SubscriptionData.description</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String description;

	/** <i>Generated property</i> for <code>SubscriptionData.productCode</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String productCode;

	/** <i>Generated property</i> for <code>SubscriptionData.productUrl</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String productUrl;

	/** <i>Generated property</i> for <code>SubscriptionData.orderNumber</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String orderNumber;

	/** <i>Generated property</i> for <code>SubscriptionData.orderEntryNumber</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Integer orderEntryNumber;

	/** <i>Generated property</i> for <code>SubscriptionData.billingsystemId</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String billingsystemId;

	/** <i>Generated property</i> for <code>SubscriptionData.startDate</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Date startDate;

	/** <i>Generated property</i> for <code>SubscriptionData.endDate</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Date endDate;

	/** <i>Generated property</i> for <code>SubscriptionData.renewalType</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String renewalType;

	/** <i>Generated property</i> for <code>SubscriptionData.subscriptionStatus</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String subscriptionStatus;

	/** <i>Generated property</i> for <code>SubscriptionData.cancellable</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Boolean cancellable;

	/** <i>Generated property</i> for <code>SubscriptionData.billingFrequency</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String billingFrequency;

	/** <i>Generated property</i> for <code>SubscriptionData.contractDuration</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Integer contractDuration;

	/** <i>Generated property</i> for <code>SubscriptionData.contractFrequency</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String contractFrequency;

	/** <i>Generated property</i> for <code>SubscriptionData.placedOn</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Date placedOn;

	/** <i>Generated property</i> for <code>SubscriptionData.cancelledDate</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private Date cancelledDate;

	/** <i>Generated property</i> for <code>SubscriptionData.customerId</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String customerId;

	/** <i>Generated property</i> for <code>SubscriptionData.paymentMethodId</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String paymentMethodId;

	/** <i>Generated property</i> for <code>SubscriptionData.version</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String version;

	/** <i>Generated property</i> for <code>SubscriptionData.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String documentNumber;

	/** <i>Generated property</i> for <code>SubscriptionData.ratePlanId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String ratePlanId;

	/** <i>Generated property</i> for <code>SubscriptionData.extendedPeriod</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String extendedPeriod;

	/** <i>Generated property</i> for <code>SubscriptionData.pricePlan</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private SubscriptionPricePlanData pricePlan;

	/** <i>Generated property</i> for <code>SubscriptionData.status</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private SubscriptionStatus status;

	/** <i>Generated property</i> for <code>SubscriptionData.validTillDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String validTillDate;

	/** <i>Generated property</i> for <code>SubscriptionData.unlimited</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean unlimited;

	/** <i>Generated property</i> for <code>SubscriptionData.currentUsages</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<UsageChargeData> currentUsages;

	/** <i>Generated property</i> for <code>SubscriptionData.renewalTerm</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RenewalTermData renewalTerm;

	/** <i>Generated property</i> for <code>SubscriptionData.payment</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PaymentData payment;

	/** <i>Generated property</i> for <code>SubscriptionData.withdrawalPeriodEndDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date withdrawalPeriodEndDate;

	/** <i>Generated property</i> for <code>SubscriptionData.withdrawnAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date withdrawnAt;

	/** <i>Generated property</i> for <code>SubscriptionData.pricing</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private PricingData pricing;

	/** <i>Generated property</i> for <code>SubscriptionData.externalObjectReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<ExternalObjectReferenceData> externalObjectReferences;
	
	public SubscriptionData()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setProductCode(final String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductCode() 
	{
		return productCode;
	}
	
	public void setProductUrl(final String productUrl)
	{
		this.productUrl = productUrl;
	}

	public String getProductUrl() 
	{
		return productUrl;
	}
	
	public void setOrderNumber(final String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber() 
	{
		return orderNumber;
	}
	
	public void setOrderEntryNumber(final Integer orderEntryNumber)
	{
		this.orderEntryNumber = orderEntryNumber;
	}

	public Integer getOrderEntryNumber() 
	{
		return orderEntryNumber;
	}
	
	public void setBillingsystemId(final String billingsystemId)
	{
		this.billingsystemId = billingsystemId;
	}

	public String getBillingsystemId() 
	{
		return billingsystemId;
	}
	
	public void setStartDate(final Date startDate)
	{
		this.startDate = startDate;
	}

	public Date getStartDate() 
	{
		return startDate;
	}
	
	public void setEndDate(final Date endDate)
	{
		this.endDate = endDate;
	}

	public Date getEndDate() 
	{
		return endDate;
	}
	
	public void setRenewalType(final String renewalType)
	{
		this.renewalType = renewalType;
	}

	public String getRenewalType() 
	{
		return renewalType;
	}
	
	public void setSubscriptionStatus(final String subscriptionStatus)
	{
		this.subscriptionStatus = subscriptionStatus;
	}

	public String getSubscriptionStatus() 
	{
		return subscriptionStatus;
	}
	
	public void setCancellable(final Boolean cancellable)
	{
		this.cancellable = cancellable;
	}

	public Boolean getCancellable() 
	{
		return cancellable;
	}
	
	public void setBillingFrequency(final String billingFrequency)
	{
		this.billingFrequency = billingFrequency;
	}

	public String getBillingFrequency() 
	{
		return billingFrequency;
	}
	
	public void setContractDuration(final Integer contractDuration)
	{
		this.contractDuration = contractDuration;
	}

	public Integer getContractDuration() 
	{
		return contractDuration;
	}
	
	public void setContractFrequency(final String contractFrequency)
	{
		this.contractFrequency = contractFrequency;
	}

	public String getContractFrequency() 
	{
		return contractFrequency;
	}
	
	public void setPlacedOn(final Date placedOn)
	{
		this.placedOn = placedOn;
	}

	public Date getPlacedOn() 
	{
		return placedOn;
	}
	
	public void setCancelledDate(final Date cancelledDate)
	{
		this.cancelledDate = cancelledDate;
	}

	public Date getCancelledDate() 
	{
		return cancelledDate;
	}
	
	public void setCustomerId(final String customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerId() 
	{
		return customerId;
	}
	
	public void setPaymentMethodId(final String paymentMethodId)
	{
		this.paymentMethodId = paymentMethodId;
	}

	public String getPaymentMethodId() 
	{
		return paymentMethodId;
	}
	
	public void setVersion(final String version)
	{
		this.version = version;
	}

	public String getVersion() 
	{
		return version;
	}
	
	public void setDocumentNumber(final String documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	public String getDocumentNumber() 
	{
		return documentNumber;
	}
	
	public void setRatePlanId(final String ratePlanId)
	{
		this.ratePlanId = ratePlanId;
	}

	public String getRatePlanId() 
	{
		return ratePlanId;
	}
	
	public void setExtendedPeriod(final String extendedPeriod)
	{
		this.extendedPeriod = extendedPeriod;
	}

	public String getExtendedPeriod() 
	{
		return extendedPeriod;
	}
	
	public void setPricePlan(final SubscriptionPricePlanData pricePlan)
	{
		this.pricePlan = pricePlan;
	}

	public SubscriptionPricePlanData getPricePlan() 
	{
		return pricePlan;
	}
	
	public void setStatus(final SubscriptionStatus status)
	{
		this.status = status;
	}

	public SubscriptionStatus getStatus() 
	{
		return status;
	}
	
	public void setValidTillDate(final String validTillDate)
	{
		this.validTillDate = validTillDate;
	}

	public String getValidTillDate() 
	{
		return validTillDate;
	}
	
	public void setUnlimited(final Boolean unlimited)
	{
		this.unlimited = unlimited;
	}

	public Boolean getUnlimited() 
	{
		return unlimited;
	}
	
	public void setCurrentUsages(final List<UsageChargeData> currentUsages)
	{
		this.currentUsages = currentUsages;
	}

	public List<UsageChargeData> getCurrentUsages() 
	{
		return currentUsages;
	}
	
	public void setRenewalTerm(final RenewalTermData renewalTerm)
	{
		this.renewalTerm = renewalTerm;
	}

	public RenewalTermData getRenewalTerm() 
	{
		return renewalTerm;
	}
	
	public void setPayment(final PaymentData payment)
	{
		this.payment = payment;
	}

	public PaymentData getPayment() 
	{
		return payment;
	}
	
	public void setWithdrawalPeriodEndDate(final Date withdrawalPeriodEndDate)
	{
		this.withdrawalPeriodEndDate = withdrawalPeriodEndDate;
	}

	public Date getWithdrawalPeriodEndDate() 
	{
		return withdrawalPeriodEndDate;
	}
	
	public void setWithdrawnAt(final Date withdrawnAt)
	{
		this.withdrawnAt = withdrawnAt;
	}

	public Date getWithdrawnAt() 
	{
		return withdrawnAt;
	}
	
	public void setPricing(final PricingData pricing)
	{
		this.pricing = pricing;
	}

	public PricingData getPricing() 
	{
		return pricing;
	}
	
	public void setExternalObjectReferences(final List<ExternalObjectReferenceData> externalObjectReferences)
	{
		this.externalObjectReferences = externalObjectReferences;
	}

	public List<ExternalObjectReferenceData> getExternalObjectReferences() 
	{
		return externalObjectReferences;
	}
	

}