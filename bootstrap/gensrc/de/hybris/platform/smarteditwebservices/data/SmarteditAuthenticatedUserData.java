/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:10 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.smarteditwebservices.data;

import de.hybris.platform.oauth2.data.AuthenticatedUserData;


import java.util.Objects;
/**
 * Smartedit Authenticated User Data
 */
public  class SmarteditAuthenticatedUserData extends AuthenticatedUserData 

{



	/** The uid of the user<br/><br/><i>Generated property</i> for <code>SmarteditAuthenticatedUserData.uid</code> property defined at extension <code>smarteditwebservices</code>. */
	
	private String uid;
	
	public SmarteditAuthenticatedUserData()
	{
		// default constructor
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	

}