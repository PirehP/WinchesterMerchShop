public class Staff {
    private String FullName;
    private boolean IsManager;

    public Staff(String FullName, boolean IsManager){
        this.FullName = FullName;
        this.IsManager = IsManager;
    }

    //getter and setter
    public String getFullName()
    {
        return FullName;
    }

    //method
    public void PrintInformation()
    {
        System.out.println("Staff FullName: " + this.FullName);
    }
    public void SellMerch(Bill bill)
    {
        System.out.println(" Printing Bill..");
        bill.PrintBill();
    }
}
