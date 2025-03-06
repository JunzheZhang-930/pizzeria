
// Main method to test the class
public class Main{
        public static void main(String[] args) {
        Pizzeria sliceOHeaven = new Pizzeria("Slice-o-Heaven", "123 Pizza St", "contact@sliceoheaven.com", "123-456-7890", "DEF-SOH-098");
        sliceOHeaven.makePizza();
        sliceOHeaven.printReceipt();

        //sliceOHeaven.setOrderID("123456");
        //System.out.println(sliceOHeaven.getOrderID());

        Pizzeria pizzeria = new Pizzeria();

        //Testing takeOrder method
        System.out.println("\nTesting takeOrder method:");
        pizzeria.takeOrder();
        
        //Testing determine whether to give discount or not method
        System.out.println("\nTesting determine whether to give discount or not method:");
        pizzeria.isItYourBirthday("");
        
        //Testing menthod to make card payment
        System.out.println("\nTesting menthod to make card payment:");
        pizzeria.makeCardPayment();

        // Test processCardPayment method
        System.out.println("\nTesting processCardPayment method:");
        sliceOHeaven.processCardPayment(1234567890123456L, "12/23", 123);
    
        // Test specialOfTheDay method
        System.out.println("\nTesting specialOfTheDay method:");
        pizzeria.specialOfTheDay("Margherita", "Garlic Bread", "$9.99");
}
}
