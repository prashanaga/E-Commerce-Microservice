/**
 @author   Prashant Agarwal
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;

public interface ProductService {
	ProductMetaDataModel findById(String id);

}

