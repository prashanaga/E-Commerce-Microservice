package Com.ecommerce.ProductCatalogService.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Com.ecommerce.ProductCatalogService.dao.ProductInventoryDao;
import Com.ecommerce.ProductCatalogService.dao.ProductMetaDataDao;
import Com.ecommerce.ProductCatalogService.model.ProductInventoryModel;

//import com.notifications.ChangeManager;
@Service
public class Inventory {
	private String id;

	private int quantity;

	@Autowired
	ProductInventoryDao productInventoryRepository;
	
	public void buy() {
		/*
		 * ProductModel productModel=new ProductModel(); productModel.setId(id);
		 * productModel.setQuantity(quantity); ManageProductDao ManageProductDao=new
		 * ManageProductDao(); ManageProductDao.addProductQuantity(productModel);
		 */
		ProductInventoryModel productInventoryModel=new ProductInventoryModel();
		
		productInventoryModel.setId(id);
		productInventoryModel.setQuantity(quantity);
		productInventoryRepository.addInventory(productInventoryModel);

	}

	public void sell() {

		ProductInventoryModel productInventoryModel=new ProductInventoryModel();
		productInventoryModel.setId(id);
		productInventoryModel.setQuantity(quantity);
		productInventoryRepository.deleteInventory(productInventoryModel);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
