/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.ecommerce.ProductCatalogService.Service.ProductInventoryService;
import Com.ecommerce.ProductCatalogService.broker.InventoryBroker;
import Com.ecommerce.ProductCatalogService.command.AddInventory;
import Com.ecommerce.ProductCatalogService.command.DeleteInventory;
import Com.ecommerce.ProductCatalogService.command.Inventory;
import Com.ecommerce.ProductCatalogService.model.ProductInventoryModel;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService {
	
	@Autowired
	Inventory inventory;
	
	public void addInventory(ProductInventoryModel inventoryModel) {

		
		inventory.setId(inventoryModel.getId());
		inventory.setQuantity(inventoryModel.getQuantity());

		AddInventory addStockOrder = new AddInventory(inventory);

		InventoryBroker broker = new InventoryBroker();

		broker.takeOrder(addStockOrder);

		broker.placeOrders();

	}

	public void deleteInventory(ProductInventoryModel inventoryModel) {
		
		inventory.setId(inventoryModel.getId());
		inventory.setQuantity(inventoryModel.getQuantity());
		DeleteInventory deleteStockOrder = new DeleteInventory(inventory);

		InventoryBroker broker = new InventoryBroker();

		broker.takeOrder(deleteStockOrder);

		broker.placeOrders();

	}

}
