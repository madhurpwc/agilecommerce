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
 * Generated model class for type SAPCpiOutboundPartnerRole first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundPartnerRoleModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundPartnerRole";
	
	/**<i>Generated relation code constant for relation <code>SAPCpiOutboundOrder2SAPCpiOutboundPartnerRole</code> defining source attribute <code>sapCpiOutboundOrder</code> in extension <code>sapcpiadapter</code>.</i>*/
	public static final String _SAPCPIOUTBOUNDORDER2SAPCPIOUTBOUNDPARTNERROLE = "SAPCpiOutboundOrder2SAPCpiOutboundPartnerRole";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ENTRYNUMBER = "entryNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.partnerRoleCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PARTNERROLECODE = "partnerRoleCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.partnerId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PARTNERID = "partnerId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.documentAddressId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DOCUMENTADDRESSID = "documentAddressId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDORDER = "sapCpiOutboundOrder";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.email</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String EMAIL = "email";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundPartnerRole.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudorder</code>. */
	public static final String REVENUECLOUDCUSTOMERID = "revenueCloudCustomerId";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundPartnerRoleModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundPartnerRoleModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundPartnerRoleModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.documentAddressId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the documentAddressId
	 */
	@Accessor(qualifier = "documentAddressId", type = Accessor.Type.GETTER)
	public String getDocumentAddressId()
	{
		return getPersistenceContext().getPropertyValue(DOCUMENTADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.email</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the email - The email of the partner.
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.GETTER)
	public String getEmail()
	{
		return getPersistenceContext().getPropertyValue(EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.GETTER)
	public String getEntryNumber()
	{
		return getPersistenceContext().getPropertyValue(ENTRYNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.partnerId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the partnerId
	 */
	@Accessor(qualifier = "partnerId", type = Accessor.Type.GETTER)
	public String getPartnerId()
	{
		return getPersistenceContext().getPropertyValue(PARTNERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.partnerRoleCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the partnerRoleCode
	 */
	@Accessor(qualifier = "partnerRoleCode", type = Accessor.Type.GETTER)
	public String getPartnerRoleCode()
	{
		return getPersistenceContext().getPropertyValue(PARTNERROLECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 * @return the revenueCloudCustomerId - The revenue cloud ID of the customer.
	 */
	@Accessor(qualifier = "revenueCloudCustomerId", type = Accessor.Type.GETTER)
	public String getRevenueCloudCustomerId()
	{
		return getPersistenceContext().getPropertyValue(REVENUECLOUDCUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundPartnerRole.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.GETTER)
	public SAPCpiOutboundOrderModel getSapCpiOutboundOrder()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDORDER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.documentAddressId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the documentAddressId
	 */
	@Accessor(qualifier = "documentAddressId", type = Accessor.Type.SETTER)
	public void setDocumentAddressId(final String value)
	{
		getPersistenceContext().setPropertyValue(DOCUMENTADDRESSID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.email</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the email - The email of the partner.
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.SETTER)
	public void setEmail(final String value)
	{
		getPersistenceContext().setPropertyValue(EMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.entryNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the entryNumber
	 */
	@Accessor(qualifier = "entryNumber", type = Accessor.Type.SETTER)
	public void setEntryNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(ENTRYNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.partnerId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the partnerId
	 */
	@Accessor(qualifier = "partnerId", type = Accessor.Type.SETTER)
	public void setPartnerId(final String value)
	{
		getPersistenceContext().setPropertyValue(PARTNERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.partnerRoleCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the partnerRoleCode
	 */
	@Accessor(qualifier = "partnerRoleCode", type = Accessor.Type.SETTER)
	public void setPartnerRoleCode(final String value)
	{
		getPersistenceContext().setPropertyValue(PARTNERROLECODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudorder</code>. 
	 *  
	 * @param value the revenueCloudCustomerId - The revenue cloud ID of the customer.
	 */
	@Accessor(qualifier = "revenueCloudCustomerId", type = Accessor.Type.SETTER)
	public void setRevenueCloudCustomerId(final String value)
	{
		getPersistenceContext().setPropertyValue(REVENUECLOUDCUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundPartnerRole.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundOrder(final SAPCpiOutboundOrderModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDORDER, value);
	}
	
}
