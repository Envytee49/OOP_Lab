package hust.soict.dsai.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc  implements Playable {
    private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc(String title) {
        this.setTitle(title); 
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
//    public DigitalVideoDisc(String category) {
//        this.category = category;
//    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category); 
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category,String director, float cost) {
        this.setTitle(title);
        this.setCategory(category); 
        this.setDirector(director);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	this.setTitle(title);
        this.setCategory(category); 
        this.setDirector(director);
        this.setCost(cost);
        this.setLength(length);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
	@Override
	public void play() throws PlayerException{
		if(this.getLength() > 0) {			
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}else throw new PlayerException("Error : DVD length is non positive");
	}
	public String toString() {
		System.out.println("DVD");
		return this.getTitle()+ "-" +this.getCategory()+
				"-" + this.getCost() + "-" + this.getDirector() + "-" + this.getLength();
	}


}