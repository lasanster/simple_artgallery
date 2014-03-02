/*
Name: Kush Patel
*/

//The purpose of this class is to create an artwork by providing the artist, title, and worth.Also a method that allows to change the worth of a particular artwork 
public class Artwork {
	private String artist;
	private String title;
	private double worth;
	
//constructs the artwork by taking artist, title, and worth as parameters. 
	public Artwork(String artist, String title, double worth){
		this.artist = artist;
		this.title = title;
		this.worth = worth;
	}
//This method returns the worth of the artwork
	public double getWorth(){
		return worth;
	}
//This method allows to change the value of the artwork's worth if it is greater than zero
	public void setWorth(double worth) throws IllegalArgumentException{
	
		//if the new worth is greater than zero, change the current worth to new worth
		if (worth >= 0){
			this.worth = worth;
		//if the new worth is less than zero, throw the Illegal Argument Exception.
		}else{
			throw new IllegalArgumentException("Artwork: "+worth+"is below zero");
		}
	}
//This method returns the type, title, artist and worth of the artwork in a formated string.
	public String toString(){
		return "\""+title+"\"" + " by " + artist + " for $" + getWorth();
	}
	
}