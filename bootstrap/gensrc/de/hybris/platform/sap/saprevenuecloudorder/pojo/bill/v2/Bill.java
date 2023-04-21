/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class Bill  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Bill.id</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>Bill.documentNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer documentNumber;

	/** <i>Generated property</i> for <code>Bill.metaData</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Metadata metaData;

	/** <i>Generated property</i> for <code>Bill.billingType</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billingType;

	/** <i>Generated property</i> for <code>Bill.market</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Market market;

	/** <i>Generated property</i> for <code>Bill.billingDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date billingDate;

	/** <i>Generated property</i> for <code>Bill.billStatus</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String billStatus;

	/** <i>Generated property</i> for <code>Bill.closing</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Closing closing;

	/** <i>Generated property</i> for <code>Bill.transferStatus</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String transferStatus;

	/** <i>Generated property</i> for <code>Bill.splitElement</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String splitElement;

	/** <i>Generated property</i> for <code>Bill.createInvoice</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean createInvoice;

	/** <i>Generated property</i> for <code>Bill.customer</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Customer customer;

	/** <i>Generated property</i> for <code>Bill.payment</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Payment payment;

	/** <i>Generated property</i> for <code>Bill.netAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netAmount;

	/** <i>Generated property</i> for <code>Bill.grossAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossAmount;

	/** <i>Generated property</i> for <code>Bill.netCreditAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount netCreditAmount;

	/** <i>Generated property</i> for <code>Bill.grossCreditAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount grossCreditAmount;

	/** <i>Generated property</i> for <code>Bill.taxAmount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private MonetaryAmount taxAmount;

	/** <i>Generated property</i> for <code>Bill.customReferences</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<CustomReference> customReferences;

	/** <i>Generated property</i> for <code>Bill.billItems</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<BillItem> billItems;
	
	public Bill()
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
	
	public void setDocumentNumber(final Integer documentNumber)
	{
		this.documentNumber = documentNumber;
	}

	public Integer getDocumentNumber() 
	{
		return documentNumber;
	}
	
	public void setMetaData(final Metadata metaData)
	{
		this.metaData = metaData;
	}

	public Metadata getMetaData() 
	{
		return metaData;
	}
	
	public void setBillingType(final String billingType)
	{
		this.billingType = billingType;
	}

	public String getBillingType() 
	{
		return billingType;
	}
	
	public void setMarket(final Market market)
	{
		this.market = market;
	}

	public Market getMarket() 
	{
		return market;
	}
	
	public void setBillingDate(final Date billingDate)
	{
		this.billingDate = billingDate;
	}

	public Date getBillingDate() 
	{
		return billingDate;
	}
	
	public void setBillStatus(final String billStatus)
	{
		this.billStatus = billStatus;
	}

	public String getBillStatus() 
	{
		return billStatus;
	}
	
	public void setClosing(final Closing closing)
	{
		this.closing = closing;
	}

	public Closing getClosing() 
	{
		return closing;
	}
	
	public void setTransferStatus(final String transferStatus)
	{
		this.transferStatus = transferStatus;
	}

	public String getTransferStatus() 
	{
		return transferStatus;
	}
	
	public void setSplitElement(final String splitElement)
	{
		this.splitElement = splitElement;
	}

	public String getSplitElement() 
	{
		return splitElement;
	}
	
	public void setCreateInvoice(final Boolean createInvoice)
	{
		this.createInvoice = createInvoice;
	}

	public Boolean getCreateInvoice() 
	{
		return createInvoice;
	}
	
	public void setCustomer(final Customer customer)
	{
		this.customer = customer;
	}

	public Customer getCustomer() 
	{
		return customer;
	}
	
	public void setPayment(final Payment payment)
	{
		this.payment = payment;
	}

	public Payment getPayment() 
	{
		return payment;
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
	
	public void setCustomReferences(final List<CustomReference> customReferences)
	{
		this.customReferences = customReferences;
	}

	public List<CustomReference> getCustomReferences() 
	{
		return customReferences;
	}
	
	public void setBillItems(final List<BillItem> billItems)
	{
		this.billItems = billItems;
	}

	public List<BillItem> getBillItems() 
	{
		return billItems;
	}
	

}