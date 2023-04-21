/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:18 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.data;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.data.AspectData;


import java.util.Objects;
public  class Price  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Price.aspectData</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private AspectData aspectData;
	
	public Price()
	{
		// default constructor
	}
	
	public void setAspectData(final AspectData aspectData)
	{
		this.aspectData = aspectData;
	}

	public AspectData getAspectData() 
	{
		return aspectData;
	}
	

}