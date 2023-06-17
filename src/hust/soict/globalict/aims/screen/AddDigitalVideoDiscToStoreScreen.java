package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import hust.soict.dsai.aims.media.DigitalVideoDisc;


public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {	
	JPanel createBottom() {
		JPanel bottom = new JPanel();
		JButton addMedia = new JButton("Add to STORE");
		addMedia.addActionListener(e ->{
			String title = titleInput.getText();
			String category = categoryInput.getText();
			float cost = Float.parseFloat(costInput.getText());
			DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost);
			StoreScreen.getStore().addMedia(dvd);
			new StoreScreen(StoreScreen.getStore());
			});
		bottom.add(addMedia);
		return bottom;
	}
	public AddDigitalVideoDiscToStoreScreen(){
		this.setMediaType("DVD");
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		cp.add(createBottom(),BorderLayout.SOUTH);
		
		setVisible(true);
		setTitle("UPDATE");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AddDigitalVideoDiscToStoreScreen();
	}
	

}
