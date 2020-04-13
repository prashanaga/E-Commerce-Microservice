/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service;

import Com.ecommerce.ProductCatalogService.model.ProductInventoryModel;

public interface ProductInventoryService {
	public void addInventory(ProductInventoryModel inventoryModel);
	public void deleteInventory(ProductInventoryModel inventoryModel) ;
}

