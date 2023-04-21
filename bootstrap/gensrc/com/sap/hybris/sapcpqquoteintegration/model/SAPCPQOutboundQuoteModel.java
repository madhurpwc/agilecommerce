/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcpqquoteintegration.model;

import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteCommentModel;
import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteCustomerModel;
import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteItemModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type SAPCPQOutboundQuote first defined at extension sapcpqquoteintegration.
 */
@SuppressWarnings("all")
public class SAPCPQOutboundQuoteModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCPQOutboundQuote";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String QUOTEID = "quoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.version</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String VERSION = "version";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.name</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.description</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String DESCRIPTION = "description";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.creationDate</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CREATIONDATE = "creationDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.quoteStatus</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String QUOTESTATUS = "quoteStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.externalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EXTERNALQUOTEID = "externalQuoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.globalComment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String GLOBALCOMMENT = "globalComment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.distributionChannel</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.divison</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String DIVISON = "divison";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.pricingProcedure</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRICINGPROCEDURE = "pricingProcedure";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.marketID</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String MARKETID = "marketID";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.marketCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String MARKETCODE = "marketCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.pricebookId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRICEBOOKID = "pricebookId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.origin</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ORIGIN = "origin";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteItems</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTEITEMS = "sapCPQOutboundQuoteItems";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteCustomers</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTECUSTOMERS = "sapCPQOutboundQuoteCustomers";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTECOMMENTS = "sapCPQOutboundQuoteComments";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCPQOutboundQuoteModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCPQOutboundQuoteModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPQOutboundQuoteModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.creationDate</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the creationDate
	 */
	@Accessor(qualifier = "creationDate", type = Accessor.Type.GETTER)
	public String getCreationDate()
	{
		return getPersistenceContext().getPropertyValue(CREATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.description</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.GETTER)
	public String getDescription()
	{
		return getPersistenceContext().getPropertyValue(DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.distributionChannel</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the distributionChannel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.GETTER)
	public String getDistributionChannel()
	{
		return getPersistenceContext().getPropertyValue(DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.divison</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the divison
	 */
	@Accessor(qualifier = "divison", type = Accessor.Type.GETTER)
	public String getDivison()
	{
		return getPersistenceContext().getPropertyValue(DIVISON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.externalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the externalQuoteId
	 */
	@Accessor(qualifier = "externalQuoteId", type = Accessor.Type.GETTER)
	public String getExternalQuoteId()
	{
		return getPersistenceContext().getPropertyValue(EXTERNALQUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.globalComment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the globalComment
	 */
	@Accessor(qualifier = "globalComment", type = Accessor.Type.GETTER)
	public String getGlobalComment()
	{
		return getPersistenceContext().getPropertyValue(GLOBALCOMMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.marketCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the marketCode
	 */
	@Accessor(qualifier = "marketCode", type = Accessor.Type.GETTER)
	public String getMarketCode()
	{
		return getPersistenceContext().getPropertyValue(MARKETCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.marketID</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the marketID
	 */
	@Accessor(qualifier = "marketID", type = Accessor.Type.GETTER)
	public String getMarketID()
	{
		return getPersistenceContext().getPropertyValue(MARKETID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.name</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.origin</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the origin
	 */
	@Accessor(qualifier = "origin", type = Accessor.Type.GETTER)
	public String getOrigin()
	{
		return getPersistenceContext().getPropertyValue(ORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.pricebookId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the pricebookId
	 */
	@Accessor(qualifier = "pricebookId", type = Accessor.Type.GETTER)
	public String getPricebookId()
	{
		return getPersistenceContext().getPropertyValue(PRICEBOOKID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.pricingProcedure</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the pricingProcedure
	 */
	@Accessor(qualifier = "pricingProcedure", type = Accessor.Type.GETTER)
	public String getPricingProcedure()
	{
		return getPersistenceContext().getPropertyValue(PRICINGPROCEDURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.GETTER)
	public String getQuoteId()
	{
		return getPersistenceContext().getPropertyValue(QUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.quoteStatus</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the quoteStatus
	 */
	@Accessor(qualifier = "quoteStatus", type = Accessor.Type.GETTER)
	public String getQuoteStatus()
	{
		return getPersistenceContext().getPropertyValue(QUOTESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCPQOutboundQuoteComments
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteComments", type = Accessor.Type.GETTER)
	public List<SAPCPQOutboundQuoteCommentModel> getSapCPQOutboundQuoteComments()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTECOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteCustomers</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCPQOutboundQuoteCustomers
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteCustomers", type = Accessor.Type.GETTER)
	public Set<SAPCPQOutboundQuoteCustomerModel> getSapCPQOutboundQuoteCustomers()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTECUSTOMERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteItems</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCPQOutboundQuoteItems
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteItems", type = Accessor.Type.GETTER)
	public List<SAPCPQOutboundQuoteItemModel> getSapCPQOutboundQuoteItems()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTEITEMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuote.version</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the version
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.GETTER)
	public String getVersion()
	{
		return getPersistenceContext().getPropertyValue(VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.creationDate</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the creationDate
	 */
	@Accessor(qualifier = "creationDate", type = Accessor.Type.SETTER)
	public void setCreationDate(final String value)
	{
		getPersistenceContext().setPropertyValue(CREATIONDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.description</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the description
	 */
	@Accessor(qualifier = "description", type = Accessor.Type.SETTER)
	public void setDescription(final String value)
	{
		getPersistenceContext().setPropertyValue(DESCRIPTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.distributionChannel</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the distributionChannel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.SETTER)
	public void setDistributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.divison</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the divison
	 */
	@Accessor(qualifier = "divison", type = Accessor.Type.SETTER)
	public void setDivison(final String value)
	{
		getPersistenceContext().setPropertyValue(DIVISON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.externalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the externalQuoteId
	 */
	@Accessor(qualifier = "externalQuoteId", type = Accessor.Type.SETTER)
	public void setExternalQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALQUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.globalComment</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the globalComment
	 */
	@Accessor(qualifier = "globalComment", type = Accessor.Type.SETTER)
	public void setGlobalComment(final String value)
	{
		getPersistenceContext().setPropertyValue(GLOBALCOMMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.marketCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the marketCode
	 */
	@Accessor(qualifier = "marketCode", type = Accessor.Type.SETTER)
	public void setMarketCode(final String value)
	{
		getPersistenceContext().setPropertyValue(MARKETCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.marketID</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the marketID
	 */
	@Accessor(qualifier = "marketID", type = Accessor.Type.SETTER)
	public void setMarketID(final String value)
	{
		getPersistenceContext().setPropertyValue(MARKETID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.name</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.origin</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the origin
	 */
	@Accessor(qualifier = "origin", type = Accessor.Type.SETTER)
	public void setOrigin(final String value)
	{
		getPersistenceContext().setPropertyValue(ORIGIN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.pricebookId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the pricebookId
	 */
	@Accessor(qualifier = "pricebookId", type = Accessor.Type.SETTER)
	public void setPricebookId(final String value)
	{
		getPersistenceContext().setPropertyValue(PRICEBOOKID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.pricingProcedure</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the pricingProcedure
	 */
	@Accessor(qualifier = "pricingProcedure", type = Accessor.Type.SETTER)
	public void setPricingProcedure(final String value)
	{
		getPersistenceContext().setPropertyValue(PRICINGPROCEDURE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.quoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the quoteId
	 */
	@Accessor(qualifier = "quoteId", type = Accessor.Type.SETTER)
	public void setQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(QUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.quoteStatus</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the quoteStatus
	 */
	@Accessor(qualifier = "quoteStatus", type = Accessor.Type.SETTER)
	public void setQuoteStatus(final String value)
	{
		getPersistenceContext().setPropertyValue(QUOTESTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuoteComments
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteComments", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuoteComments(final List<SAPCPQOutboundQuoteCommentModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTECOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteCustomers</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuoteCustomers
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteCustomers", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuoteCustomers(final Set<SAPCPQOutboundQuoteCustomerModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTECUSTOMERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.sapCPQOutboundQuoteItems</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuoteItems
	 */
	@Accessor(qualifier = "sapCPQOutboundQuoteItems", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuoteItems(final List<SAPCPQOutboundQuoteItemModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTEITEMS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuote.version</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the version
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.SETTER)
	public void setVersion(final String value)
	{
		getPersistenceContext().setPropertyValue(VERSION, value);
	}
	
}
