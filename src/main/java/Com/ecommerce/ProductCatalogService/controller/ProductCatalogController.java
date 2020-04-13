/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.ecommerce.ProductCatalogService.model.ProductInventoryModel;
import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;
import Com.ecommerce.ProductCatalogService.Service.ProductInventoryService;
import Com.ecommerce.ProductCatalogService.Service.ProductService;
import Com.ecommerce.ProductCatalogService.Service.impl.ProductServiceImpl;
import Com.ecommerce.ProductCatalogService.dao.ProductMetaDataDao;

@RestController
@RequestMapping(value = "/products-microservice")
public class ProductCatalogController {
	
	// ProductMetaDataDao productMetaDataDao=new ProductMetaDataDao();
     @Autowired
	 ProductService productService;
     @Autowired
     ProductInventoryService productInventoryService; 
	 

	@RequestMapping(method = RequestMethod.GET, value = "/product/{asin}", produces = "application/json")
	public ProductMetaDataModel getProductDetails(@PathVariable String asin) {
		//ProductService productService =new ProductServiceImpl();
		ProductMetaDataModel productMetadata = productService.findProductById(asin);
		return productMetadata;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/product/{productMetaDataModel}", produces = "application/json")
	public void addProductDetails(@PathVariable ProductMetaDataModel productMetaDataModel) {
		//ProductService productService =new ProductServiceImpl();
		productService.addNewProduct(productMetaDataModel);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/inventory/add/{asin}", produces = "application/json")
	public void addInventory(@PathVariable String asin) {
		//@PathVariable ProductInventoryModel productInventoryModel
		ProductInventoryModel inventoryModel=new ProductInventoryModel();
		inventoryModel.setId(asin);
		inventoryModel.setQuantity(2);
		productInventoryService.addInventory(inventoryModel);
		
	}
	
	

}
