/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:11 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.returns.data;

import java.io.Serializable;
import de.hybris.platform.commerceservices.search.pagedata.PaginationData;
import de.hybris.platform.commerceservices.search.pagedata.SortData;
import de.hybris.platform.ordermanagementfacades.returns.data.ReturnRequestData;
import java.util.List;


import java.util.Objects;
public  class ReturnRequestsData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ReturnRequestsData.returnRequests</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<ReturnRequestData> returnRequests;

	/** <i>Generated property</i> for <code>ReturnRequestsData.sorts</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<SortData> sorts;

	/** <i>Generated property</i> for <code>ReturnRequestsData.pagination</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private PaginationData pagination;
	
	public ReturnRequestsData()
	{
		// default constructor
	}
	
	public void setReturnRequests(final List<ReturnRequestData> returnRequests)
	{
		this.returnRequests = returnRequests;
	}

	public List<ReturnRequestData> getReturnRequests() 
	{
		return returnRequests;
	}
	
	public void setSorts(final List<SortData> sorts)
	{
		this.sorts = sorts;
	}

	public List<SortData> getSorts() 
	{
		return sorts;
	}
	
	public void setPagination(final PaginationData pagination)
	{
		this.pagination = pagination;
	}

	public PaginationData getPagination() 
	{
		return pagination;
	}
	

}