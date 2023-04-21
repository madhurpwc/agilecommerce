/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.data;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiConfig;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiCreditCardPayment;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiOrderAddress;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiOrderItem;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiOrderPriceComponent;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiPartnerRole;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.Objects;
@XmlRootElement(name="sapCpiOrder") @JsonIgnoreProperties(ignoreUnknown = true)
public  class SapCpiOrder  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiOrder.sapCpiConfig</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private SapCpiConfig sapCpiConfig;

	/** <i>Generated property</i> for <code>SapCpiOrder.orderId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String orderId;

	/** <i>Generated property</i> for <code>SapCpiOrder.creationDate</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String creationDate;

	/** <i>Generated property</i> for <code>SapCpiOrder.currencyIsoCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String currencyIsoCode;

	/** <i>Generated property</i> for <code>SapCpiOrder.paymentMode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String paymentMode;

	/** <i>Generated property</i> for <code>SapCpiOrder.deliveryMode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String deliveryMode;

	/** <i>Generated property</i> for <code>SapCpiOrder.purchaseOrderNumber</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String purchaseOrderNumber;

	/** <i>Generated property</i> for <code>SapCpiOrder.baseStoreUid</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String baseStoreUid;

	/** <i>Generated property</i> for <code>SapCpiOrder.channel</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String channel;

	/** <i>Generated property</i> for <code>SapCpiOrder.salesOrganization</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String salesOrganization;

	/** <i>Generated property</i> for <code>SapCpiOrder.distributionChannel</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String distributionChannel;

	/** <i>Generated property</i> for <code>SapCpiOrder.division</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String division;

	/** <i>Generated property</i> for <code>SapCpiOrder.transactionType</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String transactionType;

	/** <i>Generated property</i> for <code>SapCpiOrder.shippingCondition</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String shippingCondition;

	/** <i>Generated property</i> for <code>SapCpiOrder.sapCpiCreditCardPayments</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private List<SapCpiCreditCardPayment> sapCpiCreditCardPayments;

	/** <i>Generated property</i> for <code>SapCpiOrder.sapCpiOrderItems</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private List<SapCpiOrderItem> sapCpiOrderItems;

	/** <i>Generated property</i> for <code>SapCpiOrder.sapCpiPartnerRoles</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private List<SapCpiPartnerRole> sapCpiPartnerRoles;

	/** <i>Generated property</i> for <code>SapCpiOrder.sapCpiOrderAddresses</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private List<SapCpiOrderAddress> sapCpiOrderAddresses;

	/** <i>Generated property</i> for <code>SapCpiOrder.sapCpiOrderPriceComponents</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private List<SapCpiOrderPriceComponent> sapCpiOrderPriceComponents;
	
	public SapCpiOrder()
	{
		// default constructor
	}
	
	public void setSapCpiConfig(final SapCpiConfig sapCpiConfig)
	{
		this.sapCpiConfig = sapCpiConfig;
	}

@XmlElement(name="sapCpiConfig") 	public SapCpiConfig getSapCpiConfig() 
	{
		return sapCpiConfig;
	}
	
	public void setOrderId(final String orderId)
	{
		this.orderId = orderId;
	}

	public String getOrderId() 
	{
		return orderId;
	}
	
	public void setCreationDate(final String creationDate)
	{
		this.creationDate = creationDate;
	}

	public String getCreationDate() 
	{
		return creationDate;
	}
	
	public void setCurrencyIsoCode(final String currencyIsoCode)
	{
		this.currencyIsoCode = currencyIsoCode;
	}

	public String getCurrencyIsoCode() 
	{
		return currencyIsoCode;
	}
	
	public void setPaymentMode(final String paymentMode)
	{
		this.paymentMode = paymentMode;
	}

	public String getPaymentMode() 
	{
		return paymentMode;
	}
	
	public void setDeliveryMode(final String deliveryMode)
	{
		this.deliveryMode = deliveryMode;
	}

	public String getDeliveryMode() 
	{
		return deliveryMode;
	}
	
	public void setPurchaseOrderNumber(final String purchaseOrderNumber)
	{
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public String getPurchaseOrderNumber() 
	{
		return purchaseOrderNumber;
	}
	
	public void setBaseStoreUid(final String baseStoreUid)
	{
		this.baseStoreUid = baseStoreUid;
	}

	public String getBaseStoreUid() 
	{
		return baseStoreUid;
	}
	
	public void setChannel(final String channel)
	{
		this.channel = channel;
	}

	public String getChannel() 
	{
		return channel;
	}
	
	public void setSalesOrganization(final String salesOrganization)
	{
		this.salesOrganization = salesOrganization;
	}

	public String getSalesOrganization() 
	{
		return salesOrganization;
	}
	
	public void setDistributionChannel(final String distributionChannel)
	{
		this.distributionChannel = distributionChannel;
	}

	public String getDistributionChannel() 
	{
		return distributionChannel;
	}
	
	public void setDivision(final String division)
	{
		this.division = division;
	}

	public String getDivision() 
	{
		return division;
	}
	
	public void setTransactionType(final String transactionType)
	{
		this.transactionType = transactionType;
	}

	public String getTransactionType() 
	{
		return transactionType;
	}
	
	public void setShippingCondition(final String shippingCondition)
	{
		this.shippingCondition = shippingCondition;
	}

	public String getShippingCondition() 
	{
		return shippingCondition;
	}
	
	public void setSapCpiCreditCardPayments(final List<SapCpiCreditCardPayment> sapCpiCreditCardPayments)
	{
		this.sapCpiCreditCardPayments = sapCpiCreditCardPayments;
	}

@XmlElement(name="sapCpiCreditCardPayments") 	public List<SapCpiCreditCardPayment> getSapCpiCreditCardPayments() 
	{
		return sapCpiCreditCardPayments;
	}
	
	public void setSapCpiOrderItems(final List<SapCpiOrderItem> sapCpiOrderItems)
	{
		this.sapCpiOrderItems = sapCpiOrderItems;
	}

@XmlElement(name="sapCpiOrderItems") 	public List<SapCpiOrderItem> getSapCpiOrderItems() 
	{
		return sapCpiOrderItems;
	}
	
	public void setSapCpiPartnerRoles(final List<SapCpiPartnerRole> sapCpiPartnerRoles)
	{
		this.sapCpiPartnerRoles = sapCpiPartnerRoles;
	}

@XmlElement(name="sapCpiPartnerRoles") 	public List<SapCpiPartnerRole> getSapCpiPartnerRoles() 
	{
		return sapCpiPartnerRoles;
	}
	
	public void setSapCpiOrderAddresses(final List<SapCpiOrderAddress> sapCpiOrderAddresses)
	{
		this.sapCpiOrderAddresses = sapCpiOrderAddresses;
	}

@XmlElement(name="sapCpiOrderAddresses") 	public List<SapCpiOrderAddress> getSapCpiOrderAddresses() 
	{
		return sapCpiOrderAddresses;
	}
	
	public void setSapCpiOrderPriceComponents(final List<SapCpiOrderPriceComponent> sapCpiOrderPriceComponents)
	{
		this.sapCpiOrderPriceComponents = sapCpiOrderPriceComponents;
	}

@XmlElement(name="sapCpiOrderPriceComponents") 	public List<SapCpiOrderPriceComponent> getSapCpiOrderPriceComponents() 
	{
		return sapCpiOrderPriceComponents;
	}
	

}