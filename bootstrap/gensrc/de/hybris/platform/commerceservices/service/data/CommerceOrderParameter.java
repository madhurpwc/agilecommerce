/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.service.data;

import java.io.Serializable;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import java.util.List;


import java.util.Objects;
public  class CommerceOrderParameter  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** the order<br/><br/><i>Generated property</i> for <code>CommerceOrderParameter.order</code> property defined at extension <code>commerceservices</code>. */
	
	private AbstractOrderModel order;

	/** <i>Generated property</i> for <code>CommerceOrderParameter.additionalValues</code> property defined at extension <code>commerceservices</code>. */
	
	private List<String> additionalValues;
	
	public CommerceOrderParameter()
	{
		// default constructor
	}
	
	public void setOrder(final AbstractOrderModel order)
	{
		this.order = order;
	}

	public AbstractOrderModel getOrder() 
	{
		return order;
	}
	
	public void setAdditionalValues(final List<String> additionalValues)
	{
		this.additionalValues = additionalValues;
	}

	public List<String> getAdditionalValues() 
	{
		return additionalValues;
	}
	

}