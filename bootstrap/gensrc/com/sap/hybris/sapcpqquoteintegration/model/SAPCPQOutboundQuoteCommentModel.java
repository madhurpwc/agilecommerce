/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcpqquoteintegration.model;

import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteItemModel;
import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCPQOutboundQuoteComment first defined at extension sapcpqquoteintegration.
 */
@SuppressWarnings("all")
public class SAPCPQOutboundQuoteCommentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCPQOutboundQuoteComment";
	
	/**<i>Generated relation code constant for relation <code>SAPCPQOutboundQuote2SAPCPQOutboundQuoteComment</code> defining source attribute <code>sapCPQOutboundQuote</code> in extension <code>sapcpqquoteintegration</code>.</i>*/
	public static final String _SAPCPQOUTBOUNDQUOTE2SAPCPQOUTBOUNDQUOTECOMMENT = "SAPCPQOutboundQuote2SAPCPQOutboundQuoteComment";
	
	/**<i>Generated relation code constant for relation <code>SAPCPQOutboundQuoteItem2SAPCPQOutboundQuoteComment</code> defining source attribute <code>sapCPQOutboundQuoteItem</code> in extension <code>sapcpqquoteintegration</code>.</i>*/
	public static final String _SAPCPQOUTBOUNDQUOTEITEM2SAPCPQOUTBOUNDQUOTECOMMENT = "SAPCPQOutboundQuoteItem2SAPCPQOutboundQuoteComment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String QUOTEID = "quoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.commentId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String COMMENTID = "commentId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.userName</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String USERNAME = "userName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.email</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EMAIL = "email";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.userCompany</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String USERCOMPANY = "userCompany";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.comment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String COMMENT = "comment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.source</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SOURCE = "source";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTE = "sapCPQOutboundQuote";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteComment.sapCPQOutboundQuoteItem</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTEITEM = "sapCPQOutboundQuoteItem";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCPQOutboundQuoteCommentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCPQOutboundQuoteCommentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPQOutboundQuoteCommentModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.comment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the comment
	 */
	@Accessor(qualifier = "comment", type = Accessor.Type.GETTER)
	public String getComment()
	{
		return getPersistenceContext().getPropertyValue(COMMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.commentId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the commentId
	 */
	@Accessor(qualifier = "commentId", type = Accessor.Type.GETTER)
	public String getCommentId()
	{
		return getPersistenceContext().getPropertyValue(COMMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.email</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the email
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.GETTER)
	public String getEmail()
	{
		return getPersistenceContext().getPropertyValue(EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.GETTER)
	public String getQuoteId()
	{
		return getPersistenceContext().getPropertyValue(QUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the sapCPQOutboundQuote
	 */
	@Accessor(qualifier = "sapCPQOutboundQuote", type = Accessor.Type.GETTER)
	public SAPCPQOutboundQuoteModel getSapCPQOutboundQuote()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.sapCPQOutboundQuoteItem</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the sapCPQOutboundQuoteItem
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteItem", type = Accessor.Type.GETTER)
	public SAPCPQOutboundQuoteItemModel getSapCPQOutboundQuoteItem()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTEITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.source</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the source
	 */
	@Accessor(qualifier = "source", type = Accessor.Type.GETTER)
	public String getSource()
	{
		return getPersistenceContext().getPropertyValue(SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.userCompany</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the userCompany
	 */
	@Accessor(qualifier = "userCompany", type = Accessor.Type.GETTER)
	public String getUserCompany()
	{
		return getPersistenceContext().getPropertyValue(USERCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteComment.userName</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the userName
	 */
	@Accessor(qualifier = "userName", type = Accessor.Type.GETTER)
	public String getUserName()
	{
		return getPersistenceContext().getPropertyValue(USERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.comment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the comment
	 */
	@Accessor(qualifier = "comment", type = Accessor.Type.SETTER)
	public void setComment(final String value)
	{
		getPersistenceContext().setPropertyValue(COMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.commentId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the commentId
	 */
	@Accessor(qualifier = "commentId", type = Accessor.Type.SETTER)
	public void setCommentId(final String value)
	{
		getPersistenceContext().setPropertyValue(COMMENTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.email</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the email
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.SETTER)
	public void setEmail(final String value)
	{
		getPersistenceContext().setPropertyValue(EMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.SETTER)
	public void setQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(QUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuote
	 */
	@Accessor(qualifier = "sapCPQOutboundQuote", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuote(final SAPCPQOutboundQuoteModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.sapCPQOutboundQuoteItem</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuoteItem
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteItem", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuoteItem(final SAPCPQOutboundQuoteItemModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTEITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.source</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the source
	 */
	@Accessor(qualifier = "source", type = Accessor.Type.SETTER)
	public void setSource(final String value)
	{
		getPersistenceContext().setPropertyValue(SOURCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.userCompany</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the userCompany
	 */
	@Accessor(qualifier = "userCompany", type = Accessor.Type.SETTER)
	public void setUserCompany(final String value)
	{
		getPersistenceContext().setPropertyValue(USERCOMPANY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteComment.userName</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the userName
	 */
	@Accessor(qualifier = "userName", type = Accessor.Type.SETTER)
	public void setUserName(final String value)
	{
		getPersistenceContext().setPropertyValue(USERNAME, value);
	}
	
}
