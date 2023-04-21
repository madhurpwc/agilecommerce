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
 * Generated model class for type SAPCpiOutboundAddress first defined at extension sapcpiadapter.
 */
@SuppressWarnings("all")
public class SAPCpiOutboundAddressModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCpiOutboundAddress";
	
	/**<i>Generated relation code constant for relation <code>SAPCpiOutboundOrder2SAPCpiOutboundAddress</code> defining source attribute <code>sapCpiOutboundOrder</code> in extension <code>sapcpiadapter</code>.</i>*/
	public static final String _SAPCPIOUTBOUNDORDER2SAPCPIOUTBOUNDADDRESS = "SAPCpiOutboundOrder2SAPCpiOutboundAddress";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String ORDERID = "orderId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.documentAddressId</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DOCUMENTADDRESSID = "documentAddressId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.firstName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String FIRSTNAME = "firstName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.lastName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String LASTNAME = "lastName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.middleName</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String MIDDLENAME = "middleName";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.middleName2</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String MIDDLENAME2 = "middleName2";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.street</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String STREET = "street";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.city</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String CITY = "city";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.district</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String DISTRICT = "district";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.building</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String BUILDING = "building";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.apartment</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String APARTMENT = "apartment";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.pobox</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String POBOX = "pobox";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.faxNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String FAXNUMBER = "faxNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.titleCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String TITLECODE = "titleCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.telNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String TELNUMBER = "telNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.houseNumber</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String HOUSENUMBER = "houseNumber";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.postalCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String POSTALCODE = "postalCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.regionIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String REGIONISOCODE = "regionIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.countryIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String COUNTRYISOCODE = "countryIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.email</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String EMAIL = "email";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.languageIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String LANGUAGEISOCODE = "languageIsoCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCpiOutboundAddress.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. */
	public static final String SAPCPIOUTBOUNDORDER = "sapCpiOutboundOrder";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCpiOutboundAddressModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCpiOutboundAddressModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCpiOutboundAddressModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.apartment</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the apartment
	 */
	@Accessor(qualifier = "apartment", type = Accessor.Type.GETTER)
	public String getApartment()
	{
		return getPersistenceContext().getPropertyValue(APARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.building</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the building
	 */
	@Accessor(qualifier = "building", type = Accessor.Type.GETTER)
	public String getBuilding()
	{
		return getPersistenceContext().getPropertyValue(BUILDING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.city</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the city
	 */
	@Accessor(qualifier = "city", type = Accessor.Type.GETTER)
	public String getCity()
	{
		return getPersistenceContext().getPropertyValue(CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.countryIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the countryIsoCode
	 */
	@Accessor(qualifier = "countryIsoCode", type = Accessor.Type.GETTER)
	public String getCountryIsoCode()
	{
		return getPersistenceContext().getPropertyValue(COUNTRYISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.district</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the district
	 */
	@Accessor(qualifier = "district", type = Accessor.Type.GETTER)
	public String getDistrict()
	{
		return getPersistenceContext().getPropertyValue(DISTRICT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.documentAddressId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the documentAddressId
	 */
	@Accessor(qualifier = "documentAddressId", type = Accessor.Type.GETTER)
	public String getDocumentAddressId()
	{
		return getPersistenceContext().getPropertyValue(DOCUMENTADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.email</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the email
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.GETTER)
	public String getEmail()
	{
		return getPersistenceContext().getPropertyValue(EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.faxNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the faxNumber
	 */
	@Accessor(qualifier = "faxNumber", type = Accessor.Type.GETTER)
	public String getFaxNumber()
	{
		return getPersistenceContext().getPropertyValue(FAXNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.firstName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the firstName
	 */
	@Accessor(qualifier = "firstName", type = Accessor.Type.GETTER)
	public String getFirstName()
	{
		return getPersistenceContext().getPropertyValue(FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.houseNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the houseNumber
	 */
	@Accessor(qualifier = "houseNumber", type = Accessor.Type.GETTER)
	public String getHouseNumber()
	{
		return getPersistenceContext().getPropertyValue(HOUSENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.languageIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the languageIsoCode
	 */
	@Accessor(qualifier = "languageIsoCode", type = Accessor.Type.GETTER)
	public String getLanguageIsoCode()
	{
		return getPersistenceContext().getPropertyValue(LANGUAGEISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.lastName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the lastName
	 */
	@Accessor(qualifier = "lastName", type = Accessor.Type.GETTER)
	public String getLastName()
	{
		return getPersistenceContext().getPropertyValue(LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.middleName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the middleName
	 */
	@Accessor(qualifier = "middleName", type = Accessor.Type.GETTER)
	public String getMiddleName()
	{
		return getPersistenceContext().getPropertyValue(MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.middleName2</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the middleName2
	 */
	@Accessor(qualifier = "middleName2", type = Accessor.Type.GETTER)
	public String getMiddleName2()
	{
		return getPersistenceContext().getPropertyValue(MIDDLENAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.GETTER)
	public String getOrderId()
	{
		return getPersistenceContext().getPropertyValue(ORDERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.pobox</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the pobox
	 */
	@Accessor(qualifier = "pobox", type = Accessor.Type.GETTER)
	public String getPobox()
	{
		return getPersistenceContext().getPropertyValue(POBOX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.postalCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the postalCode
	 */
	@Accessor(qualifier = "postalCode", type = Accessor.Type.GETTER)
	public String getPostalCode()
	{
		return getPersistenceContext().getPropertyValue(POSTALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.regionIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the regionIsoCode
	 */
	@Accessor(qualifier = "regionIsoCode", type = Accessor.Type.GETTER)
	public String getRegionIsoCode()
	{
		return getPersistenceContext().getPropertyValue(REGIONISOCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.GETTER)
	public SAPCpiOutboundOrderModel getSapCpiOutboundOrder()
	{
		return getPersistenceContext().getPropertyValue(SAPCPIOUTBOUNDORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.street</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the street
	 */
	@Accessor(qualifier = "street", type = Accessor.Type.GETTER)
	public String getStreet()
	{
		return getPersistenceContext().getPropertyValue(STREET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.telNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the telNumber
	 */
	@Accessor(qualifier = "telNumber", type = Accessor.Type.GETTER)
	public String getTelNumber()
	{
		return getPersistenceContext().getPropertyValue(TELNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCpiOutboundAddress.titleCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 * @return the titleCode
	 */
	@Accessor(qualifier = "titleCode", type = Accessor.Type.GETTER)
	public String getTitleCode()
	{
		return getPersistenceContext().getPropertyValue(TITLECODE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.apartment</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the apartment
	 */
	@Accessor(qualifier = "apartment", type = Accessor.Type.SETTER)
	public void setApartment(final String value)
	{
		getPersistenceContext().setPropertyValue(APARTMENT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.building</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the building
	 */
	@Accessor(qualifier = "building", type = Accessor.Type.SETTER)
	public void setBuilding(final String value)
	{
		getPersistenceContext().setPropertyValue(BUILDING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.city</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the city
	 */
	@Accessor(qualifier = "city", type = Accessor.Type.SETTER)
	public void setCity(final String value)
	{
		getPersistenceContext().setPropertyValue(CITY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.countryIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the countryIsoCode
	 */
	@Accessor(qualifier = "countryIsoCode", type = Accessor.Type.SETTER)
	public void setCountryIsoCode(final String value)
	{
		getPersistenceContext().setPropertyValue(COUNTRYISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.district</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the district
	 */
	@Accessor(qualifier = "district", type = Accessor.Type.SETTER)
	public void setDistrict(final String value)
	{
		getPersistenceContext().setPropertyValue(DISTRICT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.documentAddressId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the documentAddressId
	 */
	@Accessor(qualifier = "documentAddressId", type = Accessor.Type.SETTER)
	public void setDocumentAddressId(final String value)
	{
		getPersistenceContext().setPropertyValue(DOCUMENTADDRESSID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.email</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the email
	 */
	@Accessor(qualifier = "email", type = Accessor.Type.SETTER)
	public void setEmail(final String value)
	{
		getPersistenceContext().setPropertyValue(EMAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.faxNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the faxNumber
	 */
	@Accessor(qualifier = "faxNumber", type = Accessor.Type.SETTER)
	public void setFaxNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(FAXNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.firstName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the firstName
	 */
	@Accessor(qualifier = "firstName", type = Accessor.Type.SETTER)
	public void setFirstName(final String value)
	{
		getPersistenceContext().setPropertyValue(FIRSTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.houseNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the houseNumber
	 */
	@Accessor(qualifier = "houseNumber", type = Accessor.Type.SETTER)
	public void setHouseNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(HOUSENUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.languageIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the languageIsoCode
	 */
	@Accessor(qualifier = "languageIsoCode", type = Accessor.Type.SETTER)
	public void setLanguageIsoCode(final String value)
	{
		getPersistenceContext().setPropertyValue(LANGUAGEISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.lastName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the lastName
	 */
	@Accessor(qualifier = "lastName", type = Accessor.Type.SETTER)
	public void setLastName(final String value)
	{
		getPersistenceContext().setPropertyValue(LASTNAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.middleName</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the middleName
	 */
	@Accessor(qualifier = "middleName", type = Accessor.Type.SETTER)
	public void setMiddleName(final String value)
	{
		getPersistenceContext().setPropertyValue(MIDDLENAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.middleName2</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the middleName2
	 */
	@Accessor(qualifier = "middleName2", type = Accessor.Type.SETTER)
	public void setMiddleName2(final String value)
	{
		getPersistenceContext().setPropertyValue(MIDDLENAME2, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.orderId</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the orderId
	 */
	@Accessor(qualifier = "orderId", type = Accessor.Type.SETTER)
	public void setOrderId(final String value)
	{
		getPersistenceContext().setPropertyValue(ORDERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.pobox</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the pobox
	 */
	@Accessor(qualifier = "pobox", type = Accessor.Type.SETTER)
	public void setPobox(final String value)
	{
		getPersistenceContext().setPropertyValue(POBOX, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.postalCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the postalCode
	 */
	@Accessor(qualifier = "postalCode", type = Accessor.Type.SETTER)
	public void setPostalCode(final String value)
	{
		getPersistenceContext().setPropertyValue(POSTALCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.regionIsoCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the regionIsoCode
	 */
	@Accessor(qualifier = "regionIsoCode", type = Accessor.Type.SETTER)
	public void setRegionIsoCode(final String value)
	{
		getPersistenceContext().setPropertyValue(REGIONISOCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.sapCpiOutboundOrder</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the sapCpiOutboundOrder
	 */
	@Accessor(qualifier = "sapCpiOutboundOrder", type = Accessor.Type.SETTER)
	public void setSapCpiOutboundOrder(final SAPCpiOutboundOrderModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPIOUTBOUNDORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.street</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the street
	 */
	@Accessor(qualifier = "street", type = Accessor.Type.SETTER)
	public void setStreet(final String value)
	{
		getPersistenceContext().setPropertyValue(STREET, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.telNumber</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the telNumber
	 */
	@Accessor(qualifier = "telNumber", type = Accessor.Type.SETTER)
	public void setTelNumber(final String value)
	{
		getPersistenceContext().setPropertyValue(TELNUMBER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCpiOutboundAddress.titleCode</code> attribute defined at extension <code>sapcpiadapter</code>. 
	 *  
	 * @param value the titleCode
	 */
	@Accessor(qualifier = "titleCode", type = Accessor.Type.SETTER)
	public void setTitleCode(final String value)
	{
		getPersistenceContext().setPropertyValue(TITLECODE, value);
	}
	
}
