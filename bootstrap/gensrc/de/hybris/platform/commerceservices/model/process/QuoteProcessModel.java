/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.model.process;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type QuoteProcess first defined at extension commerceservices.
 */
@SuppressWarnings("all")
public class QuoteProcessModel extends BusinessProcessModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "QuoteProcess";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteProcess.quoteCode</code> attribute defined at extension <code>commerceservices</code>. */
	public static final String QUOTECODE = "quoteCode";
	
	/** <i>Generated constant</i> - Attribute key of <code>QuoteProcess.cpqOrderCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. */
	public static final String CPQORDERCODE = "cpqOrderCode";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public QuoteProcessModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public QuoteProcessModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public QuoteProcessModel(final String _code, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _processDefinitionName initial attribute declared by type <code>BusinessProcess</code> at extension <code>processing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public QuoteProcessModel(final String _code, final ItemModel _owner, final String _processDefinitionName)
	{
		super();
		setCode(_code);
		setOwner(_owner);
		setProcessDefinitionName(_processDefinitionName);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteProcess.cpqOrderCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 * @return the cpqOrderCode - Order code of created order from Quote
	 */
	@Accessor(qualifier = "cpqOrderCode", type = Accessor.Type.GETTER)
	public String getCpqOrderCode()
	{
		return getPersistenceContext().getPropertyValue(CPQORDERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuoteProcess.quoteCode</code> attribute defined at extension <code>commerceservices</code>. 
	 * @return the quoteCode - Quote model submitted by the buyer/sales rep.
	 */
	@Accessor(qualifier = "quoteCode", type = Accessor.Type.GETTER)
	public String getQuoteCode()
	{
		return getPersistenceContext().getPropertyValue(QUOTECODE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteProcess.cpqOrderCode</code> attribute defined at extension <code>sapcpqquoteintegration</code>. 
	 *  
	 * @param value the cpqOrderCode - Order code of created order from Quote
	 */
	@Accessor(qualifier = "cpqOrderCode", type = Accessor.Type.SETTER)
	public void setCpqOrderCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CPQORDERCODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>QuoteProcess.quoteCode</code> attribute defined at extension <code>commerceservices</code>. 
	 *  
	 * @param value the quoteCode - Quote model submitted by the buyer/sales rep.
	 */
	@Accessor(qualifier = "quoteCode", type = Accessor.Type.SETTER)
	public void setQuoteCode(final String value)
	{
		getPersistenceContext().setPropertyValue(QUOTECODE, value);
	}
	
}
