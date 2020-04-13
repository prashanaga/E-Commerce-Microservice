/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import Com.ecommerce.ProductCatalogService.model.ProductInventoryModel;
import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;
import Com.ecommerce.ProductCatalogService.rowMapper.ProductMetaDataRowMapper;

@Component
public class ProductInventoryDao {

	String ADD_INVENTORY_UPDATE_QUERY = "update product_inventory set QUANTITY = QUANTITY+? where PRODUCT_ID = ?";

	String DELETE_INVENTORY_UPDATE_QUERY = "update product_inventory set QUANTITY = QUANTITY-? where PRODUCT_ID = ?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	public ProductInventoryDao() {

	}

	public void addInventory(ProductInventoryModel productInventoryModel) {

		jdbcTemplate.update(ADD_INVENTORY_UPDATE_QUERY, productInventoryModel.getQuantity(),
				productInventoryModel.getId());

	}

	public void deleteInventory(ProductInventoryModel productInventoryModel) {

		jdbcTemplate.update(DELETE_INVENTORY_UPDATE_QUERY, productInventoryModel.getQuantity(),
				productInventoryModel.getId());

	}
}
