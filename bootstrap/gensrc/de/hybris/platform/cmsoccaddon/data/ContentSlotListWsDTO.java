/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsoccaddon.data;

import java.io.Serializable;
import de.hybris.platform.cmsoccaddon.data.ContentSlotWsDTO;
import java.util.List;


import java.util.Objects;
public  class ContentSlotListWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ContentSlotListWsDTO.contentSlot</code> property defined at extension <code>cmsoccaddon</code>. */
	
	private List<ContentSlotWsDTO> contentSlot;
	
	public ContentSlotListWsDTO()
	{
		// default constructor
	}
	
	public void setContentSlot(final List<ContentSlotWsDTO> contentSlot)
	{
		this.contentSlot = contentSlot;
	}

	public List<ContentSlotWsDTO> getContentSlot() 
	{
		return contentSlot;
	}
	

}