/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Apr 21, 2023, 10:43:16 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.catalog.enums.ProductInfoStatus;
import de.hybris.platform.commercefacades.comment.data.CommentData;
import de.hybris.platform.commercefacades.order.data.ConfigurationInfoData;
import de.hybris.platform.commercefacades.order.data.DeliveryModeData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.storelocator.data.PointOfServiceData;
import de.hybris.platform.subscriptionfacades.data.OrderEntryPriceData;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;


import java.util.Objects;
public  class OrderEntryData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>OrderEntryData.entryNumber</code> property defined at extension <code>commercefacades</code>. */
	
	private Integer entryNumber;

	/** <i>Generated property</i> for <code>OrderEntryData.quantity</code> property defined at extension <code>commercefacades</code>. */
	
	private Long quantity;

	/** <i>Generated property</i> for <code>OrderEntryData.basePrice</code> property defined at extension <code>commercefacades</code>. */
	
	private PriceData basePrice;

	/** <i>Generated property</i> for <code>OrderEntryData.totalPrice</code> property defined at extension <code>commercefacades</code>. */
	
	private PriceData totalPrice;

	/** <i>Generated property</i> for <code>OrderEntryData.product</code> property defined at extension <code>commercefacades</code>. */
	
	private ProductData product;

	/** <i>Generated property</i> for <code>OrderEntryData.updateable</code> property defined at extension <code>commercefacades</code>. */
	
	private boolean updateable;

	/** <i>Generated property</i> for <code>OrderEntryData.deliveryMode</code> property defined at extension <code>commercefacades</code>. */
	
	private DeliveryModeData deliveryMode;

	/** <i>Generated property</i> for <code>OrderEntryData.deliveryPointOfService</code> property defined at extension <code>commercefacades</code>. */
	
	private PointOfServiceData deliveryPointOfService;

	/** <i>Generated property</i> for <code>OrderEntryData.entries</code> property defined at extension <code>commercefacades</code>. */
	
	private List<OrderEntryData> entries;

	/** <i>Generated property</i> for <code>OrderEntryData.configurationInfos</code> property defined at extension <code>commercefacades</code>. */
	
	private List<ConfigurationInfoData> configurationInfos;

	/** <i>Generated property</i> for <code>OrderEntryData.statusSummaryMap</code> property defined at extension <code>commercefacades</code>. */
	
	private Map<ProductInfoStatus, Integer> statusSummaryMap;

	/** <i>Generated property</i> for <code>OrderEntryData.entryGroupNumbers</code> property defined at extension <code>commercefacades</code>. */
	
	private Collection<Integer> entryGroupNumbers;

	/** <i>Generated property</i> for <code>OrderEntryData.comments</code> property defined at extension <code>commercefacades</code>. */
	
	private List<CommentData> comments;

	/** <i>Generated property</i> for <code>OrderEntryData.url</code> property defined at extension <code>ordermanagementfacades</code>. */
	
	private String url;

	/** <i>Generated property</i> for <code>OrderEntryData.cancellableQty</code> property defined at extension <code>ordermanagementfacades</code>. */
	
	private long cancellableQty;

	/** <i>Generated property</i> for <code>OrderEntryData.returnableQty</code> property defined at extension <code>ordermanagementfacades</code>. */
	
	private long returnableQty;

	/** <i>Generated property</i> for <code>OrderEntryData.cancelledItemsPrice</code> property defined at extension <code>ordermanagementfacades</code>. */
	
	private PriceData cancelledItemsPrice;

	/** <i>Generated property</i> for <code>OrderEntryData.returnedItemsPrice</code> property defined at extension <code>ordermanagementfacades</code>. */
	
	private PriceData returnedItemsPrice;

	/** <i>Generated property</i> for <code>OrderEntryData.orderEntryPrices</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private List<OrderEntryPriceData> orderEntryPrices;

	/** <i>Generated property</i> for <code>OrderEntryData.originalSubscriptionId</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String originalSubscriptionId;

	/** <i>Generated property</i> for <code>OrderEntryData.originalOrderCode</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String originalOrderCode;

	/** <i>Generated property</i> for <code>OrderEntryData.originalEntryNumber</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private int originalEntryNumber;

	/** <i>Generated property</i> for <code>OrderEntryData.entryMessage</code> property defined at extension <code>subscriptionfacades</code>. */
	
	private String entryMessage;

	/** <i>Generated property</i> for <code>OrderEntryData.supportedActions</code> property defined at extension <code>acceleratorfacades</code>. */
	
	private Set<String> supportedActions;

	/** <i>Generated property</i> for <code>OrderEntryData.quantityAllocated</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Long quantityAllocated;

	/** <i>Generated property</i> for <code>OrderEntryData.quantityUnallocated</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Long quantityUnallocated;

	/** <i>Generated property</i> for <code>OrderEntryData.quantityCancelled</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Long quantityCancelled;

	/** <i>Generated property</i> for <code>OrderEntryData.quantityPending</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Long quantityPending;

	/** <i>Generated property</i> for <code>OrderEntryData.quantityShipped</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Long quantityShipped;

	/** <i>Generated property</i> for <code>OrderEntryData.quantityReturned</code> property defined at extension <code>warehousingfacades</code>. */
	
	private Long quantityReturned;

	/** <i>Generated property</i> for <code>OrderEntryData.subscriptionType</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String subscriptionType;

	/** <i>Generated property</i> for <code>OrderEntryData.replenishmentOrderNumber</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String replenishmentOrderNumber;

	/** <i>Generated property</i> for <code>OrderEntryData.contractStartDate</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private Date contractStartDate;

	/** <i>Generated property</i> for <code>OrderEntryData.contractEndDate</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private Date contractEndDate;

	/** <i>Generated property</i> for <code>OrderEntryData.billingCycle</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String billingCycle;

	/** <i>Generated property</i> for <code>OrderEntryData.contractExtension</code> property defined at extension <code>c4hisb2cfacades</code>. */
	
	private String contractExtension;

	/** <i>Generated property</i> for <code>OrderEntryData.discountPercent</code> property defined at extension <code>sapcpqquotefacades</code>. */
	
	private String discountPercent;

	/** <i>Generated property</i> for <code>OrderEntryData.cancelledQuantity</code> property defined at extension <code>c4hisb2borderexchange</code>. */
	
	private Long cancelledQuantity;

	/** <i>Generated property</i> for <code>OrderEntryData.originalQuantity</code> property defined at extension <code>c4hisb2borderexchange</code>. */
	
	private Long originalQuantity;

	/** <i>Generated property</i> for <code>OrderEntryData.cancelledStatus</code> property defined at extension <code>c4hisb2borderexchange</code>. */
	
	private String cancelledStatus;
	
	public OrderEntryData()
	{
		// default constructor
	}
	
	public void setEntryNumber(final Integer entryNumber)
	{
		this.entryNumber = entryNumber;
	}

	public Integer getEntryNumber() 
	{
		return entryNumber;
	}
	
	public void setQuantity(final Long quantity)
	{
		this.quantity = quantity;
	}

	public Long getQuantity() 
	{
		return quantity;
	}
	
	public void setBasePrice(final PriceData basePrice)
	{
		this.basePrice = basePrice;
	}

	public PriceData getBasePrice() 
	{
		return basePrice;
	}
	
	public void setTotalPrice(final PriceData totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public PriceData getTotalPrice() 
	{
		return totalPrice;
	}
	
	public void setProduct(final ProductData product)
	{
		this.product = product;
	}

	public ProductData getProduct() 
	{
		return product;
	}
	
	public void setUpdateable(final boolean updateable)
	{
		this.updateable = updateable;
	}

	public boolean isUpdateable() 
	{
		return updateable;
	}
	
	public void setDeliveryMode(final DeliveryModeData deliveryMode)
	{
		this.deliveryMode = deliveryMode;
	}

	public DeliveryModeData getDeliveryMode() 
	{
		return deliveryMode;
	}
	
	public void setDeliveryPointOfService(final PointOfServiceData deliveryPointOfService)
	{
		this.deliveryPointOfService = deliveryPointOfService;
	}

	public PointOfServiceData getDeliveryPointOfService() 
	{
		return deliveryPointOfService;
	}
	
	public void setEntries(final List<OrderEntryData> entries)
	{
		this.entries = entries;
	}

	public List<OrderEntryData> getEntries() 
	{
		return entries;
	}
	
	public void setConfigurationInfos(final List<ConfigurationInfoData> configurationInfos)
	{
		this.configurationInfos = configurationInfos;
	}

	public List<ConfigurationInfoData> getConfigurationInfos() 
	{
		return configurationInfos;
	}
	
	public void setStatusSummaryMap(final Map<ProductInfoStatus, Integer> statusSummaryMap)
	{
		this.statusSummaryMap = statusSummaryMap;
	}

	public Map<ProductInfoStatus, Integer> getStatusSummaryMap() 
	{
		return statusSummaryMap;
	}
	
	public void setEntryGroupNumbers(final Collection<Integer> entryGroupNumbers)
	{
		this.entryGroupNumbers = entryGroupNumbers;
	}

	public Collection<Integer> getEntryGroupNumbers() 
	{
		return entryGroupNumbers;
	}
	
	public void setComments(final List<CommentData> comments)
	{
		this.comments = comments;
	}

	public List<CommentData> getComments() 
	{
		return comments;
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

	public String getUrl() 
	{
		return url;
	}
	
	public void setCancellableQty(final long cancellableQty)
	{
		this.cancellableQty = cancellableQty;
	}

	public long getCancellableQty() 
	{
		return cancellableQty;
	}
	
	public void setReturnableQty(final long returnableQty)
	{
		this.returnableQty = returnableQty;
	}

	public long getReturnableQty() 
	{
		return returnableQty;
	}
	
	public void setCancelledItemsPrice(final PriceData cancelledItemsPrice)
	{
		this.cancelledItemsPrice = cancelledItemsPrice;
	}

	public PriceData getCancelledItemsPrice() 
	{
		return cancelledItemsPrice;
	}
	
	public void setReturnedItemsPrice(final PriceData returnedItemsPrice)
	{
		this.returnedItemsPrice = returnedItemsPrice;
	}

	public PriceData getReturnedItemsPrice() 
	{
		return returnedItemsPrice;
	}
	
	public void setOrderEntryPrices(final List<OrderEntryPriceData> orderEntryPrices)
	{
		this.orderEntryPrices = orderEntryPrices;
	}

	public List<OrderEntryPriceData> getOrderEntryPrices() 
	{
		return orderEntryPrices;
	}
	
	public void setOriginalSubscriptionId(final String originalSubscriptionId)
	{
		this.originalSubscriptionId = originalSubscriptionId;
	}

	public String getOriginalSubscriptionId() 
	{
		return originalSubscriptionId;
	}
	
	public void setOriginalOrderCode(final String originalOrderCode)
	{
		this.originalOrderCode = originalOrderCode;
	}

	public String getOriginalOrderCode() 
	{
		return originalOrderCode;
	}
	
	public void setOriginalEntryNumber(final int originalEntryNumber)
	{
		this.originalEntryNumber = originalEntryNumber;
	}

	public int getOriginalEntryNumber() 
	{
		return originalEntryNumber;
	}
	
	public void setEntryMessage(final String entryMessage)
	{
		this.entryMessage = entryMessage;
	}

	public String getEntryMessage() 
	{
		return entryMessage;
	}
	
	public void setSupportedActions(final Set<String> supportedActions)
	{
		this.supportedActions = supportedActions;
	}

	public Set<String> getSupportedActions() 
	{
		return supportedActions;
	}
	
	public void setQuantityAllocated(final Long quantityAllocated)
	{
		this.quantityAllocated = quantityAllocated;
	}

	public Long getQuantityAllocated() 
	{
		return quantityAllocated;
	}
	
	public void setQuantityUnallocated(final Long quantityUnallocated)
	{
		this.quantityUnallocated = quantityUnallocated;
	}

	public Long getQuantityUnallocated() 
	{
		return quantityUnallocated;
	}
	
	public void setQuantityCancelled(final Long quantityCancelled)
	{
		this.quantityCancelled = quantityCancelled;
	}

	public Long getQuantityCancelled() 
	{
		return quantityCancelled;
	}
	
	public void setQuantityPending(final Long quantityPending)
	{
		this.quantityPending = quantityPending;
	}

	public Long getQuantityPending() 
	{
		return quantityPending;
	}
	
	public void setQuantityShipped(final Long quantityShipped)
	{
		this.quantityShipped = quantityShipped;
	}

	public Long getQuantityShipped() 
	{
		return quantityShipped;
	}
	
	public void setQuantityReturned(final Long quantityReturned)
	{
		this.quantityReturned = quantityReturned;
	}

	public Long getQuantityReturned() 
	{
		return quantityReturned;
	}
	
	public void setSubscriptionType(final String subscriptionType)
	{
		this.subscriptionType = subscriptionType;
	}

	public String getSubscriptionType() 
	{
		return subscriptionType;
	}
	
	public void setReplenishmentOrderNumber(final String replenishmentOrderNumber)
	{
		this.replenishmentOrderNumber = replenishmentOrderNumber;
	}

	public String getReplenishmentOrderNumber() 
	{
		return replenishmentOrderNumber;
	}
	
	public void setContractStartDate(final Date contractStartDate)
	{
		this.contractStartDate = contractStartDate;
	}

	public Date getContractStartDate() 
	{
		return contractStartDate;
	}
	
	public void setContractEndDate(final Date contractEndDate)
	{
		this.contractEndDate = contractEndDate;
	}

	public Date getContractEndDate() 
	{
		return contractEndDate;
	}
	
	public void setBillingCycle(final String billingCycle)
	{
		this.billingCycle = billingCycle;
	}

	public String getBillingCycle() 
	{
		return billingCycle;
	}
	
	public void setContractExtension(final String contractExtension)
	{
		this.contractExtension = contractExtension;
	}

	public String getContractExtension() 
	{
		return contractExtension;
	}
	
	public void setDiscountPercent(final String discountPercent)
	{
		this.discountPercent = discountPercent;
	}

	public String getDiscountPercent() 
	{
		return discountPercent;
	}
	
	public void setCancelledQuantity(final Long cancelledQuantity)
	{
		this.cancelledQuantity = cancelledQuantity;
	}

	public Long getCancelledQuantity() 
	{
		return cancelledQuantity;
	}
	
	public void setOriginalQuantity(final Long originalQuantity)
	{
		this.originalQuantity = originalQuantity;
	}

	public Long getOriginalQuantity() 
	{
		return originalQuantity;
	}
	
	public void setCancelledStatus(final String cancelledStatus)
	{
		this.cancelledStatus = cancelledStatus;
	}

	public String getCancelledStatus() 
	{
		return cancelledStatus;
	}
	

}