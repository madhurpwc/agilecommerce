/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core.model.user;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commerceservices.enums.CustomerType;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.customerreview.model.CustomerReviewModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.model.CsTicketModel;
import java.util.Collection;
import java.util.List;

/**
 * Generated model class for type Customer first defined at extension core.
 */
@SuppressWarnings("all")
public class CustomerModel extends UserModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Customer";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. */
	public static final String CUSTOMERID = "customerID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. */
	public static final String PREVIEWCATALOGVERSIONS = "previewCatalogVersions";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DEFAULTPAYMENTINFO = "defaultPaymentInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TOKEN = "token";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.contactEmail</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String CONTACTEMAIL = "contactEmail";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String ORIGINALUID = "originalUid";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String TYPE = "type";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.tickets</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String TICKETS = "tickets";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.sessionCarts</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String SESSIONCARTS = "sessionCarts";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.savedCarts</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String SAVEDCARTS = "savedCarts";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.sapConsumerID</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCONSUMERID = "sapConsumerID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.sapContactID</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCONTACTID = "sapContactID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.sapIsReplicated</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPISREPLICATED = "sapIsReplicated";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.sapReplicationInfo</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPREPLICATIONINFO = "sapReplicationInfo";
	
	/** <i>Generated constant</i> - Attribute key of <code>Customer.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudcustomer</code>. */
	public static final String REVENUECLOUDCUSTOMERID = "revenueCloudCustomerId";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CustomerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CustomerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CustomerModel(final boolean _loginDisabled, final String _uid)
	{
		super();
		setLoginDisabled(_loginDisabled);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _customerReviews initial attribute declared by type <code>User</code> at extension <code>customerreview</code>
	 * @param _loginDisabled initial attribute declared by type <code>User</code> at extension <code>core</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>Principal</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CustomerModel(final Collection<CustomerReviewModel> _customerReviews, final boolean _loginDisabled, final ItemModel _owner, final String _uid)
	{
		super();
		setCustomerReviews(_customerReviews);
		setLoginDisabled(_loginDisabled);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactEmail</code> dynamic attribute defined at extension <code>commerceservices</code>. 
	 * @return the contactEmail - Contact email is a dynamic attribute that is used to determine contact email
	 * 							address.
	 */
	@Accessor(qualifier = "contactEmail", type = Accessor.Type.GETTER)
	public String getContactEmail()
	{
		return getPersistenceContext().getDynamicValue(this,CONTACTEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.customerID</code> attribute defined at extension <code>core</code>. 
	 * @return the customerID
	 */
	@Accessor(qualifier = "customerID", type = Accessor.Type.GETTER)
	public String getCustomerID()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the defaultPaymentInfo - It holds information about default payment that is used by the customer.
	 */
	@Accessor(qualifier = "defaultPaymentInfo", type = Accessor.Type.GETTER)
	public PaymentInfoModel getDefaultPaymentInfo()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTPAYMENTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the originalUid
	 */
	@Accessor(qualifier = "originalUid", type = Accessor.Type.GETTER)
	public String getOriginalUid()
	{
		return getPersistenceContext().getPropertyValue(ORIGINALUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the previewCatalogVersions
	 */
	@Accessor(qualifier = "previewCatalogVersions", type = Accessor.Type.GETTER)
	public Collection<CatalogVersionModel> getPreviewCatalogVersions()
	{
		return getPersistenceContext().getPropertyValue(PREVIEWCATALOGVERSIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudcustomer</code>. 
	 * @return the revenueCloudCustomerId - Customer ID from the Revenue Cloud system.
	 */
	@Accessor(qualifier = "revenueCloudCustomerId", type = Accessor.Type.GETTER)
	public String getRevenueCloudCustomerId()
	{
		return getPersistenceContext().getPropertyValue(REVENUECLOUDCUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapConsumerID</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapConsumerID - Unique identifier of SAP consumer
	 */
	@Accessor(qualifier = "sapConsumerID", type = Accessor.Type.GETTER)
	public String getSapConsumerID()
	{
		return getPersistenceContext().getPropertyValue(SAPCONSUMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapContactID</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapContactID - Unique identifier of SAP contact
	 */
	@Accessor(qualifier = "sapContactID", type = Accessor.Type.GETTER)
	public String getSapContactID()
	{
		return getPersistenceContext().getPropertyValue(SAPCONTACTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapIsReplicated</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	@Accessor(qualifier = "sapIsReplicated", type = Accessor.Type.GETTER)
	public Boolean getSapIsReplicated()
	{
		return getPersistenceContext().getPropertyValue(SAPISREPLICATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sapReplicationInfo</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	@Accessor(qualifier = "sapReplicationInfo", type = Accessor.Type.GETTER)
	public String getSapReplicationInfo()
	{
		return getPersistenceContext().getPropertyValue(SAPREPLICATIONINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.savedCarts</code> dynamic attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the savedCarts
	 */
	@Accessor(qualifier = "savedCarts", type = Accessor.Type.GETTER)
	public List<CartModel> getSavedCarts()
	{
		return getPersistenceContext().getDynamicValue(this,SAVEDCARTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sessionCarts</code> dynamic attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sessionCarts
	 */
	@Accessor(qualifier = "sessionCarts", type = Accessor.Type.GETTER)
	public List<CartModel> getSessionCarts()
	{
		return getPersistenceContext().getDynamicValue(this,SESSIONCARTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.tickets</code> dynamic attribute defined at extension <code>ticketsystem</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the tickets
	 */
	@Accessor(qualifier = "tickets", type = Accessor.Type.GETTER)
	public List<CsTicketModel> getTickets()
	{
		return getPersistenceContext().getDynamicValue(this,TICKETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the title - It holds information about customer title (i.e. Mr, Dr, etc.)
	 */
	@Accessor(qualifier = "title", type = Accessor.Type.GETTER)
	public TitleModel getTitle()
	{
		return getPersistenceContext().getPropertyValue(TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the token - Attribute is used during forgotten password to ensure that the link can be used
	 * 							only once.
	 */
	@Accessor(qualifier = "token", type = Accessor.Type.GETTER)
	public String getToken()
	{
		return getPersistenceContext().getPropertyValue(TOKEN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the type - Customer type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public CustomerType getType()
	{
		return getPersistenceContext().getPropertyValue(TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.customerID</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the customerID
	 */
	@Accessor(qualifier = "customerID", type = Accessor.Type.SETTER)
	public void setCustomerID(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.defaultPaymentInfo</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the defaultPaymentInfo - It holds information about default payment that is used by the customer.
	 */
	@Accessor(qualifier = "defaultPaymentInfo", type = Accessor.Type.SETTER)
	public void setDefaultPaymentInfo(final PaymentInfoModel value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTPAYMENTINFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.originalUid</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the originalUid
	 */
	@Accessor(qualifier = "originalUid", type = Accessor.Type.SETTER)
	public void setOriginalUid(final String value)
	{
		getPersistenceContext().setPropertyValue(ORIGINALUID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.previewCatalogVersions</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the previewCatalogVersions
	 */
	@Accessor(qualifier = "previewCatalogVersions", type = Accessor.Type.SETTER)
	public void setPreviewCatalogVersions(final Collection<CatalogVersionModel> value)
	{
		getPersistenceContext().setPropertyValue(PREVIEWCATALOGVERSIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudcustomer</code>. 
	 *  
	 * @param value the revenueCloudCustomerId - Customer ID from the Revenue Cloud system.
	 */
	@Accessor(qualifier = "revenueCloudCustomerId", type = Accessor.Type.SETTER)
	public void setRevenueCloudCustomerId(final String value)
	{
		getPersistenceContext().setPropertyValue(REVENUECLOUDCUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.sapConsumerID</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapConsumerID - Unique identifier of SAP consumer
	 */
	@Accessor(qualifier = "sapConsumerID", type = Accessor.Type.SETTER)
	public void setSapConsumerID(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCONSUMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.sapContactID</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapContactID - Unique identifier of SAP contact
	 */
	@Accessor(qualifier = "sapContactID", type = Accessor.Type.SETTER)
	public void setSapContactID(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCONTACTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.sapIsReplicated</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapIsReplicated - Indicates if the customer has been replicated to the SAP system
	 */
	@Accessor(qualifier = "sapIsReplicated", type = Accessor.Type.SETTER)
	public void setSapIsReplicated(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(SAPISREPLICATED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.sapReplicationInfo</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapReplicationInfo - Information related to the replication to the SAP system
	 */
	@Accessor(qualifier = "sapReplicationInfo", type = Accessor.Type.SETTER)
	public void setSapReplicationInfo(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPREPLICATIONINFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.tickets</code> dynamic attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the tickets
	 */
	@Accessor(qualifier = "tickets", type = Accessor.Type.SETTER)
	public void setTickets(final List<CsTicketModel> value)
	{
		getPersistenceContext().setDynamicValue(this,TICKETS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.title</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the title - It holds information about customer title (i.e. Mr, Dr, etc.)
	 */
	@Accessor(qualifier = "title", type = Accessor.Type.SETTER)
	public void setTitle(final TitleModel value)
	{
		getPersistenceContext().setPropertyValue(TITLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.token</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the token - Attribute is used during forgotten password to ensure that the link can be used
	 * 							only once.
	 */
	@Accessor(qualifier = "token", type = Accessor.Type.SETTER)
	public void setToken(final String value)
	{
		getPersistenceContext().setPropertyValue(TOKEN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Customer.type</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the type - Customer type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.SETTER)
	public void setType(final CustomerType value)
	{
		getPersistenceContext().setPropertyValue(TYPE, value);
	}
	
}
