/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationsearch.data;

import de.hybris.platform.personalizationservices.data.CxAbstractActionResult;


import java.util.Objects;
public  class CxSearchProfileActionResult extends CxAbstractActionResult 

{



	/** <i>Generated property</i> for <code>CxSearchProfileActionResult.searchProfileCode</code> property defined at extension <code>personalizationsearch</code>. */
	
	private String searchProfileCode;

	/** <i>Generated property</i> for <code>CxSearchProfileActionResult.searchProfileCatalog</code> property defined at extension <code>personalizationsearch</code>. */
	
	private String searchProfileCatalog;
	
	public CxSearchProfileActionResult()
	{
		// default constructor
	}
	
	public void setSearchProfileCode(final String searchProfileCode)
	{
		this.searchProfileCode = searchProfileCode;
	}

	public String getSearchProfileCode() 
	{
		return searchProfileCode;
	}
	
	public void setSearchProfileCatalog(final String searchProfileCatalog)
	{
		this.searchProfileCatalog = searchProfileCatalog;
	}

	public String getSearchProfileCatalog() 
	{
		return searchProfileCatalog;
	}
	

}