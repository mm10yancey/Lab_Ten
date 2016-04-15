package searchThatMovie;

public class Movie {

	String title;
	String category;
	String xMovie;
	String yCat;
	
	public Movie(String xMovie, String yCat)
	//xMovie and yCat are the values inside the movie search method 
	{  
	  title =xMovie;
	  category = yCat;
	 }
	
	
   public Movie (String usercat)
   {
	   yCat =usercat;
   }
   


	public String getTitle() {
		return title;
	}

/*
	public void setTitle(String title) {
		this.title = title;
		}
		*/
	
	

	public String getCategory() {
		return category;
		
	}
	

	/*
	public void setCategory(String category) {
		this.category = category;
		}*/

	


	
	
	 
}
