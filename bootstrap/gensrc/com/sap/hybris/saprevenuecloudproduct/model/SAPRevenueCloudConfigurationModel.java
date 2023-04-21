/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.saprevenuecloudproduct.model;

import com.sap.hybris.saprevenuecloudproduct.model.SAPMarketToCatalogMappingModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type SAPRevenueCloudConfiguration first defined at extension saprevenuecloudproduct.
 */
@SuppressWarnings("all")
public class SAPRevenueCloudConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPRevenueCloudConfiguration";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRevenueCloudConfiguration.name</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRevenueCloudConfiguration.replicateCustomer</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String REPLICATECUSTOMER = "replicateCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRevenueCloudConfiguration.defaultCountryCode</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String DEFAULTCOUNTRYCODE = "defaultCountryCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRevenueCloudConfiguration.paymentMethod</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String PAYMENTMETHOD = "paymentMethod";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRevenueCloudConfiguration.invoiceMethod</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String INVOICEMETHOD = "invoiceMethod";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRevenueCloudConfiguration.marketToCatalogMappings</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String MARKETTOCATALOGMAPPINGS = "marketToCatalogMappings";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPRevenueCloudConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPRevenueCloudConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPRevenueCloudConfigurationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRevenueCloudConfiguration.defaultCountryCode</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the defaultCountryCode - Default Country Code for the Customer if no address is entered.
	 */
	@Accessor(qualifier = "defaultCountryCode", type = Accessor.Type.GETTER)
	public String getDefaultCountryCode()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTCOUNTRYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRevenueCloudConfiguration.invoiceMethod</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the invoiceMethod - Invoice value that needs to be sent to Revenue cloud.
	 */
	@Accessor(qualifier = "invoiceMethod", type = Accessor.Type.GETTER)
	public String getInvoiceMethod()
	{
		return getPersistenceContext().getPropertyValue(INVOICEMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRevenueCloudConfiguration.marketToCatalogMappings</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the marketToCatalogMappings
	 */
	@Accessor(qualifier = "marketToCatalogMappings", type = Accessor.Type.GETTER)
	public Collection<SAPMarketToCatalogMappingModel> getMarketToCatalogMappings()
	{
		return getPersistenceContext().getPropertyValue(MARKETTOCATALOGMAPPINGS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRevenueCloudConfiguration.name</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the name - Sap Revenue Cloud configuration name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRevenueCloudConfiguration.paymentMethod</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the paymentMethod - Payment method that is to be used while changing card payment details e.g. "Payment Card", "External Card".
	 */
	@Accessor(qualifier = "paymentMethod", type = Accessor.Type.GETTER)
	public String getPaymentMethod()
	{
		return getPersistenceContext().getPropertyValue(PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRevenueCloudConfiguration.replicateCustomer</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the replicateCustomer - Indicate if the B2C customer has to be replicated to SAP Revenue Cloud
	 */
	@Accessor(qualifier = "replicateCustomer", type = Accessor.Type.GETTER)
	public boolean isReplicateCustomer()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(REPLICATECUSTOMER));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRevenueCloudConfiguration.defaultCountryCode</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the defaultCountryCode - Default Country Code for the Customer if no address is entered.
	 */
	@Accessor(qualifier = "defaultCountryCode", type = Accessor.Type.SETTER)
	public void setDefaultCountryCode(final String value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTCOUNTRYCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRevenueCloudConfiguration.invoiceMethod</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the invoiceMethod - Invoice value that needs to be sent to Revenue cloud.
	 */
	@Accessor(qualifier = "invoiceMethod", type = Accessor.Type.SETTER)
	public void setInvoiceMethod(final String value)
	{
		getPersistenceContext().setPropertyValue(INVOICEMETHOD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRevenueCloudConfiguration.marketToCatalogMappings</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the marketToCatalogMappings
	 */
	@Accessor(qualifier = "marketToCatalogMappings", type = Accessor.Type.SETTER)
	public void setMarketToCatalogMappings(final Collection<SAPMarketToCatalogMappingModel> value)
	{
		getPersistenceContext().setPropertyValue(MARKETTOCATALOGMAPPINGS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRevenueCloudConfiguration.name</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the name - Sap Revenue Cloud configuration name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRevenueCloudConfiguration.paymentMethod</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the paymentMethod - Payment method that is to be used while changing card payment details e.g. "Payment Card", "External Card".
	 */
	@Accessor(qualifier = "paymentMethod", type = Accessor.Type.SETTER)
	public void setPaymentMethod(final String value)
	{
		getPersistenceContext().setPropertyValue(PAYMENTMETHOD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRevenueCloudConfiguration.replicateCustomer</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the replicateCustomer - Indicate if the B2C customer has to be replicated to SAP Revenue Cloud
	 */
	@Accessor(qualifier = "replicateCustomer", type = Accessor.Type.SETTER)
	public void setReplicateCustomer(final boolean value)
	{
		getPersistenceContext().setPropertyValue(REPLICATECUSTOMER, toObject(value));
	}
	
}
