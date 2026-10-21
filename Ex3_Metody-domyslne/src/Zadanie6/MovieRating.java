package Zadanie6;

import java.util.Arrays;
import java.util.Objects;

public class MovieRating {
    private String movieTitle;
    private String directorName;
    private double[] ratings;

    public MovieRating(String movieTitle, String directorName, int ratingsAmount) {
        setMovieTitle(movieTitle);
        setDirectorName(directorName);
        setRatings(ratingsAmount);
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(int ratingsAmount) {
        this.ratings = new double[ratingsAmount];
    }

    public void addRating(int index, double rating){
        this.ratings[index] = rating;
    }

    public double averageRating(){
        double avg = 0;
        for (double rating : this.ratings) {
            avg += rating;
        }
        avg /= ratings.length;
        return avg;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MovieRating that)) return false;
        return Objects.equals(getMovieTitle(), that.getMovieTitle()) && Objects.equals(getDirectorName(), that.getDirectorName()) && Objects.deepEquals(getRatings(), that.getRatings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovieTitle(), getDirectorName(), Arrays.hashCode(getRatings()));
    }

    @Override
    public String toString() {
        return String.format("MovieRating for %s by %s: Average Rating = %f, Ratings: %s. ", this.movieTitle, this.directorName, averageRating(), Arrays.toString(this.ratings));
    }
}
