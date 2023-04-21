/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:14 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiadapter.data;

import java.io.Serializable;
import de.hybris.platform.sap.sapcpiadapter.data.SapCpiTargetSystem;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;


import java.util.Objects;
@XmlRootElement(name="sapCpiConfig")
public  class SapCpiConfig  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SapCpiConfig.sapCpiTargetSystem</code> property defined at extension <code>sapcpiadapter</code>. */
	
	private SapCpiTargetSystem sapCpiTargetSystem;
	
	public SapCpiConfig()
	{
		// default constructor
	}
	
	public void setSapCpiTargetSystem(final SapCpiTargetSystem sapCpiTargetSystem)
	{
		this.sapCpiTargetSystem = sapCpiTargetSystem;
	}

@XmlElement(name="sapCpiTargetSystem") 	public SapCpiTargetSystem getSapCpiTargetSystem() 
	{
		return sapCpiTargetSystem;
	}
	

}