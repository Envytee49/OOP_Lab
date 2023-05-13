import java.util.ArrayList;

public class Store {
	private ArrayList<DigitalVideoDisc> items;
	Store() {
		items = new ArrayList<>();
	}
	public void add(DigitalVideoDisc disc) {
		items.add(disc);
	}
	public void remove(DigitalVideoDisc disc) {
		items.remove(disc);
	}
}
