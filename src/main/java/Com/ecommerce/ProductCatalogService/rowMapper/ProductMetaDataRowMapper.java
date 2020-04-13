/**
 @author   Prashant, Tauseef, Tarun Rainy
 @version  1.0
*/
package Com.ecommerce.ProductCatalogService.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;

public class ProductMetaDataRowMapper implements RowMapper<ProductMetaDataModel> {

	@Override
	public ProductMetaDataModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ProductMetaDataModel productMetaDataModel=new ProductMetaDataModel();
		productMetaDataModel.setId(rs.getString("PRODUCT_ID"));
		productMetaDataModel.setName(rs.getString("NAME"));
		productMetaDataModel.setBrand(rs.getString("BRAND"));
		productMetaDataModel.setTitle(rs.getString("TITLE"));
		productMetaDataModel.setPrice(rs.getFloat("PRICE"));
		productMetaDataModel.setId(rs.getString("CATEGORY_ID"));
		
		return productMetaDataModel;
	}

}

