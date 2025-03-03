public class Main{
    // Main method to test the class
    public static void main(String[] args) {
        Pizzeria sliceOHeaven = new Pizzeria("Slice-o-Heaven", "123 Pizza St", "contact@sliceoheaven.com", "123-456-7890", "DEF-SOH-098");
        sliceOHeaven.makePizza();
        sliceOHeaven.printReceipt();

        //sliceOHeaven.setOrderID("123456");
        //System.out.println(sliceOHeaven.getOrderID());

        // Test processCardPayment method

        Pizzeria pizzeria = new Pizzeria();
        System.out.println("\nTesting processCardPayment method:");
        pizzeria.processCardPayment("12345678901234", "12/25", 123);
        pizzeria.processCardPayment("1234567890123", "12/25", 123);
    
        // Test specialOfTheDay method

        System.out.println("\nTesting specialOfTheDay method:");
        pizzeria.specialOfTheDay("Margherita", "Garlic Bread", "$9.99");
}
}
