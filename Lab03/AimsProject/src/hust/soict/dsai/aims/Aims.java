package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

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
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);
        
        // Print cart
        anOrder.printCart();
        // Search by ID
        anOrder.searchById(4);
        // Search by title
        anOrder.searchByTitle("Aladin");
    }
}