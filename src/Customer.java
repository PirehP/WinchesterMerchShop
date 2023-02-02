public class Customer {
    private String FullName;
    private String Address;

    public Customer(String FullName){
        this.FullName = FullName;
    }

    //getter and setter
    public String getFullName()
    {
        return FullName;
    }

    //method
    public void PrintInformation()
    {
        System.out.println("Customer FullName: " + this.FullName);
        System.out.println("Customer Address: " + this.Address);
    }
}
