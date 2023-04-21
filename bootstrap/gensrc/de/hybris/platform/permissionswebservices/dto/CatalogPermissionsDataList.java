/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.permissionswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.permissionsfacades.data.CatalogPermissionsData;
import java.util.List;


import java.util.Objects;
public  class CatalogPermissionsDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogPermissionsDataList.permissionsList</code> property defined at extension <code>permissionswebservices</code>. */
	
	private List<CatalogPermissionsData> permissionsList;
	
	public CatalogPermissionsDataList()
	{
		// default constructor
	}
	
	public void setPermissionsList(final List<CatalogPermissionsData> permissionsList)
	{
		this.permissionsList = permissionsList;
	}

	public List<CatalogPermissionsData> getPermissionsList() 
	{
		return permissionsList;
	}
	

}