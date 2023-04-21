/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.Objects;
@XmlRootElement(name="sapCpiPartnerRole")
public  class SapCpiPartnerRole  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiPartnerRole.orderId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String orderId;

	/** <i>Generated property</i> for <code>SapCpiPartnerRole.partnerRoleCode</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String partnerRoleCode;

	/** <i>Generated property</i> for <code>SapCpiPartnerRole.partnerId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String partnerId;

	/** <i>Generated property</i> for <code>SapCpiPartnerRole.documentAddressId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String documentAddressId;

	/** <i>Generated property</i> for <code>SapCpiPartnerRole.entryNumber</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String entryNumber;
	
	public SapCpiPartnerRole()
	{
		// default constructor
	}
	
	public void setOrderId(final String orderId)
	{
		this.orderId = orderId;
	}

	public String getOrderId() 
	{
		return orderId;
	}
	
	public void setPartnerRoleCode(final String partnerRoleCode)
	{
		this.partnerRoleCode = partnerRoleCode;
	}

	public String getPartnerRoleCode() 
	{
		return partnerRoleCode;
	}
	
	public void setPartnerId(final String partnerId)
	{
		this.partnerId = partnerId;
	}

	public String getPartnerId() 
	{
		return partnerId;
	}
	
	public void setDocumentAddressId(final String documentAddressId)
	{
		this.documentAddressId = documentAddressId;
	}

	public String getDocumentAddressId() 
	{
		return documentAddressId;
	}
	
	public void setEntryNumber(final String entryNumber)
	{
		this.entryNumber = entryNumber;
	}

	public String getEntryNumber() 
	{
		return entryNumber;
	}
	

}