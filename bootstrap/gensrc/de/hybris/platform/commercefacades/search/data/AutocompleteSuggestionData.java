/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.search.data;

import java.io.Serializable;


import java.util.Objects;
public  class AutocompleteSuggestionData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AutocompleteSuggestionData.term</code> property defined at extension <code>commercefacades</code>. */
	
	private String term;
	
	public AutocompleteSuggestionData()
	{
		// default constructor
	}
	
	public void setTerm(final String term)
	{
		this.term = term;
	}

	public String getTerm() 
	{
		return term;
	}
	

}