import java.util.ArrayList;

public class Cart {
    public static final int MAXIMUM_DVDS = 20;
    private int dvdQuantity = 0;
    private ArrayList<DigitalVideoDisc> dvdList;
    Cart() {
    	dvdList = new ArrayList<>();
    }
    public void addDVD(DigitalVideoDisc disc) {
        if (dvdQuantity == MAXIMUM_DVDS) {
            System.out.println("The cart is almost full");
            return;
        }
        dvdList.add(disc);
        dvdQuantity++;
        System.out.println("The disc has been added");
    }
    public void addDVD(DigitalVideoDisc[] dvdLists) {
    	if(dvdLists.length + dvdQuantity > MAXIMUM_DVDS) {
    		System.out.println("The cart is almost full");
            return;
    	}
    	for( DigitalVideoDisc d : dvdLists) {
    		dvdList.add(d);
    		dvdQuantity++;
    	}
    	System.out.println("all discs been added");
    	
    }
//    public void addDVD(DigitalVideoDisc... arbitrary) {
//    	if(arbitrary.length + dvdQuantity > MAXIMUM_DVDS) {
//    		System.out.println("The cart is almost full");
//            return;
//    	}
//    	for( DigitalVideoDisc d : arbitrary) {
//    		dvdList.add(d);
//    		dvdQuantity++;
//    	}
//    	System.out.println("all discs been added");
//    }
    public void printCart() {
    	double totalCost = 0;
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered items:");
    	for(int i = 0; i < dvdList.size(); i++) {
    		System.out.println(toString(dvdList.get(i)));
    		totalCost += dvdList.get(i).getCost();
    	}
    	System.out.println("Total cost "+ totalCost);
    	System.out.println("***************************************************");
    }
    
    public String toString(DigitalVideoDisc disc) {
    	return "DVD" + " " + 
    			disc.getTitle() + " " +
    			disc.getCategory() + " " +
    			disc.getDirector() + " " +
    			disc.getLength() + " :" +
    			disc.getCost();
    }
    public void searchById(int id) {
    	boolean check = false; 
    	for(DigitalVideoDisc d : dvdList) {
    		if(d.getId() == id) {
    			System.out.println("DVD found " +toString(d));
    			check = true;
    			break;
    		}else continue;
    	}
    	if(!check) {
    		System.out.println("DVD not found");
    	}
    	
    }
    public void searchByTitle(String title) {
    	boolean check = false; 
    	for(DigitalVideoDisc d : dvdList) {
    		if(d.getTitle().equals(title)) {
    			System.out.println("DVD found " +toString(d));
    			check = true;
    			break;
    		}else continue;
    	}
    	if(!check) {
    		System.out.println("DVD not found");
    	}
    	
    }
    
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
    	if(dvdQuantity + 2 > MAXIMUM_DVDS) {
    		System.out.println("The cart is almost full");
    		return;
    	}
    	dvdList.add(disc1);
    	dvdList.add(disc2);
    	dvdQuantity += 2;
    	System.out.println("2 discs been added");
    }
    public void removeDVD(DigitalVideoDisc disc) {
        if(dvdList.contains(disc)) {
        	dvdList.remove(disc);
        }else {
        	System.out.println("The disc has not been found");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < dvdList.size(); i++) {
            total += dvdList.get(i).getCost();
        }
        return total;
    }
}
