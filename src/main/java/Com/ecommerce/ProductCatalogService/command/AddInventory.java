package Com.ecommerce.ProductCatalogService.command;

public class AddInventory implements IInventory{

	private Inventory inventory;
	public  AddInventory(Inventory inventory)
	{
		this.inventory=inventory;
	}
	public void execute(){
		//inventory.
		inventory.buy();
		
		
	}
	
	
}
