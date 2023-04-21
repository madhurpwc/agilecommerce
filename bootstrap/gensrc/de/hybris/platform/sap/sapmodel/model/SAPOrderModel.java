/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapmodel.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.sap.sapcpiorderexchangeoms.enums.SAPOrderType;
import de.hybris.platform.sap.sapmodel.enums.SAPOrderStatus;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;
import java.util.Set;

/**
 * Generated model class for type SAPOrder first defined at extension sapmodel.
 */
@SuppressWarnings("all")
public class SAPOrderModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPOrder";
	
	/**<i>Generated relation code constant for relation <code>Order2SapOrder</code> defining source attribute <code>order</code> in extension <code>sapmodel</code>.</i>*/
	public static final String _ORDER2SAPORDER = "Order2SapOrder";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentSapOrderRelation</code> defining source attribute <code>consignments</code> in extension <code>sapmodel</code>.</i>*/
	public static final String _CONSIGNMENTSAPORDERRELATION = "ConsignmentSapOrderRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.code</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.sapOrderStatus</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPORDERSTATUS = "sapOrderStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.orderPOS</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ORDERPOS = "orderPOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.order</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.consignments</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String CONSIGNMENTS = "consignments";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.orderEntryNumber</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. */
	public static final String ORDERENTRYNUMBER = "orderEntryNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.quantity</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.rejectionReason</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. */
	public static final String REJECTIONREASON = "rejectionReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.goodsIssueDate</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. */
	public static final String GOODSISSUEDATE = "goodsIssueDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.sapOrderType</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. */
	public static final String SAPORDERTYPE = "sapOrderType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.subscriptionOrder</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String SUBSCRIPTIONORDER = "subscriptionOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPOrder.revenueCloudOrderId</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String REVENUECLOUDORDERID = "revenueCloudOrderId";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPOrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPOrderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>SAPOrder</code> at extension <code>sapmodel</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPOrderModel(final OrderModel _order)
	{
		super();
		setOrder(_order);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _order initial attribute declared by type <code>SAPOrder</code> at extension <code>sapmodel</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPOrderModel(final OrderModel _order, final ItemModel _owner)
	{
		super();
		setOrder(_order);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.code</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the code - SAP Order Number
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.consignments</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignments
	 */
	@Accessor(qualifier = "consignments", type = Accessor.Type.GETTER)
	public Set<ConsignmentModel> getConsignments()
	{
		return getPersistenceContext().getPropertyValue(CONSIGNMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.goodsIssueDate</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 * @return the goodsIssueDate
	 */
	@Accessor(qualifier = "goodsIssueDate", type = Accessor.Type.GETTER)
	public Date getGoodsIssueDate()
	{
		return getPersistenceContext().getPropertyValue(GOODSISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.order</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public OrderModel getOrder()
	{
		return getPersistenceContext().getPropertyValue(ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.orderEntryNumber</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 * @return the orderEntryNumber
	 */
	@Accessor(qualifier = "orderEntryNumber", type = Accessor.Type.GETTER)
	public Integer getOrderEntryNumber()
	{
		return getPersistenceContext().getPropertyValue(ORDERENTRYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.quantity</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 * @return the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.GETTER)
	public Integer getQuantity()
	{
		return getPersistenceContext().getPropertyValue(QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.rejectionReason</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 * @return the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.GETTER)
	public String getRejectionReason()
	{
		return getPersistenceContext().getPropertyValue(REJECTIONREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.revenueCloudOrderId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the revenueCloudOrderId - Saves revenue cloud SubscriptionOrder-ID in Hybris Commerce Order
	 */
	@Accessor(qualifier = "revenueCloudOrderId", type = Accessor.Type.GETTER)
	public String getRevenueCloudOrderId()
	{
		return getPersistenceContext().getPropertyValue(REVENUECLOUDORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.sapOrderStatus</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapOrderStatus - Sap Order Status
	 */
	@Accessor(qualifier = "sapOrderStatus", type = Accessor.Type.GETTER)
	public SAPOrderStatus getSapOrderStatus()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.sapOrderType</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 * @return the sapOrderType
	 */
	@Accessor(qualifier = "sapOrderType", type = Accessor.Type.GETTER)
	public SAPOrderType getSapOrderType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPOrder.subscriptionOrder</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the subscriptionOrder - Determines if this order is subscription order or not
	 */
	@Accessor(qualifier = "subscriptionOrder", type = Accessor.Type.GETTER)
	public boolean isSubscriptionOrder()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(SUBSCRIPTIONORDER));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.code</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the code - SAP Order Number
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.consignments</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the consignments
	 */
	@Accessor(qualifier = "consignments", type = Accessor.Type.SETTER)
	public void setConsignments(final Set<ConsignmentModel> value)
	{
		getPersistenceContext().setPropertyValue(CONSIGNMENTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.goodsIssueDate</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 *  
	 * @param value the goodsIssueDate
	 */
	@Accessor(qualifier = "goodsIssueDate", type = Accessor.Type.SETTER)
	public void setGoodsIssueDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(GOODSISSUEDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>SAPOrder.order</code> attribute defined at extension <code>sapmodel</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final OrderModel value)
	{
		getPersistenceContext().setPropertyValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.orderEntryNumber</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 *  
	 * @param value the orderEntryNumber
	 */
	@Accessor(qualifier = "orderEntryNumber", type = Accessor.Type.SETTER)
	public void setOrderEntryNumber(final Integer value)
	{
		getPersistenceContext().setPropertyValue(ORDERENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.quantity</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 *  
	 * @param value the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.SETTER)
	public void setQuantity(final Integer value)
	{
		getPersistenceContext().setPropertyValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.rejectionReason</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 *  
	 * @param value the rejectionReason
	 */
	@Accessor(qualifier = "rejectionReason", type = Accessor.Type.SETTER)
	public void setRejectionReason(final String value)
	{
		getPersistenceContext().setPropertyValue(REJECTIONREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.revenueCloudOrderId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the revenueCloudOrderId - Saves revenue cloud SubscriptionOrder-ID in Hybris Commerce Order
	 */
	@Accessor(qualifier = "revenueCloudOrderId", type = Accessor.Type.SETTER)
	public void setRevenueCloudOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(REVENUECLOUDORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.sapOrderStatus</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapOrderStatus - Sap Order Status
	 */
	@Accessor(qualifier = "sapOrderStatus", type = Accessor.Type.SETTER)
	public void setSapOrderStatus(final SAPOrderStatus value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.sapOrderType</code> attribute defined at extension <code>sapcpiorderexchangeoms</code>. 
	 *  
	 * @param value the sapOrderType
	 */
	@Accessor(qualifier = "sapOrderType", type = Accessor.Type.SETTER)
	public void setSapOrderType(final SAPOrderType value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPOrder.subscriptionOrder</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the subscriptionOrder - Determines if this order is subscription order or not
	 */
	@Accessor(qualifier = "subscriptionOrder", type = Accessor.Type.SETTER)
	public void setSubscriptionOrder(final boolean value)
	{
		getPersistenceContext().setPropertyValue(SUBSCRIPTIONORDER, toObject(value));
	}
	
}
