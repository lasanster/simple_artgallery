/*
Name: Kush Patel
*/
//The purpose of this class is to create different artworks and add them to the gallery. allow user to choose which artwork he/she wants to add to the gallery. 
import java.util.*;
import java.io.*;
public class ArtGallery {
	public static void main(String[] args)throws IllegalArgumentException{
		Gallery famous = new Gallery();		//create an empty gallery
		//create fourteen different artworks of forms picture or statue
		Artwork one = new Statue("Frederick Remington","Coming Through the Rye",400.00,"Marble",23);
		Artwork two = new Picture("Claude Monet", "Still Life with Flowers", 240.00, "Oil", 39.375, 31.75);
		Artwork three = new Picture("Andy Warhol", "Dollar Sign", 411240.00, "Acrylic", 90.0 , 70.0);
		Artwork four = new Picture("Rembrandt Harmensz Van Rijn", "A Pair of Drawings", 1644.00, "Charcoal", 11.2, 7.3);
		Artwork five = new Picture("Charles Russell","Smoking Them Out", 3151000.00, "Oil", 5.25, 21);
		Artwork six = new Statue("Charles Russell", "Will Rogers", 1792.00, "Bronze", 34 );
		Artwork seven = new Picture("Charles Russell", "An Unscheduled Stop", 146500.00, "Watercolor", 8.5, 11.5);
		Artwork eight = new Picture("Vincent Van Gogh", "Weaver", 818500.00, "Oil", 14.375, 17.625);
		Artwork nine = new Picture("Jackson Pollock", "Eye-scape", 782500.00, "Oil", 27.5, 27);
		Artwork ten = new Picture("Pierre-Auguste Renoir", "Bal du moulin de la Galette", 136400000.00, "Oil", 51.6, 68.9);
		Artwork eleven = new Picture("Norman Rockwell", "Horseshoe Forging Contest", 5000.00, "Charcoal", 16, 28);
		Artwork tweleve = new Picture("Edouard Manet", "Lettre À Isabelle Lemonnier", 65891.00, "Watercolor", 6.6, 3.9);
		Artwork thirteen = new Statue("Frederick Remington", "Bronco Buster", 1599.00, "Marble", 100);
		Artwork fourteen = new Statue("Frederick Remington", "Buffalo Signal", 1785.00, "Marble", 64);
		//print all the artworks so that the user can choose what to add to the gallery
		System.out.println("0. Frederick Remington, Coming Through the Rye, 400.00, Marble, 23 lbs");
		System.out.println("1. Claude Monet, Still Life with Flowers, 240.00, Oil, 39.375\"Hx31.75\"W");
		System.out.println("2. Andy Warhol, Dollar Sign, 411,240.00, Acrylic, 90.0\"Hx70.0\"W");
		System.out.println("3. Rembrandt Harmensz Van Rijn, A Pair of Drawings, 1644.00, Charcoal, 11.2\"Hx7.3\"W");
		System.out.println("4. Charles Russell, Smoking Them Out, 3151000.00, Oil, 15.25\"H x 21\"W");
		System.out.println("5. Charles Russell, Will Rogers, 1792.00, Bronze, 34 lbs");
		System.out.println("6. Charles Russell, An Unscheduled Stop, 146500.00, Watercolor, 8.5\"Hx11.5\"W");
		System.out.println("7. Vincent Van Gogh, Weaver, 818500.00, Oil, 14.375\"Hx17.625\"W");
		System.out.println("8. Jackson Pollock, Eye-scape, 782500.00, Oil, 27.5\"Hx27\"W");
		System.out.println("9. Pierre-Auguste Renoir, Bal du moulin de la Galette, 136400000.00, Oil, 51.6\"H×68.9\"W");
		System.out.println("10. Norman Rockwell, Horseshoe Forging Contest, 5000.00, Charcoal, 16\"Hx28\"W");
		System.out.println("11. Edouard Manet, Lettre À Isabelle Lemonnier, 65891.00, Watercolor, 6.6\"Hx3.9\"W");
		System.out.println("12. Frederick Remington, Bronco Buster, 1599.00, Marble, 100 lbs");
		System.out.println("13. Frederick Remington, Buffalo Signal, 1785.00, Marble, 64 lbs");
		System.out.println();
		//allow user to input which artwork to add
		Scanner input = new Scanner(System.in);
		System.out.print("Enter artwork number to add to your gallery (-1 to quit): ");
		//while the user input is an integer		
		while(input.hasNextInt()){
		try{
			int num = input.nextInt();			//set num to user input
			//if num equals zero, add artwork one to the gallery and print the gallery
			if(num == 0){
				famous.add(one);
				System.out.println(famous.toString());
			}
			//if num equals one, add artwork two to the gallery and print the gallery
			else if(num == 1){
				famous.add(two);
				System.out.println(famous.toString());
			}
			//if num equals two, add artwork three to the gallery and print the gallery
			else if(num == 2){
				famous.add(three);
				System.out.println(famous.toString());
			}
			//if num equals three, add artwork four to the gallery and print the gallery
			else if(num == 3){
				famous.add(four);
				System.out.println(famous.toString());
			}
			//if num equals four, add artwork five to the gallery and print the gallery
			else if(num == 4){
				famous.add(five);
				System.out.println(famous.toString());
			}
			//if num equals five, add artwork six to the gallery and print the gallery
			else if(num == 5){
				famous.add(six);
				System.out.println(famous.toString());
			}
			//if num equals six, add artwork seven to the gallery and print the gallery
			else if(num == 6){
				famous.add(seven);
				System.out.println(famous.toString());
			}
			//if num equals seven, add artwork eight to the gallery and print the gallery
			else if(num == 7){
				famous.add(eight);
				System.out.println(famous.toString());
			}
			//if num equals eight, add artwork nine to the gallery and print the gallery
			else if(num == 8){
				famous.add(nine);
				System.out.println(famous.toString());
			}
			//if num equals nine, add artwork ten to the gallery and print the gallery
			else if(num == 9){
				famous.add(ten);
				System.out.println(famous.toString());
			}
			//if num equals ten, add artwork eleven to the gallery and print the gallery
			else if(num == 10){
				famous.add(eleven);
				System.out.println(famous.toString());
			}
			//if num equals eleven, add artwork tweleve to the gallery and print the gallery
			else if(num == 11){
				famous.add(tweleve);
				System.out.println(famous.toString());
			}
			//if num equals twelve, add artwork thirteen to the gallery and print the gallery
			else if(num == 12){
				famous.add(thirteen);
				System.out.println(famous.toString());
			}
			//if num equals thirteen, add artwork fourteen to the gallery and print the gallery
			else if(num == 13){
				famous.add(fourteen);
				System.out.println(famous.toString());	
			}
			//if num equals -1, break the loop and print good bye
			else if(num == -1){
				System.out.println("GOOD BYE");
				break;
			}
			//if num is greater then 13 throw Exception
			else{
				throw new IllegalArgumentException("Please Enter a number from 0 to 13"); 
			}
			System.out.println();
			System.out.print("Enter artwork number to add to your gallery (-1 to quit): ");
		}
		catch(IllegalArgumentException e){
			System.out.println("Please Enter a number from 0 to 13");
			System.out.print("Enter artwork number to add to your gallery (-1 to quit): ");
		}
		}
		
	}
}