/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.c4his.b2c.core.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ZFM_GETPDFResponse first defined at extension c4hisb2ccore.
 */
@SuppressWarnings("all")
public class ZFM_GETPDFResponseModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ZFM_GETPDFResponse";
	
	/** <i>Generated constant</i> - Attribute key of <code>ZFM_GETPDFResponse.responseMessagePdf</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String RESPONSEMESSAGEPDF = "responseMessagePdf";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ZFM_GETPDFResponseModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ZFM_GETPDFResponseModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ZFM_GETPDFResponseModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ZFM_GETPDFResponse.responseMessagePdf</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the responseMessagePdf
	 */
	@Accessor(qualifier = "responseMessagePdf", type = Accessor.Type.GETTER)
	public String getResponseMessagePdf()
	{
		return getPersistenceContext().getPropertyValue(RESPONSEMESSAGEPDF);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ZFM_GETPDFResponse.responseMessagePdf</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the responseMessagePdf
	 */
	@Accessor(qualifier = "responseMessagePdf", type = Accessor.Type.SETTER)
	public void setResponseMessagePdf(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSEMESSAGEPDF, value);
	}
	
}
