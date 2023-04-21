/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.data;

import java.io.Serializable;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiConfig;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiOrderCancellationItem;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.Objects;
@XmlRootElement(name="sapCpiOrderCancellation")
public  class SapCpiOrderCancellation  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellation.sapCpiConfig</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private SapCpiConfig sapCpiConfig;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellation.orderId</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String orderId;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellation.rejectionReason</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String rejectionReason;

	/** <i>Generated property</i> for <code>SapCpiOrderCancellation.sapCpiOrderCancellationItems</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private List<SapCpiOrderCancellationItem> sapCpiOrderCancellationItems;
	
	public SapCpiOrderCancellation()
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
	
	public void setRejectionReason(final String rejectionReason)
	{
		this.rejectionReason = rejectionReason;
	}

	public String getRejectionReason() 
	{
		return rejectionReason;
	}
	
	public void setSapCpiOrderCancellationItems(final List<SapCpiOrderCancellationItem> sapCpiOrderCancellationItems)
	{
		this.sapCpiOrderCancellationItems = sapCpiOrderCancellationItems;
	}

@XmlElement(name="sapCpiOrderCancellationItems") 	public List<SapCpiOrderCancellationItem> getSapCpiOrderCancellationItems() 
	{
		return sapCpiOrderCancellationItems;
	}
	

}