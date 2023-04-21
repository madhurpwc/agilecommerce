/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Apr 21, 2023, 10:42:53 AM                   ---
 * ----------------------------------------------------------------
 */
package com.sap.hybris.saprevenuecloudproduct.model;

import com.sap.hybris.saprevenuecloudproduct.enums.RatePlanElementType;
import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SAPRatePlanElement first defined at extension saprevenuecloudproduct.
 * <p>
 * Sap Revenue Cloud Rate plan elements.
 */
@SuppressWarnings("all")
public class SAPRatePlanElementModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SAPRatePlanElement";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRatePlanElement.id</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String ID = "id";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRatePlanElement.name</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>SAPRatePlanElement.type</code> attribute defined at extension <code>saprevenuecloudproduct</code>. */
	public static final String TYPE = "type";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SAPRatePlanElementModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SAPRatePlanElementModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>SAPRatePlanElement</code> at extension <code>saprevenuecloudproduct</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPRatePlanElementModel(final String _id)
	{
		super();
		setId(_id);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _id initial attribute declared by type <code>SAPRatePlanElement</code> at extension <code>saprevenuecloudproduct</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SAPRatePlanElementModel(final String _id, final ItemModel _owner)
	{
		super();
		setId(_id);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRatePlanElement.id</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the id - Sap Revenue Cloud configuration name
	 */
	@Accessor(qualifier = "id", type = Accessor.Type.GETTER)
	public String getId()
	{
		return getPersistenceContext().getPropertyValue(ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRatePlanElement.name</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SAPRatePlanElement.type</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 * @return the type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.GETTER)
	public RatePlanElementType getType()
	{
		return getPersistenceContext().getPropertyValue(TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRatePlanElement.id</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the id - Sap Revenue Cloud configuration name
	 */
	@Accessor(qualifier = "id", type = Accessor.Type.SETTER)
	public void setId(final String value)
	{
		getPersistenceContext().setPropertyValue(ID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRatePlanElement.name</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SAPRatePlanElement.type</code> attribute defined at extension <code>saprevenuecloudproduct</code>. 
	 *  
	 * @param value the type
	 */
	@Accessor(qualifier = "type", type = Accessor.Type.SETTER)
	public void setType(final RatePlanElementType value)
	{
		getPersistenceContext().setPropertyValue(TYPE, value);
	}
	
}
