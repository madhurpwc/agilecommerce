/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.saprevenuecloudproduct.model;

import com.sap.hybris.saprevenuecloudproduct.enums.SapRevenueCloudReplicationModeEnum;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type SapRevenueCloudProductCronjob first defined at extension saprevenuecloudproduct.
 */
@SuppressWarnings("all")
public class SapRevenueCloudProductCronjobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SapRevenueCloudProductCronjob";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapRevenueCloudProductCronjob.replicationMode</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String REPLICATIONMODE = "replicationMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapRevenueCloudProductCronjob.replicationTime</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String REPLICATIONTIME = "replicationTime";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SapRevenueCloudProductCronjobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SapRevenueCloudProductCronjobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SapRevenueCloudProductCronjobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SapRevenueCloudProductCronjobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapRevenueCloudProductCronjob.replicationMode</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the replicationMode - Sap Revenue Cloud replication mode enum
	 */
	@Accessor(qualifier = "replicationMode", type = Accessor.Type.GETTER)
	public SapRevenueCloudReplicationModeEnum getReplicationMode()
	{
		return getPersistenceContext().getPropertyValue(REPLICATIONMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapRevenueCloudProductCronjob.replicationTime</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the replicationTime - Sap Revenue Cloud replication time
	 */
	@Accessor(qualifier = "replicationTime", type = Accessor.Type.GETTER)
	public Date getReplicationTime()
	{
		return getPersistenceContext().getPropertyValue(REPLICATIONTIME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapRevenueCloudProductCronjob.replicationMode</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the replicationMode - Sap Revenue Cloud replication mode enum
	 */
	@Accessor(qualifier = "replicationMode", type = Accessor.Type.SETTER)
	public void setReplicationMode(final SapRevenueCloudReplicationModeEnum value)
	{
		getPersistenceContext().setPropertyValue(REPLICATIONMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapRevenueCloudProductCronjob.replicationTime</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the replicationTime - Sap Revenue Cloud replication time
	 */
	@Accessor(qualifier = "replicationTime", type = Accessor.Type.SETTER)
	public void setReplicationTime(final Date value)
	{
		getPersistenceContext().setPropertyValue(REPLICATIONTIME, value);
	}
	
}
