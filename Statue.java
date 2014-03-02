/*
Name: Kush Patel

*/
//Purpose of this class is to extend the artwork class and classify the artwork as a Statue, if its a Statue, change the weight if needed and return a nicely formated string
public class Statue extends Artwork {
	private String material;
	private double weight;
	
	//constructs the Statue by taking artist, title, worth, material, and weight as parameters.
	public Statue (String artist, String title, double worth, String material, double weight){
		super(artist, title, worth);			//calls artwork's artist, title, worth
		this.material = material;
		this.weight = weight;
	}
	//changes the weight of the Statue if the new weight is greater than 0 or else throws the exception.
	public void setWeight(double weight)throws IllegalArgumentException{
		//if the new weight is greater than zero, change the current weight to new weight
		if(weight >= 0){
			this.weight = weight;
		//if the new weight is less than zero, throw the Illegal Argument Exception.
		}else{
			throw new IllegalArgumentException("Statue: "+weight+" is below zero");
		}
	}
	//returns the material of the Statue
	public String getMaterial(){
		return material;
	}
	//returns the nicely formated string of Statue
	public String toString(){
		return super.toString() + " made from " + getMaterial() + ", " + weight + " pounds";
	}
}