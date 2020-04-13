package Com.ecommerce.ProductCatalogService.command;

public class DeleteInventory implements IInventory{
	
	private Inventory inventory;
	public  DeleteInventory(Inventory inventory)
	{
		this.inventory=inventory;
	}
	public void execute(){
		inventory.sell();
	}
}
