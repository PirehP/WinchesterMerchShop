import java.lang.Math;

public class Bill {
    private String BillCode;
    private int Quantity;
    private Customer PurchasedBy;
    private Staff SoldBy;
    private Merchandise PurchasedItem;

    //constructor
    public Bill(Customer purchasedBy, Staff createdBy, Merchandise purchasedItem, int Quantity)
    {
        BillCode = "BillCode-" + Double.toString(Math.random());//BillCode-001
        this.PurchasedBy = purchasedBy;
        SoldBy = createdBy;
        this.PurchasedItem = purchasedItem;
        this.Quantity= Quantity;
    }

    //method
    public void PrintBill()
    {
        System.out.println("Bill Code: " + this.BillCode);
        System.out.println("Customer Full Name: " + this.PurchasedBy.getFullName());
        this.PurchasedItem.PrintMerchandiseInformation();
        System.out.println("Purchased Quantity: " + this.Quantity);
        System.out.println("Total Price: " + Double.toString(this.Quantity * this.PurchasedItem.getPrice()));
    }
}
