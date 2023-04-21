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
import de.hybris.platform.b2b.model.B2BCustomerModel;
import de.hybris.platform.commerceservices.enums.SalesApplication;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.QuoteModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.fraud.model.FraudReportModel;
import de.hybris.platform.orderhistory.model.OrderHistoryEntryModel;
import de.hybris.platform.ordermodify.model.OrderModificationRecordModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.orderscheduling.model.CartToOrderCronJobModel;
import de.hybris.platform.orderscheduling.model.OrderScheduleCronJobModel;
import de.hybris.platform.orderscheduling.model.OrderTemplateToOrderCronJobModel;
import de.hybris.platform.returns.model.ReturnRequestModel;
import de.hybris.platform.sap.sapmodel.enums.SapSystemType;
import de.hybris.platform.sap.sapmodel.model.SAPOrderModel;
import de.hybris.platform.sap.sapmodel.model.SAPSalesOrganizationModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type Order first defined at extension core.
 */
@SuppressWarnings("all")
public class OrderModel extends AbstractOrderModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Order";
	
	/**<i>Generated relation code constant for relation <code>Order2CartToOrderCronJob</code> defining source attribute <code>schedulingCronJob</code> in extension <code>b2bacceleratorservices</code>.</i>*/
	public static final String _ORDER2CARTTOORDERCRONJOB = "Order2CartToOrderCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String VERSIONID = "versionID";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORIGINALVERSION = "originalVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FRAUDULENT = "fraudulent";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String POTENTIALLYFRAUDULENT = "potentiallyFraudulent";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.statusDisplay</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String STATUSDISPLAY = "statusDisplay";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String FRAUDREPORTS = "fraudReports";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String HISTORYENTRIES = "historyEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERTEMPLATECRONJOB = "orderTemplateCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERSCHEDULECRONJOB = "orderScheduleCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String MODIFICATIONRECORDS = "modificationRecords";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String RETURNREQUESTS = "returnRequests";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. */
	public static final String ORDERPROCESS = "orderProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String SALESAPPLICATION = "salesApplication";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.placedBy</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String PLACEDBY = "placedBy";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.quoteReference</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String QUOTEREFERENCE = "quoteReference";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.exhaustedApprovers</code> attribute defined at extension <code>b2bapprovalprocess</code>. */
	public static final String EXHAUSTEDAPPROVERS = "exhaustedApprovers";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.schedulingCronJob</code> attribute defined at extension <code>b2bacceleratorservices</code>. */
	public static final String SCHEDULINGCRONJOB = "schedulingCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapOrders</code> attribute defined at extension <code>sapmodel</code>. */
	public static final String SAPORDERS = "sapOrders";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapPlantCode</code> attribute defined at extension <code>sapcpiorderexchange</code>. */
	public static final String SAPPLANTCODE = "sapPlantCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapRejectionReason</code> attribute defined at extension <code>sapcpiorderexchange</code>. */
	public static final String SAPREJECTIONREASON = "sapRejectionReason";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapGoodsIssueDate</code> attribute defined at extension <code>sapcpiorderexchange</code>. */
	public static final String SAPGOODSISSUEDATE = "sapGoodsIssueDate";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapLogicalSystem</code> attribute defined at extension <code>saporderexchangeoms</code>. */
	public static final String SAPLOGICALSYSTEM = "sapLogicalSystem";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapSalesOrganization</code> attribute defined at extension <code>saporderexchangeoms</code>. */
	public static final String SAPSALESORGANIZATION = "sapSalesOrganization";
	
	/** <i>Generated constant</i> - Attribute key of <code>Order.sapSystemType</code> attribute defined at extension <code>saporderexchangeoms</code>. */
	public static final String SAPSYSTEMTYPE = "sapSystemType";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public OrderModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public OrderModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Order</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OrderModel(final CurrencyModel _currency, final Date _date, final UserModel _user)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setUser(_user);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _currency initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _date initial attribute declared by type <code>AbstractOrder</code> at extension <code>core</code>
	 * @param _originalVersion initial attribute declared by type <code>Order</code> at extension <code>basecommerce</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _user initial attribute declared by type <code>Order</code> at extension <code>core</code>
	 * @param _versionID initial attribute declared by type <code>Order</code> at extension <code>basecommerce</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public OrderModel(final CurrencyModel _currency, final Date _date, final OrderModel _originalVersion, final ItemModel _owner, final UserModel _user, final String _versionID)
	{
		super();
		setCurrency(_currency);
		setDate(_date);
		setOriginalVersion(_originalVersion);
		setOwner(_owner);
		setUser(_user);
		setVersionID(_versionID);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.exhaustedApprovers</code> attribute defined at extension <code>b2bapprovalprocess</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the exhaustedApprovers
	 */
	@Accessor(qualifier = "exhaustedApprovers", type = Accessor.Type.GETTER)
	public Set<B2BCustomerModel> getExhaustedApprovers()
	{
		return getPersistenceContext().getPropertyValue(EXHAUSTEDAPPROVERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the fraudReports
	 */
	@Accessor(qualifier = "fraudReports", type = Accessor.Type.GETTER)
	public Set<FraudReportModel> getFraudReports()
	{
		return getPersistenceContext().getPropertyValue(FRAUDREPORTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the fraudulent
	 */
	@Accessor(qualifier = "fraudulent", type = Accessor.Type.GETTER)
	public Boolean getFraudulent()
	{
		return getPersistenceContext().getPropertyValue(FRAUDULENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the historyEntries
	 */
	@Accessor(qualifier = "historyEntries", type = Accessor.Type.GETTER)
	public List<OrderHistoryEntryModel> getHistoryEntries()
	{
		return getPersistenceContext().getPropertyValue(HISTORYENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the language - The language used when the order is placed.
	 */
	@Accessor(qualifier = "language", type = Accessor.Type.GETTER)
	public LanguageModel getLanguage()
	{
		return getPersistenceContext().getPropertyValue(LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the modificationRecords
	 */
	@Accessor(qualifier = "modificationRecords", type = Accessor.Type.GETTER)
	public Set<OrderModificationRecordModel> getModificationRecords()
	{
		return getPersistenceContext().getPropertyValue(MODIFICATIONRECORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderProcess
	 */
	@Accessor(qualifier = "orderProcess", type = Accessor.Type.GETTER)
	public Collection<OrderProcessModel> getOrderProcess()
	{
		return getPersistenceContext().getPropertyValue(ORDERPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderScheduleCronJob
	 */
	@Accessor(qualifier = "orderScheduleCronJob", type = Accessor.Type.GETTER)
	public Collection<OrderScheduleCronJobModel> getOrderScheduleCronJob()
	{
		return getPersistenceContext().getPropertyValue(ORDERSCHEDULECRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the orderTemplateCronJob
	 */
	@Accessor(qualifier = "orderTemplateCronJob", type = Accessor.Type.GETTER)
	public Collection<OrderTemplateToOrderCronJobModel> getOrderTemplateCronJob()
	{
		return getPersistenceContext().getPropertyValue(ORDERTEMPLATECRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the originalVersion
	 */
	@Accessor(qualifier = "originalVersion", type = Accessor.Type.GETTER)
	public OrderModel getOriginalVersion()
	{
		return getPersistenceContext().getPropertyValue(ORIGINALVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.placedBy</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the placedBy - The sales agent which the order was placed by.
	 */
	@Accessor(qualifier = "placedBy", type = Accessor.Type.GETTER)
	public UserModel getPlacedBy()
	{
		return getPersistenceContext().getPropertyValue(PLACEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the potentiallyFraudulent
	 */
	@Accessor(qualifier = "potentiallyFraudulent", type = Accessor.Type.GETTER)
	public Boolean getPotentiallyFraudulent()
	{
		return getPersistenceContext().getPropertyValue(POTENTIALLYFRAUDULENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.quoteReference</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the quoteReference - The reference to quote from which the order was placed.
	 */
	@Accessor(qualifier = "quoteReference", type = Accessor.Type.GETTER)
	public QuoteModel getQuoteReference()
	{
		return getPersistenceContext().getPropertyValue(QUOTEREFERENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the returnRequests
	 */
	@Accessor(qualifier = "returnRequests", type = Accessor.Type.GETTER)
	public List<ReturnRequestModel> getReturnRequests()
	{
		return getPersistenceContext().getPropertyValue(RETURNREQUESTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the salesApplication - The sales application for which the order was placed.
	 */
	@Accessor(qualifier = "salesApplication", type = Accessor.Type.GETTER)
	public SalesApplication getSalesApplication()
	{
		return getPersistenceContext().getPropertyValue(SALESAPPLICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapGoodsIssueDate</code> attribute defined at extension <code>sapcpiorderexchange</code>. 
	 * @return the sapGoodsIssueDate
	 */
	@Accessor(qualifier = "sapGoodsIssueDate", type = Accessor.Type.GETTER)
	public Date getSapGoodsIssueDate()
	{
		return getPersistenceContext().getPropertyValue(SAPGOODSISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapLogicalSystem</code> attribute defined at extension <code>saporderexchangeoms</code>. 
	 * @return the sapLogicalSystem - SAP logical system
	 */
	@Accessor(qualifier = "sapLogicalSystem", type = Accessor.Type.GETTER)
	public String getSapLogicalSystem()
	{
		return getPersistenceContext().getPropertyValue(SAPLOGICALSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapOrders</code> attribute defined at extension <code>sapmodel</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sapOrders
	 */
	@Accessor(qualifier = "sapOrders", type = Accessor.Type.GETTER)
	public Set<SAPOrderModel> getSapOrders()
	{
		return getPersistenceContext().getPropertyValue(SAPORDERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapPlantCode</code> attribute defined at extension <code>sapcpiorderexchange</code>. 
	 * @return the sapPlantCode
	 */
	@Accessor(qualifier = "sapPlantCode", type = Accessor.Type.GETTER)
	public String getSapPlantCode()
	{
		return getPersistenceContext().getPropertyValue(SAPPLANTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapRejectionReason</code> attribute defined at extension <code>sapcpiorderexchange</code>. 
	 * @return the sapRejectionReason
	 */
	@Accessor(qualifier = "sapRejectionReason", type = Accessor.Type.GETTER)
	public String getSapRejectionReason()
	{
		return getPersistenceContext().getPropertyValue(SAPREJECTIONREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapSalesOrganization</code> attribute defined at extension <code>saporderexchangeoms</code>. 
	 * @return the sapSalesOrganization - SAP Sales Organization
	 */
	@Accessor(qualifier = "sapSalesOrganization", type = Accessor.Type.GETTER)
	public SAPSalesOrganizationModel getSapSalesOrganization()
	{
		return getPersistenceContext().getPropertyValue(SAPSALESORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.sapSystemType</code> attribute defined at extension <code>saporderexchangeoms</code>. 
	 * @return the sapSystemType - SAP System Type
	 */
	@Accessor(qualifier = "sapSystemType", type = Accessor.Type.GETTER)
	public SapSystemType getSapSystemType()
	{
		return getPersistenceContext().getPropertyValue(SAPSYSTEMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.schedulingCronJob</code> attribute defined at extension <code>b2bacceleratorservices</code>. 
	 * @return the schedulingCronJob
	 */
	@Accessor(qualifier = "schedulingCronJob", type = Accessor.Type.GETTER)
	public CartToOrderCronJobModel getSchedulingCronJob()
	{
		return getPersistenceContext().getPropertyValue(SCHEDULINGCRONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.statusDisplay</code> dynamic attribute defined at extension <code>basecommerce</code>. 
	 * @return the statusDisplay
	 */
	@Accessor(qualifier = "statusDisplay", type = Accessor.Type.GETTER)
	public String getStatusDisplay()
	{
		return getPersistenceContext().getDynamicValue(this,STATUSDISPLAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. 
	 * @return the versionID
	 */
	@Accessor(qualifier = "versionID", type = Accessor.Type.GETTER)
	public String getVersionID()
	{
		return getPersistenceContext().getPropertyValue(VERSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.exhaustedApprovers</code> attribute defined at extension <code>b2bapprovalprocess</code>. 
	 *  
	 * @param value the exhaustedApprovers
	 */
	@Accessor(qualifier = "exhaustedApprovers", type = Accessor.Type.SETTER)
	public void setExhaustedApprovers(final Set<B2BCustomerModel> value)
	{
		getPersistenceContext().setPropertyValue(EXHAUSTEDAPPROVERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.fraudReports</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the fraudReports
	 */
	@Accessor(qualifier = "fraudReports", type = Accessor.Type.SETTER)
	public void setFraudReports(final Set<FraudReportModel> value)
	{
		getPersistenceContext().setPropertyValue(FRAUDREPORTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.fraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the fraudulent
	 */
	@Accessor(qualifier = "fraudulent", type = Accessor.Type.SETTER)
	public void setFraudulent(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(FRAUDULENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.historyEntries</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the historyEntries
	 */
	@Accessor(qualifier = "historyEntries", type = Accessor.Type.SETTER)
	public void setHistoryEntries(final List<OrderHistoryEntryModel> value)
	{
		getPersistenceContext().setPropertyValue(HISTORYENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.language</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the language - The language used when the order is placed.
	 */
	@Accessor(qualifier = "language", type = Accessor.Type.SETTER)
	public void setLanguage(final LanguageModel value)
	{
		getPersistenceContext().setPropertyValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.modificationRecords</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the modificationRecords
	 */
	@Accessor(qualifier = "modificationRecords", type = Accessor.Type.SETTER)
	public void setModificationRecords(final Set<OrderModificationRecordModel> value)
	{
		getPersistenceContext().setPropertyValue(MODIFICATIONRECORDS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.orderProcess</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderProcess
	 */
	@Accessor(qualifier = "orderProcess", type = Accessor.Type.SETTER)
	public void setOrderProcess(final Collection<OrderProcessModel> value)
	{
		getPersistenceContext().setPropertyValue(ORDERPROCESS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.orderScheduleCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderScheduleCronJob
	 */
	@Accessor(qualifier = "orderScheduleCronJob", type = Accessor.Type.SETTER)
	public void setOrderScheduleCronJob(final Collection<OrderScheduleCronJobModel> value)
	{
		getPersistenceContext().setPropertyValue(ORDERSCHEDULECRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.orderTemplateCronJob</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the orderTemplateCronJob
	 */
	@Accessor(qualifier = "orderTemplateCronJob", type = Accessor.Type.SETTER)
	public void setOrderTemplateCronJob(final Collection<OrderTemplateToOrderCronJobModel> value)
	{
		getPersistenceContext().setPropertyValue(ORDERTEMPLATECRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Order.originalVersion</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the originalVersion
	 */
	@Accessor(qualifier = "originalVersion", type = Accessor.Type.SETTER)
	public void setOriginalVersion(final OrderModel value)
	{
		getPersistenceContext().setPropertyValue(ORIGINALVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.placedBy</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the placedBy - The sales agent which the order was placed by.
	 */
	@Accessor(qualifier = "placedBy", type = Accessor.Type.SETTER)
	public void setPlacedBy(final UserModel value)
	{
		getPersistenceContext().setPropertyValue(PLACEDBY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.potentiallyFraudulent</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the potentiallyFraudulent
	 */
	@Accessor(qualifier = "potentiallyFraudulent", type = Accessor.Type.SETTER)
	public void setPotentiallyFraudulent(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(POTENTIALLYFRAUDULENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.quoteReference</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the quoteReference - The reference to quote from which the order was placed.
	 */
	@Accessor(qualifier = "quoteReference", type = Accessor.Type.SETTER)
	public void setQuoteReference(final QuoteModel value)
	{
		getPersistenceContext().setPropertyValue(QUOTEREFERENCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.returnRequests</code> attribute defined at extension <code>basecommerce</code>. 
	 *  
	 * @param value the returnRequests
	 */
	@Accessor(qualifier = "returnRequests", type = Accessor.Type.SETTER)
	public void setReturnRequests(final List<ReturnRequestModel> value)
	{
		getPersistenceContext().setPropertyValue(RETURNREQUESTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.salesApplication</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the salesApplication - The sales application for which the order was placed.
	 */
	@Accessor(qualifier = "salesApplication", type = Accessor.Type.SETTER)
	public void setSalesApplication(final SalesApplication value)
	{
		getPersistenceContext().setPropertyValue(SALESAPPLICATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapGoodsIssueDate</code> attribute defined at extension <code>sapcpiorderexchange</code>. 
	 *  
	 * @param value the sapGoodsIssueDate
	 */
	@Accessor(qualifier = "sapGoodsIssueDate", type = Accessor.Type.SETTER)
	public void setSapGoodsIssueDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(SAPGOODSISSUEDATE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapLogicalSystem</code> attribute defined at extension <code>saporderexchangeoms</code>. 
	 *  
	 * @param value the sapLogicalSystem - SAP logical system
	 */
	@Accessor(qualifier = "sapLogicalSystem", type = Accessor.Type.SETTER)
	public void setSapLogicalSystem(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPLOGICALSYSTEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapOrders</code> attribute defined at extension <code>sapmodel</code>. 
	 *  
	 * @param value the sapOrders
	 */
	@Accessor(qualifier = "sapOrders", type = Accessor.Type.SETTER)
	public void setSapOrders(final Set<SAPOrderModel> value)
	{
		getPersistenceContext().setPropertyValue(SAPORDERS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapPlantCode</code> attribute defined at extension <code>sapcpiorderexchange</code>. 
	 *  
	 * @param value the sapPlantCode
	 */
	@Accessor(qualifier = "sapPlantCode", type = Accessor.Type.SETTER)
	public void setSapPlantCode(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPPLANTCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapRejectionReason</code> attribute defined at extension <code>sapcpiorderexchange</code>. 
	 *  
	 * @param value the sapRejectionReason
	 */
	@Accessor(qualifier = "sapRejectionReason", type = Accessor.Type.SETTER)
	public void setSapRejectionReason(final String value)
	{
		getPersistenceContext().setPropertyValue(SAPREJECTIONREASON, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapSalesOrganization</code> attribute defined at extension <code>saporderexchangeoms</code>. 
	 *  
	 * @param value the sapSalesOrganization - SAP Sales Organization
	 */
	@Accessor(qualifier = "sapSalesOrganization", type = Accessor.Type.SETTER)
	public void setSapSalesOrganization(final SAPSalesOrganizationModel value)
	{
		getPersistenceContext().setPropertyValue(SAPSALESORGANIZATION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.sapSystemType</code> attribute defined at extension <code>saporderexchangeoms</code>. 
	 *  
	 * @param value the sapSystemType - SAP System Type
	 */
	@Accessor(qualifier = "sapSystemType", type = Accessor.Type.SETTER)
	public void setSapSystemType(final SapSystemType value)
	{
		getPersistenceContext().setPropertyValue(SAPSYSTEMTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Order.schedulingCronJob</code> attribute defined at extension <code>b2bacceleratorservices</code>. 
	 *  
	 * @param value the schedulingCronJob
	 */
	@Accessor(qualifier = "schedulingCronJob", type = Accessor.Type.SETTER)
	public void setSchedulingCronJob(final CartToOrderCronJobModel value)
	{
		getPersistenceContext().setPropertyValue(SCHEDULINGCRONJOB, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>Order.versionID</code> attribute defined at extension <code>basecommerce</code>. Can only be used at creation of model - before first save.  
	 *  
	 * @param value the versionID
	 */
	@Accessor(qualifier = "versionID", type = Accessor.Type.SETTER)
	public void setVersionID(final String value)
	{
		getPersistenceContext().setPropertyValue(VERSIONID, value);
	}
	
}
