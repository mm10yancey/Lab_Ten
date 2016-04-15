package searchThatMovie;

public class MovieCatIO {
public static Movie getUserCategory(int index)
{

switch (index)
{
            case 1:
            	return new Movie ("drama"); 
              
            case 2:
            	return new Movie("musical");
              
            case 3:
            	return new Movie("animated");
                
            case 4:
            	return new Movie ("scifi");
                
            case 5:
            	return new Movie("horror");
                
            case 6:
             return new Movie ("comedy");
            default:
                return new Movie("NO SUCH MOVIE");
            }
}
}