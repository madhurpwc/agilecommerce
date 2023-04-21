/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.c4his.b2c.core.model;

import com.c4his.b2c.core.model.ZFM_GETPDFResponseModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ZFM_GETPDF first defined at extension c4hisb2ccore.
 */
@SuppressWarnings("all")
public class ZFM_GETPDFModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ZFM_GETPDF";
	
	/** <i>Generated constant</i> - Attribute key of <code>ZFM_GETPDF.iv_vbeln</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String IV_VBELN = "iv_vbeln";
	
	/** <i>Generated constant</i> - Attribute key of <code>ZFM_GETPDF.responseMessagePdf</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String RESPONSEMESSAGEPDF = "responseMessagePdf";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ZFM_GETPDFModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ZFM_GETPDFModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ZFM_GETPDFModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ZFM_GETPDF.iv_vbeln</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the iv_vbeln
	 */
	@Accessor(qualifier = "iv_vbeln", type = Accessor.Type.GETTER)
	public String getIv_vbeln()
	{
		return getPersistenceContext().getPropertyValue(IV_VBELN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ZFM_GETPDF.responseMessagePdf</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the responseMessagePdf
	 */
	@Accessor(qualifier = "responseMessagePdf", type = Accessor.Type.GETTER)
	public ZFM_GETPDFResponseModel getResponseMessagePdf()
	{
		return getPersistenceContext().getPropertyValue(RESPONSEMESSAGEPDF);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ZFM_GETPDF.iv_vbeln</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the iv_vbeln
	 */
	@Accessor(qualifier = "iv_vbeln", type = Accessor.Type.SETTER)
	public void setIv_vbeln(final String value)
	{
		getPersistenceContext().setPropertyValue(IV_VBELN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ZFM_GETPDF.responseMessagePdf</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the responseMessagePdf
	 */
	@Accessor(qualifier = "responseMessagePdf", type = Accessor.Type.SETTER)
	public void setResponseMessagePdf(final ZFM_GETPDFResponseModel value)
	{
		getPersistenceContext().setPropertyValue(RESPONSEMESSAGEPDF, value);
	}
	
}
