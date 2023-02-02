public class Program {
    public static void main(String[] args)
    {
        //Create Staff
        Staff John = new Staff("John Doe",false);
        Staff Marry = new Staff("Marry", true);

        //Merchandise
        Merchandise CoffeeCup = new Merchandise("CoffeeCup",19.99,"Reusable coffee cup", "Purple");
        Merchandise Tshirt = new Merchandise("Tshirt",30.00,"T shirt in medium size", "White");

        //Create Customer
        Customer Alice = new Customer("Alice");

        Bill billforAlice = new Bill(Alice,Marry,CoffeeCup,2);
        Marry.SellMerch(billforAlice);



    }
}
