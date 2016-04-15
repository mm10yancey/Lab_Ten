package searchThatMovie;

public class MovieIO {
	public static Movie getMovie(int index)
    {
        switch (index)
        {
            case 1:
                return new Movie("Citizen Kane", "drama");
            case 2:
                return new Movie("Casablanca", "drama");
            case 3:
                return new Movie("The Godfather", "drama");
            case 4:
                return new Movie("Gone With The Wind", "drama");
            case 5:
                return new Movie("Lawrence Of Arabia", "drama");
            case 6:
                return new Movie("The Wizard Of Oz", "musical");
            case 7:
                return new Movie("The Graduate", "drama");
            case 8:
                return new Movie("On The Waterfront", "drama");
            case 9:
                return new Movie("Schindler's List", "drama");
            case 10:
                return new Movie("Singin' In The Rain", "musical");
            case 11:
                return new Movie("It's A Wonderful Life", "drama");
            case 12:
                return new Movie("Sunset Boulevard", "drama");
            case 13:
                return new Movie("The Bridge On The River Kwai", "drama");
            case 14:
                return new Movie("Some Like It Hot", "drama");
            case 15:
                return new Movie("Star Wars", "scifi");
            case 16:
                return new Movie("All About Eve", "drama");
            case 17:
                return new Movie("The African Queen", "drama");
            case 18:
                return new Movie("Psycho" , "horror");
            case 19:
                return new Movie("Chinatown", "drama");
            case 20:
                return new Movie("One Flew Over The Cuckoo's Nest", "drama");
            case 21:
                return new Movie("The Grapes Of Wrath", "drama");
            case 22:
                return new Movie("2001: A Space Odyssey", "scifi");
            case 23:
                return new Movie("The Maltese Falcon", "drama");
            case 24:
                return new Movie("Raging Bull", "drama");
            case 25:
                return new Movie("E.T. The extra-terrestrial", "scifi");
            case 26:
                return new Movie("Dr. Strangelove", "drama");
            case 27:
                return new Movie("Bonnie And Clyde", "drama");
            case 28:
                return new Movie("Apocalypse Now", "drama");
            case 29:
                return new Movie("Mr. Smith Goes to Washington", "drama");
            case 30:
                return new Movie("The Treasure Of The Sierra Madre", "drama");
            case 31:
                return new Movie("Annie Hall", "comedy");
            case 32:
                return new Movie("The Godfather Part II", "drama");
            case 33:
                return new Movie("High Noon", "drama");
            case 34:
                return new Movie("To Kill A Mockingbird", "drama");
            case 35:
                return new Movie("It Happened One Night", "drama");
            case 36:
                return new Movie("Midnight Cowboy", "drama");
            case 37:
                return new Movie("The Best Years Of Our Lives", "drama");
            case 38:
                return new Movie("Double Indemnity", "drama");
            case 39:
                return new Movie("Doctor Zhivago", "drama");
            case 40:
                return new Movie("North By Northwest", "drama");
           default:
                return new Movie("NO SUCH MOVIE", "");
                
        }

    }


}
