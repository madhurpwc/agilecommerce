/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:09 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.product.data;

import java.io.Serializable;
import com.c4his.b2c.core.enums.C4HISProductType;
import com.c4his.b2c.facades.product.data.GenderData;
import de.hybris.platform.acceleratorfacades.order.data.PriceRangeData;
import de.hybris.platform.commercefacades.product.data.BaseOptionData;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ClassificationData;
import de.hybris.platform.commercefacades.product.data.FutureStockData;
import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.ProductReferenceData;
import de.hybris.platform.commercefacades.product.data.PromotionData;
import de.hybris.platform.commercefacades.product.data.ReviewData;
import de.hybris.platform.commercefacades.product.data.StockData;
import de.hybris.platform.commercefacades.product.data.VariantMatrixElementData;
import de.hybris.platform.commercefacades.product.data.VariantOptionData;
import de.hybris.platform.commerceservices.product.data.SolrFirstVariantCategoryEntryData;
import de.hybris.platform.subscriptionfacades.data.SubscriptionTermData;
import java.util.Collection;
import java.util.List;
import java.util.Set;


import java.util.Objects;
public  class ProductData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ProductData.code</code> property defined at extension <code>commercefacades</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>ProductData.name</code> property defined at extension <code>commercefacades</code>. */
	
	private String name;

	/** <i>Generated property</i> for <code>ProductData.url</code> property defined at extension <code>commercefacades</code>. */
	
	private String url;

	/** <i>Generated property</i> for <code>ProductData.description</code> property defined at extension <code>commercefacades</code>. */
	
	private String description;

	/** <i>Generated property</i> for <code>ProductData.purchasable</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean purchasable;

	/** <i>Generated property</i> for <code>ProductData.stock</code> property defined at extension <code>commercefacades</code>. */
	
	private StockData stock;

	/** <i>Generated property</i> for <code>ProductData.futureStocks</code> property defined at extension <code>commercefacades</code>. */
	
	private List<FutureStockData> futureStocks;

	/** <i>Generated property</i> for <code>ProductData.availableForPickup</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean availableForPickup;

	/** <i>Generated property</i> for <code>ProductData.averageRating</code> property defined at extension <code>commercefacades</code>. */
	
	private Double averageRating;

	/** <i>Generated property</i> for <code>ProductData.numberOfReviews</code> property defined at extension <code>commercefacades</code>. */
	
	private Integer numberOfReviews;

	/** <i>Generated property</i> for <code>ProductData.summary</code> property defined at extension <code>commercefacades</code>. */
	
	private String summary;

	/** <i>Generated property</i> for <code>ProductData.manufacturer</code> property defined at extension <code>commercefacades</code>. */
	
	private String manufacturer;

	/** <i>Generated property</i> for <code>ProductData.variantType</code> property defined at extension <code>commercefacades</code>. */
	
	private String variantType;

	/** <i>Generated property</i> for <code>ProductData.price</code> property defined at extension <code>commercefacades</code>. */
	
	private PriceData price;

	/** <i>Generated property</i> for <code>ProductData.baseProduct</code> property defined at extension <code>commercefacades</code>. */
	
	private String baseProduct;

	/** <i>Generated property</i> for <code>ProductData.images</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<ImageData> images;

	/** <i>Generated property</i> for <code>ProductData.categories</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<CategoryData> categories;

	/** <i>Generated property</i> for <code>ProductData.reviews</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<ReviewData> reviews;

	/** <i>Generated property</i> for <code>ProductData.classifications</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<ClassificationData> classifications;

	/** <i>Generated property</i> for <code>ProductData.potentialPromotions</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<PromotionData> potentialPromotions;

	/** <i>Generated property</i> for <code>ProductData.variantOptions</code> property defined at extension <code>commercefacades</code>. */
	
	private List<VariantOptionData> variantOptions;

	/** <i>Generated property</i> for <code>ProductData.baseOptions</code> property defined at extension <code>commercefacades</code>. */
	
	private List<BaseOptionData> baseOptions;

	/** <i>Generated property</i> for <code>ProductData.volumePricesFlag</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean volumePricesFlag;

	/** <i>Generated property</i> for <code>ProductData.volumePrices</code> property defined at extension <code>commercefacades</code>. */
	
	private List<PriceData> volumePrices;

	/** <i>Generated property</i> for <code>ProductData.productReferences</code> property defined at extension <code>commercefacades</code>. */
	
	private List<ProductReferenceData> productReferences;

	/** <i>Generated property</i> for <code>ProductData.variantMatrix</code> property defined at extension <code>commercefacades</code>. */
	
	private List<VariantMatrixElementData> variantMatrix;

	/** <i>Generated property</i> for <code>ProductData.priceRange</code> property defined at extension <code>commercefacades</code>. */
	
	private PriceRangeData priceRange;

	/** <i>Generated property</i> for <code>ProductData.firstCategoryNameList</code> property defined at extension <code>commercefacades</code>. */
	
	private List<SolrFirstVariantCategoryEntryData> firstCategoryNameList;

	/** <i>Generated property</i> for <code>ProductData.multidimensional</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean multidimensional;

	/** <i>Generated property</i> for <code>ProductData.configurable</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean configurable;

	/** <i>Generated property</i> for <code>ProductData.configuratorType</code> property defined at extension <code>commercefacades</code>. */
	
	private String configuratorType;

	/** <i>Generated property</i> for <code>ProductData.addToCartDisabled</code> property defined at extension <code>commercefacades</code>. */
	
	private Boolean addToCartDisabled;

	/** <i>Generated property</i> for <code>ProductData.addToCartDisabledMessage</code> property defined at extension <code>commercefacades</code>. */
	
	private String addToCartDisabledMessage;

	/** <i>Generated property</i> for <code>ProductData.tags</code> property defined at extension <code>commercefacades</code>. */
	
	private Set<String> tags;

	/** <i>Generated property</i> for <code>ProductData.itemType</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String itemType;

	/** <i>Generated property</i> for <code>ProductData.subscriptionTerm</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private SubscriptionTermData subscriptionTerm;

	/** <i>Generated property</i> for <code>ProductData.keywords</code> property defined at extension <code>acceleratorfacades</code>. */
	
	private Set<String> keywords;

	/** <i>Generated property</i> for <code>ProductData.contractTerm</code> property defined at extension <code>saprevenuecloudproduct</code>. */
	
	private String contractTerm;

	/** <i>Generated property</i> for <code>ProductData.minimumTerm</code> property defined at extension <code>saprevenuecloudproduct</code>. */
	
	private String minimumTerm;

	/** <i>Generated property</i> for <code>ProductData.renewalTerm</code> property defined at extension <code>saprevenuecloudproduct</code>. */
	
	private String renewalTerm;

	/** <i>Generated property</i> for <code>ProductData.subscriptionCode</code> property defined at extension <code>saprevenuecloudproduct</code>. */
	
	private String subscriptionCode;

	/** <i>Generated property</i> for <code>ProductData.subscriptionValidTerm</code> property defined at extension <code>saprevenuecloudproduct</code>. */
	
	private String subscriptionValidTerm;

	/** <i>Generated property</i> for <code>ProductData.genders</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private List<GenderData> genders;

	/** <i>Generated property</i> for <code>ProductData.containsAlternateFlag</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private Boolean containsAlternateFlag;

	/** <i>Generated property</i> for <code>ProductData.availableStock</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private Long availableStock;

	/** <i>Generated property</i> for <code>ProductData.subscriptionProduct</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private Boolean subscriptionProduct;

	/** <i>Generated property</i> for <code>ProductData.productType</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private C4HISProductType productType;
	
	public ProductData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setDescription(final String description)
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public void setPurchasable(final Boolean purchasable)
	{
		this.purchasable = purchasable;
	}

	public Boolean getPurchasable() 
	{
		return purchasable;
	}
	
	public void setStock(final StockData stock)
	{
		this.stock = stock;
	}

	public StockData getStock() 
	{
		return stock;
	}
	
	public void setFutureStocks(final List<FutureStockData> futureStocks)
	{
		this.futureStocks = futureStocks;
	}

	public List<FutureStockData> getFutureStocks() 
	{
		return futureStocks;
	}
	
	public void setAvailableForPickup(final Boolean availableForPickup)
	{
		this.availableForPickup = availableForPickup;
	}

	public Boolean getAvailableForPickup() 
	{
		return availableForPickup;
	}
	
	public void setAverageRating(final Double averageRating)
	{
		this.averageRating = averageRating;
	}

	public Double getAverageRating() 
	{
		return averageRating;
	}
	
	public void setNumberOfReviews(final Integer numberOfReviews)
	{
		this.numberOfReviews = numberOfReviews;
	}

	public Integer getNumberOfReviews() 
	{
		return numberOfReviews;
	}
	
	public void setSummary(final String summary)
	{
		this.summary = summary;
	}

	public String getSummary() 
	{
		return summary;
	}
	
	public void setManufacturer(final String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() 
	{
		return manufacturer;
	}
	
	public void setVariantType(final String variantType)
	{
		this.variantType = variantType;
	}

	public String getVariantType() 
	{
		return variantType;
	}
	
	public void setPrice(final PriceData price)
	{
		this.price = price;
	}

	public PriceData getPrice() 
	{
		return price;
	}
	
	public void setBaseProduct(final String baseProduct)
	{
		this.baseProduct = baseProduct;
	}

	public String getBaseProduct() 
	{
		return baseProduct;
	}
	
	public void setImages(final Collection<ImageData> images)
	{
		this.images = images;
	}

	public Collection<ImageData> getImages() 
	{
		return images;
	}
	
	public void setCategories(final Collection<CategoryData> categories)
	{
		this.categories = categories;
	}

	public Collection<CategoryData> getCategories() 
	{
		return categories;
	}
	
	public void setReviews(final Collection<ReviewData> reviews)
	{
		this.reviews = reviews;
	}

	public Collection<ReviewData> getReviews() 
	{
		return reviews;
	}
	
	public void setClassifications(final Collection<ClassificationData> classifications)
	{
		this.classifications = classifications;
	}

	public Collection<ClassificationData> getClassifications() 
	{
		return classifications;
	}
	
	public void setPotentialPromotions(final Collection<PromotionData> potentialPromotions)
	{
		this.potentialPromotions = potentialPromotions;
	}

	public Collection<PromotionData> getPotentialPromotions() 
	{
		return potentialPromotions;
	}
	
	public void setVariantOptions(final List<VariantOptionData> variantOptions)
	{
		this.variantOptions = variantOptions;
	}

	public List<VariantOptionData> getVariantOptions() 
	{
		return variantOptions;
	}
	
	public void setBaseOptions(final List<BaseOptionData> baseOptions)
	{
		this.baseOptions = baseOptions;
	}

	public List<BaseOptionData> getBaseOptions() 
	{
		return baseOptions;
	}
	
	public void setVolumePricesFlag(final Boolean volumePricesFlag)
	{
		this.volumePricesFlag = volumePricesFlag;
	}

	public Boolean getVolumePricesFlag() 
	{
		return volumePricesFlag;
	}
	
	public void setVolumePrices(final List<PriceData> volumePrices)
	{
		this.volumePrices = volumePrices;
	}

	public List<PriceData> getVolumePrices() 
	{
		return volumePrices;
	}
	
	public void setProductReferences(final List<ProductReferenceData> productReferences)
	{
		this.productReferences = productReferences;
	}

	public List<ProductReferenceData> getProductReferences() 
	{
		return productReferences;
	}
	
	public void setVariantMatrix(final List<VariantMatrixElementData> variantMatrix)
	{
		this.variantMatrix = variantMatrix;
	}

	public List<VariantMatrixElementData> getVariantMatrix() 
	{
		return variantMatrix;
	}
	
	public void setPriceRange(final PriceRangeData priceRange)
	{
		this.priceRange = priceRange;
	}

	public PriceRangeData getPriceRange() 
	{
		return priceRange;
	}
	
	public void setFirstCategoryNameList(final List<SolrFirstVariantCategoryEntryData> firstCategoryNameList)
	{
		this.firstCategoryNameList = firstCategoryNameList;
	}

	public List<SolrFirstVariantCategoryEntryData> getFirstCategoryNameList() 
	{
		return firstCategoryNameList;
	}
	
	public void setMultidimensional(final Boolean multidimensional)
	{
		this.multidimensional = multidimensional;
	}

	public Boolean getMultidimensional() 
	{
		return multidimensional;
	}
	
	public void setConfigurable(final Boolean configurable)
	{
		this.configurable = configurable;
	}

	public Boolean getConfigurable() 
	{
		return configurable;
	}
	
	public void setConfiguratorType(final String configuratorType)
	{
		this.configuratorType = configuratorType;
	}

	public String getConfiguratorType() 
	{
		return configuratorType;
	}
	
	public void setAddToCartDisabled(final Boolean addToCartDisabled)
	{
		this.addToCartDisabled = addToCartDisabled;
	}

	public Boolean getAddToCartDisabled() 
	{
		return addToCartDisabled;
	}
	
	public void setAddToCartDisabledMessage(final String addToCartDisabledMessage)
	{
		this.addToCartDisabledMessage = addToCartDisabledMessage;
	}

	public String getAddToCartDisabledMessage() 
	{
		return addToCartDisabledMessage;
	}
	
	public void setTags(final Set<String> tags)
	{
		this.tags = tags;
	}

	public Set<String> getTags() 
	{
		return tags;
	}
	
	public void setItemType(final String itemType)
	{
		this.itemType = itemType;
	}

	public String getItemType() 
	{
		return itemType;
	}
	
	public void setSubscriptionTerm(final SubscriptionTermData subscriptionTerm)
	{
		this.subscriptionTerm = subscriptionTerm;
	}

	public SubscriptionTermData getSubscriptionTerm() 
	{
		return subscriptionTerm;
	}
	
	public void setKeywords(final Set<String> keywords)
	{
		this.keywords = keywords;
	}

	public Set<String> getKeywords() 
	{
		return keywords;
	}
	
	public void setContractTerm(final String contractTerm)
	{
		this.contractTerm = contractTerm;
	}

	public String getContractTerm() 
	{
		return contractTerm;
	}
	
	public void setMinimumTerm(final String minimumTerm)
	{
		this.minimumTerm = minimumTerm;
	}

	public String getMinimumTerm() 
	{
		return minimumTerm;
	}
	
	public void setRenewalTerm(final String renewalTerm)
	{
		this.renewalTerm = renewalTerm;
	}

	public String getRenewalTerm() 
	{
		return renewalTerm;
	}
	
	public void setSubscriptionCode(final String subscriptionCode)
	{
		this.subscriptionCode = subscriptionCode;
	}

	public String getSubscriptionCode() 
	{
		return subscriptionCode;
	}
	
	public void setSubscriptionValidTerm(final String subscriptionValidTerm)
	{
		this.subscriptionValidTerm = subscriptionValidTerm;
	}

	public String getSubscriptionValidTerm() 
	{
		return subscriptionValidTerm;
	}
	
	public void setGenders(final List<GenderData> genders)
	{
		this.genders = genders;
	}

	public List<GenderData> getGenders() 
	{
		return genders;
	}
	
	public void setContainsAlternateFlag(final Boolean containsAlternateFlag)
	{
		this.containsAlternateFlag = containsAlternateFlag;
	}

	public Boolean getContainsAlternateFlag() 
	{
		return containsAlternateFlag;
	}
	
	public void setAvailableStock(final Long availableStock)
	{
		this.availableStock = availableStock;
	}

	public Long getAvailableStock() 
	{
		return availableStock;
	}
	
	public void setSubscriptionProduct(final Boolean subscriptionProduct)
	{
		this.subscriptionProduct = subscriptionProduct;
	}

	public Boolean getSubscriptionProduct() 
	{
		return subscriptionProduct;
	}
	
	public void setProductType(final C4HISProductType productType)
	{
		this.productType = productType;
	}

	public C4HISProductType getProductType() 
	{
		return productType;
	}
	

}