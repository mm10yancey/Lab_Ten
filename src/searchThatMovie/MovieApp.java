package searchThatMovie;
import java.util.Arrays;
import java.util.Scanner;
import searchThatMovie.Movie;
import searchThatMovie.MovieIO;

public class MovieApp {
    static Movie category;
    static Scanner sc = new Scanner(System.in);
    static String userCat;
    
	public static void main(String[] args) {

		Movie [] myMovie = new Movie [40];
		Movie [] movieCat = new Movie [6];
        String toContinue = "Y";
              
        
      //added movie IO to the myMovie arraylist; set counter at -1 because of index beg at 
     // this is for when assigning values to the arrray fm scanner. have to put get, set method and use the counter
        for (int i = 0; i < myMovie.length; i++) 
		{
			myMovie[i] = MovieIO.getMovie(i -1);
					
		}
        for (int i = 0; i < movieCat.length; i++) 
        {
    	    movieCat[i]= MovieCatIO.getUserCategory(i-1);
        }
		System.out.println("Welcome to the Movie Listicle");
		System.out.println("There are 40 Movies in this database.");
		
		while(!toContinue.equalsIgnoreCase("N")) {
			
		{
		   System.out.println("Category = " + movieCat[2]);
		}
				   
		System.out.println("What category of movie are you interested in?");
		userCat = sc.nextLine();
		
		{
			for (int i =0; i < myMovie.length; i++)
				
			{
				if(userCat.equalsIgnoreCase(myMovie[i].getCategory()))
					System.out.println(myMovie[i].getTitle());			   
			}
			
			  {
		    	System.out.println("Continue? Y/N?");toContinue=sc.nextLine();		    	
			  }
						
		}
	 }
}
	//public static String getValidInput () {
		
	}
 

	


			
			
			

		 
	
		
	
	
	
		
		
	

