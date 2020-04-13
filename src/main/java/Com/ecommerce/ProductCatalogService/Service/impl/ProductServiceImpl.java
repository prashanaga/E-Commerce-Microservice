/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.ecommerce.ProductCatalogService.Service.ProductService;
import Com.ecommerce.ProductCatalogService.dao.ProductMetaDataDao;
import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMetaDataDao productRepository;


	@Override
	public ProductMetaDataModel findProductById(String id) {
		
		return productRepository.findProductById(id);
	}

	@Override
	public void addNewProduct(ProductMetaDataModel productMetaDataModel) {

	}

}
