package InvoiceItem;

public class InvoiceItem {
	
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	public double getTotal() {
		return this.unitPrice * this.qty;
	}
	
	public String toString() {
		return "InvoiceItem:[ ID=" + this.id + " DESC=" + this.desc + " QTY=" + this.qty + " UnitPrice=" + this.unitPrice +"]";
	}

}
