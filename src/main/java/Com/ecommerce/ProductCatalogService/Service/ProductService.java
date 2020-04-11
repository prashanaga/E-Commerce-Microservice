/**
 @author   Prashant Agarwal
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;


public interface ProductService {
	public ProductMetaDataModel findById(String id);
	public void addNewProduct(ProductMetaDataModel productMetaDataModel);

}

