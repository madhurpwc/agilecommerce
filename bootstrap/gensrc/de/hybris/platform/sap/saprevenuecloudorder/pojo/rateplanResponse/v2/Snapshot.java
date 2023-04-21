/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:12 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2;

import java.io.Serializable;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.AllUnitVolumeRate;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.BlockRate;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.FixedRate;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.PercentageRate;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.SetupFee;
import de.hybris.platform.sap.saprevenuecloudorder.pojo.rateplanResponse.v2.TierRate;
import java.util.List;


import java.util.Objects;
public  class Snapshot  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Snapshot.effectiveAt</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String effectiveAt;

	/** <i>Generated property</i> for <code>Snapshot.setupFees</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<SetupFee> setupFees;

	/** <i>Generated property</i> for <code>Snapshot.fixedRates</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<FixedRate> fixedRates;

	/** <i>Generated property</i> for <code>Snapshot.blockRates</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<BlockRate> blockRates;

	/** <i>Generated property</i> for <code>Snapshot.allUnitVolumeRates</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<AllUnitVolumeRate> allUnitVolumeRates;

	/** <i>Generated property</i> for <code>Snapshot.tierRates</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<TierRate> tierRates;

	/** <i>Generated property</i> for <code>Snapshot.percentageRates</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private List<PercentageRate> percentageRates;
	
	public Snapshot()
	{
		// default constructor
	}
	
	public void setEffectiveAt(final String effectiveAt)
	{
		this.effectiveAt = effectiveAt;
	}

	public String getEffectiveAt() 
	{
		return effectiveAt;
	}
	
	public void setSetupFees(final List<SetupFee> setupFees)
	{
		this.setupFees = setupFees;
	}

	public List<SetupFee> getSetupFees() 
	{
		return setupFees;
	}
	
	public void setFixedRates(final List<FixedRate> fixedRates)
	{
		this.fixedRates = fixedRates;
	}

	public List<FixedRate> getFixedRates() 
	{
		return fixedRates;
	}
	
	public void setBlockRates(final List<BlockRate> blockRates)
	{
		this.blockRates = blockRates;
	}

	public List<BlockRate> getBlockRates() 
	{
		return blockRates;
	}
	
	public void setAllUnitVolumeRates(final List<AllUnitVolumeRate> allUnitVolumeRates)
	{
		this.allUnitVolumeRates = allUnitVolumeRates;
	}

	public List<AllUnitVolumeRate> getAllUnitVolumeRates() 
	{
		return allUnitVolumeRates;
	}
	
	public void setTierRates(final List<TierRate> tierRates)
	{
		this.tierRates = tierRates;
	}

	public List<TierRate> getTierRates() 
	{
		return tierRates;
	}
	
	public void setPercentageRates(final List<PercentageRate> percentageRates)
	{
		this.percentageRates = percentageRates;
	}

	public List<PercentageRate> getPercentageRates() 
	{
		return percentageRates;
	}
	

}