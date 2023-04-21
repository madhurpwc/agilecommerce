/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcpqquoteintegration.model;

import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteCommentModel;
import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type SAPCPQOutboundQuoteItem first defined at extension sapcpqquoteintegration.
 */
@SuppressWarnings("all")
public class SAPCPQOutboundQuoteItemModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCPQOutboundQuoteItem";
	
	/**<i>Generated relation code constant for relation <code>SAPCPQOutboundQuote2SAPCPQOutboundQuoteItem</code> defining source attribute <code>sapCPQOutboundQuote</code> in extension <code>sapcpqquoteintegration</code>.</i>*/
	public static final String _SAPCPQOUTBOUNDQUOTE2SAPCPQOUTBOUNDQUOTEITEM = "SAPCPQOutboundQuote2SAPCPQOutboundQuoteItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String QUOTEID = "quoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.productCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRODUCTCODE = "productCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.quantity</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.itemNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ITEMNUMBER = "itemNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.price</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRICE = "price";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.partNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PARTNUMBER = "partNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.configurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CONFIGURATIONID = "configurationId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.productSystemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRODUCTSYSTEMID = "productSystemId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.externalItemID</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EXTERNALITEMID = "externalItemID";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.externalConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EXTERNALCONFIGURATIONID = "externalConfigurationId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTE = "sapCPQOutboundQuote";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteItem.sapCPQOutboundQuoteItemComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTEITEMCOMMENTS = "sapCPQOutboundQuoteItemComments";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCPQOutboundQuoteItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCPQOutboundQuoteItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPQOutboundQuoteItemModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.configurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the configurationId
	 */
	@Accessor(qualifier = "configurationId", type = Accessor.Type.GETTER)
	public String getConfigurationId()
	{
		return getPersistenceContext().getPropertyValue(CONFIGURATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.externalConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the externalConfigurationId
	 */
	@Accessor(qualifier = "externalConfigurationId", type = Accessor.Type.GETTER)
	public String getExternalConfigurationId()
	{
		return getPersistenceContext().getPropertyValue(EXTERNALCONFIGURATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.externalItemID</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the externalItemID
	 */
	@Accessor(qualifier = "externalItemID", type = Accessor.Type.GETTER)
	public String getExternalItemID()
	{
		return getPersistenceContext().getPropertyValue(EXTERNALITEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.itemNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the itemNumber
	 */
	@Accessor(qualifier = "itemNumber", type = Accessor.Type.GETTER)
	public Integer getItemNumber()
	{
		return getPersistenceContext().getPropertyValue(ITEMNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.partNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the partNumber
	 */
	@Accessor(qualifier = "partNumber", type = Accessor.Type.GETTER)
	public String getPartNumber()
	{
		return getPersistenceContext().getPropertyValue(PARTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.price</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the price
	 */
	@Accessor(qualifier = "price", type = Accessor.Type.GETTER)
	public String getPrice()
	{
		return getPersistenceContext().getPropertyValue(PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.productCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the productCode
	 */
	@Accessor(qualifier = "productCode", type = Accessor.Type.GETTER)
	public String getProductCode()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.productSystemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the productSystemId
	 */
	@Accessor(qualifier = "productSystemId", type = Accessor.Type.GETTER)
	public String getProductSystemId()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTSYSTEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.quantity</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.GETTER)
	public String getQuantity()
	{
		return getPersistenceContext().getPropertyValue(QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.GETTER)
	public String getQuoteId()
	{
		return getPersistenceContext().getPropertyValue(QUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the sapCPQOutboundQuote
	 */
	@Accessor(qualifier = "sapCPQOutboundQuote", type = Accessor.Type.GETTER)
	public SAPCPQOutboundQuoteModel getSapCPQOutboundQuote()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteItem.sapCPQOutboundQuoteItemComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCPQOutboundQuoteItemComments
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteItemComments", type = Accessor.Type.GETTER)
	public List<SAPCPQOutboundQuoteCommentModel> getSapCPQOutboundQuoteItemComments()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTEITEMCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.configurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the configurationId
	 */
	@Accessor(qualifier = "configurationId", type = Accessor.Type.SETTER)
	public void setConfigurationId(final String value)
	{
		getPersistenceContext().setPropertyValue(CONFIGURATIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.externalConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the externalConfigurationId
	 */
	@Accessor(qualifier = "externalConfigurationId", type = Accessor.Type.SETTER)
	public void setExternalConfigurationId(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALCONFIGURATIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.externalItemID</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the externalItemID
	 */
	@Accessor(qualifier = "externalItemID", type = Accessor.Type.SETTER)
	public void setExternalItemID(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALITEMID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.itemNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the itemNumber
	 */
	@Accessor(qualifier = "itemNumber", type = Accessor.Type.SETTER)
	public void setItemNumber(final Integer value)
	{
		getPersistenceContext().setPropertyValue(ITEMNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.partNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the partNumber
	 */
	@Accessor(qualifier = "partNumber", type = Accessor.Type.SETTER)
	public void setPartNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(PARTNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.price</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the price
	 */
	@Accessor(qualifier = "price", type = Accessor.Type.SETTER)
	public void setPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(PRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.productCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the productCode
	 */
	@Accessor(qualifier = "productCode", type = Accessor.Type.SETTER)
	public void setProductCode(final String value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.productSystemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the productSystemId
	 */
	@Accessor(qualifier = "productSystemId", type = Accessor.Type.SETTER)
	public void setProductSystemId(final String value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTSYSTEMID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.quantity</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.SETTER)
	public void setQuantity(final String value)
	{
		getPersistenceContext().setPropertyValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.SETTER)
	public void setQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(QUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuote
	 */
	@Accessor(qualifier = "sapCPQOutboundQuote", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuote(final SAPCPQOutboundQuoteModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteItem.sapCPQOutboundQuoteItemComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuoteItemComments
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteItemComments", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuoteItemComments(final List<SAPCPQOutboundQuoteCommentModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTEITEMCOMMENTS, value);
	}
	
}
