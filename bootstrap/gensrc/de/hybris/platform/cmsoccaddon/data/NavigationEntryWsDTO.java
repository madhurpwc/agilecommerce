/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsoccaddon.data;

import java.io.Serializable;


import java.util.Objects;
public  class NavigationEntryWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NavigationEntryWsDTO.itemId</code> property defined at extension <code>cmsoccaddon</code>. */
	
	private String itemId;

	/** <i>Generated property</i> for <code>NavigationEntryWsDTO.itemType</code> property defined at extension <code>cmsoccaddon</code>. */
	
	private String itemType;

	/** <i>Generated property</i> for <code>NavigationEntryWsDTO.itemSuperType</code> property defined at extension <code>cmsoccaddon</code>. */
	
	private String itemSuperType;
	
	public NavigationEntryWsDTO()
	{
		// default constructor
	}
	
	public void setItemId(final String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemId() 
	{
		return itemId;
	}
	
	public void setItemType(final String itemType)
	{
		this.itemType = itemType;
	}

	public String getItemType() 
	{
		return itemType;
	}
	
	public void setItemSuperType(final String itemSuperType)
	{
		this.itemSuperType = itemSuperType;
	}

	public String getItemSuperType() 
	{
		return itemSuperType;
	}
	

}