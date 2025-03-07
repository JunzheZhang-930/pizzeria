import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
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
    /*public String getStoreName() {
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
    }*/

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

    // New method to take order
    public void takeOrder() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three ingredients for your pizza (use spaces to separate ingredients):");
        String ing1 = input.next();
        String ing2 = input.next();
        String ing3 = input.next();

        System.out.println("Enter size of pizza (Small, Medium, Large):");
        String pizzaSize = input.next();

        System.out.println("Do you want extra cheese? (Y/N):");
        String extraCheese = input.next();

        System.out.println("Enter one side dish (Calzone, Garlic bread, None):");
        input.nextLine(); // Consume the newline character
        String sideDish = input.nextLine();

        System.out.println("Enter drinks (Cold Coffee, Cocoa drink, Coke, None):");
        String drinks = input.nextLine();

        System.out.println("Would you like the chance to pay only half for your order? (Y/N):");
        String whatDiscount = input.next();

        System.out.println("Ingredients: " + ing1 + ", " + ing2 + ", " + ing3 + ", Size: " + pizzaSize + ", Extra Cheese: " + extraCheese + ", Side Dish: " + sideDish + ", Drinks: " + drinks + ", Discount: " + whatDiscount);

        if (whatDiscount.equalsIgnoreCase("Y")||whatDiscount.equalsIgnoreCase("y")) {
            isItYourBirthday();
        } else {
            makeCardPayment();
            }

        input.close();
    }
    // New method to determine whether to give discount or not
    public void isItYourBirthday() {
        /*Scanner input = new Scanner(System.in);
        System.out.println("What is your birthday? (MM/DD)(use spaces to separate Month dand Day)");
        String birthdayMonth = input.next();
        String birthdayDay = input.next();
        LocalDate today = LocalDate.now();
        String birthdayDate = birthdayMonth + "/" + birthdayDay;
        String todayDate = today.toString();
        String todayMonth = todayDate.substring(6, 7);
        String todayDay = todayDate.substring(9, 10);
        String todayDateWithoutYear = todayMonth + "/" + todayDay;
        input.close();

        if (whatDiscount.equals("Y")|| whatDiscount.equals("y")) {
            if (birthdayDate.equals(todayDateWithoutYear)) {
            System.out.println("Congratulations! You pay only half the price for your order.");
            }
            else {
            System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
            }
        }
        else {
            makeCardPayment();
        }*/
        Scanner input = new Scanner(System.in);
	    System.out.println("What is your birthday? (YYYY-MM-DD)");
	    String birthdate = input.next();
	    LocalDate birthday = LocalDate.parse(birthdate);
	    LocalDate today = LocalDate.now();
	    int age = Period.between(birthday, today).getYears();

	    if (age < 18 && birthday.getMonth() == today.getMonth() && birthday.getDayOfMonth() == today.getDayOfMonth()) {
	        System.out.println("Congratulations! You pay only half the price for your order.");
	    } else {
	        System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
            makeCardPayment();
	        }

	    input.close();
    }

    //New menthod to make card payment
    public void makeCardPayment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter card number:");
        Long cardNumber = input.nextLong();
        System.out.println("Enter expiry date:(MM/YY)");
        String expiryDate = input.next();
        System.out.println("Enter CVV:(only 3 digits long)");
        int cvv = input.nextInt();
        processCardPayment(cardNumber, expiryDate, cvv);
        input.close();
    }

   // New method to process card payment
   public void processCardPayment(Long cardNumber, String expiryDate, int cvv) {
        String cardNumberStrl = Long.toString(cardNumber);
        int cardLength = cardNumberStrl.length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
            System.out.println("Card number should be 14 digits");
            return;
            }

        int firstCardDigit = Integer.parseInt(cardNumberStrl.substring(0, 1));
        Long blacklistedNumber = 12345678901234L;
        System.out.println("First card digits:" + firstCardDigit);
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
            return;
        }

        int lastFourDigits = Integer.parseInt(cardNumberStrl.substring(cardLength - 4));
        System.out.println("Last four digits: " + lastFourDigits);
        StringBuilder cardNumberToDisplay = new StringBuilder(cardNumberStrl);
        for (int i = 1; i < cardLength - 4; i++) {
            cardNumberToDisplay.setCharAt(i, '*');
        }

        System.out.println("Card Number: " + cardNumberToDisplay);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
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

    // New method to display special of the day
    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        System.out.println("Special of the Day: Wendesday");
        System.out.println("Pizza: " + pizzaOfTheDay);
        System.out.println("Side: " + sideOfTheDay);
        System.out.println("Special Price: " + specialPrice);
        System.out.println("\n");
    } 

}