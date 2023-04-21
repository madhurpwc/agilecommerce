/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:18 AM
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
@XmlRootElement(name="sapCpiTargetSystem")
public  class SapCpiTargetSystem  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.url</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String url;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.username</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String username;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.senderName</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String senderName;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.senderPort</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String senderPort;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.receiverName</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String receiverName;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.receiverPort</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String receiverPort;

	/** <i>Generated property</i> for <code>SapCpiTargetSystem.client</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private String client;
	
	public SapCpiTargetSystem()
	{
		// default constructor
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setUsername(final String username)
	{
		this.username = username;
	}

	public String getUsername() 
	{
		return username;
	}
	
	public void setSenderName(final String senderName)
	{
		this.senderName = senderName;
	}

	public String getSenderName() 
	{
		return senderName;
	}
	
	public void setSenderPort(final String senderPort)
	{
		this.senderPort = senderPort;
	}

	public String getSenderPort() 
	{
		return senderPort;
	}
	
	public void setReceiverName(final String receiverName)
	{
		this.receiverName = receiverName;
	}

	public String getReceiverName() 
	{
		return receiverName;
	}
	
	public void setReceiverPort(final String receiverPort)
	{
		this.receiverPort = receiverPort;
	}

	public String getReceiverPort() 
	{
		return receiverPort;
	}
	
	public void setClient(final String client)
	{
		this.client = client;
	}

	public String getClient() 
	{
		return client;
	}
	

}