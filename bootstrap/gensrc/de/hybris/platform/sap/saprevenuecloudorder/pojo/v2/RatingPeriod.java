/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:13 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.v2;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public  class RatingPeriod  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RatingPeriod.start</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("start") 	
	private String start;

	/** <i>Generated property</i> for <code>RatingPeriod.end</code> property defined at extension <code>saprevenuecloudorder</code>. */
@JsonProperty("end") 	
	private String end;
	
	public RatingPeriod()
	{
		// default constructor
	}
	
@JsonProperty("start") 	public void setStart(final String start)
	{
		this.start = start;
	}

@JsonProperty("start") 	public String getStart() 
	{
		return start;
	}
	
@JsonProperty("end") 	public void setEnd(final String end)
	{
		this.end = end;
	}

@JsonProperty("end") 	public String getEnd() 
	{
		return end;
	}
	

}