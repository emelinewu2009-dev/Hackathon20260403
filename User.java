public class User 
{
   //declare variables
   String strUserName, strPassword;
   private ShoppingCart cart;
   double dblTotalSpent;
   static int intTotalUsers;
   //constructor
    User(String u, String p)
    {
        //initialize the variables
        this.strUserName = u;
        this.strPassword = p;
        this.cart = new ShoppingCart();
        intTotalUsers++;
    }
    //default constructor
    User()
    {
        this.strUserName = "Unknown";
        this.strPassword = "unknown";
        this.cart = new ShoppingCart();
        this.dblTotalSpent = 0.0;
        intTotalUsers++;
    }
    //method to add to cart
    public void addToCart(Product p, int quantity)
    {
        if(quantity > 0 && quantity <= p.intStock)
            {

        }
    }
}