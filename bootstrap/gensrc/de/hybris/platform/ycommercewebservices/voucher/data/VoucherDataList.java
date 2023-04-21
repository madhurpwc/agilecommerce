/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:17 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ycommercewebservices.voucher.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.voucher.data.VoucherData;
import java.util.List;


import java.util.Objects;
public  class VoucherDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>VoucherDataList.vouchers</code> property defined at extension <code>ycommercewebservices</code>. */
	
	private List<VoucherData> vouchers;
	
	public VoucherDataList()
	{
		// default constructor
	}
	
	public void setVouchers(final List<VoucherData> vouchers)
	{
		this.vouchers = vouchers;
	}

	public List<VoucherData> getVouchers() 
	{
		return vouchers;
	}
	

}