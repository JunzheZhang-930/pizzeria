public class Pizzeria {
    // Variables
    private String storeName;
    private String storeAddress;
    private String storeEmail;
    private String storePhone;
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
        this.orderTotal = DEF_ORDER_TOTAL;
        this.pizzaPrice = 10.0;
        this.orderID = DEF_ORDER_ID;
        this.sides = new String[] {"Garlic Bread", "Chicken Wings"};
        this.drinks = new String[] {"Coke", "Pepsi"};

        //System.out.println("Store Address: " + storeAddress);
        //System.out.println("Store Email: " + storeEmail);
        //System.out.println("Store Phone: " + storePhone);

       // System.out.println("Sides:");
       // for (String side : sides) {
       //       System.out.println(side);
        //}
        //System.out.println("Drinks:");
       // for (String drink : drinks) {
       //     System.out.println(drink);
        //}
    
        // Implementation for taking an order
        //this.orderID = DEF_ORDER_ID;
        //int orderNumber = Integer.parseInt(orderID);
       // orderNumber++;
       // orderID = String.valueOf(orderNumber);
        //System.out.println("Order taken. Order ID: " + orderID);
    }

    public void makePizza() {
        // Implementation for making a pizza
        this.pizzaIngredients = new String[] {DEF_PIZZA_INGREDIENTS};

        System.out.println("\nPizza is being made.");
        System.out.println("Ingredients: ");
        for (String ingredient : pizzaIngredients) {
            System.out.println(ingredient);
        }
        System.out.println("Sides:");
        for (String side : sides) {
              System.out.println(side);
        }
        System.out.println("Drinks:");
        for (String drink : drinks) {
            System.out.println(drink);
        }
    }

    public void printReceipt() {
        // Implementation for printing a receipt
        System.out.println("\nReceipt printed.");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Order taken. Order ID: " + orderID);
        System.out.println("Pizza Price: $" + pizzaPrice);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Order Total: $" + orderTotal);
    }

   // New method to process card payment
   public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
    int cardLength = cardNumber.length();
    if (cardLength == 14) {
        System.out.println("Card accepted");
    } else {
        System.out.println("Invalid card");
        System.out.println("Card number should be 14 digits");
        return;
    }

    int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));
    String blacklistedNumber = "12345678901234";
    System.out.println("First card digits:" + firstCardDigit);
    if (cardNumber.equals(blacklistedNumber)) {
        System.out.println("Card is blacklisted. Please use another card");
        return;
    }

    int lastFourDigits = Integer.parseInt(cardNumber.substring(cardLength - 4));
    System.out.println("Last four digits: " + lastFourDigits);
    StringBuilder cardNumberToDisplay = new StringBuilder(cardNumber);
    for (int i = 1; i < cardLength - 4; i++) {
        cardNumberToDisplay.setCharAt(i, '*');
    }

    System.out.println("Card Number: " + cardNumberToDisplay);
    System.out.println("Expiry Date: " + expiryDate);
    System.out.println("CVV: " + cvv);
}
// New method to display special of the day
public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
    System.out.println("Special of the Day: Wendesday");
    System.out.println("Pizza: " + pizzaOfTheDay);
    System.out.println("Side: " + sideOfTheDay);
    System.out.println("Special Price: " + specialPrice);
}

}