/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.returnsexchange.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.basecommerce.enums.RefundReason;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.core.configuration.model.SAPConfigurationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SapReturnOrderReason first defined at extension sapreturnsexchange.
 */
@SuppressWarnings("all")
public class SapReturnOrderReasonModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SapReturnOrderReason";
	
	/**<i>Generated relation code constant for relation <code>SAPConfigReturnReasonRelation</code> defining source attribute <code>sapConfiguration</code> in extension <code>sapreturnsexchange</code>.</i>*/
	public static final String _SAPCONFIGRETURNREASONRELATION = "SAPConfigReturnReasonRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapReturnOrderReason.sapConfiguration</code> attribute defined at extension <code>sapreturnsexchange</code>. */
	public static final String SAPCONFIGURATION = "sapConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapReturnOrderReason.refundReason</code> attribute defined at extension <code>sapreturnsexchange</code>. */
	public static final String REFUNDREASON = "refundReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>SapReturnOrderReason.sapReturnReasonCode</code> attribute defined at extension <code>sapreturnsexchange</code>. */
	public static final String SAPRETURNREASONCODE = "sapReturnReasonCode";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SapReturnOrderReasonModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SapReturnOrderReasonModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sapConfiguration initial attribute declared by type <code>SapReturnOrderReason</code> at extension <code>sapreturnsexchange</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SapReturnOrderReasonModel(final ItemModel _owner, final SAPConfigurationModel _sapConfiguration)
	{
		super();
		setOwner(_owner);
		setSapConfiguration(_sapConfiguration);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapReturnOrderReason.refundReason</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 * @return the refundReason
	 */
	@Accessor(qualifier = "refundReason", type = Accessor.Type.GETTER)
	public RefundReason getRefundReason()
	{
		return getPersistenceContext().getPropertyValue(REFUNDREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapReturnOrderReason.sapConfiguration</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 * @return the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.GETTER)
	public SAPConfigurationModel getSapConfiguration()
	{
		return getPersistenceContext().getPropertyValue(SAPCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SapReturnOrderReason.sapReturnReasonCode</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 * @return the sapReturnReasonCode
	 */
	@Accessor(qualifier = "sapReturnReasonCode", type = Accessor.Type.GETTER)
	public String getSapReturnReasonCode()
	{
		return getPersistenceContext().getPropertyValue(SAPRETURNREASONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapReturnOrderReason.refundReason</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 *  
	 * @param value the refundReason
	 */
	@Accessor(qualifier = "refundReason", type = Accessor.Type.SETTER)
	public void setRefundReason(final RefundReason value)
	{
		getPersistenceContext().setPropertyValue(REFUNDREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SapReturnOrderReason.sapConfiguration</code> attribute defined at extension <code>sapreturnsexchange</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the sapConfiguration
	 */
	@Accessor(qualifier = "sapConfiguration", type = Accessor.Type.SETTER)
	public void setSapConfiguration(final SAPConfigurationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SapReturnOrderReason.sapReturnReasonCode</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 *  
	 * @param value the sapReturnReasonCode
	 */
	@Accessor(qualifier = "sapReturnReasonCode", type = Accessor.Type.SETTER)
	public void setSapReturnReasonCode(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPRETURNREASONCODE, value);
	}
	
}
