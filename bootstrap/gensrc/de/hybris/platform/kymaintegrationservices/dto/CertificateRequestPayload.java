/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.kymaintegrationservices.dto;

import java.io.Serializable;


import java.util.Objects;
public  class CertificateRequestPayload  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CertificateRequestPayload.csr</code> property defined at extension <code>kymaintegrationservices</code>. */
	
	private String csr;
	
	public CertificateRequestPayload()
	{
		// default constructor
	}
	
	public void setCsr(final String csr)
	{
		this.csr = csr;
	}

	public String getCsr() 
	{
		return csr;
	}
	

}