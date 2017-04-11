package rw.itcg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author NIYOMWUNGERI Apr 4, 2017, 11:20:59 AM
 */
@Entity
public class Product extends GenericDomain {

	private static final long serialVersionUID = 1L;

	@Column(unique = true)
	private String productId;
	private String productName;
	private String productDesc;
	private Double pricePerItem;
	private Double quantity;

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public void setPricePerItem(Double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

}
