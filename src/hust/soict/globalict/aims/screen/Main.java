package hust.soict.globalict.aims.screen;

import java.util.ArrayList;
import java.util.Arrays;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class Main {
	public static void main(String[] args) {
		Store store = new Store();
		store.add(new DigitalVideoDisc("The Lord of the Rings", "Fantasy", "Peter Jackson", 120, 10.99f));
		store.add(new DigitalVideoDisc("Star Wars: A New Hope", "Sci-Fi", "George Lucas", 121, 9.99f));
		store.add(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 178, 12.99f));

		// Add 3 Books to the store
		store.add(new Book("To Kill a Mockingbird", "Fiction", "Harper Lee", 8.99f, Arrays.asList("Harper Lee")));
		store.add(new Book("The Hunger Games", "Young Adult", "Gary Ross", 12.99f, Arrays.asList("Suzanne Collins")));
		store.add(new Book("The Da Vinci Code", "Mystery", "Ron Howard", 10.99f, Arrays.asList("Dan Brown")));

		// Add 3 CompactDiscs to the store
		ArrayList<Track> cd1Tracks = new ArrayList<>();
		cd1Tracks.add(new Track("Track 1", 3.30f));
		cd1Tracks.add(new Track("Track 2", 4.20f));
		cd1Tracks.add(new Track("Track 3", 5.15f));
		store.add(new CompactDisc("Album 1", "Rock", 15.99f, "Led Zeppelin", cd1Tracks));

		ArrayList<Track> cd2Tracks = new ArrayList<>();
		cd2Tracks.add(new Track("Track 1", 3.50f));
		cd2Tracks.add(new Track("Track 2", 4.10f));
		cd2Tracks.add(new Track("Track 3", 4.45f));
		store.add(new CompactDisc("Album 2", "Pop", 12.99f, "Taylor Swift", cd2Tracks));

		ArrayList<Track> cd3Tracks = new ArrayList<>();
		cd3Tracks.add(new Track("Track 1", 4.00f));
		cd3Tracks.add(new Track("Track 2", 5.20f));
		cd3Tracks.add(new Track("Track 3", 6.45f));
		store.add(new CompactDisc("Album 3", "RbNb", 12.99f, "Daft Punk", cd3Tracks));
		
		
		StoreScreen storeScreen = new StoreScreen(store);

		
		
	}
	
}
