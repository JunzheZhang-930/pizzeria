
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//create a class called Pizzeria
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
    private static final long BLACKLISTED_NUMBER = 12345678901234L;

    // Constructor
    public Pizzeria() {
        this.storeAddress ="123 Pizza St";
        this.storeName = "Slice O' Heaven";
        this.storeEmail = "contact@sliceoheaven.com";
        this.storePhone = "123-456-7890";
        this.pizzaPrice = 10.0;
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = new String[] {DEF_PIZZA_INGREDIENTS};
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = new String[] {"Garlic Bread", "Chicken Wings"};
        this.drinks = new String[] {"Coke", "Pepsi"};
        this.sides = new String[] {"Garlic Bread", "Chicken Wings"};
        this.drinks = new String[] {"Coke", "Pepsi"};
    
        // Implementation for taking an order
        /*this.orderID = DEF_ORDER_ID;
        int orderNumber = Integer.parseInt(orderID);
        orderNumber++;
        orderID = String.valueOf(orderNumber);
        System.out.println("Order taken. Order ID: " + orderID);*/
    }

    /*public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }*/

    public void makePizza() {

        // Implementation for making a pizza
        //this.pizzaIngredients = new String[] {DEF_PIZZA_INGREDIENTS};
    
        System.out.println("Pizza is being made.");
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

    // Updated takeOrder method
    public void takeOrder() {
        Scanner input = new Scanner(System.in);

        // Ingredients selection
        String[] ingredients = {"Mushroom", "Paprika", "Sun-dried tomatoes", "Chicken", "Pineapple"};
        String ing1 = "", ing2 = "", ing3 = "";
        //while (true) {
            System.out.println("Please pick any three of the following ingredients:");
            for (int i = 0; i < ingredients.length; i++) {
                System.out.println((i + 1) + ". " + ingredients[i]);
            }
            System.out.println("Enter any three choices (1, 2, 3,...) separated by spaces:");
            while (true) {
            int ingChoice1 = input.nextInt();
            int ingChoice2 = input.nextInt();
            int ingChoice3 = input.nextInt();
            
            if (ingChoice1 >= 1 && ingChoice1 <= 5 && ingChoice2 >= 1 && ingChoice2 <= 5 && ingChoice3 >= 1 && ingChoice3 <= 5) {
                ing1 = ingredients[ingChoice1 - 1];
                ing2 = ingredients[ingChoice2 - 1];
                ing3 = ingredients[ingChoice3 - 1];
                break;
            } else {
                System.out.println("Invalid choice(s). Please pick only from the given list:");
            }
        }

        // Pizza size selection
        String pizzaSize = "";
            System.out.println("What size should your pizza be?");
            System.out.println("1. Large");
            System.out.println("2. Medium");
            System.out.println("3. Small");
            System.out.println("Enter only one choice (1, 2, or 3):");
            while(true) {
            int sizeChoice = input.nextInt();

            switch (sizeChoice) {
                case 1:
                    pizzaSize = "Large";
                    break;
                case 2:
                    pizzaSize = "Medium";
                    break;
                case 3:
                    pizzaSize = "Small";
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    continue;
            }
            break;
        }

        // Extra cheese selection
        System.out.println("Do you waYnt extra cheese? (Y/N):");
        String extraCheese = input.next();

        // Side dish selection
        String[] sideDishes = {"Calzone", "Garlic bread", "Chicken puff", "Muffin", "Nothing for me"};
        String sideDish = "";
            System.out.println("Following are the side dish that go well with your pizza:");
            for (int i = 0; i < sideDishes.length; i++) {
                System.out.println((i + 1) + ". " + sideDishes[i]);
            }
            System.out.println("What would you like? Pick one (1, 2, 3,...):");
            while(true) {
            int sideDishChoice = input.nextInt();

            if (sideDishChoice >= 1 && sideDishChoice <= 5) {
                sideDish = sideDishes[sideDishChoice - 1];
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }

        // Drink selection
        String[] drinkOptions = {"Coca Cola", "Cold coffee", "Cocoa Drink", "No drinks for me"};
        String drinks = "";
            System.out.println("Choose from one of the drinks below. We recommend Coca Cola:");
            for (int i = 0; i < drinkOptions.length; i++) {
                System.out.println((i + 1) + ". " + drinkOptions[i]);
            }
            System.out.println("Enter your choice:");
            while(true) {
            int drinkChoice = input.nextInt();

            if (drinkChoice >= 1 && drinkChoice <= 4) {
                drinks = drinkOptions[drinkChoice - 1];
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }

        // Discount selection
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

    // Updated method to determine whether to give discount or not
    public void isItYourBirthday() {
        Scanner input = new Scanner(System.in);
            System.out.println("What is your birthday? (YYYY-MM-DD)");
            while(true) {
            String birthdate = input.next();
            LocalDate birthday = LocalDate.parse(birthdate);
            LocalDate today = LocalDate.now();
            int age = Period.between(birthday, today).getYears();

            if (age < 5 || age > 120) {
                System.out.println("Invalid date. You are either too young or too dead to order. Please enter a valid date:");
            } else {
                if (age < 18 && birthday.getMonth() == today.getMonth() && birthday.getDayOfMonth() == today.getDayOfMonth()) {
                    System.out.println("Congratulations! You pay only half the price for your order.");
                } else {
                    System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
                    makeCardPayment();
                }
                break;
            }
        }
        input.close();
    }

    // Updated method to make card payment
    public void makeCardPayment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter card number:");
        long cardNumber = input.nextLong();
        while (true) {
            String cardNumberStr = Long.toString(cardNumber);
            int cardLength = cardNumberStr.length();
            if (cardLength == 14 && cardNumber != BLACKLISTED_NUMBER) {
                System.out.println("Card accepted");
                break;
            } else if(cardNumber==BLACKLISTED_NUMBER){
            	System.out.println("Card is blacklisted. Please use another card");
                cardNumber = input.nextLong();
            	}
            	else {
                System.out.println("Invalid card. Please enter a valid 14-digit card number:");
                cardNumber = input.nextLong();
            }
        }
        String expiryDate;
            System.out.println("Enter expiry date (MM/YY):");
            while(true) {
            expiryDate = input.next();
            String[] parts = expiryDate.split("/");
            int month = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]) + 2000;
            LocalDate expiry = LocalDate.of(year, month, 1).withDayOfMonth(1);
            if (expiry.isBefore(LocalDate.now())) {
                System.out.println("Invalid expiry date. Please enter a future date:");
            } else {
                break;
            }
        }
        System.out.println("Enter CVV (only 3 digits long):");
        while(true) {
            int cvv = input.nextInt();
            if (cvv >= 100 && cvv <= 999) {
                break;
            } else {
                System.out.println("Invalid CVV. Please enter a valid 3-digit CVV:");
            }
        }
        int cvv = input.nextInt();
        processCardPayment(cardNumber, expiryDate, cvv);
        input.close();
    }

    // Updated method to process card payment
    public void processCardPayment(long cardNumber, String expiryDate, int cvv) {

        String cardNumberStr = Long.toString(cardNumber);
        int firstCardDigit = Integer.parseInt(cardNumberStr.substring(0, 1));
        System.out.println("FirstCardDigit: " + firstCardDigit);
        int lastFourDigits = Integer.parseInt(cardNumberStr.substring(cardNumberStr.length() - 4));
        System.out.println("LastFourDigits: " + lastFourDigits);
        StringBuilder cardNumberToDisplay = new StringBuilder(cardNumberStr);
        for (int i = 1; i < cardNumberStr.length() - 4; i++) {
            cardNumberToDisplay.setCharAt(i, '*');
        }

        System.out.println("Card Number: " + cardNumberToDisplay);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }

    // Updated toString method to replace printReceipt
    @Override
    public String toString() {
        return "Receipt printed.\n" +
             "Store Name: " + storeName + "\n" +
             "Store Address: " + storeAddress + "\n" +
             "Store Email: " + storeEmail + "\n" +
             "Order taken. Order ID: " + orderID + "\n" +
             "Pizza Price: $" + pizzaPrice + "\n" +
             "Store Phone: " + storePhone + "\n" +
             "Order Total: $" + orderTotal + "\n";
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