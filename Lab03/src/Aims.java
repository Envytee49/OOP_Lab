public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();
        Cart cart2 = new Cart();
        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation","Roger Alers", 87, 19.95f);
        anOrder.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDVD(dvd2);
        cart2.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);
        cart2.addDVD(dvd3);
        
        
        // Print total cost of the items in the cart
        System.out.println("The total cost is: ");
        System.out.println(anOrder.totalCost());
        System.out.println(cart2.totalCost());

        // Check remove function
//        anOrder.removeDVD(dvd1);
//        System.out.println("The total cost is: ");
//        System.out.println(anOrder.totalCost());
        
        
    }
}