package netflix;

public class myownclass {
public static void main(String[] args) {
	NetflixQueue netflix= new NetflixQueue();
	
	
	
	
	Movie movie= new Movie("Star Wars",3);
	Movie movie2= new Movie("Avatar",4);
	Movie movie3= new Movie("Frozen",5);
	Movie movie4= new Movie("Avengers",1);
	Movie movie5= new Movie("Toy story",2);
	System.out.println(movie.getTitle());
	
	netflix.addMovie(movie);
	netflix.addMovie(movie2);
	netflix.addMovie(movie3);
	netflix.addMovie(movie4);
	netflix.addMovie(movie5);
    
	netflix.sortMoviesByRating();
	
	System.out.println(netflix.movies);
	System.out.println("The best movie is "+netflix.getBestMovie());
	System.out.println("The second best movie is "+ netflix.getMovie(1));
}

}