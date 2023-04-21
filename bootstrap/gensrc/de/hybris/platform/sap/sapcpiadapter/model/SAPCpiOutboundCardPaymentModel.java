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
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundOrderModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundCardPayment first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundCardPaymentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundCardPayment";
	
	/**<i>Generated relation code constant for relation <code>SAPCpiOutboundOrder2SAPCpiOutboundCardPayment</code> defining source attribute <code>sapCpiOutboundOrder</code> in extension <code>sapcpiadapter</code>.</i>*/
	public static final String _SAPCPIOUTBOUNDORDER2SAPCPIOUTBOUNDCARDPAYMENT = "SAPCpiOutboundOrder2SAPCpiOutboundCardPayment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.requestId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String REQUESTID = "requestId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.ccOwner</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CCOWNER = "ccOwner";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.validToMonth</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String VALIDTOMONTH = "validToMonth";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.validToYear</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String VALIDTOYEAR = "validToYear";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.subscriptionId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SUBSCRIPTIONID = "subscriptionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.paymentProvider</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PAYMENTPROVIDER = "paymentProvider";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCardPayment.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDORDER = "sapCpiOutboundOrder";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundCardPaymentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundCardPaymentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundCardPaymentModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.ccOwner</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the ccOwner
	 */
	@Accessor(qualifier = "ccOwner", type = Accessor.Type.GETTER)
	public String getCcOwner()
	{
		return getPersistenceContext().getPropertyValue(CCOWNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.paymentProvider</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the paymentProvider
	 */
	@Accessor(qualifier = "paymentProvider", type = Accessor.Type.GETTER)
	public String getPaymentProvider()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTPROVIDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.requestId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the requestId
	 */
	@Accessor(qualifier = "requestId", type = Accessor.Type.GETTER)
	public String getRequestId()
	{
		return getPersistenceContext().getPropertyValue(REQUESTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.GETTER)
	public SAPCpiOutboundOrderModel getSapCpiOutboundOrder()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.subscriptionId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the subscriptionId
	 */
	@Accessor(qualifier = "subscriptionId", type = Accessor.Type.GETTER)
	public String getSubscriptionId()
	{
		return getPersistenceContext().getPropertyValue(SUBSCRIPTIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.validToMonth</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the validToMonth
	 */
	@Accessor(qualifier = "validToMonth", type = Accessor.Type.GETTER)
	public String getValidToMonth()
	{
		return getPersistenceContext().getPropertyValue(VALIDTOMONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCardPayment.validToYear</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the validToYear
	 */
	@Accessor(qualifier = "validToYear", type = Accessor.Type.GETTER)
	public String getValidToYear()
	{
		return getPersistenceContext().getPropertyValue(VALIDTOYEAR);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.ccOwner</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the ccOwner
	 */
	@Accessor(qualifier = "ccOwner", type = Accessor.Type.SETTER)
	public void setCcOwner(final String value)
	{
		getPersistenceContext().setPropertyValue(CCOWNER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.paymentProvider</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the paymentProvider
	 */
	@Accessor(qualifier = "paymentProvider", type = Accessor.Type.SETTER)
	public void setPaymentProvider(final String value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTPROVIDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.requestId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the requestId
	 */
	@Accessor(qualifier = "requestId", type = Accessor.Type.SETTER)
	public void setRequestId(final String value)
	{
		getPersistenceContext().setPropertyValue(REQUESTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundOrder(final SAPCpiOutboundOrderModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.subscriptionId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the subscriptionId
	 */
	@Accessor(qualifier = "subscriptionId", type = Accessor.Type.SETTER)
	public void setSubscriptionId(final String value)
	{
		getPersistenceContext().setPropertyValue(SUBSCRIPTIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.validToMonth</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the validToMonth
	 */
	@Accessor(qualifier = "validToMonth", type = Accessor.Type.SETTER)
	public void setValidToMonth(final String value)
	{
		getPersistenceContext().setPropertyValue(VALIDTOMONTH, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCardPayment.validToYear</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the validToYear
	 */
	@Accessor(qualifier = "validToYear", type = Accessor.Type.SETTER)
	public void setValidToYear(final String value)
	{
		getPersistenceContext().setPropertyValue(VALIDTOYEAR, value);
	}
	
}
