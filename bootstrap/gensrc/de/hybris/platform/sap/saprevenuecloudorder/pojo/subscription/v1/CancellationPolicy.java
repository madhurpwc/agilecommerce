/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.subscription.v1;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class CancellationPolicy  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CancellationPolicy.allowMidBillCycleExpiration</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Boolean allowMidBillCycleExpiration;

	/** <i>Generated property</i> for <code>CancellationPolicy.termOfNotice</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer termOfNotice;

	/** <i>Generated property</i> for <code>CancellationPolicy.withdrawalPeriod</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Integer withdrawalPeriod;

	/** <i>Generated property</i> for <code>CancellationPolicy.withdrawalPeriodEndDate</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private Date withdrawalPeriodEndDate;
	
	public CancellationPolicy()
	{
		// default constructor
	}
	
	public void setAllowMidBillCycleExpiration(final Boolean allowMidBillCycleExpiration)
	{
		this.allowMidBillCycleExpiration = allowMidBillCycleExpiration;
	}

	public Boolean getAllowMidBillCycleExpiration() 
	{
		return allowMidBillCycleExpiration;
	}
	
	public void setTermOfNotice(final Integer termOfNotice)
	{
		this.termOfNotice = termOfNotice;
	}

	public Integer getTermOfNotice() 
	{
		return termOfNotice;
	}
	
	public void setWithdrawalPeriod(final Integer withdrawalPeriod)
	{
		this.withdrawalPeriod = withdrawalPeriod;
	}

	public Integer getWithdrawalPeriod() 
	{
		return withdrawalPeriod;
	}
	
	public void setWithdrawalPeriodEndDate(final Date withdrawalPeriodEndDate)
	{
		this.withdrawalPeriodEndDate = withdrawalPeriodEndDate;
	}

	public Date getWithdrawalPeriodEndDate() 
	{
		return withdrawalPeriodEndDate;
	}
	

}