import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        System.out.println("Please enter the type of product received");
        Scanner in = new Scanner(System.in);
        String productType = in.next();
        System.out.println("Please enter the cost to us for each " + productType);
        int cost = in.nextInt();  
        // check if cost is integer or string.. if it is string ask again to input the cost in number. Wondering how to do it??//
        System.out.println("Please enter the brand name");
        String brandName = in.next();
        System.out.println("Please enter the number of " + productType + " in the shipment");
        int numProductInShipment = in.nextInt();
        int totalCostOfShipment = cost * numProductInShipment / 100;
        System.out.println("Shipment Summary:\n" +
                                   "The new product is " + productType + ".\n" +
                                   "This shipment included "+ numProductInShipment + " from " + brandName + ".\n" +
                                   "The total value of the shipment was $" + totalCostOfShipment +"\n");
        System.out.println("With GST: " + totalCostOfShipment * 1.05f);
    }
}
