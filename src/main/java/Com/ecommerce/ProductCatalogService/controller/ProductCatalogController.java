/**
 @author   Prashant Agarwal
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.ecommerce.ProductCatalogService.Model.ProductMetaDataModel;
import Com.ecommerce.ProductCatalogService.Service.ProductService;

@RestController
@RequestMapping(value = "/products-microservice")
public class ProductCatalogController {
	
	 @Autowired
	  ProductService productService;

	@RequestMapping(method = RequestMethod.GET, value = "/product/{asin}", produces = "application/json")
	public ProductMetaDataModel getProductDetails(@PathVariable String asin) {
		ProductMetaDataModel productMetadata = productService.findById(asin).get();
		return productMetadata;
	}

}
