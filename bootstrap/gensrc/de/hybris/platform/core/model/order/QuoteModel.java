/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core.model.order;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.commerceservices.enums.QuoteNotificationType;
import de.hybris.platform.core.enums.QuoteState;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.QuoteEntryModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type Quote first defined at extension core.
 */
@SuppressWarnings("all")
public class QuoteModel extends AbstractOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Quote";
	
	/**<i>Generated relation code constant for relation <code>Assignee2Quotes</code> defining source attribute <code>assignee</code> in extension <code>commerceservices</code>.</i>*/
	public static final String _ASSIGNEE2QUOTES = "Assignee2Quotes";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.version</code> attribute defined at extension <code>core</code>. */
	public static final String VERSION = "version";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.state</code> attribute defined at extension <code>core</code>. */
	public static final String STATE = "state";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cartReference</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CARTREFERENCE = "cartReference";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.previousEstimatedTotal</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String PREVIOUSESTIMATEDTOTAL = "previousEstimatedTotal";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.assignee</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String ASSIGNEE = "assignee";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.generatedNotifications</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String GENERATEDNOTIFICATIONS = "generatedNotifications";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqExternalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQEXTERNALQUOTEID = "cpqExternalQuoteId";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqExternalComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQEXTERNALCOMMENTS = "cpqExternalComments";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqOrderCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQORDERCODE = "cpqOrderCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqQuoteProposalDocument</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQQUOTEPROPOSALDOCUMENT = "cpqQuoteProposalDocument";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.proposalMessage</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PROPOSALMESSAGE = "proposalMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqHeaderDiscount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQHEADERDISCOUNT = "cpqHeaderDiscount";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqSalesOrganization</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQSALESORGANIZATION = "cpqSalesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqDistributionChannel</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQDISTRIBUTIONCHANNEL = "cpqDistributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqDivision</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQDIVISION = "cpqDivision";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqQuoteEntries</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQQUOTEENTRIES = "cpqQuoteEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqQuoteNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQQUOTENUMBER = "cpqQuoteNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>Quote.cpqSbQuoteProposalDocument</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String CPQSBQUOTEPROPOSALDOCUMENT = "cpqSbQuoteProposalDocument";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public QuoteModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public QuoteModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _state initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _version initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public QuoteModel(final CurrencyModel _currency, final Date _date, final QuoteState _state, final UserModel _user, final Integer _version)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setState(_state);
		setUser(_user);
		setVersion(_version);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _state initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 * @param _version initial attribute declared by type <code>Quote</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public QuoteModel(final CurrencyModel _currency, final Date _date, final ItemModel _owner, final QuoteState _state, final UserModel _user, final Integer _version)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOwner(_owner);
		setState(_state);
		setUser(_user);
		setVersion(_version);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.assignee</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the assignee
	 */
	@Accessor(qualifier = "assignee", type = Accessor.Type.GETTER)
	public UserModel getAssignee()
	{
		return getPersistenceContext().getPropertyValue(ASSIGNEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cartReference</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the cartReference - The reference to cart used to manipulate the quote.
	 */
	@Accessor(qualifier = "cartReference", type = Accessor.Type.GETTER)
	public CartModel getCartReference()
	{
		return getPersistenceContext().getPropertyValue(CARTREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqDistributionChannel</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqDistributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "cpqDistributionChannel", type = Accessor.Type.GETTER)
	public String getCpqDistributionChannel()
	{
		return getPersistenceContext().getPropertyValue(CPQDISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqDivision</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqDivision - Division
	 */
	@Accessor(qualifier = "cpqDivision", type = Accessor.Type.GETTER)
	public String getCpqDivision()
	{
		return getPersistenceContext().getPropertyValue(CPQDIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqExternalComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqExternalComments - External header level comments in XML formal to be parsed in pre-persist-hook
	 */
	@Accessor(qualifier = "cpqExternalComments", type = Accessor.Type.GETTER)
	public String getCpqExternalComments()
	{
		return getPersistenceContext().getPropertyValue(CPQEXTERNALCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqExternalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqExternalQuoteId - Unique identifier of Quote in the Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqExternalQuoteId", type = Accessor.Type.GETTER)
	public String getCpqExternalQuoteId()
	{
		return getPersistenceContext().getPropertyValue(CPQEXTERNALQUOTEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqHeaderDiscount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqHeaderDiscount
	 */
	@Accessor(qualifier = "cpqHeaderDiscount", type = Accessor.Type.GETTER)
	public Double getCpqHeaderDiscount()
	{
		return getPersistenceContext().getPropertyValue(CPQHEADERDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqOrderCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqOrderCode - Unique identifier of Order Created for particular Quote
	 */
	@Accessor(qualifier = "cpqOrderCode", type = Accessor.Type.GETTER)
	public String getCpqOrderCode()
	{
		return getPersistenceContext().getPropertyValue(CPQORDERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqQuoteEntries</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cpqQuoteEntries
	 */
	@Accessor(qualifier = "cpqQuoteEntries", type = Accessor.Type.GETTER)
	public List<QuoteEntryModel> getCpqQuoteEntries()
	{
		return getPersistenceContext().getPropertyValue(CPQQUOTEENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqQuoteNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqQuoteNumber - Quote Number of Quote in the Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqQuoteNumber", type = Accessor.Type.GETTER)
	public String getCpqQuoteNumber()
	{
		return getPersistenceContext().getPropertyValue(CPQQUOTENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqQuoteProposalDocument</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqQuoteProposalDocument - Externally generated Proposal PDF Document
	 */
	@Accessor(qualifier = "cpqQuoteProposalDocument", type = Accessor.Type.GETTER)
	public String getCpqQuoteProposalDocument()
	{
		return getPersistenceContext().getPropertyValue(CPQQUOTEPROPOSALDOCUMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqSalesOrganization</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqSalesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "cpqSalesOrganization", type = Accessor.Type.GETTER)
	public String getCpqSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(CPQSALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.cpqSbQuoteProposalDocument</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the cpqSbQuoteProposalDocument - Externally generated Proposal PDF Document
	 */
	@Accessor(qualifier = "cpqSbQuoteProposalDocument", type = Accessor.Type.GETTER)
	public String getCpqSbQuoteProposalDocument()
	{
		return getPersistenceContext().getPropertyValue(CPQSBQUOTEPROPOSALDOCUMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.generatedNotifications</code> attribute defined at extension <code>commerceservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the generatedNotifications
	 */
	@Accessor(qualifier = "generatedNotifications", type = Accessor.Type.GETTER)
	public Set<QuoteNotificationType> getGeneratedNotifications()
	{
		return getPersistenceContext().getPropertyValue(GENERATEDNOTIFICATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.previousEstimatedTotal</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the previousEstimatedTotal - Previously estimated total
	 */
	@Accessor(qualifier = "previousEstimatedTotal", type = Accessor.Type.GETTER)
	public Double getPreviousEstimatedTotal()
	{
		return getPersistenceContext().getPropertyValue(PREVIOUSESTIMATEDTOTAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.proposalMessage</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the proposalMessage - Externally generated Proposal PDF Document
	 */
	@Accessor(qualifier = "proposalMessage", type = Accessor.Type.GETTER)
	public String getProposalMessage()
	{
		return getPersistenceContext().getPropertyValue(PROPOSALMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.state</code> attribute defined at extension <code>core</code>. 
	 * @return the state - Current state of the quote
	 */
	@Accessor(qualifier = "state", type = Accessor.Type.GETTER)
	public QuoteState getState()
	{
		return getPersistenceContext().getPropertyValue(STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Quote.version</code> attribute defined at extension <code>core</code>. 
	 * @return the version - The version of the quote. Along with code it makes a quote instance unique.
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.GETTER)
	public Integer getVersion()
	{
		return getPersistenceContext().getPropertyValue(VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.assignee</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the assignee
	 */
	@Accessor(qualifier = "assignee", type = Accessor.Type.SETTER)
	public void setAssignee(final UserModel value)
	{
		getPersistenceContext().setPropertyValue(ASSIGNEE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cartReference</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the cartReference - The reference to cart used to manipulate the quote.
	 */
	@Accessor(qualifier = "cartReference", type = Accessor.Type.SETTER)
	public void setCartReference(final CartModel value)
	{
		getPersistenceContext().setPropertyValue(CARTREFERENCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqDistributionChannel</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqDistributionChannel - Distribution Channel
	 */
	@Accessor(qualifier = "cpqDistributionChannel", type = Accessor.Type.SETTER)
	public void setCpqDistributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQDISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqDivision</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqDivision - Division
	 */
	@Accessor(qualifier = "cpqDivision", type = Accessor.Type.SETTER)
	public void setCpqDivision(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQDIVISION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqExternalComments</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqExternalComments - External header level comments in XML formal to be parsed in pre-persist-hook
	 */
	@Accessor(qualifier = "cpqExternalComments", type = Accessor.Type.SETTER)
	public void setCpqExternalComments(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQEXTERNALCOMMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqExternalQuoteId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqExternalQuoteId - Unique identifier of Quote in the Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqExternalQuoteId", type = Accessor.Type.SETTER)
	public void setCpqExternalQuoteId(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQEXTERNALQUOTEID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqHeaderDiscount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqHeaderDiscount
	 */
	@Accessor(qualifier = "cpqHeaderDiscount", type = Accessor.Type.SETTER)
	public void setCpqHeaderDiscount(final Double value)
	{
		getPersistenceContext().setPropertyValue(CPQHEADERDISCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqOrderCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqOrderCode - Unique identifier of Order Created for particular Quote
	 */
	@Accessor(qualifier = "cpqOrderCode", type = Accessor.Type.SETTER)
	public void setCpqOrderCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQORDERCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqQuoteEntries</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqQuoteEntries
	 */
	@Accessor(qualifier = "cpqQuoteEntries", type = Accessor.Type.SETTER)
	public void setCpqQuoteEntries(final List<QuoteEntryModel> value)
	{
		getPersistenceContext().setPropertyValue(CPQQUOTEENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqQuoteNumber</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqQuoteNumber - Quote Number of Quote in the Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqQuoteNumber", type = Accessor.Type.SETTER)
	public void setCpqQuoteNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQQUOTENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqQuoteProposalDocument</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqQuoteProposalDocument - Externally generated Proposal PDF Document
	 */
	@Accessor(qualifier = "cpqQuoteProposalDocument", type = Accessor.Type.SETTER)
	public void setCpqQuoteProposalDocument(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQQUOTEPROPOSALDOCUMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqSalesOrganization</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqSalesOrganization - Sales Organization
	 */
	@Accessor(qualifier = "cpqSalesOrganization", type = Accessor.Type.SETTER)
	public void setCpqSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQSALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.cpqSbQuoteProposalDocument</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the cpqSbQuoteProposalDocument - Externally generated Proposal PDF Document
	 */
	@Accessor(qualifier = "cpqSbQuoteProposalDocument", type = Accessor.Type.SETTER)
	public void setCpqSbQuoteProposalDocument(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQSBQUOTEPROPOSALDOCUMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.generatedNotifications</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the generatedNotifications
	 */
	@Accessor(qualifier = "generatedNotifications", type = Accessor.Type.SETTER)
	public void setGeneratedNotifications(final Set<QuoteNotificationType> value)
	{
		getPersistenceContext().setPropertyValue(GENERATEDNOTIFICATIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.previousEstimatedTotal</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the previousEstimatedTotal - Previously estimated total
	 */
	@Accessor(qualifier = "previousEstimatedTotal", type = Accessor.Type.SETTER)
	public void setPreviousEstimatedTotal(final Double value)
	{
		getPersistenceContext().setPropertyValue(PREVIOUSESTIMATEDTOTAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.proposalMessage</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the proposalMessage - Externally generated Proposal PDF Document
	 */
	@Accessor(qualifier = "proposalMessage", type = Accessor.Type.SETTER)
	public void setProposalMessage(final String value)
	{
		getPersistenceContext().setPropertyValue(PROPOSALMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Quote.state</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the state - Current state of the quote
	 */
	@Accessor(qualifier = "state", type = Accessor.Type.SETTER)
	public void setState(final QuoteState value)
	{
		getPersistenceContext().setPropertyValue(STATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Quote.version</code> attribute defined at extension <code>core</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the version - The version of the quote. Along with code it makes a quote instance unique.
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.SETTER)
	public void setVersion(final Integer value)
	{
		getPersistenceContext().setPropertyValue(VERSION, value);
	}
	
}
