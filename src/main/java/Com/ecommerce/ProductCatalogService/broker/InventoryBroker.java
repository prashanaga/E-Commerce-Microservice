package Com.ecommerce.ProductCatalogService.broker;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;


import Com.ecommerce.ProductCatalogService.command.IInventory;

public class InventoryBroker {

	private List<IInventory> orderList = new ArrayList<IInventory>(); 

	   public void takeOrder(IInventory order){
	      orderList.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (IInventory order : orderList) {
	    	  
	         order.execute();
	      }
	      orderList.clear();
	   }
	
}
