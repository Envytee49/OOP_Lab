package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> items;
	public Store() {
		items = new ArrayList<>();
	}
	public void add(DigitalVideoDisc disc) {
		items.add(disc);
	}
	public void remove(DigitalVideoDisc disc) {
		items.remove(disc);
	}
}
