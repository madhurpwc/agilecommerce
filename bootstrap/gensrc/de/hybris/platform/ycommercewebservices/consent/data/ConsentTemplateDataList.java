/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.consent.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.consent.data.ConsentTemplateData;
import java.util.List;


import java.util.Objects;
public  class ConsentTemplateDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConsentTemplateDataList.consentTemplates</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<ConsentTemplateData> consentTemplates;
	
	public ConsentTemplateDataList()
	{
		// default constructor
	}
	
	public void setConsentTemplates(final List<ConsentTemplateData> consentTemplates)
	{
		this.consentTemplates = consentTemplates;
	}

	public List<ConsentTemplateData> getConsentTemplates() 
	{
		return consentTemplates;
	}
	

}