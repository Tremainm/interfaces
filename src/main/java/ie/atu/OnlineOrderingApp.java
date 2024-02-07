package ie.atu;

public class OnlineOrderingApp {
    public static void main(String[] args)
    {
        Burger myBurger;
        Pizza myPizza;
        Salad mySalad;
        Dessert myDessert;

        MenuItem[] menuItems = new MenuItem[]
                {
                    myBurger = new Burger("Classic Burger", 8.99, "Beef patty, lettuce, tomato, cheese"),
                    myPizza = new Pizza("Margherita Pizza", 12.99, "Tomato sauce, mozzarella, basil"),
                    mySalad = new Salad("Caesar Salad", 6.99, "Romaine lettuce, croutons, Caesar dressing"),
                        myDessert = new Dessert("Lemon Cheesecake", 7.99, "Cream cheese, lemon zest, biscuit")
                };

        for(MenuItem menuItem : menuItems)
        {
            System.out.println("\nName: " + menuItem.getName() + "\nDescription: " + menuItem.getDescription() + "\nPrice: " + menuItem.getPrice());

        }

        double totalCost = 0;
        for(MenuItem menuItem : menuItems)
        {
            totalCost += menuItem.getPrice();
        }
        System.out.println("\nTotal cost: €" + totalCost);
    }
}
