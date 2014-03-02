/*
Name: Kush Patel
*/
//Purpose of this class is to extend the artwork class and classify if the artwork is a picture, if its a picture determine its area, change the width if needed and return a nicely formated string
public class Picture extends Artwork {
	private String medium;
	private double height;
	private double width;
	
	//constructs the Picture by taking artist, title, worth, medium, height, and width as parameters.
	public Picture (String artist, String title, double worth, String medium, double height, double width){
		super(artist, title, worth);		//calls artwork's artist, title, worth
		this.medium = medium;
		this.height = height;
		this.width = width;
	}
	//finds the area of the picture by multiplying its height and width
	public double getArea(){
		return height*width;
	}
	//changes the height of the Picture if the new height is greater than 0 or else throws the exception.
	public void setHeight(double height)throws IllegalArgumentException{
		//if the new height is greater than zero, change the current height to new height
		if (height >= 0){
			this.height = height;
		//if the new height is less than zero, throw the Illegal Argument Exception.
		}else{
			throw new IllegalArgumentException("Picture: "+height+" is below zero");
		}
	}
	//changes the width of the Picture if the new width is greater than 0 or else throws the exception.
	public void setWidth(double width) throws IllegalArgumentException{
		//if the new width is greater than zero, change the current width to new width
		if (width >= 0){
			this.width = width;
		//if the new width is less than zero, throw the Illegal Argument Exception.
		}else{
			throw new IllegalArgumentException("Picture: "+width+" is below zero");
		}
	}
	//returns the medium of the Picture
	public String getMedium(){
		return medium;
	}
	//returns the nicely formated string of Picture 
	public String toString(){
		return super.toString() + ", in "+ getMedium() + ", " + getArea() + " inches squared";
	}
}