/**
 @author   Prashant Agarwal
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.model;

public class ProductInventoryModel {

	
	private String id;
	private Integer quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}