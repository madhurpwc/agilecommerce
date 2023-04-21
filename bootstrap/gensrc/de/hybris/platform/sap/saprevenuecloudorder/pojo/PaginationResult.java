/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo;

import java.io.Serializable;


import java.util.Objects;
public  class PaginationResult<T>  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaginationResult<T>.pageIndex</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer pageIndex;

	/** <i>Generated property</i> for <code>PaginationResult<T>.pageSize</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer pageSize;

	/** <i>Generated property</i> for <code>PaginationResult<T>.count</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer count;

	/** <i>Generated property</i> for <code>PaginationResult<T>.pageCount</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer pageCount;

	/** <i>Generated property</i> for <code>PaginationResult<T>.result</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private T result;
	
	public PaginationResult()
	{
		// default constructor
	}
	
	public void setPageIndex(final Integer pageIndex)
	{
		this.pageIndex = pageIndex;
	}

	public Integer getPageIndex() 
	{
		return pageIndex;
	}
	
	public void setPageSize(final Integer pageSize)
	{
		this.pageSize = pageSize;
	}

	public Integer getPageSize() 
	{
		return pageSize;
	}
	
	public void setCount(final Integer count)
	{
		this.count = count;
	}

	public Integer getCount() 
	{
		return count;
	}
	
	public void setPageCount(final Integer pageCount)
	{
		this.pageCount = pageCount;
	}

	public Integer getPageCount() 
	{
		return pageCount;
	}
	
	public void setResult(final T result)
	{
		this.result = result;
	}

	public T getResult() 
	{
		return result;
	}
	

}