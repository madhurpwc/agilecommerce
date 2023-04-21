/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:08 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.permissionswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.permissionswebservices.dto.CatalogPermissionsWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


import java.util.Objects;
/**
 * Catalog permissions list
 */
@ApiModel(value="CatalogPermissionsList", description="Catalog permissions list")
public  class CatalogPermissionsListWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogPermissionsListWsDTO.permissionsList</code> property defined at extension <code>permissionswebservices</code>. */
@ApiModelProperty(name="permissionsList") 	
	private List<CatalogPermissionsWsDTO> permissionsList;
	
	public CatalogPermissionsListWsDTO()
	{
		// default constructor
	}
	
	public void setPermissionsList(final List<CatalogPermissionsWsDTO> permissionsList)
	{
		this.permissionsList = permissionsList;
	}

	public List<CatalogPermissionsWsDTO> getPermissionsList() 
	{
		return permissionsList;
	}
	

}