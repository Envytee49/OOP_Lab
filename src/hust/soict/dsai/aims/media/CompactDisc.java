package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.globalict.aims.exception.PlayerException;
public class CompactDisc extends Media implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	private int cdID = 1;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		this.setTitle(title);
        this.setCategory(category); 
        this.setCost(cost);
        this.setId(cdID);
        cdID++;
        this.artist = artist;
        this.tracks = tracks;
	}
	public CompactDisc(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		this.setTitle(title);
        this.setCategory(category); 
        this.setCost(cost);
        this.setId(cdID);
        cdID++;
	}
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
		}
	}
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}
	}
	public int getLength() {
		int length = 0;
		for(Track track : tracks) {
			length += track.getLength();
		}
		return length;
	}
	@Override
	public void play() throws PlayerException {
		for(Track track : tracks) {
			track.play();
		}	
		if(this.getLength() > 0) {
			Iterator iter = tracks.iterator();
			Track nextTrack;
			while(iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				}catch(PlayerException e) {
					throw e;
				}
			}
		}else throw new PlayerException("Error : CD Length is non-positive");
	}
	@Override
	public String toString() {
		return this.artist + "-" + this.getCategory() + "-"+this.getTitle();
	}
	

}
 