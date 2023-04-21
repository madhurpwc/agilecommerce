/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core.model.order;

import com.sap.hybris.sapcpqquoteintegration.model.CpqPricingDetailModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.b2b.model.B2BCostCenterModel;
import de.hybris.platform.basecommerce.enums.OrderCancelEntryStatus;
import de.hybris.platform.basecommerce.enums.OrderEntryStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.europe1.enums.ProductDiscountGroup;
import de.hybris.platform.europe1.enums.ProductPriceGroup;
import de.hybris.platform.europe1.enums.ProductTaxGroup;
import de.hybris.platform.order.model.AbstractOrderEntryProductInfoModel;
import de.hybris.platform.ordersplitting.model.ConsignmentEntryModel;
import de.hybris.platform.ordersplitting.model.VendorModel;
import de.hybris.platform.sap.sapmodel.model.SAPPricingConditionModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.storelocator.model.PointOfServiceModel;
import de.hybris.platform.util.DiscountValue;
import de.hybris.platform.util.TaxValue;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type AbstractOrderEntry first defined at extension core.
 */
@SuppressWarnings("all")
public class AbstractOrderEntryModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "AbstractOrderEntry";
	
	/**<i>Generated relation code constant for relation <code>AbstractOrder2AbstractOrderEntry</code> defining source attribute <code>order</code> in extension <code>core</code>.</i>*/
	public static final String _ABSTRACTORDER2ABSTRACTORDERENTRY = "AbstractOrder2AbstractOrderEntry";
	
	/**<i>Generated relation code constant for relation <code>ConsignmentEntryOrderEntryRelation</code> defining source attribute <code>consignmentEntries</code> in extension <code>basecommerce</code>.</i>*/
	public static final String _CONSIGNMENTENTRYORDERENTRYRELATION = "ConsignmentEntryOrderEntryRelation";
	
	/**<i>Generated relation code constant for relation <code>MasterAbstractOrderEntry2ChildAbstractOrderEntriesRelation</code> defining source attribute <code>masterEntry</code> in extension <code>subscriptionservices</code>.</i>*/
	public static final String _MASTERABSTRACTORDERENTRY2CHILDABSTRACTORDERENTRIESRELATION = "MasterAbstractOrderEntry2ChildAbstractOrderEntriesRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. */
	public static final String BASEPRICE = "basePrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. */
	public static final String CALCULATED = "calculated";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.discountValuesInternal</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTVALUESINTERNAL = "discountValuesInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.discountValues</code> attribute defined at extension <code>core</code>. */
	public static final String DISCOUNTVALUES = "discountValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. */
	public static final String ENTRYNUMBER = "entryNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. */
	public static final String INFO = "info";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. */
	public static final String PRODUCT = "product";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. */
	public static final String QUANTITY = "quantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.taxValues</code> attribute defined at extension <code>core</code>. */
	public static final String TAXVALUES = "taxValues";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.taxValuesInternal</code> attribute defined at extension <code>core</code>. */
	public static final String TAXVALUESINTERNAL = "taxValuesInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. */
	public static final String TOTALPRICE = "totalPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. */
	public static final String UNIT = "unit";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. */
	public static final String GIVEAWAY = "giveAway";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. */
	public static final String REJECTED = "rejected";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.entryGroupNumbers</code> attribute defined at extension <code>core</code>. */
	public static final String ENTRYGROUPNUMBERS = "entryGroupNumbers";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.productInfos</code> attribute defined at extension <code>catalog</code>. */
	public static final String PRODUCTINFOS = "productInfos";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.Europe1PriceFactory_PPG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_PPG = "Europe1PriceFactory_PPG";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.Europe1PriceFactory_PTG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_PTG = "Europe1PriceFactory_PTG";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.Europe1PriceFactory_PDG</code> attribute defined at extension <code>europe1</code>. */
	public static final String EUROPE1PRICEFACTORY_PDG = "Europe1PriceFactory_PDG";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CHOSENVENDOR = "chosenVendor";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DELIVERYADDRESS = "deliveryAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String DELIVERYMODE = "deliveryMode";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String NAMEDDELIVERYDATE = "namedDeliveryDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String QUANTITYSTATUS = "quantityStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String CONSIGNMENTENTRIES = "consignmentEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String DELIVERYPOINTOFSERVICE = "deliveryPointOfService";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.costCenter</code> attribute defined at extension <code>b2bcommerce</code>. */
	public static final String COSTCENTER = "costCenter";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.xmlProduct</code> attribute defined at extension <code>subscriptionservices</code>. */
	public static final String XMLPRODUCT = "xmlProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.originalSubscriptionId</code> attribute defined at extension <code>subscriptionservices</code>. */
	public static final String ORIGINALSUBSCRIPTIONID = "originalSubscriptionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.originalOrderEntry</code> attribute defined at extension <code>subscriptionservices</code>. */
	public static final String ORIGINALORDERENTRY = "originalOrderEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.masterEntry</code> attribute defined at extension <code>subscriptionservices</code>. */
	public static final String MASTERENTRY = "masterEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.childEntries</code> attribute defined at extension <code>subscriptionservices</code>. */
	public static final String CHILDENTRIES = "childEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.externalConfiguration</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String EXTERNALCONFIGURATION = "externalConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.sapPricingConditions</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPPRICINGCONDITIONS = "sapPricingConditions";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.subscriptionType</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String SUBSCRIPTIONTYPE = "subscriptionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.replenishmentOrderNumber</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String REPLENISHMENTORDERNUMBER = "replenishmentOrderNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.cpqEntryDiscountInternal</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQENTRYDISCOUNTINTERNAL = "cpqEntryDiscountInternal";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.cpqPricingDetails</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQPRICINGDETAILS = "cpqPricingDetails";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.cancelledQuantity</code> attribute defined at extension <code>c4hisb2borderexchange</code>. */
	public static final String CANCELLEDQUANTITY = "cancelledQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.originalQuantity</code> attribute defined at extension <code>c4hisb2borderexchange</code>. */
	public static final String ORIGINALQUANTITY = "originalQuantity";
	
	/** <i>Generated constant</i> - Attribute key of <code>AbstractOrderEntry.cancelStatus</code> attribute defined at extension <code>c4hisb2borderexchange</code>. */
	public static final String CANCELSTATUS = "cancelStatus";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public AbstractOrderEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public AbstractOrderEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _product initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _quantity initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _unit initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public AbstractOrderEntryModel(final ProductModel _product, final Long _quantity, final UnitModel _unit)
	{
		super();
		setProduct(_product);
		setQuantity(_quantity);
		setUnit(_unit);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _product initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _quantity initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 * @param _unit initial attribute declared by type <code>AbstractOrderEntry</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public AbstractOrderEntryModel(final ItemModel _owner, final ProductModel _product, final Long _quantity, final UnitModel _unit)
	{
		super();
		setOwner(_owner);
		setProduct(_product);
		setQuantity(_quantity);
		setUnit(_unit);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. 
	 * @return the basePrice
	 */
	@Accessor(qualifier = "basePrice", type = Accessor.Type.GETTER)
	public Double getBasePrice()
	{
		return getPersistenceContext().getPropertyValue(BASEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. 
	 * @return the calculated
	 */
	@Accessor(qualifier = "calculated", type = Accessor.Type.GETTER)
	public Boolean getCalculated()
	{
		final Boolean value = getPersistenceContext().getPropertyValue(CALCULATED);
		return value != null ? value : Boolean.valueOf(false);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cancelledQuantity</code> attribute defined at extension <code>c4hisb2borderexchange</code>. 
	 * @return the cancelledQuantity
	 */
	@Accessor(qualifier = "cancelledQuantity", type = Accessor.Type.GETTER)
	public Long getCancelledQuantity()
	{
		return getPersistenceContext().getPropertyValue(CANCELLEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cancelStatus</code> attribute defined at extension <code>c4hisb2borderexchange</code>. 
	 * @return the cancelStatus
	 */
	@Accessor(qualifier = "cancelStatus", type = Accessor.Type.GETTER)
	public OrderCancelEntryStatus getCancelStatus()
	{
		return getPersistenceContext().getPropertyValue(CANCELSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.childEntries</code> attribute defined at extension <code>subscriptionservices</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the childEntries
	 */
	@Accessor(qualifier = "childEntries", type = Accessor.Type.GETTER)
	public Collection<AbstractOrderEntryModel> getChildEntries()
	{
		return getPersistenceContext().getPropertyValue(CHILDENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the chosenVendor
	 */
	@Accessor(qualifier = "chosenVendor", type = Accessor.Type.GETTER)
	public VendorModel getChosenVendor()
	{
		return getPersistenceContext().getPropertyValue(CHOSENVENDOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consignmentEntries
	 */
	@Accessor(qualifier = "consignmentEntries", type = Accessor.Type.GETTER)
	public Set<ConsignmentEntryModel> getConsignmentEntries()
	{
		return getPersistenceContext().getPropertyValue(CONSIGNMENTENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.costCenter</code> attribute defined at extension <code>b2bcommerce</code>. 
	 * @return the costCenter
	 */
	@Accessor(qualifier = "costCenter", type = Accessor.Type.GETTER)
	public B2BCostCenterModel getCostCenter()
	{
		return getPersistenceContext().getPropertyValue(COSTCENTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cpqEntryDiscountInternal</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqEntryDiscountInternal - Field to hold discount value and populate discount value during cart calculations
	 */
	@Accessor(qualifier = "cpqEntryDiscountInternal", type = Accessor.Type.GETTER)
	public String getCpqEntryDiscountInternal()
	{
		return getPersistenceContext().getPropertyValue(CPQENTRYDISCOUNTINTERNAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.cpqPricingDetails</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the cpqPricingDetails
	 */
	@Accessor(qualifier = "cpqPricingDetails", type = Accessor.Type.GETTER)
	public List<CpqPricingDetailModel> getCpqPricingDetails()
	{
		return getPersistenceContext().getPropertyValue(CPQPRICINGDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the deliveryAddress
	 */
	@Accessor(qualifier = "deliveryAddress", type = Accessor.Type.GETTER)
	public AddressModel getDeliveryAddress()
	{
		return getPersistenceContext().getPropertyValue(DELIVERYADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the deliveryMode
	 */
	@Accessor(qualifier = "deliveryMode", type = Accessor.Type.GETTER)
	public DeliveryModeModel getDeliveryMode()
	{
		return getPersistenceContext().getPropertyValue(DELIVERYMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the deliveryPointOfService - The point of service to deliver to/collect from.
	 */
	@Accessor(qualifier = "deliveryPointOfService", type = Accessor.Type.GETTER)
	public PointOfServiceModel getDeliveryPointOfService()
	{
		return getPersistenceContext().getPropertyValue(DELIVERYPOINTOFSERVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountValues</code> dynamic attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the discountValues
	 */
	@Accessor(qualifier = "discountValues", type = Accessor.Type.GETTER)
	public List<DiscountValue> getDiscountValues()
	{
		return getPersistenceContext().getDynamicValue(this,DISCOUNTVALUES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.discountValuesInternal</code> attribute defined at extension <code>core</code>. 
	 * @return the discountValuesInternal
	 */
	@Accessor(qualifier = "discountValuesInternal", type = Accessor.Type.GETTER)
	public String getDiscountValuesInternal()
	{
		return getPersistenceContext().getPropertyValue(DISCOUNTVALUESINTERNAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.entryGroupNumbers</code> attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the entryGroupNumbers - List of EntryGroup numbers that this order entry belongs to.
	 */
	@Accessor(qualifier = "entryGroupNumbers", type = Accessor.Type.GETTER)
	public Set<Integer> getEntryGroupNumbers()
	{
		return getPersistenceContext().getPropertyValue(ENTRYGROUPNUMBERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. 
	 * @return the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.GETTER)
	public Integer getEntryNumber()
	{
		return getPersistenceContext().getPropertyValue(ENTRYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.Europe1PriceFactory_PDG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_PDG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_PDG", type = Accessor.Type.GETTER)
	public ProductDiscountGroup getEurope1PriceFactory_PDG()
	{
		return getPersistenceContext().getPropertyValue(EUROPE1PRICEFACTORY_PDG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.Europe1PriceFactory_PPG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_PPG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_PPG", type = Accessor.Type.GETTER)
	public ProductPriceGroup getEurope1PriceFactory_PPG()
	{
		return getPersistenceContext().getPropertyValue(EUROPE1PRICEFACTORY_PPG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.Europe1PriceFactory_PTG</code> attribute defined at extension <code>europe1</code>. 
	 * @return the Europe1PriceFactory_PTG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_PTG", type = Accessor.Type.GETTER)
	public ProductTaxGroup getEurope1PriceFactory_PTG()
	{
		return getPersistenceContext().getPropertyValue(EUROPE1PRICEFACTORY_PTG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.externalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the externalConfiguration - XML Representation of a Product Configuration
	 */
	@Accessor(qualifier = "externalConfiguration", type = Accessor.Type.GETTER)
	public String getExternalConfiguration()
	{
		return getPersistenceContext().getPropertyValue(EXTERNALCONFIGURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. 
	 * @return the giveAway
	 */
	@Accessor(qualifier = "giveAway", type = Accessor.Type.GETTER)
	public Boolean getGiveAway()
	{
		final Boolean value = getPersistenceContext().getPropertyValue(GIVEAWAY);
		return value != null ? value : Boolean.valueOf(false);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. 
	 * @return the info
	 */
	@Accessor(qualifier = "info", type = Accessor.Type.GETTER)
	public String getInfo()
	{
		return getPersistenceContext().getPropertyValue(INFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.masterEntry</code> attribute defined at extension <code>subscriptionservices</code>. 
	 * @return the masterEntry
	 */
	@Accessor(qualifier = "masterEntry", type = Accessor.Type.GETTER)
	public AbstractOrderEntryModel getMasterEntry()
	{
		return getPersistenceContext().getPropertyValue(MASTERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the namedDeliveryDate
	 */
	@Accessor(qualifier = "namedDeliveryDate", type = Accessor.Type.GETTER)
	public Date getNamedDeliveryDate()
	{
		return getPersistenceContext().getPropertyValue(NAMEDDELIVERYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. 
	 * @return the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public AbstractOrderModel getOrder()
	{
		return getPersistenceContext().getPropertyValue(ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.originalOrderEntry</code> attribute defined at extension <code>subscriptionservices</code>. 
	 * @return the originalOrderEntry - YTODO to be added to the new entry configuration: Reference to the original entry of the subscription that is upgraded
	 */
	@Accessor(qualifier = "originalOrderEntry", type = Accessor.Type.GETTER)
	public OrderEntryModel getOriginalOrderEntry()
	{
		return getPersistenceContext().getPropertyValue(ORIGINALORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.originalQuantity</code> attribute defined at extension <code>c4hisb2borderexchange</code>. 
	 * @return the originalQuantity
	 */
	@Accessor(qualifier = "originalQuantity", type = Accessor.Type.GETTER)
	public Long getOriginalQuantity()
	{
		return getPersistenceContext().getPropertyValue(ORIGINALQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.originalSubscriptionId</code> attribute defined at extension <code>subscriptionservices</code>. 
	 * @return the originalSubscriptionId - YTODO to be added to the new entry configuration: Id of the original subscription that is upgraded
	 */
	@Accessor(qualifier = "originalSubscriptionId", type = Accessor.Type.GETTER)
	public String getOriginalSubscriptionId()
	{
		return getPersistenceContext().getPropertyValue(ORIGINALSUBSCRIPTIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. 
	 * @return the product
	 */
	@Accessor(qualifier = "product", type = Accessor.Type.GETTER)
	public ProductModel getProduct()
	{
		return getPersistenceContext().getPropertyValue(PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.productInfos</code> attribute defined at extension <code>catalog</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the productInfos
	 */
	@Accessor(qualifier = "productInfos", type = Accessor.Type.GETTER)
	public List<AbstractOrderEntryProductInfoModel> getProductInfos()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTINFOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. 
	 * @return the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.GETTER)
	public Long getQuantity()
	{
		return getPersistenceContext().getPropertyValue(QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the quantityStatus
	 */
	@Accessor(qualifier = "quantityStatus", type = Accessor.Type.GETTER)
	public OrderEntryStatus getQuantityStatus()
	{
		return getPersistenceContext().getPropertyValue(QUANTITYSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. 
	 * @return the rejected
	 */
	@Accessor(qualifier = "rejected", type = Accessor.Type.GETTER)
	public Boolean getRejected()
	{
		final Boolean value = getPersistenceContext().getPropertyValue(REJECTED);
		return value != null ? value : Boolean.valueOf(false);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.replenishmentOrderNumber</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the replenishmentOrderNumber
	 */
	@Accessor(qualifier = "replenishmentOrderNumber", type = Accessor.Type.GETTER)
	public String getReplenishmentOrderNumber()
	{
		return getPersistenceContext().getPropertyValue(REPLENISHMENTORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sapPricingConditions</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapPricingConditions - SAP pricing conditions
	 */
	@Accessor(qualifier = "sapPricingConditions", type = Accessor.Type.GETTER)
	public Set<SAPPricingConditionModel> getSapPricingConditions()
	{
		return getPersistenceContext().getPropertyValue(SAPPRICINGCONDITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.subscriptionType</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the subscriptionType
	 */
	@Accessor(qualifier = "subscriptionType", type = Accessor.Type.GETTER)
	public String getSubscriptionType()
	{
		return getPersistenceContext().getPropertyValue(SUBSCRIPTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxValues</code> dynamic attribute defined at extension <code>core</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the taxValues
	 */
	@Accessor(qualifier = "taxValues", type = Accessor.Type.GETTER)
	public Collection<TaxValue> getTaxValues()
	{
		return getPersistenceContext().getDynamicValue(this,TAXVALUES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.taxValuesInternal</code> attribute defined at extension <code>core</code>. 
	 * @return the taxValuesInternal
	 */
	@Accessor(qualifier = "taxValuesInternal", type = Accessor.Type.GETTER)
	public String getTaxValuesInternal()
	{
		return getPersistenceContext().getPropertyValue(TAXVALUESINTERNAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. 
	 * @return the totalPrice
	 */
	@Accessor(qualifier = "totalPrice", type = Accessor.Type.GETTER)
	public Double getTotalPrice()
	{
		return getPersistenceContext().getPropertyValue(TOTALPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. 
	 * @return the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.GETTER)
	public UnitModel getUnit()
	{
		return getPersistenceContext().getPropertyValue(UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.xmlProduct</code> attribute defined at extension <code>subscriptionservices</code>. 
	 * @return the xmlProduct - xmlProduct
	 */
	@Accessor(qualifier = "xmlProduct", type = Accessor.Type.GETTER)
	public String getXmlProduct()
	{
		return getPersistenceContext().getPropertyValue(XMLPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.basePrice</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the basePrice
	 */
	@Accessor(qualifier = "basePrice", type = Accessor.Type.SETTER)
	public void setBasePrice(final Double value)
	{
		getPersistenceContext().setPropertyValue(BASEPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.calculated</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the calculated
	 */
	@Accessor(qualifier = "calculated", type = Accessor.Type.SETTER)
	public void setCalculated(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(CALCULATED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.cancelledQuantity</code> attribute defined at extension <code>c4hisb2borderexchange</code>. 
	 *  
	 * @param value the cancelledQuantity
	 */
	@Accessor(qualifier = "cancelledQuantity", type = Accessor.Type.SETTER)
	public void setCancelledQuantity(final Long value)
	{
		getPersistenceContext().setPropertyValue(CANCELLEDQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.cancelStatus</code> attribute defined at extension <code>c4hisb2borderexchange</code>. 
	 *  
	 * @param value the cancelStatus
	 */
	@Accessor(qualifier = "cancelStatus", type = Accessor.Type.SETTER)
	public void setCancelStatus(final OrderCancelEntryStatus value)
	{
		getPersistenceContext().setPropertyValue(CANCELSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.childEntries</code> attribute defined at extension <code>subscriptionservices</code>. 
	 *  
	 * @param value the childEntries
	 */
	@Accessor(qualifier = "childEntries", type = Accessor.Type.SETTER)
	public void setChildEntries(final Collection<AbstractOrderEntryModel> value)
	{
		getPersistenceContext().setPropertyValue(CHILDENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.chosenVendor</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the chosenVendor
	 */
	@Accessor(qualifier = "chosenVendor", type = Accessor.Type.SETTER)
	public void setChosenVendor(final VendorModel value)
	{
		getPersistenceContext().setPropertyValue(CHOSENVENDOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.consignmentEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the consignmentEntries
	 */
	@Accessor(qualifier = "consignmentEntries", type = Accessor.Type.SETTER)
	public void setConsignmentEntries(final Set<ConsignmentEntryModel> value)
	{
		getPersistenceContext().setPropertyValue(CONSIGNMENTENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.costCenter</code> attribute defined at extension <code>b2bcommerce</code>. 
	 *  
	 * @param value the costCenter
	 */
	@Accessor(qualifier = "costCenter", type = Accessor.Type.SETTER)
	public void setCostCenter(final B2BCostCenterModel value)
	{
		getPersistenceContext().setPropertyValue(COSTCENTER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.cpqEntryDiscountInternal</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqEntryDiscountInternal - Field to hold discount value and populate discount value during cart calculations
	 */
	@Accessor(qualifier = "cpqEntryDiscountInternal", type = Accessor.Type.SETTER)
	public void setCpqEntryDiscountInternal(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQENTRYDISCOUNTINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.cpqPricingDetails</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqPricingDetails
	 */
	@Accessor(qualifier = "cpqPricingDetails", type = Accessor.Type.SETTER)
	public void setCpqPricingDetails(final List<CpqPricingDetailModel> value)
	{
		getPersistenceContext().setPropertyValue(CPQPRICINGDETAILS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.deliveryAddress</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the deliveryAddress
	 */
	@Accessor(qualifier = "deliveryAddress", type = Accessor.Type.SETTER)
	public void setDeliveryAddress(final AddressModel value)
	{
		getPersistenceContext().setPropertyValue(DELIVERYADDRESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.deliveryMode</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the deliveryMode
	 */
	@Accessor(qualifier = "deliveryMode", type = Accessor.Type.SETTER)
	public void setDeliveryMode(final DeliveryModeModel value)
	{
		getPersistenceContext().setPropertyValue(DELIVERYMODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.deliveryPointOfService</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the deliveryPointOfService - The point of service to deliver to/collect from.
	 */
	@Accessor(qualifier = "deliveryPointOfService", type = Accessor.Type.SETTER)
	public void setDeliveryPointOfService(final PointOfServiceModel value)
	{
		getPersistenceContext().setPropertyValue(DELIVERYPOINTOFSERVICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.discountValues</code> dynamic attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the discountValues
	 */
	@Accessor(qualifier = "discountValues", type = Accessor.Type.SETTER)
	public void setDiscountValues(final List<DiscountValue> value)
	{
		getPersistenceContext().setDynamicValue(this,DISCOUNTVALUES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.discountValuesInternal</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the discountValuesInternal
	 */
	@Accessor(qualifier = "discountValuesInternal", type = Accessor.Type.SETTER)
	public void setDiscountValuesInternal(final String value)
	{
		getPersistenceContext().setPropertyValue(DISCOUNTVALUESINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.entryGroupNumbers</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the entryGroupNumbers - List of EntryGroup numbers that this order entry belongs to.
	 */
	@Accessor(qualifier = "entryGroupNumbers", type = Accessor.Type.SETTER)
	public void setEntryGroupNumbers(final Set<Integer> value)
	{
		getPersistenceContext().setPropertyValue(ENTRYGROUPNUMBERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.entryNumber</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.SETTER)
	public void setEntryNumber(final Integer value)
	{
		getPersistenceContext().setPropertyValue(ENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.Europe1PriceFactory_PDG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_PDG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_PDG", type = Accessor.Type.SETTER)
	public void setEurope1PriceFactory_PDG(final ProductDiscountGroup value)
	{
		getPersistenceContext().setPropertyValue(EUROPE1PRICEFACTORY_PDG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.Europe1PriceFactory_PPG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_PPG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_PPG", type = Accessor.Type.SETTER)
	public void setEurope1PriceFactory_PPG(final ProductPriceGroup value)
	{
		getPersistenceContext().setPropertyValue(EUROPE1PRICEFACTORY_PPG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.Europe1PriceFactory_PTG</code> attribute defined at extension <code>europe1</code>. 
	 *  
	 * @param value the Europe1PriceFactory_PTG
	 */
	@Accessor(qualifier = "Europe1PriceFactory_PTG", type = Accessor.Type.SETTER)
	public void setEurope1PriceFactory_PTG(final ProductTaxGroup value)
	{
		getPersistenceContext().setPropertyValue(EUROPE1PRICEFACTORY_PTG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.externalConfiguration</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the externalConfiguration - XML Representation of a Product Configuration
	 */
	@Accessor(qualifier = "externalConfiguration", type = Accessor.Type.SETTER)
	public void setExternalConfiguration(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTERNALCONFIGURATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.giveAway</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the giveAway
	 */
	@Accessor(qualifier = "giveAway", type = Accessor.Type.SETTER)
	public void setGiveAway(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(GIVEAWAY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.info</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the info
	 */
	@Accessor(qualifier = "info", type = Accessor.Type.SETTER)
	public void setInfo(final String value)
	{
		getPersistenceContext().setPropertyValue(INFO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.masterEntry</code> attribute defined at extension <code>subscriptionservices</code>. 
	 *  
	 * @param value the masterEntry
	 */
	@Accessor(qualifier = "masterEntry", type = Accessor.Type.SETTER)
	public void setMasterEntry(final AbstractOrderEntryModel value)
	{
		getPersistenceContext().setPropertyValue(MASTERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.namedDeliveryDate</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the namedDeliveryDate
	 */
	@Accessor(qualifier = "namedDeliveryDate", type = Accessor.Type.SETTER)
	public void setNamedDeliveryDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(NAMEDDELIVERYDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final AbstractOrderModel value)
	{
		getPersistenceContext().setPropertyValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.originalOrderEntry</code> attribute defined at extension <code>subscriptionservices</code>. 
	 *  
	 * @param value the originalOrderEntry - YTODO to be added to the new entry configuration: Reference to the original entry of the subscription that is upgraded
	 */
	@Accessor(qualifier = "originalOrderEntry", type = Accessor.Type.SETTER)
	public void setOriginalOrderEntry(final OrderEntryModel value)
	{
		getPersistenceContext().setPropertyValue(ORIGINALORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.originalQuantity</code> attribute defined at extension <code>c4hisb2borderexchange</code>. 
	 *  
	 * @param value the originalQuantity
	 */
	@Accessor(qualifier = "originalQuantity", type = Accessor.Type.SETTER)
	public void setOriginalQuantity(final Long value)
	{
		getPersistenceContext().setPropertyValue(ORIGINALQUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.originalSubscriptionId</code> attribute defined at extension <code>subscriptionservices</code>. 
	 *  
	 * @param value the originalSubscriptionId - YTODO to be added to the new entry configuration: Id of the original subscription that is upgraded
	 */
	@Accessor(qualifier = "originalSubscriptionId", type = Accessor.Type.SETTER)
	public void setOriginalSubscriptionId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORIGINALSUBSCRIPTIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.product</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the product
	 */
	@Accessor(qualifier = "product", type = Accessor.Type.SETTER)
	public void setProduct(final ProductModel value)
	{
		getPersistenceContext().setPropertyValue(PRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.productInfos</code> attribute defined at extension <code>catalog</code>. 
	 *  
	 * @param value the productInfos
	 */
	@Accessor(qualifier = "productInfos", type = Accessor.Type.SETTER)
	public void setProductInfos(final List<AbstractOrderEntryProductInfoModel> value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTINFOS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.quantity</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the quantity
	 */
	@Accessor(qualifier = "quantity", type = Accessor.Type.SETTER)
	public void setQuantity(final Long value)
	{
		getPersistenceContext().setPropertyValue(QUANTITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.quantityStatus</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the quantityStatus
	 */
	@Accessor(qualifier = "quantityStatus", type = Accessor.Type.SETTER)
	public void setQuantityStatus(final OrderEntryStatus value)
	{
		getPersistenceContext().setPropertyValue(QUANTITYSTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.rejected</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the rejected
	 */
	@Accessor(qualifier = "rejected", type = Accessor.Type.SETTER)
	public void setRejected(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(REJECTED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.replenishmentOrderNumber</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the replenishmentOrderNumber
	 */
	@Accessor(qualifier = "replenishmentOrderNumber", type = Accessor.Type.SETTER)
	public void setReplenishmentOrderNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(REPLENISHMENTORDERNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.sapPricingConditions</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapPricingConditions - SAP pricing conditions
	 */
	@Accessor(qualifier = "sapPricingConditions", type = Accessor.Type.SETTER)
	public void setSapPricingConditions(final Set<SAPPricingConditionModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPPRICINGCONDITIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.subscriptionType</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the subscriptionType
	 */
	@Accessor(qualifier = "subscriptionType", type = Accessor.Type.SETTER)
	public void setSubscriptionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SUBSCRIPTIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.taxValues</code> dynamic attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the taxValues
	 */
	@Accessor(qualifier = "taxValues", type = Accessor.Type.SETTER)
	public void setTaxValues(final Collection<TaxValue> value)
	{
		getPersistenceContext().setDynamicValue(this,TAXVALUES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.taxValuesInternal</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the taxValuesInternal
	 */
	@Accessor(qualifier = "taxValuesInternal", type = Accessor.Type.SETTER)
	public void setTaxValuesInternal(final String value)
	{
		getPersistenceContext().setPropertyValue(TAXVALUESINTERNAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.totalPrice</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the totalPrice
	 */
	@Accessor(qualifier = "totalPrice", type = Accessor.Type.SETTER)
	public void setTotalPrice(final Double value)
	{
		getPersistenceContext().setPropertyValue(TOTALPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.unit</code> attribute defined at extension <code>core</code>. 
	 *  
	 * @param value the unit
	 */
	@Accessor(qualifier = "unit", type = Accessor.Type.SETTER)
	public void setUnit(final UnitModel value)
	{
		getPersistenceContext().setPropertyValue(UNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>AbstractOrderEntry.xmlProduct</code> attribute defined at extension <code>subscriptionservices</code>. 
	 *  
	 * @param value the xmlProduct - xmlProduct
	 */
	@Accessor(qualifier = "xmlProduct", type = Accessor.Type.SETTER)
	public void setXmlProduct(final String value)
	{
		getPersistenceContext().setPropertyValue(XMLPRODUCT, value);
	}
	
}
