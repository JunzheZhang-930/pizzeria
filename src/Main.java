
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
        
        // Test specialOfTheDay method
        System.out.println("\nTesting specialOfTheDay method:");
        pizzeria.specialOfTheDay("Margherita", "Garlic Bread", "$9.99");
}
}
