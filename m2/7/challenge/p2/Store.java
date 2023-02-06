public class Store {

    private Movie[] movies;

    public Store() {
        // Allocate memory for 10 movies
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        // getter must return a copy of the Movie object requested
        return this.movies[index];
    }

    public void setMovie(int index, Movie movie) {
        // setter must update array with a new copy of Movie object
        this.movies[index] = new Movie(movie);
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
