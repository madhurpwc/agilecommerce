/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.personalizationsearchweb.data;

import java.io.Serializable;
import java.util.Set;


import java.util.Objects;
public  class CxSearchIndexTypeIdListWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CxSearchIndexTypeIdListWsDTO.indexTypeIds</code> property defined at extension <code>personalizationsearchweb</code>. */
	
	private Set<String> indexTypeIds;
	
	public CxSearchIndexTypeIdListWsDTO()
	{
		// default constructor
	}
	
	public void setIndexTypeIds(final Set<String> indexTypeIds)
	{
		this.indexTypeIds = indexTypeIds;
	}

	public Set<String> getIndexTypeIds() 
	{
		return indexTypeIds;
	}
	

}