/**
 @author   Prashant Agarwal
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import Com.ecommerce.ProductCatalogService.Service.ProductService;
import Com.ecommerce.ProductCatalogService.dao.ProductMetaDataDao;

public class ProductServiceImpl implements ProductService {
	
	 private ProductMetaDataDao productRepository;
	
	@Autowired
	    public ProductServiceImpl(ProductMetadataDao productRepository) {
	       
			this.productRepository = productRepository;
			
	    }
	    
	@Override
    public ProductMetadataModel findById(String id) {
        return productRepository.findById(id);
    }

}

