package rw.itcg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rw.itcg.dao.ProductDao;
import rw.itcg.domain.Product;
import rw.itcg.exceptionHandling.ManageExceptions;

/**
 * @author NIYOMWUNGERI Apr 11, 2017, 10:30:12 AM
 */
@Service
public class ProductService extends TransactionAware {
	@Autowired
	private ProductDao productDao;

	public String createProduct(Product product) {
		try {
			productDao.save(product);
			return "Product Registered";
		} catch (Exception e) {
			e.printStackTrace();
			throw new ManageExceptions(e.getMessage());
		}
	}
}
