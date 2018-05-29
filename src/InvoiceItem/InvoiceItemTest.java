package InvoiceItem;

public class InvoiceItemTest {

	public static void main(String[] args) {
		
		InvoiceItem invItem1 = new InvoiceItem("Paper", "dog", 112, 345);
		System.out.printf("The first Item is: %s\n", invItem1.getID());
		System.out.printf("The Desc of the Item is: %s\n", invItem1.getDesc());
		invItem1.getQty();
		System.out.printf("The Qty of the Item is: %d\n", invItem1.getQty());
		invItem1.setQty(4);
		invItem1.getUnitPrice();
		invItem1.getTotal();
		invItem1.toString();
		System.out.println(invItem1.toString());
	
		
		
		

	}

}
