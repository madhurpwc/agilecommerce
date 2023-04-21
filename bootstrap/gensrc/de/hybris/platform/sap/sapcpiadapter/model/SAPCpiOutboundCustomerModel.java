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
import de.hybris.platform.sap.sapcpiadapter.model.SAPCpiOutboundConfigModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCpiOutboundCustomer first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundCustomerModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.uid</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.contactId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CONTACTID = "contactId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.customerId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CUSTOMERID = "customerId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.firstName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String FIRSTNAME = "firstName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.lastName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String LASTNAME = "lastName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.sessionLanguage</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SESSIONLANGUAGE = "sessionLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.title</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String TITLE = "title";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.baseStore</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String BASESTORE = "baseStore";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.objType</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String OBJTYPE = "objType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.addressUsage</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ADDRESSUSAGE = "addressUsage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.addressUUID</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ADDRESSUUID = "addressUUID";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.country</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String COUNTRY = "country";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.street</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String STREET = "street";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.phone</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String PHONE = "phone";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.fax</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String FAX = "fax";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.town</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String TOWN = "town";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.postalCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String POSTALCODE = "postalCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.streetNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String STREETNUMBER = "streetNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.region</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String REGION = "region";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.responseStatus</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String RESPONSESTATUS = "responseStatus";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.responseMessage</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String RESPONSEMESSAGE = "responseMessage";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.sapCpiConfig</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPICONFIG = "sapCpiConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundCustomer.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudcustomer</code>. */
	public static final String REVENUECLOUDCUSTOMERID = "revenueCloudCustomerId";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundCustomerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundCustomerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundCustomerModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.addressUsage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the addressUsage
	 */
	@Accessor(qualifier = "addressUsage", type = Accessor.Type.GETTER)
	public String getAddressUsage()
	{
		return getPersistenceContext().getPropertyValue(ADDRESSUSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.addressUUID</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the addressUUID
	 */
	@Accessor(qualifier = "addressUUID", type = Accessor.Type.GETTER)
	public String getAddressUUID()
	{
		return getPersistenceContext().getPropertyValue(ADDRESSUUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.baseStore</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.GETTER)
	public String getBaseStore()
	{
		return getPersistenceContext().getPropertyValue(BASESTORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.contactId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the contactId
	 */
	@Accessor(qualifier = "contactId", type = Accessor.Type.GETTER)
	public String getContactId()
	{
		return getPersistenceContext().getPropertyValue(CONTACTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.country</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the country
	 */
	@Accessor(qualifier = "country", type = Accessor.Type.GETTER)
	public String getCountry()
	{
		return getPersistenceContext().getPropertyValue(COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.customerId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the customerId
	 */
	@Accessor(qualifier = "customerId", type = Accessor.Type.GETTER)
	public String getCustomerId()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.fax</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the fax
	 */
	@Accessor(qualifier = "fax", type = Accessor.Type.GETTER)
	public String getFax()
	{
		return getPersistenceContext().getPropertyValue(FAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.firstName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the firstName
	 */
	@Accessor(qualifier = "firstName", type = Accessor.Type.GETTER)
	public String getFirstName()
	{
		return getPersistenceContext().getPropertyValue(FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.lastName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the lastName
	 */
	@Accessor(qualifier = "lastName", type = Accessor.Type.GETTER)
	public String getLastName()
	{
		return getPersistenceContext().getPropertyValue(LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.objType</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the objType
	 */
	@Accessor(qualifier = "objType", type = Accessor.Type.GETTER)
	public String getObjType()
	{
		return getPersistenceContext().getPropertyValue(OBJTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.phone</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the phone
	 */
	@Accessor(qualifier = "phone", type = Accessor.Type.GETTER)
	public String getPhone()
	{
		return getPersistenceContext().getPropertyValue(PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.postalCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the postalCode
	 */
	@Accessor(qualifier = "postalCode", type = Accessor.Type.GETTER)
	public String getPostalCode()
	{
		return getPersistenceContext().getPropertyValue(POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.region</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the region
	 */
	@Accessor(qualifier = "region", type = Accessor.Type.GETTER)
	public String getRegion()
	{
		return getPersistenceContext().getPropertyValue(REGION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.responseMessage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the responseMessage
	 */
	@Accessor(qualifier = "responseMessage", type = Accessor.Type.GETTER)
	public String getResponseMessage()
	{
		return getPersistenceContext().getPropertyValue(RESPONSEMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.responseStatus</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the responseStatus
	 */
	@Accessor(qualifier = "responseStatus", type = Accessor.Type.GETTER)
	public String getResponseStatus()
	{
		return getPersistenceContext().getPropertyValue(RESPONSESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudcustomer</code>. 
	 * @return the revenueCloudCustomerId - Customer ID from the Revenue Cloud system.
	 */
	@Accessor(qualifier = "revenueCloudCustomerId", type = Accessor.Type.GETTER)
	public String getRevenueCloudCustomerId()
	{
		return getPersistenceContext().getPropertyValue(REVENUECLOUDCUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.sapCpiConfig</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiConfig
	 */
	@Accessor(qualifier = "sapCpiConfig", type = Accessor.Type.GETTER)
	public SAPCpiOutboundConfigModel getSapCpiConfig()
	{
		return getPersistenceContext().getPropertyValue(SAPCPICONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.sessionLanguage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sessionLanguage
	 */
	@Accessor(qualifier = "sessionLanguage", type = Accessor.Type.GETTER)
	public String getSessionLanguage()
	{
		return getPersistenceContext().getPropertyValue(SESSIONLANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.street</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the street
	 */
	@Accessor(qualifier = "street", type = Accessor.Type.GETTER)
	public String getStreet()
	{
		return getPersistenceContext().getPropertyValue(STREET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.streetNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the streetNumber
	 */
	@Accessor(qualifier = "streetNumber", type = Accessor.Type.GETTER)
	public String getStreetNumber()
	{
		return getPersistenceContext().getPropertyValue(STREETNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.title</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the title
	 */
	@Accessor(qualifier = "title", type = Accessor.Type.GETTER)
	public String getTitle()
	{
		return getPersistenceContext().getPropertyValue(TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.town</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the town
	 */
	@Accessor(qualifier = "town", type = Accessor.Type.GETTER)
	public String getTown()
	{
		return getPersistenceContext().getPropertyValue(TOWN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundCustomer.uid</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.GETTER)
	public String getUid()
	{
		return getPersistenceContext().getPropertyValue(UID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.addressUsage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the addressUsage
	 */
	@Accessor(qualifier = "addressUsage", type = Accessor.Type.SETTER)
	public void setAddressUsage(final String value)
	{
		getPersistenceContext().setPropertyValue(ADDRESSUSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.addressUUID</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the addressUUID
	 */
	@Accessor(qualifier = "addressUUID", type = Accessor.Type.SETTER)
	public void setAddressUUID(final String value)
	{
		getPersistenceContext().setPropertyValue(ADDRESSUUID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.baseStore</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the baseStore
	 */
	@Accessor(qualifier = "baseStore", type = Accessor.Type.SETTER)
	public void setBaseStore(final String value)
	{
		getPersistenceContext().setPropertyValue(BASESTORE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.contactId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the contactId
	 */
	@Accessor(qualifier = "contactId", type = Accessor.Type.SETTER)
	public void setContactId(final String value)
	{
		getPersistenceContext().setPropertyValue(CONTACTID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.country</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the country
	 */
	@Accessor(qualifier = "country", type = Accessor.Type.SETTER)
	public void setCountry(final String value)
	{
		getPersistenceContext().setPropertyValue(COUNTRY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.customerId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the customerId
	 */
	@Accessor(qualifier = "customerId", type = Accessor.Type.SETTER)
	public void setCustomerId(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.fax</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the fax
	 */
	@Accessor(qualifier = "fax", type = Accessor.Type.SETTER)
	public void setFax(final String value)
	{
		getPersistenceContext().setPropertyValue(FAX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.firstName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the firstName
	 */
	@Accessor(qualifier = "firstName", type = Accessor.Type.SETTER)
	public void setFirstName(final String value)
	{
		getPersistenceContext().setPropertyValue(FIRSTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.lastName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the lastName
	 */
	@Accessor(qualifier = "lastName", type = Accessor.Type.SETTER)
	public void setLastName(final String value)
	{
		getPersistenceContext().setPropertyValue(LASTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.objType</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the objType
	 */
	@Accessor(qualifier = "objType", type = Accessor.Type.SETTER)
	public void setObjType(final String value)
	{
		getPersistenceContext().setPropertyValue(OBJTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.phone</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the phone
	 */
	@Accessor(qualifier = "phone", type = Accessor.Type.SETTER)
	public void setPhone(final String value)
	{
		getPersistenceContext().setPropertyValue(PHONE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.postalCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the postalCode
	 */
	@Accessor(qualifier = "postalCode", type = Accessor.Type.SETTER)
	public void setPostalCode(final String value)
	{
		getPersistenceContext().setPropertyValue(POSTALCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.region</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the region
	 */
	@Accessor(qualifier = "region", type = Accessor.Type.SETTER)
	public void setRegion(final String value)
	{
		getPersistenceContext().setPropertyValue(REGION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.responseMessage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the responseMessage
	 */
	@Accessor(qualifier = "responseMessage", type = Accessor.Type.SETTER)
	public void setResponseMessage(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSEMESSAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.responseStatus</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the responseStatus
	 */
	@Accessor(qualifier = "responseStatus", type = Accessor.Type.SETTER)
	public void setResponseStatus(final String value)
	{
		getPersistenceContext().setPropertyValue(RESPONSESTATUS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.revenueCloudCustomerId</code> attribute defined at extension <code>saprevenuecloudcustomer</code>. 
	 *  
	 * @param value the revenueCloudCustomerId - Customer ID from the Revenue Cloud system.
	 */
	@Accessor(qualifier = "revenueCloudCustomerId", type = Accessor.Type.SETTER)
	public void setRevenueCloudCustomerId(final String value)
	{
		getPersistenceContext().setPropertyValue(REVENUECLOUDCUSTOMERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.sapCpiConfig</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiConfig
	 */
	@Accessor(qualifier = "sapCpiConfig", type = Accessor.Type.SETTER)
	public void setSapCpiConfig(final SAPCpiOutboundConfigModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPICONFIG, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.sessionLanguage</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sessionLanguage
	 */
	@Accessor(qualifier = "sessionLanguage", type = Accessor.Type.SETTER)
	public void setSessionLanguage(final String value)
	{
		getPersistenceContext().setPropertyValue(SESSIONLANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.street</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the street
	 */
	@Accessor(qualifier = "street", type = Accessor.Type.SETTER)
	public void setStreet(final String value)
	{
		getPersistenceContext().setPropertyValue(STREET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.streetNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the streetNumber
	 */
	@Accessor(qualifier = "streetNumber", type = Accessor.Type.SETTER)
	public void setStreetNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(STREETNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.title</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the title
	 */
	@Accessor(qualifier = "title", type = Accessor.Type.SETTER)
	public void setTitle(final String value)
	{
		getPersistenceContext().setPropertyValue(TITLE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.town</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the town
	 */
	@Accessor(qualifier = "town", type = Accessor.Type.SETTER)
	public void setTown(final String value)
	{
		getPersistenceContext().setPropertyValue(TOWN, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundCustomer.uid</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.SETTER)
	public void setUid(final String value)
	{
		getPersistenceContext().setPropertyValue(UID, value);
	}
	
}
