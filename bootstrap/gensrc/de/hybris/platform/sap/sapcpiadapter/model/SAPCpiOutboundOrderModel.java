/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundAddressModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundCardPaymentModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundConfigModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundOrderItemModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundPartnerRoleModel;
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundPriceComponentModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Set;

/**
 * Generated model class for type SAPCpiOutboundOrder first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundOrderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.creationDate</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CREATIONDATE = "creationDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CURRENCYISOCODE = "currencyIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.paymentMode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PAYMENTMODE = "paymentMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.deliveryMode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.purchaseOrderNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PURCHASEORDERNUMBER = "purchaseOrderNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.baseStoreUid</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String BASESTOREUID = "baseStoreUid";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.channel</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CHANNEL = "channel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.salesOrganization</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SALESORGANIZATION = "salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.distributionChannel</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.division</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DIVISION = "division";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.transactionType</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String TRANSACTIONTYPE = "transactionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.shippingCondition</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SHIPPINGCONDITION = "shippingCondition";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.responseStatus</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String RESPONSESTATUS = "responseStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.responseMessage</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String RESPONSEMESSAGE = "responseMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.sapCpiConfig</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPICONFIG = "sapCpiConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.sapCpiOutboundOrderItems</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDORDERITEMS = "sapCpiOutboundOrderItems";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.sapCpiOutboundPartnerRoles</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDPARTNERROLES = "sapCpiOutboundPartnerRoles";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.sapCpiOutboundCardPayments</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDCARDPAYMENTS = "sapCpiOutboundCardPayments";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.sapCpiOutboundPriceComponents</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDPRICECOMPONENTS = "sapCpiOutboundPriceComponents";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.sapCpiOutboundAddresses</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDADDRESSES = "sapCpiOutboundAddresses";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrder.revenueCloudOrderId</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String REVENUECLOUDORDERID = "revenueCloudOrderId";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundOrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundOrderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundOrderModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.baseStoreUid</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the baseStoreUid
	 */
	@Accessor(qualifier = "baseStoreUid", type = Accessor.Type.GETTER)
	public String getBaseStoreUid()
	{
		return getPersistenceContext().getPropertyValue(BASESTOREUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.channel</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the channel
	 */
	@Accessor(qualifier = "channel", type = Accessor.Type.GETTER)
	public String getChannel()
	{
		return getPersistenceContext().getPropertyValue(CHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.creationDate</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the creationDate
	 */
	@Accessor(qualifier = "creationDate", type = Accessor.Type.GETTER)
	public String getCreationDate()
	{
		return getPersistenceContext().getPropertyValue(CREATIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the currencyIsoCode
	 */
	@Accessor(qualifier = "currencyIsoCode", type = Accessor.Type.GETTER)
	public String getCurrencyIsoCode()
	{
		return getPersistenceContext().getPropertyValue(CURRENCYISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.deliveryMode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the deliveryMode
	 */
	@Accessor(qualifier = "deliveryMode", type = Accessor.Type.GETTER)
	public String getDeliveryMode()
	{
		return getPersistenceContext().getPropertyValue(DELIVERYMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.distributionChannel</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the distributionChannel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.GETTER)
	public String getDistributionChannel()
	{
		return getPersistenceContext().getPropertyValue(DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.division</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the division
	 */
	@Accessor(qualifier = "division", type = Accessor.Type.GETTER)
	public String getDivision()
	{
		return getPersistenceContext().getPropertyValue(DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.paymentMode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the paymentMode
	 */
	@Accessor(qualifier = "paymentMode", type = Accessor.Type.GETTER)
	public String getPaymentMode()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.purchaseOrderNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the purchaseOrderNumber
	 */
	@Accessor(qualifier = "purchaseOrderNumber", type = Accessor.Type.GETTER)
	public String getPurchaseOrderNumber()
	{
		return getPersistenceContext().getPropertyValue(PURCHASEORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.responseMessage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the responseMessage
	 */
	@Accessor(qualifier = "responseMessage", type = Accessor.Type.GETTER)
	public String getResponseMessage()
	{
		return getPersistenceContext().getPropertyValue(RESPONSEMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.responseStatus</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the responseStatus
	 */
	@Accessor(qualifier = "responseStatus", type = Accessor.Type.GETTER)
	public String getResponseStatus()
	{
		return getPersistenceContext().getPropertyValue(RESPONSESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.revenueCloudOrderId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the revenueCloudOrderId - Revenue Cloud ID of the order
	 */
	@Accessor(qualifier = "revenueCloudOrderId", type = Accessor.Type.GETTER)
	public String getRevenueCloudOrderId()
	{
		return getPersistenceContext().getPropertyValue(REVENUECLOUDORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.salesOrganization</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the salesOrganization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.GETTER)
	public String getSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.sapCpiConfig</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiConfig
	 */
	@Accessor(qualifier = "sapCpiConfig", type = Accessor.Type.GETTER)
	public SAPCpiOutboundConfigModel getSapCpiConfig()
	{
		return getPersistenceContext().getPropertyValue(SAPCPICONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.sapCpiOutboundAddresses</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCpiOutboundAddresses
	 */
	@Accessor(qualifier = "sapCpiOutboundAddresses", type = Accessor.Type.GETTER)
	public Set<SAPCpiOutboundAddressModel> getSapCpiOutboundAddresses()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDADDRESSES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.sapCpiOutboundCardPayments</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCpiOutboundCardPayments
	 */
	@Accessor(qualifier = "sapCpiOutboundCardPayments", type = Accessor.Type.GETTER)
	public Set<SAPCpiOutboundCardPaymentModel> getSapCpiOutboundCardPayments()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDCARDPAYMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.sapCpiOutboundOrderItems</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCpiOutboundOrderItems
	 */
	@Accessor(qualifier = "sapCpiOutboundOrderItems", type = Accessor.Type.GETTER)
	public Set<SAPCpiOutboundOrderItemModel> getSapCpiOutboundOrderItems()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDORDERITEMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.sapCpiOutboundPartnerRoles</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCpiOutboundPartnerRoles
	 */
	@Accessor(qualifier = "sapCpiOutboundPartnerRoles", type = Accessor.Type.GETTER)
	public Set<SAPCpiOutboundPartnerRoleModel> getSapCpiOutboundPartnerRoles()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDPARTNERROLES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.sapCpiOutboundPriceComponents</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapCpiOutboundPriceComponents
	 */
	@Accessor(qualifier = "sapCpiOutboundPriceComponents", type = Accessor.Type.GETTER)
	public Set<SAPCpiOutboundPriceComponentModel> getSapCpiOutboundPriceComponents()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDPRICECOMPONENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.shippingCondition</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the shippingCondition
	 */
	@Accessor(qualifier = "shippingCondition", type = Accessor.Type.GETTER)
	public String getShippingCondition()
	{
		return getPersistenceContext().getPropertyValue(SHIPPINGCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrder.transactionType</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the transactionType
	 */
	@Accessor(qualifier = "transactionType", type = Accessor.Type.GETTER)
	public String getTransactionType()
	{
		return getPersistenceContext().getPropertyValue(TRANSACTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.baseStoreUid</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the baseStoreUid
	 */
	@Accessor(qualifier = "baseStoreUid", type = Accessor.Type.SETTER)
	public void setBaseStoreUid(final String value)
	{
		getPersistenceContext().setPropertyValue(BASESTOREUID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.channel</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the channel
	 */
	@Accessor(qualifier = "channel", type = Accessor.Type.SETTER)
	public void setChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(CHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.creationDate</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the creationDate
	 */
	@Accessor(qualifier = "creationDate", type = Accessor.Type.SETTER)
	public void setCreationDate(final String value)
	{
		getPersistenceContext().setPropertyValue(CREATIONDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the currencyIsoCode
	 */
	@Accessor(qualifier = "currencyIsoCode", type = Accessor.Type.SETTER)
	public void setCurrencyIsoCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CURRENCYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.deliveryMode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the deliveryMode
	 */
	@Accessor(qualifier = "deliveryMode", type = Accessor.Type.SETTER)
	public void setDeliveryMode(final String value)
	{
		getPersistenceContext().setPropertyValue(DELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.distributionChannel</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the distributionChannel
	 */
	@Accessor(qualifier = "distributionChannel", type = Accessor.Type.SETTER)
	public void setDistributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.division</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the division
	 */
	@Accessor(qualifier = "division", type = Accessor.Type.SETTER)
	public void setDivision(final String value)
	{
		getPersistenceContext().setPropertyValue(DIVISION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.paymentMode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the paymentMode
	 */
	@Accessor(qualifier = "paymentMode", type = Accessor.Type.SETTER)
	public void setPaymentMode(final String value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.purchaseOrderNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the purchaseOrderNumber
	 */
	@Accessor(qualifier = "purchaseOrderNumber", type = Accessor.Type.SETTER)
	public void setPurchaseOrderNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(PURCHASEORDERNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.responseMessage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the responseMessage
	 */
	@Accessor(qualifier = "responseMessage", type = Accessor.Type.SETTER)
	public void setResponseMessage(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSEMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.responseStatus</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the responseStatus
	 */
	@Accessor(qualifier = "responseStatus", type = Accessor.Type.SETTER)
	public void setResponseStatus(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSESTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.revenueCloudOrderId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the revenueCloudOrderId - Revenue Cloud ID of the order
	 */
	@Accessor(qualifier = "revenueCloudOrderId", type = Accessor.Type.SETTER)
	public void setRevenueCloudOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(REVENUECLOUDORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.salesOrganization</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the salesOrganization
	 */
	@Accessor(qualifier = "salesOrganization", type = Accessor.Type.SETTER)
	public void setSalesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.sapCpiConfig</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiConfig
	 */
	@Accessor(qualifier = "sapCpiConfig", type = Accessor.Type.SETTER)
	public void setSapCpiConfig(final SAPCpiOutboundConfigModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPICONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.sapCpiOutboundAddresses</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundAddresses
	 */
	@Accessor(qualifier = "sapCpiOutboundAddresses", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundAddresses(final Set<SAPCpiOutboundAddressModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDADDRESSES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.sapCpiOutboundCardPayments</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundCardPayments
	 */
	@Accessor(qualifier = "sapCpiOutboundCardPayments", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundCardPayments(final Set<SAPCpiOutboundCardPaymentModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDCARDPAYMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.sapCpiOutboundOrderItems</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundOrderItems
	 */
	@Accessor(qualifier = "sapCpiOutboundOrderItems", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundOrderItems(final Set<SAPCpiOutboundOrderItemModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDORDERITEMS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.sapCpiOutboundPartnerRoles</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundPartnerRoles
	 */
	@Accessor(qualifier = "sapCpiOutboundPartnerRoles", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundPartnerRoles(final Set<SAPCpiOutboundPartnerRoleModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDPARTNERROLES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.sapCpiOutboundPriceComponents</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundPriceComponents
	 */
	@Accessor(qualifier = "sapCpiOutboundPriceComponents", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundPriceComponents(final Set<SAPCpiOutboundPriceComponentModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDPRICECOMPONENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.shippingCondition</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the shippingCondition
	 */
	@Accessor(qualifier = "shippingCondition", type = Accessor.Type.SETTER)
	public void setShippingCondition(final String value)
	{
		getPersistenceContext().setPropertyValue(SHIPPINGCONDITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrder.transactionType</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the transactionType
	 */
	@Accessor(qualifier = "transactionType", type = Accessor.Type.SETTER)
	public void setTransactionType(final String value)
	{
		getPersistenceContext().setPropertyValue(TRANSACTIONTYPE, value);
	}
	
}
