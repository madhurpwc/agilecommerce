/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.configuration.model;

import com.sap.hybris.returnsexchange.model.SapReturnOrderReasonModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.sap.core.configuration.model.SAPRFCDestinationModel;
import de.hybris.platform.sap.sapmodel.model.SAPDeliveryModeModel;
import de.hybris.platform.sap.sapmodel.model.SAPPaymentModeModel;
import de.hybris.platform.sap.sapmodel.model.SAPPlantLogSysOrgModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.store.BaseStoreModel;
import java.util.Collection;
import java.util.Set;

/**
 * Generated model class for type SAPConfiguration first defined at extension sapcoreconfiguration.
 */
@SuppressWarnings("all")
public class SAPConfigurationModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPConfiguration";
	
	/**<i>Generated relation code constant for relation <code>SAPConfigurationForBaseStore</code> defining source attribute <code>baseStores</code> in extension <code>sapcoreconfiguration</code>.</i>*/
	public static final String _SAPCONFIGURATIONFORBASESTORE = "SAPConfigurationForBaseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String CORE_NAME = "core_name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.baseStores</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String BASESTORES = "baseStores";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. */
	public static final String SAPRFCDESTINATION = "SAPRFCDestination";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_REFERENCECUSTOMER = "sapcommon_referenceCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_transactionType</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_TRANSACTIONTYPE = "sapcommon_transactionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_SALESORGANIZATION = "sapcommon_salesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_DISTRIBUTIONCHANNEL = "sapcommon_distributionChannel";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapcommon_division</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPCOMMON_DIVISION = "sapcommon_division";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapDeliveryModes</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPDELIVERYMODES = "sapDeliveryModes";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapPaymentModes</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPPAYMENTMODES = "sapPaymentModes";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPPLANTLOGSYSORG = "sapPlantLogSysOrg";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.replicateregisteredb2buser</code> attribute defined at extension <code>sapcustomerb2b</code>. */
	public static final String REPLICATEREGISTEREDB2BUSER = "replicateregisteredb2buser";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute defined at extension <code>saporderexchange</code>. */
	public static final String SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE = "saporderexchange_itemPriceConditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. */
	public static final String SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE = "saporderexchange_paymentCostConditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. */
	public static final String SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE = "saporderexchange_deliveryCostConditionType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.cpqQuoteDiscountConditionCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQQUOTEDISCOUNTCONDITIONCODE = "cpqQuoteDiscountConditionCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.cpqQuoteEntryDiscountConditionCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQQUOTEENTRYDISCOUNTCONDITIONCODE = "cpqQuoteEntryDiscountConditionCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.cpqAbsoluteDiscountEnabled</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQABSOLUTEDISCOUNTENABLED = "cpqAbsoluteDiscountEnabled";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.returnOrderProcesstype</code> attribute defined at extension <code>sapreturnsexchange</code>. */
	public static final String RETURNORDERPROCESSTYPE = "returnOrderProcesstype";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.returnOrderReason</code> attribute defined at extension <code>sapreturnsexchange</code>. */
	public static final String RETURNORDERREASON = "returnOrderReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPConfiguration.sapReturnReasons</code> attribute defined at extension <code>sapreturnsexchange</code>. */
	public static final String SAPRETURNREASONS = "sapReturnReasons";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPConfigurationModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPConfigurationModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPConfigurationModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.baseStores</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the baseStores
	 */
	@Accessor(qualifier = "baseStores", type = Accessor.Type.GETTER)
	public Collection<BaseStoreModel> getBaseStores()
	{
		return getPersistenceContext().getPropertyValue(BASESTORES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the core_name - Name
	 */
	@Accessor(qualifier = "core_name", type = Accessor.Type.GETTER)
	public String getCore_name()
	{
		return getPersistenceContext().getPropertyValue(CORE_NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.cpqAbsoluteDiscountEnabled</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqAbsoluteDiscountEnabled - Absolute or Percentage Discount Condition Type
	 */
	@Accessor(qualifier = "cpqAbsoluteDiscountEnabled", type = Accessor.Type.GETTER)
	public Boolean getCpqAbsoluteDiscountEnabled()
	{
		return getPersistenceContext().getPropertyValue(CPQABSOLUTEDISCOUNTENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.cpqQuoteDiscountConditionCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqQuoteDiscountConditionCode - quote processingType code in back end system
	 */
	@Accessor(qualifier = "cpqQuoteDiscountConditionCode", type = Accessor.Type.GETTER)
	public String getCpqQuoteDiscountConditionCode()
	{
		return getPersistenceContext().getPropertyValue(CPQQUOTEDISCOUNTCONDITIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.cpqQuoteEntryDiscountConditionCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqQuoteEntryDiscountConditionCode - quoteEntry processingType code in back end system
	 */
	@Accessor(qualifier = "cpqQuoteEntryDiscountConditionCode", type = Accessor.Type.GETTER)
	public String getCpqQuoteEntryDiscountConditionCode()
	{
		return getPersistenceContext().getPropertyValue(CPQQUOTEENTRYDISCOUNTCONDITIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.replicateregisteredb2buser</code> attribute defined at extension <code>sapcustomerb2b</code>. 
	 * @return the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	@Accessor(qualifier = "replicateregisteredb2buser", type = Accessor.Type.GETTER)
	public Boolean getReplicateregisteredb2buser()
	{
		return getPersistenceContext().getPropertyValue(REPLICATEREGISTEREDB2BUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.returnOrderProcesstype</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 * @return the returnOrderProcesstype - Return order process type
	 */
	@Accessor(qualifier = "returnOrderProcesstype", type = Accessor.Type.GETTER)
	public String getReturnOrderProcesstype()
	{
		return getPersistenceContext().getPropertyValue(RETURNORDERPROCESSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.returnOrderReason</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 * @return the returnOrderReason - Return order level rejection reason
	 */
	@Accessor(qualifier = "returnOrderReason", type = Accessor.Type.GETTER)
	public String getReturnOrderReason()
	{
		return getPersistenceContext().getPropertyValue(RETURNORDERREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_distributionChannel
	 */
	@Accessor(qualifier = "sapcommon_distributionChannel", type = Accessor.Type.GETTER)
	public String getSapcommon_distributionChannel()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_division</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_division
	 */
	@Accessor(qualifier = "sapcommon_division", type = Accessor.Type.GETTER)
	public String getSapcommon_division()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	@Accessor(qualifier = "sapcommon_referenceCustomer", type = Accessor.Type.GETTER)
	public String getSapcommon_referenceCustomer()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_REFERENCECUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_salesOrganization
	 */
	@Accessor(qualifier = "sapcommon_salesOrganization", type = Accessor.Type.GETTER)
	public String getSapcommon_salesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_SALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapcommon_transactionType</code> attribute defined at extension <code>sapmodel</code>. 
	 * @return the sapcommon_transactionType
	 */
	@Accessor(qualifier = "sapcommon_transactionType", type = Accessor.Type.GETTER)
	public String getSapcommon_transactionType()
	{
		return getPersistenceContext().getPropertyValue(SAPCOMMON_TRANSACTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapDeliveryModes</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapDeliveryModes
	 */
	@Accessor(qualifier = "sapDeliveryModes", type = Accessor.Type.GETTER)
	public Set<SAPDeliveryModeModel> getSapDeliveryModes()
	{
		return getPersistenceContext().getPropertyValue(SAPDELIVERYMODES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 * @return the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	@Accessor(qualifier = "saporderexchange_deliveryCostConditionType", type = Accessor.Type.GETTER)
	public String getSaporderexchange_deliveryCostConditionType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 * @return the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	@Accessor(qualifier = "saporderexchange_itemPriceConditionType", type = Accessor.Type.GETTER)
	public String getSaporderexchange_itemPriceConditionType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 * @return the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	@Accessor(qualifier = "saporderexchange_paymentCostConditionType", type = Accessor.Type.GETTER)
	public String getSaporderexchange_paymentCostConditionType()
	{
		return getPersistenceContext().getPropertyValue(SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPaymentModes</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapPaymentModes
	 */
	@Accessor(qualifier = "sapPaymentModes", type = Accessor.Type.GETTER)
	public Set<SAPPaymentModeModel> getSapPaymentModes()
	{
		return getPersistenceContext().getPropertyValue(SAPPAYMENTMODES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapPlantLogSysOrg
	 */
	@Accessor(qualifier = "sapPlantLogSysOrg", type = Accessor.Type.GETTER)
	public Set<SAPPlantLogSysOrgModel> getSapPlantLogSysOrg()
	{
		return getPersistenceContext().getPropertyValue(SAPPLANTLOGSYSORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.sapReturnReasons</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapReturnReasons
	 */
	@Accessor(qualifier = "sapReturnReasons", type = Accessor.Type.GETTER)
	public Set<SapReturnOrderReasonModel> getSapReturnReasons()
	{
		return getPersistenceContext().getPropertyValue(SAPRETURNREASONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPConfiguration.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 * @return the SAPRFCDestination
	 */
	@Accessor(qualifier = "SAPRFCDestination", type = Accessor.Type.GETTER)
	public SAPRFCDestinationModel getSAPRFCDestination()
	{
		return getPersistenceContext().getPropertyValue(SAPRFCDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.baseStores</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the baseStores
	 */
	@Accessor(qualifier = "baseStores", type = Accessor.Type.SETTER)
	public void setBaseStores(final Collection<BaseStoreModel> value)
	{
		getPersistenceContext().setPropertyValue(BASESTORES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.core_name</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the core_name - Name
	 */
	@Accessor(qualifier = "core_name", type = Accessor.Type.SETTER)
	public void setCore_name(final String value)
	{
		getPersistenceContext().setPropertyValue(CORE_NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.cpqAbsoluteDiscountEnabled</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqAbsoluteDiscountEnabled - Absolute or Percentage Discount Condition Type
	 */
	@Accessor(qualifier = "cpqAbsoluteDiscountEnabled", type = Accessor.Type.SETTER)
	public void setCpqAbsoluteDiscountEnabled(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(CPQABSOLUTEDISCOUNTENABLED, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.cpqQuoteDiscountConditionCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqQuoteDiscountConditionCode - quote processingType code in back end system
	 */
	@Accessor(qualifier = "cpqQuoteDiscountConditionCode", type = Accessor.Type.SETTER)
	public void setCpqQuoteDiscountConditionCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQQUOTEDISCOUNTCONDITIONCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.cpqQuoteEntryDiscountConditionCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqQuoteEntryDiscountConditionCode - quoteEntry processingType code in back end system
	 */
	@Accessor(qualifier = "cpqQuoteEntryDiscountConditionCode", type = Accessor.Type.SETTER)
	public void setCpqQuoteEntryDiscountConditionCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQQUOTEENTRYDISCOUNTCONDITIONCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.replicateregisteredb2buser</code> attribute defined at extension <code>sapcustomerb2b</code>. 
	 *  
	 * @param value the replicateregisteredb2buser - Replicate Registered B2B Users
	 */
	@Accessor(qualifier = "replicateregisteredb2buser", type = Accessor.Type.SETTER)
	public void setReplicateregisteredb2buser(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(REPLICATEREGISTEREDB2BUSER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.returnOrderProcesstype</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 *  
	 * @param value the returnOrderProcesstype - Return order process type
	 */
	@Accessor(qualifier = "returnOrderProcesstype", type = Accessor.Type.SETTER)
	public void setReturnOrderProcesstype(final String value)
	{
		getPersistenceContext().setPropertyValue(RETURNORDERPROCESSTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.returnOrderReason</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 *  
	 * @param value the returnOrderReason - Return order level rejection reason
	 */
	@Accessor(qualifier = "returnOrderReason", type = Accessor.Type.SETTER)
	public void setReturnOrderReason(final String value)
	{
		getPersistenceContext().setPropertyValue(RETURNORDERREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_distributionChannel</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_distributionChannel
	 */
	@Accessor(qualifier = "sapcommon_distributionChannel", type = Accessor.Type.SETTER)
	public void setSapcommon_distributionChannel(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_DISTRIBUTIONCHANNEL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_division</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_division
	 */
	@Accessor(qualifier = "sapcommon_division", type = Accessor.Type.SETTER)
	public void setSapcommon_division(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_DIVISION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_referenceCustomer</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_referenceCustomer - reference customer used in RFC call
	 */
	@Accessor(qualifier = "sapcommon_referenceCustomer", type = Accessor.Type.SETTER)
	public void setSapcommon_referenceCustomer(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_REFERENCECUSTOMER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_salesOrganization</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_salesOrganization
	 */
	@Accessor(qualifier = "sapcommon_salesOrganization", type = Accessor.Type.SETTER)
	public void setSapcommon_salesOrganization(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_SALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapcommon_transactionType</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapcommon_transactionType
	 */
	@Accessor(qualifier = "sapcommon_transactionType", type = Accessor.Type.SETTER)
	public void setSapcommon_transactionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPCOMMON_TRANSACTIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapDeliveryModes</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapDeliveryModes
	 */
	@Accessor(qualifier = "sapDeliveryModes", type = Accessor.Type.SETTER)
	public void setSapDeliveryModes(final Set<SAPDeliveryModeModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPDELIVERYMODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.saporderexchange_deliveryCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 *  
	 * @param value the saporderexchange_deliveryCostConditionType - Condition Type for delivery cost.
	 */
	@Accessor(qualifier = "saporderexchange_deliveryCostConditionType", type = Accessor.Type.SETTER)
	public void setSaporderexchange_deliveryCostConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDEREXCHANGE_DELIVERYCOSTCONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.saporderexchange_itemPriceConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 *  
	 * @param value the saporderexchange_itemPriceConditionType - Condition Type for item Price.
	 */
	@Accessor(qualifier = "saporderexchange_itemPriceConditionType", type = Accessor.Type.SETTER)
	public void setSaporderexchange_itemPriceConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDEREXCHANGE_ITEMPRICECONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.saporderexchange_paymentCostConditionType</code> attribute defined at extension <code>saporderexchange</code>. 
	 *  
	 * @param value the saporderexchange_paymentCostConditionType - Condition Type for payment cost.
	 */
	@Accessor(qualifier = "saporderexchange_paymentCostConditionType", type = Accessor.Type.SETTER)
	public void setSaporderexchange_paymentCostConditionType(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPORDEREXCHANGE_PAYMENTCOSTCONDITIONTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapPaymentModes</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapPaymentModes
	 */
	@Accessor(qualifier = "sapPaymentModes", type = Accessor.Type.SETTER)
	public void setSapPaymentModes(final Set<SAPPaymentModeModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPPAYMENTMODES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapPlantLogSysOrg</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapPlantLogSysOrg
	 */
	@Accessor(qualifier = "sapPlantLogSysOrg", type = Accessor.Type.SETTER)
	public void setSapPlantLogSysOrg(final Set<SAPPlantLogSysOrgModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPPLANTLOGSYSORG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.sapReturnReasons</code> attribute defined at extension <code>sapreturnsexchange</code>. 
	 *  
	 * @param value the sapReturnReasons
	 */
	@Accessor(qualifier = "sapReturnReasons", type = Accessor.Type.SETTER)
	public void setSapReturnReasons(final Set<SapReturnOrderReasonModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPRETURNREASONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPConfiguration.SAPRFCDestination</code> attribute defined at extension <code>sapcoreconfiguration</code>. 
	 *  
	 * @param value the SAPRFCDestination
	 */
	@Accessor(qualifier = "SAPRFCDestination", type = Accessor.Type.SETTER)
	public void setSAPRFCDestination(final SAPRFCDestinationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPRFCDESTINATION, value);
	}
	
}
