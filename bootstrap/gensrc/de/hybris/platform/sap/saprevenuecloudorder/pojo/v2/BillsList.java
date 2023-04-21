/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Bill;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.CustomReferencesItem;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Customer;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.GrossAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Market;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.MetaData;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.NetAmount;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.Payment;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.v2.TaxAmount;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class BillsList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>BillsList.transferStatus</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("transferStatus") 	
	private String transferStatus;

	/** <i>Generated property</i> for <code>BillsList.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("netAmount") 	
	private NetAmount netAmount;

	/** <i>Generated property</i> for <code>BillsList.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("documentNumber") 	
	private int documentNumber;

	/** <i>Generated property</i> for <code>BillsList.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("grossAmount") 	
	private GrossAmount grossAmount;

	/** <i>Generated property</i> for <code>BillsList.createInvoice</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("createInvoice") 	
	private boolean createInvoice;

	/** <i>Generated property</i> for <code>BillsList.billItems</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("billItems") 	
	private List<Bill> billItems;

	/** <i>Generated property</i> for <code>BillsList.splitElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("splitElement") 	
	private String splitElement;

	/** <i>Generated property</i> for <code>BillsList.customReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("customReferences") 	
	private List<CustomReferencesItem> customReferences;

	/** <i>Generated property</i> for <code>BillsList.market</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("market") 	
	private Market market;

	/** <i>Generated property</i> for <code>BillsList.metaData</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("metaData") 	
	private MetaData metaData;

	/** <i>Generated property</i> for <code>BillsList.billingDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("billingDate") 	
	private String billingDate;

	/** <i>Generated property</i> for <code>BillsList.billStatus</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("billStatus") 	
	private String billStatus;

	/** <i>Generated property</i> for <code>BillsList.payment</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("payment") 	
	private Payment payment;

	/** <i>Generated property</i> for <code>BillsList.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("id") 	
	private String id;

	/** <i>Generated property</i> for <code>BillsList.taxAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("taxAmount") 	
	private TaxAmount taxAmount;

	/** <i>Generated property</i> for <code>BillsList.customer</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("customer") 	
	private Customer customer;
	
	public BillsList()
	{
		// default constructor
	}
	
@JsonProperty("transferStatus") 	public void setTransferStatus(final String transferStatus)
	{
		this.transferStatus = transferStatus;
	}

@JsonProperty("transferStatus") 	public String getTransferStatus() 
	{
		return transferStatus;
	}
	
@JsonProperty("netAmount") 	public void setNetAmount(final NetAmount netAmount)
	{
		this.netAmount = netAmount;
	}

@JsonProperty("netAmount") 	public NetAmount getNetAmount() 
	{
		return netAmount;
	}
	
@JsonProperty("documentNumber") 	public void setDocumentNumber(final int documentNumber)
	{
		this.documentNumber = documentNumber;
	}

@JsonProperty("documentNumber") 	public int getDocumentNumber() 
	{
		return documentNumber;
	}
	
@JsonProperty("grossAmount") 	public void setGrossAmount(final GrossAmount grossAmount)
	{
		this.grossAmount = grossAmount;
	}

@JsonProperty("grossAmount") 	public GrossAmount getGrossAmount() 
	{
		return grossAmount;
	}
	
@JsonProperty("createInvoice") 	public void setCreateInvoice(final boolean createInvoice)
	{
		this.createInvoice = createInvoice;
	}

@JsonProperty("createInvoice") 	public boolean isCreateInvoice() 
	{
		return createInvoice;
	}
	
@JsonProperty("billItems") 	public void setBillItems(final List<Bill> billItems)
	{
		this.billItems = billItems;
	}

@JsonProperty("billItems") 	public List<Bill> getBillItems() 
	{
		return billItems;
	}
	
@JsonProperty("splitElement") 	public void setSplitElement(final String splitElement)
	{
		this.splitElement = splitElement;
	}

@JsonProperty("splitElement") 	public String getSplitElement() 
	{
		return splitElement;
	}
	
@JsonProperty("customReferences") 	public void setCustomReferences(final List<CustomReferencesItem> customReferences)
	{
		this.customReferences = customReferences;
	}

@JsonProperty("customReferences") 	public List<CustomReferencesItem> getCustomReferences() 
	{
		return customReferences;
	}
	
@JsonProperty("market") 	public void setMarket(final Market market)
	{
		this.market = market;
	}

@JsonProperty("market") 	public Market getMarket() 
	{
		return market;
	}
	
@JsonProperty("metaData") 	public void setMetaData(final MetaData metaData)
	{
		this.metaData = metaData;
	}

@JsonProperty("metaData") 	public MetaData getMetaData() 
	{
		return metaData;
	}
	
@JsonProperty("billingDate") 	public void setBillingDate(final String billingDate)
	{
		this.billingDate = billingDate;
	}

@JsonProperty("billingDate") 	public String getBillingDate() 
	{
		return billingDate;
	}
	
@JsonProperty("billStatus") 	public void setBillStatus(final String billStatus)
	{
		this.billStatus = billStatus;
	}

@JsonProperty("billStatus") 	public String getBillStatus() 
	{
		return billStatus;
	}
	
@JsonProperty("payment") 	public void setPayment(final Payment payment)
	{
		this.payment = payment;
	}

@JsonProperty("payment") 	public Payment getPayment() 
	{
		return payment;
	}
	
@JsonProperty("id") 	public void setId(final String id)
	{
		this.id = id;
	}

@JsonProperty("id") 	public String getId() 
	{
		return id;
	}
	
@JsonProperty("taxAmount") 	public void setTaxAmount(final TaxAmount taxAmount)
	{
		this.taxAmount = taxAmount;
	}

@JsonProperty("taxAmount") 	public TaxAmount getTaxAmount() 
	{
		return taxAmount;
	}
	
@JsonProperty("customer") 	public void setCustomer(final Customer customer)
	{
		this.customer = customer;
	}

@JsonProperty("customer") 	public Customer getCustomer() 
	{
		return customer;
	}
	

}