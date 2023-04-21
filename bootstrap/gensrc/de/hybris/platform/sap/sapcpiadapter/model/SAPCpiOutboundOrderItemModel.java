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
 * Generated model class for type SAPCpiOutboundOrderItem first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundOrderItemModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundOrderItem";
	
	/**<i>Generated relation code constant for relation <code>SAPCpiOutboundOrder2SAPCpiOutboundOrderItem</code> defining source attribute <code>sapCpiOutboundOrder</code> in extension <code>sapcpiadapter</code>.</i>*/
	public static final String _SAPCPIOUTBOUNDORDER2SAPCPIOUTBOUNDORDERITEM = "SAPCpiOutboundOrder2SAPCpiOutboundOrderItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ENTRYNUMBER = "entryNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.quantity</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CURRENCYISOCODE = "currencyIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.unit</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.productCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PRODUCTCODE = "productCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.productName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PRODUCTNAME = "productName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.plant</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PLANT = "plant";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.namedDeliveryDate</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String NAMEDDELIVERYDATE = "namedDeliveryDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.itemCategory</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ITEMCATEGORY = "itemCategory";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDORDER = "sapCpiOutboundOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.pricePlanId</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String PRICEPLANID = "pricePlanId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.subscriptionValidFrom</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String SUBSCRIPTIONVALIDFROM = "subscriptionValidFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.subscriptionValidTill</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String SUBSCRIPTIONVALIDTILL = "subscriptionValidTill";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.overwriteContractTerm</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String OVERWRITECONTRACTTERM = "overwriteContractTerm";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundOrderItem.subscriptionValidTerm</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String SUBSCRIPTIONVALIDTERM = "subscriptionValidTerm";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundOrderItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundOrderItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundOrderItemModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the currencyIsoCode
	 */
	@Accessor(qualifier = "currencyIsoCode", type = Accessor.Type.GETTER)
	public String getCurrencyIsoCode()
	{
		return getPersistenceContext().getPropertyValue(CURRENCYISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.GETTER)
	public String getEntryNumber()
	{
		return getPersistenceContext().getPropertyValue(ENTRYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.itemCategory</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the itemCategory
	 */
	@Accessor(qualifier = "itemCategory", type = Accessor.Type.GETTER)
	public String getItemCategory()
	{
		return getPersistenceContext().getPropertyValue(ITEMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.namedDeliveryDate</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the namedDeliveryDate
	 */
	@Accessor(qualifier = "namedDeliveryDate", type = Accessor.Type.GETTER)
	public String getNamedDeliveryDate()
	{
		return getPersistenceContext().getPropertyValue(NAMEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.overwriteContractTerm</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the overwriteContractTerm - Override subscription terms.
	 */
	@Accessor(qualifier = "overwriteContractTerm", type = Accessor.Type.GETTER)
	public String getOverwriteContractTerm()
	{
		return getPersistenceContext().getPropertyValue(OVERWRITECONTRACTTERM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.plant</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the plant
	 */
	@Accessor(qualifier = "plant", type = Accessor.Type.GETTER)
	public String getPlant()
	{
		return getPersistenceContext().getPropertyValue(PLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.pricePlanId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the pricePlanId - The price plan ID for the item.
	 */
	@Accessor(qualifier = "pricePlanId", type = Accessor.Type.GETTER)
	public String getPricePlanId()
	{
		return getPersistenceContext().getPropertyValue(PRICEPLANID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.productCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the productCode
	 */
	@Accessor(qualifier = "productCode", type = Accessor.Type.GETTER)
	public String getProductCode()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.productName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the productName
	 */
	@Accessor(qualifier = "productName", type = Accessor.Type.GETTER)
	public String getProductName()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.quantity</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.GETTER)
	public String getQuantity()
	{
		return getPersistenceContext().getPropertyValue(QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.GETTER)
	public SAPCpiOutboundOrderModel getSapCpiOutboundOrder()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.subscriptionValidFrom</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the subscriptionValidFrom - Subscription start date.
	 */
	@Accessor(qualifier = "subscriptionValidFrom", type = Accessor.Type.GETTER)
	public String getSubscriptionValidFrom()
	{
		return getPersistenceContext().getPropertyValue(SUBSCRIPTIONVALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.subscriptionValidTerm</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the subscriptionValidTerm - Subscription validity term or period.
	 */
	@Accessor(qualifier = "subscriptionValidTerm", type = Accessor.Type.GETTER)
	public String getSubscriptionValidTerm()
	{
		return getPersistenceContext().getPropertyValue(SUBSCRIPTIONVALIDTERM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.subscriptionValidTill</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the subscriptionValidTill - Subscription valid till date.
	 */
	@Accessor(qualifier = "subscriptionValidTill", type = Accessor.Type.GETTER)
	public String getSubscriptionValidTill()
	{
		return getPersistenceContext().getPropertyValue(SUBSCRIPTIONVALIDTILL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundOrderItem.unit</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.GETTER)
	public String getUnit()
	{
		return getPersistenceContext().getPropertyValue(UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the currencyIsoCode
	 */
	@Accessor(qualifier = "currencyIsoCode", type = Accessor.Type.SETTER)
	public void setCurrencyIsoCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CURRENCYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.SETTER)
	public void setEntryNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(ENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.itemCategory</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the itemCategory
	 */
	@Accessor(qualifier = "itemCategory", type = Accessor.Type.SETTER)
	public void setItemCategory(final String value)
	{
		getPersistenceContext().setPropertyValue(ITEMCATEGORY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.namedDeliveryDate</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the namedDeliveryDate
	 */
	@Accessor(qualifier = "namedDeliveryDate", type = Accessor.Type.SETTER)
	public void setNamedDeliveryDate(final String value)
	{
		getPersistenceContext().setPropertyValue(NAMEDDELIVERYDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.overwriteContractTerm</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the overwriteContractTerm - Override subscription terms.
	 */
	@Accessor(qualifier = "overwriteContractTerm", type = Accessor.Type.SETTER)
	public void setOverwriteContractTerm(final String value)
	{
		getPersistenceContext().setPropertyValue(OVERWRITECONTRACTTERM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.plant</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the plant
	 */
	@Accessor(qualifier = "plant", type = Accessor.Type.SETTER)
	public void setPlant(final String value)
	{
		getPersistenceContext().setPropertyValue(PLANT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.pricePlanId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the pricePlanId - The price plan ID for the item.
	 */
	@Accessor(qualifier = "pricePlanId", type = Accessor.Type.SETTER)
	public void setPricePlanId(final String value)
	{
		getPersistenceContext().setPropertyValue(PRICEPLANID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.productCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the productCode
	 */
	@Accessor(qualifier = "productCode", type = Accessor.Type.SETTER)
	public void setProductCode(final String value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.productName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the productName
	 */
	@Accessor(qualifier = "productName", type = Accessor.Type.SETTER)
	public void setProductName(final String value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.quantity</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.SETTER)
	public void setQuantity(final String value)
	{
		getPersistenceContext().setPropertyValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundOrder(final SAPCpiOutboundOrderModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.subscriptionValidFrom</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the subscriptionValidFrom - Subscription start date.
	 */
	@Accessor(qualifier = "subscriptionValidFrom", type = Accessor.Type.SETTER)
	public void setSubscriptionValidFrom(final String value)
	{
		getPersistenceContext().setPropertyValue(SUBSCRIPTIONVALIDFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.subscriptionValidTerm</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the subscriptionValidTerm - Subscription validity term or period.
	 */
	@Accessor(qualifier = "subscriptionValidTerm", type = Accessor.Type.SETTER)
	public void setSubscriptionValidTerm(final String value)
	{
		getPersistenceContext().setPropertyValue(SUBSCRIPTIONVALIDTERM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.subscriptionValidTill</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the subscriptionValidTill - Subscription valid till date.
	 */
	@Accessor(qualifier = "subscriptionValidTill", type = Accessor.Type.SETTER)
	public void setSubscriptionValidTill(final String value)
	{
		getPersistenceContext().setPropertyValue(SUBSCRIPTIONVALIDTILL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundOrderItem.unit</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.SETTER)
	public void setUnit(final String value)
	{
		getPersistenceContext().setPropertyValue(UNIT, value);
	}
	
}
