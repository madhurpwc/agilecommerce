/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:15 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.saprevenuecloudorder.pojo.bill.v2;

import java.io.Serializable;


import java.util.Objects;
public  class CreditCard  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CreditCard.token</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String token;

	/** The type text of the card. Sample values are [ DPAM, DPDS, DPVI, DPMC, DPDI, DPJC ]")
            <br/><br/><i>Generated property</i> for <code>CreditCard.type</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String type;

	/** The type text of the card. Sample values are [ AMERICAN EXPRESS, DISCOVER, VISA, MasterCard,
                Diners Club, JCB ]")
            <br/><br/><i>Generated property</i> for <code>CreditCard.typeText</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String typeText;

	/** <i>Generated property</i> for <code>CreditCard.expirationMonth</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String expirationMonth;

	/** <i>Generated property</i> for <code>CreditCard.expirationYear</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String expirationYear;

	/** <i>Generated property</i> for <code>CreditCard.maskedCardNumber</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String maskedCardNumber;

	/** <i>Generated property</i> for <code>CreditCard.cardHolderName</code> property defined at extension <code>saprevenuecloudorder</code>. */
	
	private String cardHolderName;
	
	public CreditCard()
	{
		// default constructor
	}
	
	public void setToken(final String token)
	{
		this.token = token;
	}

	public String getToken() 
	{
		return token;
	}
	
	public void setType(final String type)
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	
	public void setTypeText(final String typeText)
	{
		this.typeText = typeText;
	}

	public String getTypeText() 
	{
		return typeText;
	}
	
	public void setExpirationMonth(final String expirationMonth)
	{
		this.expirationMonth = expirationMonth;
	}

	public String getExpirationMonth() 
	{
		return expirationMonth;
	}
	
	public void setExpirationYear(final String expirationYear)
	{
		this.expirationYear = expirationYear;
	}

	public String getExpirationYear() 
	{
		return expirationYear;
	}
	
	public void setMaskedCardNumber(final String maskedCardNumber)
	{
		this.maskedCardNumber = maskedCardNumber;
	}

	public String getMaskedCardNumber() 
	{
		return maskedCardNumber;
	}
	
	public void setCardHolderName(final String cardHolderName)
	{
		this.cardHolderName = cardHolderName;
	}

	public String getCardHolderName() 
	{
		return cardHolderName;
	}
	

}