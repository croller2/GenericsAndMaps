package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable<Movie> {
    private final String UNKNOWN_STRING = "Unknown";
    private String title;
    private String director;

    public Movie(String title, String director) {
        if(title != null && title.length() > 0){
            this.title = title;
        }else{
            this.title = UNKNOWN_STRING;
        }
        if(director != null && director.length() > 0){
            this.director = director;
        }else{
            this.director = UNKNOWN_STRING;
        }
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
//Lab 1: Using the Movie class from the common package, create the necessary equals(),
//hashCode() and toString() methods. Then implement the Comparable interface to
//provide a default sort order. Be careful … you need something unique for equals
//and that field must also be used for sorting.

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + Objects.hashCode(this.director);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Movie other = (Movie) obj;
            return (this.director == null ? other.director == null : this.director.equals(other.director)) 
                    && (this.title == null ? other.title == null : this.title.equals(other.title));
    }

    @Override
    public String toString() {
        return this.title + ", Directed by: " + this.director;
    }

    @Override
    public int compareTo(Movie o) {
        return new CompareToBuilder()
        .append(this.director, o.director).toComparison();
    
    }
    
    
    
    
    
}
