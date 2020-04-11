/**
 @author   Prashant Agarwal
 @version  1.0
*/
package rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Com.ecommerce.ProductCatalogService.model.ProductMetaDataModel;

public class ProductMetaDataRowMapper implements RowMapper<ProductMetaDataModel> {

	@Override
	public ProductMetaDataModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ProductMetaDataModel productMetaDataModel=new ProductMetaDataModel();
		productMetaDataModel.setId(rs.getString("PRODUCT_ID"));
		productMetaDataModel.setId(rs.getString("NAME"));
		productMetaDataModel.setId(rs.getString("BRAND"));
		productMetaDataModel.setId(rs.getString("TITLE"));
		productMetaDataModel.setId(rs.getString("PRICE"));
		productMetaDataModel.setId(rs.getString("CATEGORY_ID"));
		
		return productMetaDataModel;
	}

}

