/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;
import Com.ecommerce.ProductCatalogService.rowMapper.ProductMetaDataRowMapper;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "product")
@Component
public class ProductMetaDataDao {
	final String QUERY_GET_BY_ID = "select * from product_meta_data where PRODUCT_ID=?";

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public ProductMetaDataDao() {
		
	}

	public ProductMetaDataModel findProductById(String id) {
		
		System.out.println("****************************************************************before "+id);
		
		
		
		 jdbcTemplate.execute("CREATE TABLE customers(" +
			        "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
		 System.out.println("****************************************************************Afterbjhjd");

		return jdbcTemplate.queryForObject(QUERY_GET_BY_ID, new Object[] { id }, new ProductMetaDataRowMapper());
		
	}

}
