/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.sapcpqquoteintegration.model;

import com.sap.hybris.sapcpqquoteintegration.model.SAPCPQOutboundQuoteModel;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPCPQOutboundQuoteCustomer first defined at extension sapcpqquoteintegration.
 */
@SuppressWarnings("all")
public class SAPCPQOutboundQuoteCustomerModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPCPQOutboundQuoteCustomer";
	
	/**<i>Generated relation code constant for relation <code>SAPCPQOutboundQuote2SAPCPQOutboundQuoteCustomer</code> defining source attribute <code>sapCPQOutboundQuote</code> in extension <code>sapcpqquoteintegration</code>.</i>*/
	public static final String _SAPCPQOUTBOUNDQUOTE2SAPCPQOUTBOUNDQUOTECUSTOMER = "SAPCPQOutboundQuote2SAPCPQOutboundQuoteCustomer";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteCustomer.id</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteCustomer.customerCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CUSTOMERCODE = "customerCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteCustomer.roleType</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String ROLETYPE = "roleType";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteCustomer.businessPartnerId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String BUSINESSPARTNERID = "businessPartnerId";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPCPQOutboundQuoteCustomer.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String SAPCPQOUTBOUNDQUOTE = "sapCPQOutboundQuote";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPCPQOutboundQuoteCustomerModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPCPQOutboundQuoteCustomerModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPCPQOutboundQuoteCustomerModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteCustomer.businessPartnerId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the businessPartnerId
	 */
	@Accessor(qualifier = "businessPartnerId", type = Accessor.Type.GETTER)
	public String getBusinessPartnerId()
	{
		return getPersistenceContext().getPropertyValue(BUSINESSPARTNERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteCustomer.customerCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the customerCode
	 */
	@Accessor(qualifier = "customerCode", type = Accessor.Type.GETTER)
	public String getCustomerCode()
	{
		return getPersistenceContext().getPropertyValue(CUSTOMERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteCustomer.id</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the id
	 */
	@Accessor(qualifier = "id", type = Accessor.Type.GETTER)
	public String getId()
	{
		return getPersistenceContext().getPropertyValue(ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteCustomer.roleType</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the roleType
	 */
	@Accessor(qualifier = "roleType", type = Accessor.Type.GETTER)
	public String getRoleType()
	{
		return getPersistenceContext().getPropertyValue(ROLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPCPQOutboundQuoteCustomer.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the sapCPQOutboundQuote
	 */
	@Accessor(qualifier = "sapCPQOutboundQuote", type = Accessor.Type.GETTER)
	public SAPCPQOutboundQuoteModel getSapCPQOutboundQuote()
	{
		return getPersistenceContext().getPropertyValue(SAPCPQOUTBOUNDQUOTE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteCustomer.businessPartnerId</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the businessPartnerId
	 */
	@Accessor(qualifier = "businessPartnerId", type = Accessor.Type.SETTER)
	public void setBusinessPartnerId(final String value)
	{
		getPersistenceContext().setPropertyValue(BUSINESSPARTNERID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteCustomer.customerCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the customerCode
	 */
	@Accessor(qualifier = "customerCode", type = Accessor.Type.SETTER)
	public void setCustomerCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOMERCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteCustomer.id</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the id
	 */
	@Accessor(qualifier = "id", type = Accessor.Type.SETTER)
	public void setId(final String value)
	{
		getPersistenceContext().setPropertyValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteCustomer.roleType</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the roleType
	 */
	@Accessor(qualifier = "roleType", type = Accessor.Type.SETTER)
	public void setRoleType(final String value)
	{
		getPersistenceContext().setPropertyValue(ROLETYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPCPQOutboundQuoteCustomer.sapCPQOutboundQuote</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the sapCPQOutboundQuote
	 */
	@Accessor(qualifier = "sapCPQOutboundQuote", type = Accessor.Type.SETTER)
	public void setSapCPQOutboundQuote(final SAPCPQOutboundQuoteModel value)
	{
		getPersistenceContext().setPropertyValue(SAPCPQOUTBOUNDQUOTE, value);
	}
	
}
