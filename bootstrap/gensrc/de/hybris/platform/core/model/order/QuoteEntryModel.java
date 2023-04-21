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
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.QuoteModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.product.UnitModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type QuoteEntry first defined at extension core.
 */
@SuppressWarnings("all")
public class QuoteEntryModel extends AbstractOrderEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "QuoteEntry";
	
	/**<i>Generated relation code constant for relation <code>AbstractOrder2AbstractOrderEntry</code> defining source attribute <code>order</code> in extension <code>core</code>.</i>*/
	public static final String _ABSTRACTORDER2ABSTRACTORDERENTRY = "AbstractOrder2AbstractOrderEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.contractStartDate</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String CONTRACTSTARTDATE = "contractStartDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.contractEndDate</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String CONTRACTENDDATE = "contractEndDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.billingCycle</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String BILLINGCYCLE = "billingCycle";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.contractExtension</code> attribute defined at extension <code>c4hisb2ccore</code>. */
	public static final String CONTRACTEXTENSION = "contractExtension";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqEntryDiscount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQENTRYDISCOUNT = "cpqEntryDiscount";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqExternalQuoteEntryId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQEXTERNALQUOTEENTRYID = "cpqExternalQuoteEntryId";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqRank</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQRANK = "cpqRank";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqItemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQITEMID = "cpqItemId";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.productId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRODUCTID = "productId";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.productTypeName</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String PRODUCTTYPENAME = "productTypeName";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.discountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String DISCOUNTPERCENT = "discountPercent";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqParentItemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQPARENTITEMID = "cpqParentItemId";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQCONFIGURATIONID = "cpqConfigurationId";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteEntry.cpqExternalConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQEXTERNALCONFIGURATIONID = "cpqExternalConfigurationId";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public QuoteEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public QuoteEntryModel(final ItemModelContext ctx)
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
	public QuoteEntryModel(final ProductModel _product, final Long _quantity, final UnitModel _unit)
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
	public QuoteEntryModel(final ItemModel _owner, final ProductModel _product, final Long _quantity, final UnitModel _unit)
	{
		super();
		setOwner(_owner);
		setProduct(_product);
		setQuantity(_quantity);
		setUnit(_unit);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.billingCycle</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the billingCycle
	 */
	@Accessor(qualifier = "billingCycle", type = Accessor.Type.GETTER)
	public String getBillingCycle()
	{
		return getPersistenceContext().getPropertyValue(BILLINGCYCLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.contractEndDate</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the contractEndDate
	 */
	@Accessor(qualifier = "contractEndDate", type = Accessor.Type.GETTER)
	public Date getContractEndDate()
	{
		return getPersistenceContext().getPropertyValue(CONTRACTENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.contractExtension</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the contractExtension
	 */
	@Accessor(qualifier = "contractExtension", type = Accessor.Type.GETTER)
	public String getContractExtension()
	{
		return getPersistenceContext().getPropertyValue(CONTRACTEXTENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.contractStartDate</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 * @return the contractStartDate
	 */
	@Accessor(qualifier = "contractStartDate", type = Accessor.Type.GETTER)
	public Date getContractStartDate()
	{
		return getPersistenceContext().getPropertyValue(CONTRACTSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqConfigurationId
	 */
	@Accessor(qualifier = "cpqConfigurationId", type = Accessor.Type.GETTER)
	public String getCpqConfigurationId()
	{
		return getPersistenceContext().getPropertyValue(CPQCONFIGURATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqEntryDiscount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqEntryDiscount
	 */
	@Accessor(qualifier = "cpqEntryDiscount", type = Accessor.Type.GETTER)
	public Double getCpqEntryDiscount()
	{
		return getPersistenceContext().getPropertyValue(CPQENTRYDISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqExternalConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqExternalConfigurationId
	 */
	@Accessor(qualifier = "cpqExternalConfigurationId", type = Accessor.Type.GETTER)
	public String getCpqExternalConfigurationId()
	{
		return getPersistenceContext().getPropertyValue(CPQEXTERNALCONFIGURATIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqExternalQuoteEntryId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqExternalQuoteEntryId - Unique identifier of QuoteEntry in the External Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqExternalQuoteEntryId", type = Accessor.Type.GETTER)
	public String getCpqExternalQuoteEntryId()
	{
		return getPersistenceContext().getPropertyValue(CPQEXTERNALQUOTEENTRYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqItemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqItemId - Unique identifier of Product. Used to map this Quote Entry to a specific product in Commerce
	 */
	@Accessor(qualifier = "cpqItemId", type = Accessor.Type.GETTER)
	public String getCpqItemId()
	{
		return getPersistenceContext().getPropertyValue(CPQITEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqParentItemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqParentItemId
	 */
	@Accessor(qualifier = "cpqParentItemId", type = Accessor.Type.GETTER)
	public String getCpqParentItemId()
	{
		return getPersistenceContext().getPropertyValue(CPQPARENTITEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.cpqRank</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqRank - Unique rank of QuoteEntry in the External Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqRank", type = Accessor.Type.GETTER)
	public String getCpqRank()
	{
		return getPersistenceContext().getPropertyValue(CPQRANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.discountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the discountPercent - Placeholder for discount percentage
	 */
	@Accessor(qualifier = "discountPercent", type = Accessor.Type.GETTER)
	public String getDiscountPercent()
	{
		return getPersistenceContext().getPropertyValue(DISCOUNTPERCENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code> and redeclared at extension <code>core</code>. 
	 * @return the order
	 */
	@Override
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public QuoteModel getOrder()
	{
		return (QuoteModel) super.getOrder();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.productId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the productId - Unique identifier of Product. Used to map this Quote Entry to a specific product in Commerce
	 */
	@Accessor(qualifier = "productId", type = Accessor.Type.GETTER)
	public String getProductId()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteEntry.productTypeName</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the productTypeName - Unique identifier of Product. Used to map this Quote Entry to a specific product in Commerce
	 */
	@Accessor(qualifier = "productTypeName", type = Accessor.Type.GETTER)
	public String getProductTypeName()
	{
		return getPersistenceContext().getPropertyValue(PRODUCTTYPENAME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.billingCycle</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the billingCycle
	 */
	@Accessor(qualifier = "billingCycle", type = Accessor.Type.SETTER)
	public void setBillingCycle(final String value)
	{
		getPersistenceContext().setPropertyValue(BILLINGCYCLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.contractEndDate</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the contractEndDate
	 */
	@Accessor(qualifier = "contractEndDate", type = Accessor.Type.SETTER)
	public void setContractEndDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(CONTRACTENDDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.contractExtension</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the contractExtension
	 */
	@Accessor(qualifier = "contractExtension", type = Accessor.Type.SETTER)
	public void setContractExtension(final String value)
	{
		getPersistenceContext().setPropertyValue(CONTRACTEXTENSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.contractStartDate</code> attribute defined at extension <code>c4hisb2ccore</code>. 
	 *  
	 * @param value the contractStartDate
	 */
	@Accessor(qualifier = "contractStartDate", type = Accessor.Type.SETTER)
	public void setContractStartDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(CONTRACTSTARTDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqConfigurationId
	 */
	@Accessor(qualifier = "cpqConfigurationId", type = Accessor.Type.SETTER)
	public void setCpqConfigurationId(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQCONFIGURATIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqEntryDiscount</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqEntryDiscount
	 */
	@Accessor(qualifier = "cpqEntryDiscount", type = Accessor.Type.SETTER)
	public void setCpqEntryDiscount(final Double value)
	{
		getPersistenceContext().setPropertyValue(CPQENTRYDISCOUNT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqExternalConfigurationId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqExternalConfigurationId
	 */
	@Accessor(qualifier = "cpqExternalConfigurationId", type = Accessor.Type.SETTER)
	public void setCpqExternalConfigurationId(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQEXTERNALCONFIGURATIONID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqExternalQuoteEntryId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqExternalQuoteEntryId - Unique identifier of QuoteEntry in the External Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqExternalQuoteEntryId", type = Accessor.Type.SETTER)
	public void setCpqExternalQuoteEntryId(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQEXTERNALQUOTEENTRYID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqItemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqItemId - Unique identifier of Product. Used to map this Quote Entry to a specific product in Commerce
	 */
	@Accessor(qualifier = "cpqItemId", type = Accessor.Type.SETTER)
	public void setCpqItemId(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQITEMID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqParentItemId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqParentItemId
	 */
	@Accessor(qualifier = "cpqParentItemId", type = Accessor.Type.SETTER)
	public void setCpqParentItemId(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQPARENTITEMID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.cpqRank</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqRank - Unique rank of QuoteEntry in the External Integrated System, eg. Callidus CPQ
	 */
	@Accessor(qualifier = "cpqRank", type = Accessor.Type.SETTER)
	public void setCpqRank(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQRANK, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.discountPercent</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the discountPercent - Placeholder for discount percentage
	 */
	@Accessor(qualifier = "discountPercent", type = Accessor.Type.SETTER)
	public void setDiscountPercent(final String value)
	{
		getPersistenceContext().setPropertyValue(DISCOUNTPERCENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractOrderEntry.order</code> attribute defined at extension <code>core</code> and redeclared at extension <code>core</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.core.model.order.QuoteModel}.  
	 *  
	 * @param value the order
	 */
	@Override
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final AbstractOrderModel value)
	{
		if( value == null || value instanceof QuoteModel)
		{
			super.setOrder(value);
		}
		else
		{
			throw new IllegalArgumentException("Given value is not instance of de.hybris.platform.core.model.order.QuoteModel");
		}
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.productId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the productId - Unique identifier of Product. Used to map this Quote Entry to a specific product in Commerce
	 */
	@Accessor(qualifier = "productId", type = Accessor.Type.SETTER)
	public void setProductId(final String value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteEntry.productTypeName</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the productTypeName - Unique identifier of Product. Used to map this Quote Entry to a specific product in Commerce
	 */
	@Accessor(qualifier = "productTypeName", type = Accessor.Type.SETTER)
	public void setProductTypeName(final String value)
	{
		getPersistenceContext().setPropertyValue(PRODUCTTYPENAME, value);
	}
	
}
