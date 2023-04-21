/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcpqquoteintegration.model;

import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteCommentModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;

/**
 * Generated model class for type SAPCPQOutboundQuoteStatus first defined at extension sapcpqquoteintegration.
 */
@SuppressWarnings("all")
public class SAPCPQOutboundQuoteStatusModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCPQOutboundQuoteStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String QUOTEID = "quoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.externalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EXTERNALQUOTEID = "externalQuoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.orderId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.status</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String STATUS = "status";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.headerComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String HEADERCOMMENTS = "headerComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.itemComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ITEMCOMMENTS = "itemComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.responseStatus</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String RESPONSESTATUS = "responseStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.responseMessage</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String RESPONSEMESSAGE = "responseMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.action</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ACTION = "action";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteStatus.cancellationComment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CANCELLATIONCOMMENT = "cancellationComment";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCPQOutboundQuoteStatusModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCPQOutboundQuoteStatusModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPQOutboundQuoteStatusModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.action</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the action
	 */
	@Accessor(qualifier = "action", type = Accessor.Type.GETTER)
	public String getAction()
	{
		return getPersistenceContext().getPropertyValue(ACTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.cancellationComment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cancellationComment
	 */
	@Accessor(qualifier = "cancellationComment", type = Accessor.Type.GETTER)
	public List<SAPCPQOutboundQuoteCommentModel> getCancellationComment()
	{
		return getPersistenceContext().getPropertyValue(CANCELLATIONCOMMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.externalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the externalQuoteId
	 */
	@Accessor(qualifier = "externalQuoteId", type = Accessor.Type.GETTER)
	public String getExternalQuoteId()
	{
		return getPersistenceContext().getPropertyValue(EXTERNALQUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.headerComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the headerComments
	 */
	@Accessor(qualifier = "headerComments", type = Accessor.Type.GETTER)
	public List<SAPCPQOutboundQuoteCommentModel> getHeaderComments()
	{
		return getPersistenceContext().getPropertyValue(HEADERCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.itemComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the itemComments
	 */
	@Accessor(qualifier = "itemComments", type = Accessor.Type.GETTER)
	public List<SAPCPQOutboundQuoteCommentModel> getItemComments()
	{
		return getPersistenceContext().getPropertyValue(ITEMCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.orderId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.GETTER)
	public String getQuoteId()
	{
		return getPersistenceContext().getPropertyValue(QUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.responseMessage</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the responseMessage
	 */
	@Accessor(qualifier = "responseMessage", type = Accessor.Type.GETTER)
	public String getResponseMessage()
	{
		return getPersistenceContext().getPropertyValue(RESPONSEMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.responseStatus</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the responseStatus
	 */
	@Accessor(qualifier = "responseStatus", type = Accessor.Type.GETTER)
	public String getResponseStatus()
	{
		return getPersistenceContext().getPropertyValue(RESPONSESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteStatus.status</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the status
	 */
	@Accessor(qualifier = "status", type = Accessor.Type.GETTER)
	public String getStatus()
	{
		return getPersistenceContext().getPropertyValue(STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.action</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the action
	 */
	@Accessor(qualifier = "action", type = Accessor.Type.SETTER)
	public void setAction(final String value)
	{
		getPersistenceContext().setPropertyValue(ACTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.cancellationComment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cancellationComment
	 */
	@Accessor(qualifier = "cancellationComment", type = Accessor.Type.SETTER)
	public void setCancellationComment(final List<SAPCPQOutboundQuoteCommentModel> value)
	{
		getPersistenceContext().setPropertyValue(CANCELLATIONCOMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.externalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the externalQuoteId
	 */
	@Accessor(qualifier = "externalQuoteId", type = Accessor.Type.SETTER)
	public void setExternalQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALQUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.headerComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the headerComments
	 */
	@Accessor(qualifier = "headerComments", type = Accessor.Type.SETTER)
	public void setHeaderComments(final List<SAPCPQOutboundQuoteCommentModel> value)
	{
		getPersistenceContext().setPropertyValue(HEADERCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.itemComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the itemComments
	 */
	@Accessor(qualifier = "itemComments", type = Accessor.Type.SETTER)
	public void setItemComments(final List<SAPCPQOutboundQuoteCommentModel> value)
	{
		getPersistenceContext().setPropertyValue(ITEMCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.orderId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.SETTER)
	public void setQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(QUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.responseMessage</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the responseMessage
	 */
	@Accessor(qualifier = "responseMessage", type = Accessor.Type.SETTER)
	public void setResponseMessage(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSEMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.responseStatus</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the responseStatus
	 */
	@Accessor(qualifier = "responseStatus", type = Accessor.Type.SETTER)
	public void setResponseStatus(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSESTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteStatus.status</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the status
	 */
	@Accessor(qualifier = "status", type = Accessor.Type.SETTER)
	public void setStatus(final String value)
	{
		getPersistenceContext().setPropertyValue(STATUS, value);
	}
	
}
