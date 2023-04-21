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
 * Generated model class for type SAPCpiOutboundPriceComponent first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundPriceComponentModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundPriceComponent";
	
	/**<i>Generated relation code constant for relation <code>SAPCpiOutboundOrder2SAPCpiOutboundPriceComponent</code> defining source attribute <code>sapCpiOutboundOrder</code> in extension <code>sapcpiadapter</code>.</i>*/
	public static final String _SAPCPIOUTBOUNDORDER2SAPCPIOUTBOUNDPRICECOMPONENT = "SAPCpiOutboundOrder2SAPCpiOutboundPriceComponent";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ENTRYNUMBER = "entryNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.value</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String VALUE = "value";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.unit</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.absolute</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ABSOLUTE = "absolute";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.conditionCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CONDITIONCODE = "conditionCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.conditionCounter</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CONDITIONCOUNTER = "conditionCounter";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CURRENCYISOCODE = "currencyIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.priceQuantity</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PRICEQUANTITY = "priceQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPriceComponent.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDORDER = "sapCpiOutboundOrder";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundPriceComponentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundPriceComponentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundPriceComponentModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.absolute</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the absolute
	 */
	@Accessor(qualifier = "absolute", type = Accessor.Type.GETTER)
	public String getAbsolute()
	{
		return getPersistenceContext().getPropertyValue(ABSOLUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.conditionCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the conditionCode
	 */
	@Accessor(qualifier = "conditionCode", type = Accessor.Type.GETTER)
	public String getConditionCode()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.conditionCounter</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the conditionCounter
	 */
	@Accessor(qualifier = "conditionCounter", type = Accessor.Type.GETTER)
	public String getConditionCounter()
	{
		return getPersistenceContext().getPropertyValue(CONDITIONCOUNTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the currencyIsoCode
	 */
	@Accessor(qualifier = "currencyIsoCode", type = Accessor.Type.GETTER)
	public String getCurrencyIsoCode()
	{
		return getPersistenceContext().getPropertyValue(CURRENCYISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.GETTER)
	public String getEntryNumber()
	{
		return getPersistenceContext().getPropertyValue(ENTRYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.priceQuantity</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the priceQuantity
	 */
	@Accessor(qualifier = "priceQuantity", type = Accessor.Type.GETTER)
	public String getPriceQuantity()
	{
		return getPersistenceContext().getPropertyValue(PRICEQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.GETTER)
	public SAPCpiOutboundOrderModel getSapCpiOutboundOrder()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.unit</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.GETTER)
	public String getUnit()
	{
		return getPersistenceContext().getPropertyValue(UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPriceComponent.value</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the value
	 */
	@Accessor(qualifier = "value", type = Accessor.Type.GETTER)
	public String getValue()
	{
		return getPersistenceContext().getPropertyValue(VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.absolute</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the absolute
	 */
	@Accessor(qualifier = "absolute", type = Accessor.Type.SETTER)
	public void setAbsolute(final String value)
	{
		getPersistenceContext().setPropertyValue(ABSOLUTE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.conditionCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the conditionCode
	 */
	@Accessor(qualifier = "conditionCode", type = Accessor.Type.SETTER)
	public void setConditionCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.conditionCounter</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the conditionCounter
	 */
	@Accessor(qualifier = "conditionCounter", type = Accessor.Type.SETTER)
	public void setConditionCounter(final String value)
	{
		getPersistenceContext().setPropertyValue(CONDITIONCOUNTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.currencyIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the currencyIsoCode
	 */
	@Accessor(qualifier = "currencyIsoCode", type = Accessor.Type.SETTER)
	public void setCurrencyIsoCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CURRENCYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.SETTER)
	public void setEntryNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(ENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.priceQuantity</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the priceQuantity
	 */
	@Accessor(qualifier = "priceQuantity", type = Accessor.Type.SETTER)
	public void setPriceQuantity(final String value)
	{
		getPersistenceContext().setPropertyValue(PRICEQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundOrder(final SAPCpiOutboundOrderModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.unit</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.SETTER)
	public void setUnit(final String value)
	{
		getPersistenceContext().setPropertyValue(UNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPriceComponent.value</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the value
	 */
	@Accessor(qualifier = "value", type = Accessor.Type.SETTER)
	public void setValue(final String value)
	{
		getPersistenceContext().setPropertyValue(VALUE, value);
	}
	
}
