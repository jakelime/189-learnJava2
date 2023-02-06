import java.util.List;
import java.util.LinkedList;

public class Store {

    private List<Movie> movies;

    public Store() {
        // This application prioritizes retrieving/updating data and does not add/remove
        // elements from the middle.
        this.movies = new LinkedList<Movie>();

    }

    public Movie getMovie(int index) {
        return this.movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, movie);
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }


}