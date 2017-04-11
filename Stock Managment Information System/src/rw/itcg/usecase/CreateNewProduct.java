package rw.itcg.usecase;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rw.itcg.domain.Product;
import rw.itcg.service.ProductService;

/**
 * @author NIYOMWUNGERI Apr 11, 2017, 6:12:31 PM
 */
@Component
@ManagedBean
public class CreateNewProduct {
	@Autowired
	private ProductService productService;
	private Product product = new Product();

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void register() {
		String resp = "";
		resp = productService.createProduct(new Product());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, null, resp));
	}
}
