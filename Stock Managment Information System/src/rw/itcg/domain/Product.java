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
	private String desc;
	private double unitPrice;
	private double quantity;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
