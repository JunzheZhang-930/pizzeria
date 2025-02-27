public class Pizzeria {
    // Variables
    private String storeName;
    private String storeAddress;
    private String storeEmail;
    private String storePhone;
    private String[] storeMenu;
    private String[] pizzaIngredients;
    private double pizzaPrice;
    private String[] sides;
    private String[] drinks;
    private double orderTotal;
    private String orderID;
    
    // Final variables
    private static final String DEF_ORDER_ID = "DEF-SOH-099";
    private static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private static final double DEF_ORDER_TOTAL = 15.00;
    
    // Default constructor
    public Pizzeria() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = new String[] {DEF_PIZZA_INGREDIENTS};
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = new String[] {"Garlic Bread", "Chicken Wings"};
        this.drinks = new String[] {"Coke", "Pepsi"};
    }
    
    // Getter and Setter methods
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String[] getStoreMenu() {
        return storeMenu;
    }

    public void setStoreMenu(String[] storeMenu) {
        this.storeMenu = storeMenu;
    }

    public String[] getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(String[] pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public String[] getSides() {
        return sides;
    }

    public void setSides(String[] sides) {
        this.sides = sides;
    }

    public String[] getDrinks() {
        return drinks;
    }

    public void setDrinks(String[] drinks) {
        this.drinks = drinks;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
    // Constructor
    public Pizzeria(String storeName, String storeAddress, String storeEmail, String storePhone, String orderID) {
        this.storeAddress = storeAddress;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        
        this.pizzaPrice = 10.0;

        this.sides = new String[] {"Garlic Bread", "Chicken Wings"};
        this.drinks = new String[] {"Coke", "Pepsi"};

        
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Store Phone: " + storePhone);

        System.out.println("Sides:");
        for (String side : sides) {
              System.out.println(side);
        }
        System.out.println("Drinks:");
        for (String drink : drinks) {
            System.out.println(drink);
        }
    
        // Implementation for taking an order
        this.orderID = DEF_ORDER_ID;
        //int orderNumber = Integer.parseInt(orderID);
       // orderNumber++;
       // orderID = String.valueOf(orderNumber);
        System.out.println("Order taken. Order ID: " + orderID);
    }

    public void makePizza() {
        // Implementation for making a pizza
        this.pizzaIngredients = new String[] {DEF_PIZZA_INGREDIENTS};
        System.out.println("Pizza is being made.");
        System.out.println("Ingredients: ");
        for (String ingredient : pizzaIngredients) {
            System.out.println(ingredient);
        }
    }

    public void printReceipt() {
        // Implementation for printing a receipt
        System.out.println("Receipt printed.");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Pizza Price: $" + pizzaPrice);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Order Total: $" + orderTotal);
    }

   

    // Main method to test the class
    public static void main(String[] args) {
        Pizzeria sliceOHeaven = new Pizzeria("Slice-o-Heaven", "123 Pizza St", "contact@sliceoheaven.com", "123-456-7890", "DEF-SOH-098");
        sliceOHeaven.makePizza();
        sliceOHeaven.printReceipt();
    }
}