public class Product 
{
    //declare variables
    String strName;
    float fltPrice;
    int intStock;
    public static int intTotalProducts;
    //constructors
    Product(String n, float p, int s)
    {
        this.strName = n;
        this.fltPrice = p;
        this.intStock = s;
        intTotalProducts++;
    }
    //defalt constructor
    Product()
    {
        this.strName = "Unknown";
        this.fltPrice = 0.0f;
        this.intStock = 0;
        intTotalProducts++;
    }

    //method to reduce the stock
    public void reduceStock(int amount)
    {
        //code a if statement to check if the user input is less than or equal to the stock and greater than 0
        if(amount <= intStock && amount >0)
        {
            intStock -= amount;
            System.out.println("Stock reduced by " + amount + ". Current Stock: " + intStock);
        }
        else
        {
            System.out.println("Sorry, not enough stock available or invalid amount.");
        }
    }

    //code a toString method to return the info stuff
    public String toString ()
    {
        return "Product Name: " + strName + "\nPrice: $" + fltPrice + "\nStock: " + intStock;
    }

}
