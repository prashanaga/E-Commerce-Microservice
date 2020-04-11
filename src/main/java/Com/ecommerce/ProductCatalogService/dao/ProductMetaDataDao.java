/**
 @author   Prashant Agarwal
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;
import rowMapper.ProductMetaDataRowMapper;

public class ProductMetaDataDao {
	final String QUERY_GET_BY_ID = "select * from product_meta_data where PRODUCT_ID=?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	public ProductMetaDataModel findById(String id) {

		return jdbcTemplate.queryForObject(QUERY_GET_BY_ID, new Object[] { id }, new ProductMetaDataRowMapper());

	}

}
