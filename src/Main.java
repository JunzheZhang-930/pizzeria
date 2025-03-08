
// Main method to test the class
public class Main{
        public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        //Testing makePizza method
        System.out.println("Testing makePizza method:\n");
        pizzeria.makePizza();

        /*sliceOHeaven.setOrderID("123456");
        System.out.println(sliceOHeaven.getOrderID());*/

        //Testing takeOrder method
        System.out.println("\nTesting takeOrder method:\n");
        pizzeria.takeOrder();
        //Testing tostring method
        System.out.println("\nTesting toString method:\n");
        System.out.println(pizzeria);
        // Test specialOfTheDay method
        System.out.println("Testing specialOfTheDay method:\n");
        pizzeria.specialOfTheDay("Margherita", "Garlic Bread", "$9.99");

        }
        
}
