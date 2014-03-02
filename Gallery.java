/*
Name: Kush Patel
*/

//The purpose of this class is to combine all the artworks and add them to a gallery, find the total worth of the gallery
import java.util.*;
public class Gallery {
	private ArrayList<Artwork> gallery;			//creates an arralist of artworks
	//constructs the arraylist of artworks
	public Gallery (){
		 gallery = new ArrayList<Artwork>();
	}
	//this method adds a particular artwork to the gallery
	public void add(Artwork x){
		//if the artwork is not in the gallery than add the artwork
		if (!gallery.contains(x)){
			gallery.add(x);
		}
	}
	//this method calculates the total worth of all the artworks in the gallery
	public double getTotalWorth(){
		double totalworth = 0;
		//for each artwork in the gallery sum their worth
		for (Artwork x : gallery){
			totalworth += x.getWorth();
		}
		return totalworth;
	}
	//return a formated string of the artworks in the gallery, determine how many different types of artworks are their in gallery, and return the total worth of all the artworks in the gallery
	public String toString(){
		System.out.println();
		System.out.println("Gallery");
		System.out.println();
		//print each artwork in the gallery
		for(int i =0; i<gallery.size(); i++){
			System.out.println(gallery.get(i));
		}
		//initiate the counter for different materials and mediums of artwork
		int oil = 0;
		int watercolor = 0;
		int charcoal = 0;
		int acrylic = 0;
		int bronze = 0;
		int marble = 0;
	//go through each artwork in the gallery	
	for(int i = 0; i<gallery.size(); i++){
		//if that artwork is a picture
		if (gallery.get(i) instanceof Picture){
			Picture x = (Picture) gallery.get(i);
			//and the medium of that artwork equals oil, add oil
			if(x.getMedium().equals("Oil")){
				oil++;
			}
			//if its medium is watercolor, add watercolor
			else if(x.getMedium().equals("Watercolor")){
				watercolor++;
			}
			//if its medium is charcoal, add charcoal
			else if(x.getMedium().equals("Charcoal")){
				charcoal++;
			}
			//if its medium is acrylic, add acrylic
			else if(x.getMedium().equals("Acrylic")){
				acrylic++;
			}
		//if the artwork in the gallery is a statue
		}else if(gallery.get(i) instanceof Statue){
			Statue y = (Statue) gallery.get(i);
			//and the material of that statue equal bronze, add bronze
			if(y.getMaterial().equals("Bronze")){
				bronze++;
			}//if its material is marble, add marble
			else if(y.getMaterial().equals("Marble")){
				marble++;
			}
		}
	
	}	//print the number of different type of artworks types
		System.out.println();
		System.out.println("Number of artwork Types");
		System.out.println("Oil: " + oil);	 
		System.out.println("Watercolor: " + watercolor);
		System.out.println("Charcoal: " + charcoal);
		System.out.println("Acrylic: " + acrylic);
		System.out.println("Bronze: " + bronze);	
		System.out.println("Marble: " + marble);
		System.out.println();
		//print the total worth of all the artworks in the gallery
		return "Total Worth of All Artworks: $"+getTotalWorth();
		
	}
}	