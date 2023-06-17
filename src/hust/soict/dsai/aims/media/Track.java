package hust.soict.dsai.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private float length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track() {
		
	}
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	public Track(String title, float length) {
		this.title = title;
		this.length = length;
	}
	@Override
	public void play()throws PlayerException {
		if(this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}else throw new PlayerException("Error : Tracj length is non positive");
	}
	public boolean equals(Object obj) {
		if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Track other = (Track) obj;

        if (!this.title.equals(other.title) && this.length != other.length) {
            return false;
        }
        return true;
    }

}
