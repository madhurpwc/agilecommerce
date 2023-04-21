/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcpqquoteintegration.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type CpqPricingDetail first defined at extension sapcpqquoteintegration.
 */
@SuppressWarnings("all")
public class CpqPricingDetailModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CpqPricingDetail";
	
	/**<i>Generated relation code constant for relation <code>AbstractOrderEntry2CpqPricingDetail</code> defining source attribute <code>orderEntry</code> in extension <code>sapcpqquoteintegration</code>.</i>*/
	public static final String _ABSTRACTORDERENTRY2CPQPRICINGDETAIL = "AbstractOrderEntry2CpqPricingDetail";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.pricingType</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRICINGTYPE = "pricingType";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.itemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ITEMID = "itemId";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.listPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String LISTPRICE = "listPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.netPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String NETPRICE = "netPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.rolledUpDiscountAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLLEDUPDISCOUNTAMOUNT = "rolledUpDiscountAmount";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.discountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String DISCOUNTPERCENT = "discountPercent";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.extendedListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EXTENDEDLISTPRICE = "extendedListPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.extendedAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String EXTENDEDAMOUNT = "extendedAmount";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.rolledUpListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLLEDUPLISTPRICE = "rolledUpListPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.rolledUpExtendedListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLLEDUPEXTENDEDLISTPRICE = "rolledUpExtendedListPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.rolledUpNetPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLLEDUPNETPRICE = "rolledUpNetPrice";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.rolledUpExtendedAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLLEDUPEXTENDEDAMOUNT = "rolledUpExtendedAmount";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.discountAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String DISCOUNTAMOUNT = "discountAmount";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.rolledUpDiscountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLLEDUPDISCOUNTPERCENT = "rolledUpDiscountPercent";
	
	/** <i>Generated constant</i> - Attribute key of <code>CpqPricingDetail.orderEntry</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ORDERENTRY = "orderEntry";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CpqPricingDetailModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CpqPricingDetailModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CpqPricingDetailModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.discountAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the discountAmount
	 */
	@Accessor(qualifier = "discountAmount", type = Accessor.Type.GETTER)
	public String getDiscountAmount()
	{
		return getPersistenceContext().getPropertyValue(DISCOUNTAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.discountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the discountPercent
	 */
	@Accessor(qualifier = "discountPercent", type = Accessor.Type.GETTER)
	public String getDiscountPercent()
	{
		return getPersistenceContext().getPropertyValue(DISCOUNTPERCENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.extendedAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the extendedAmount
	 */
	@Accessor(qualifier = "extendedAmount", type = Accessor.Type.GETTER)
	public String getExtendedAmount()
	{
		return getPersistenceContext().getPropertyValue(EXTENDEDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.extendedListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the extendedListPrice
	 */
	@Accessor(qualifier = "extendedListPrice", type = Accessor.Type.GETTER)
	public String getExtendedListPrice()
	{
		return getPersistenceContext().getPropertyValue(EXTENDEDLISTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.itemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the itemId
	 */
	@Accessor(qualifier = "itemId", type = Accessor.Type.GETTER)
	public String getItemId()
	{
		return getPersistenceContext().getPropertyValue(ITEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.listPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the listPrice
	 */
	@Accessor(qualifier = "listPrice", type = Accessor.Type.GETTER)
	public String getListPrice()
	{
		return getPersistenceContext().getPropertyValue(LISTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.netPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the netPrice
	 */
	@Accessor(qualifier = "netPrice", type = Accessor.Type.GETTER)
	public String getNetPrice()
	{
		return getPersistenceContext().getPropertyValue(NETPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.orderEntry</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the orderEntry
	 */
	@Accessor(qualifier = "orderEntry", type = Accessor.Type.GETTER)
	public AbstractOrderEntryModel getOrderEntry()
	{
		return getPersistenceContext().getPropertyValue(ORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.pricingType</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the pricingType
	 */
	@Accessor(qualifier = "pricingType", type = Accessor.Type.GETTER)
	public String getPricingType()
	{
		return getPersistenceContext().getPropertyValue(PRICINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.rolledUpDiscountAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the rolledUpDiscountAmount
	 */
	@Accessor(qualifier = "rolledUpDiscountAmount", type = Accessor.Type.GETTER)
	public String getRolledUpDiscountAmount()
	{
		return getPersistenceContext().getPropertyValue(ROLLEDUPDISCOUNTAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.rolledUpDiscountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the rolledUpDiscountPercent
	 */
	@Accessor(qualifier = "rolledUpDiscountPercent", type = Accessor.Type.GETTER)
	public String getRolledUpDiscountPercent()
	{
		return getPersistenceContext().getPropertyValue(ROLLEDUPDISCOUNTPERCENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.rolledUpExtendedAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the rolledUpExtendedAmount
	 */
	@Accessor(qualifier = "rolledUpExtendedAmount", type = Accessor.Type.GETTER)
	public String getRolledUpExtendedAmount()
	{
		return getPersistenceContext().getPropertyValue(ROLLEDUPEXTENDEDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.rolledUpExtendedListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the rolledUpExtendedListPrice
	 */
	@Accessor(qualifier = "rolledUpExtendedListPrice", type = Accessor.Type.GETTER)
	public String getRolledUpExtendedListPrice()
	{
		return getPersistenceContext().getPropertyValue(ROLLEDUPEXTENDEDLISTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.rolledUpListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the rolledUpListPrice
	 */
	@Accessor(qualifier = "rolledUpListPrice", type = Accessor.Type.GETTER)
	public String getRolledUpListPrice()
	{
		return getPersistenceContext().getPropertyValue(ROLLEDUPLISTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CpqPricingDetail.rolledUpNetPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the rolledUpNetPrice
	 */
	@Accessor(qualifier = "rolledUpNetPrice", type = Accessor.Type.GETTER)
	public String getRolledUpNetPrice()
	{
		return getPersistenceContext().getPropertyValue(ROLLEDUPNETPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.discountAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the discountAmount
	 */
	@Accessor(qualifier = "discountAmount", type = Accessor.Type.SETTER)
	public void setDiscountAmount(final String value)
	{
		getPersistenceContext().setPropertyValue(DISCOUNTAMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.discountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the discountPercent
	 */
	@Accessor(qualifier = "discountPercent", type = Accessor.Type.SETTER)
	public void setDiscountPercent(final String value)
	{
		getPersistenceContext().setPropertyValue(DISCOUNTPERCENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.extendedAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the extendedAmount
	 */
	@Accessor(qualifier = "extendedAmount", type = Accessor.Type.SETTER)
	public void setExtendedAmount(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTENDEDAMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.extendedListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the extendedListPrice
	 */
	@Accessor(qualifier = "extendedListPrice", type = Accessor.Type.SETTER)
	public void setExtendedListPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(EXTENDEDLISTPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.itemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the itemId
	 */
	@Accessor(qualifier = "itemId", type = Accessor.Type.SETTER)
	public void setItemId(final String value)
	{
		getPersistenceContext().setPropertyValue(ITEMID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.listPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the listPrice
	 */
	@Accessor(qualifier = "listPrice", type = Accessor.Type.SETTER)
	public void setListPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(LISTPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.netPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the netPrice
	 */
	@Accessor(qualifier = "netPrice", type = Accessor.Type.SETTER)
	public void setNetPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(NETPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.orderEntry</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the orderEntry
	 */
	@Accessor(qualifier = "orderEntry", type = Accessor.Type.SETTER)
	public void setOrderEntry(final AbstractOrderEntryModel value)
	{
		getPersistenceContext().setPropertyValue(ORDERENTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.pricingType</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the pricingType
	 */
	@Accessor(qualifier = "pricingType", type = Accessor.Type.SETTER)
	public void setPricingType(final String value)
	{
		getPersistenceContext().setPropertyValue(PRICINGTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.rolledUpDiscountAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the rolledUpDiscountAmount
	 */
	@Accessor(qualifier = "rolledUpDiscountAmount", type = Accessor.Type.SETTER)
	public void setRolledUpDiscountAmount(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLLEDUPDISCOUNTAMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.rolledUpDiscountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the rolledUpDiscountPercent
	 */
	@Accessor(qualifier = "rolledUpDiscountPercent", type = Accessor.Type.SETTER)
	public void setRolledUpDiscountPercent(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLLEDUPDISCOUNTPERCENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.rolledUpExtendedAmount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the rolledUpExtendedAmount
	 */
	@Accessor(qualifier = "rolledUpExtendedAmount", type = Accessor.Type.SETTER)
	public void setRolledUpExtendedAmount(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLLEDUPEXTENDEDAMOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.rolledUpExtendedListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the rolledUpExtendedListPrice
	 */
	@Accessor(qualifier = "rolledUpExtendedListPrice", type = Accessor.Type.SETTER)
	public void setRolledUpExtendedListPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLLEDUPEXTENDEDLISTPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.rolledUpListPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the rolledUpListPrice
	 */
	@Accessor(qualifier = "rolledUpListPrice", type = Accessor.Type.SETTER)
	public void setRolledUpListPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLLEDUPLISTPRICE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CpqPricingDetail.rolledUpNetPrice</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the rolledUpNetPrice
	 */
	@Accessor(qualifier = "rolledUpNetPrice", type = Accessor.Type.SETTER)
	public void setRolledUpNetPrice(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLLEDUPNETPRICE, value);
	}
	
}
