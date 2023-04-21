/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.product.ReferenceWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.Objects;
/**
 * Representation of a Product Reference
 */
@ApiModel(value="ProductReference", description="Representation of a Product Reference")
public  class ProductReferenceWsDTO extends ReferenceWsDTO 

{



	/** Flag stating if product reference is preselected<br/><br/><i>Generated property</i> for <code>ProductReferenceWsDTO.preselected</code> property defined at extension <code>commercewebservicescommons</code>. */
@ApiModelProperty(name="preselected", value="Flag stating if product reference is preselected") 	
	private Boolean preselected;
	
	public ProductReferenceWsDTO()
	{
		// default constructor
	}
	
	public void setPreselected(final Boolean preselected)
	{
		this.preselected = preselected;
	}

	public Boolean getPreselected() 
	{
		return preselected;
	}
	

}