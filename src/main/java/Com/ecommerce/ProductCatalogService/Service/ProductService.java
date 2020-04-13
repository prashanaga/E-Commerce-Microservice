/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;


public interface ProductService {
	public ProductMetaDataModel findProductById(String id);
	public void addNewProduct(ProductMetaDataModel productMetaDataModel);

}

