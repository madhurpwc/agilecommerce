/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Subscription  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Subscription.subscriptionId</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String subscriptionId;

	/** <i>Generated property</i> for <code>Subscription.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer documentNumber;

	/** <i>Generated property</i> for <code>Subscription.metadata</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("metaData") 	
	private Metadata metadata;

	/** <i>Generated property</i> for <code>Subscription.validFrom</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date validFrom;

	/** <i>Generated property</i> for <code>Subscription.billingCycleReferenceDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date billingCycleReferenceDate;

	/** <i>Generated property</i> for <code>Subscription.validUntil</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date validUntil;

	/** <i>Generated property</i> for <code>Subscription.customer</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private BusinessPartner customer;

	/** <i>Generated property</i> for <code>Subscription.market</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Market market;

	/** <i>Generated property</i> for <code>Subscription.cancellationReason</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String cancellationReason;

	/** <i>Generated property</i> for <code>Subscription.requestedCancellationDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date requestedCancellationDate;

	/** <i>Generated property</i> for <code>Subscription.cancelledWithOverruledTerms</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("canceledWithOverruledTerms") 	
	private Boolean cancelledWithOverruledTerms;

	/** <i>Generated property</i> for <code>Subscription.payment</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Payment payment;

	/** <i>Generated property</i> for <code>Subscription.billSplitElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billSplitElement;

	/** <i>Generated property</i> for <code>Subscription.customReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CustomReference> customReferences;

	/** Valid values are [ Active, Canceled, Expired, Not Started, Withdrawn ]<br/><br/><i>Generated property</i> for <code>Subscription.status</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String status;

	/** <i>Generated property</i> for <code>Subscription.contractTerm</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private ContractTerm contractTerm;

	/** <i>Generated property</i> for <code>Subscription.cancellationPolicy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private CancellationPolicy cancellationPolicy;

	/** <i>Generated property</i> for <code>Subscription.renewalTerm</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private RenewalTerm renewalTerm;

	/** <i>Generated property</i> for <code>Subscription.withdrawnAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date withdrawnAt;

	/** Valid values are [ calendar-monthly, calendar-quarterly, calendar-half-yearly, calendar-yearly, anniversary-monthly, anniversary-quarterly, anniversary-half-yearly, anniversary-yearly ]<br/><br/><i>Generated property</i> for <code>Subscription.billingCycle</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billingCycle;

	/** <i>Generated property</i> for <code>Subscription.cancelledAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("canceledAt") 	
	private Date cancelledAt;

	/** Number of billing cycles that are billed together in one bill. This only applies for recurring
                charges. Usage charges are billed per single billing cycle. minimum: 1, maximum: 99<br/><br/><i>Generated property</i> for <code>Subscription.numberOfCyclesBilledTogether</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer numberOfCyclesBilledTogether;

	/** <i>Generated property</i> for <code>Subscription.snapshots</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<Snapshot> snapshots;

	/** <i>Generated property</i> for <code>Subscription.createdAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date createdAt;

	/** <i>Generated property</i> for <code>Subscription.createdBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String createdBy;

	/** <i>Generated property</i> for <code>Subscription.changedAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date changedAt;

	/** <i>Generated property</i> for <code>Subscription.changedBy</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String changedBy;

	/** <i>Generated property</i> for <code>Subscription.nextScheduledBillingDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date nextScheduledBillingDate;

	/** <i>Generated property</i> for <code>Subscription.billingCutOverDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("billingCutoverDate") 	
	private Date billingCutOverDate;

	/** <i>Generated property</i> for <code>Subscription.externalObjectReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<ExternalObjectReference> externalObjectReferences;
	
	public Subscription()
	{
		// default constructor
	}
	
	public void setSubscriptionId(final String subscriptionId)
	{
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionId() 
	{
		return subscriptionId;
	}
	
	public void setDocumentNumber(final Integer documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	public Integer getDocumentNumber() 
	{
		return documentNumber;
	}
	
@JsonProperty("metaData") 	public void setMetadata(final Metadata metadata)
	{
		this.metadata = metadata;
	}

@JsonProperty("metaData") 	public Metadata getMetadata() 
	{
		return metadata;
	}
	
	public void setValidFrom(final Date validFrom)
	{
		this.validFrom = validFrom;
	}

	public Date getValidFrom() 
	{
		return validFrom;
	}
	
	public void setBillingCycleReferenceDate(final Date billingCycleReferenceDate)
	{
		this.billingCycleReferenceDate = billingCycleReferenceDate;
	}

	public Date getBillingCycleReferenceDate() 
	{
		return billingCycleReferenceDate;
	}
	
	public void setValidUntil(final Date validUntil)
	{
		this.validUntil = validUntil;
	}

	public Date getValidUntil() 
	{
		return validUntil;
	}
	
	public void setCustomer(final BusinessPartner customer)
	{
		this.customer = customer;
	}

	public BusinessPartner getCustomer() 
	{
		return customer;
	}
	
	public void setMarket(final Market market)
	{
		this.market = market;
	}

	public Market getMarket() 
	{
		return market;
	}
	
	public void setCancellationReason(final String cancellationReason)
	{
		this.cancellationReason = cancellationReason;
	}

	public String getCancellationReason() 
	{
		return cancellationReason;
	}
	
	public void setRequestedCancellationDate(final Date requestedCancellationDate)
	{
		this.requestedCancellationDate = requestedCancellationDate;
	}

	public Date getRequestedCancellationDate() 
	{
		return requestedCancellationDate;
	}
	
@JsonProperty("canceledWithOverruledTerms") 	public void setCancelledWithOverruledTerms(final Boolean cancelledWithOverruledTerms)
	{
		this.cancelledWithOverruledTerms = cancelledWithOverruledTerms;
	}

@JsonProperty("canceledWithOverruledTerms") 	public Boolean getCancelledWithOverruledTerms() 
	{
		return cancelledWithOverruledTerms;
	}
	
	public void setPayment(final Payment payment)
	{
		this.payment = payment;
	}

	public Payment getPayment() 
	{
		return payment;
	}
	
	public void setBillSplitElement(final String billSplitElement)
	{
		this.billSplitElement = billSplitElement;
	}

	public String getBillSplitElement() 
	{
		return billSplitElement;
	}
	
	public void setCustomReferences(final List<CustomReference> customReferences)
	{
		this.customReferences = customReferences;
	}

	public List<CustomReference> getCustomReferences() 
	{
		return customReferences;
	}
	
	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	
	public void setContractTerm(final ContractTerm contractTerm)
	{
		this.contractTerm = contractTerm;
	}

	public ContractTerm getContractTerm() 
	{
		return contractTerm;
	}
	
	public void setCancellationPolicy(final CancellationPolicy cancellationPolicy)
	{
		this.cancellationPolicy = cancellationPolicy;
	}

	public CancellationPolicy getCancellationPolicy() 
	{
		return cancellationPolicy;
	}
	
	public void setRenewalTerm(final RenewalTerm renewalTerm)
	{
		this.renewalTerm = renewalTerm;
	}

	public RenewalTerm getRenewalTerm() 
	{
		return renewalTerm;
	}
	
	public void setWithdrawnAt(final Date withdrawnAt)
	{
		this.withdrawnAt = withdrawnAt;
	}

	public Date getWithdrawnAt() 
	{
		return withdrawnAt;
	}
	
	public void setBillingCycle(final String billingCycle)
	{
		this.billingCycle = billingCycle;
	}

	public String getBillingCycle() 
	{
		return billingCycle;
	}
	
@JsonProperty("canceledAt") 	public void setCancelledAt(final Date cancelledAt)
	{
		this.cancelledAt = cancelledAt;
	}

@JsonProperty("canceledAt") 	public Date getCancelledAt() 
	{
		return cancelledAt;
	}
	
	public void setNumberOfCyclesBilledTogether(final Integer numberOfCyclesBilledTogether)
	{
		this.numberOfCyclesBilledTogether = numberOfCyclesBilledTogether;
	}

	public Integer getNumberOfCyclesBilledTogether() 
	{
		return numberOfCyclesBilledTogether;
	}
	
	public void setSnapshots(final List<Snapshot> snapshots)
	{
		this.snapshots = snapshots;
	}

	public List<Snapshot> getSnapshots() 
	{
		return snapshots;
	}
	
	public void setCreatedAt(final Date createdAt)
	{
		this.createdAt = createdAt;
	}

	public Date getCreatedAt() 
	{
		return createdAt;
	}
	
	public void setCreatedBy(final String createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getCreatedBy() 
	{
		return createdBy;
	}
	
	public void setChangedAt(final Date changedAt)
	{
		this.changedAt = changedAt;
	}

	public Date getChangedAt() 
	{
		return changedAt;
	}
	
	public void setChangedBy(final String changedBy)
	{
		this.changedBy = changedBy;
	}

	public String getChangedBy() 
	{
		return changedBy;
	}
	
	public void setNextScheduledBillingDate(final Date nextScheduledBillingDate)
	{
		this.nextScheduledBillingDate = nextScheduledBillingDate;
	}

	public Date getNextScheduledBillingDate() 
	{
		return nextScheduledBillingDate;
	}
	
@JsonProperty("billingCutoverDate") 	public void setBillingCutOverDate(final Date billingCutOverDate)
	{
		this.billingCutOverDate = billingCutOverDate;
	}

@JsonProperty("billingCutoverDate") 	public Date getBillingCutOverDate() 
	{
		return billingCutOverDate;
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