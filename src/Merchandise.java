public class Merchandise {
    //attributes
    private String MerchType;
    private double Price;//19.22
    private String Description;
    private String Colour;

    //constructor
    public Merchandise(String MerchType, double Price, String Description,  String Colour)
    {
        this.MerchType = MerchType;
        this.Price=Price;
        this.Description = Description;
        this.Colour = Colour;
    }

    //method
    public void UpdateMerchandise(String MerchType, double Price, String Description,  String Colour)
    {
        this.MerchType = MerchType;
        this.Price=Price;
        this.Description = Description;
        this.Colour = Colour;
    }


    //getters and setters..
    public String getDescription()
    {
        return Description;
    }
    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    public double getPrice()
    {
        return Price;
    }
    public void setPrice(double price)
    {
        this.Price = price;
    }

    //method
    public void PrintMerchandiseInformation()
    {
        System.out.println(" Merch Type : " + this.MerchType
                + ", Description: " + this.Description
                + ", Price: " + Double.toString(this.Price));
    }
}
