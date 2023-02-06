public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // quality control for name
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name you passed cannot be null or blank");
        }
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        // quality control for format
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("The format you passed cannot be null or blank");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        // quality control for rating
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("The rating you passed must be between 0 and 10");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}