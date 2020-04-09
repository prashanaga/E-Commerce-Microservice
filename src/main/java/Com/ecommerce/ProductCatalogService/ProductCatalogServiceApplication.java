package Com.ecommerce.ProductCatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication
public class ProductCatalogServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogServiceApplication.class, args);
		//System.out.println("Our DataSource is = " + dataSource);
       // Iterable<com.michaelcgood.model.System> systemlist = systemRepository.findAll();
        //for(com.michaelcgood.model.System systemmodel:systemlist){
          //  System.out.println("Here is a system: " + systemmodel.toString());
        //}
	}
	@Autowired
	JdbcTemplate jdbcTemplate;
	 @Override
	  public void run(String... strings) throws Exception {
		 jdbcTemplate.execute("CREATE TABLE customers(" +
			        "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
	 }
	 

}
