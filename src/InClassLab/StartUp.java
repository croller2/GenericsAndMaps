/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClassLab;

import common.Movie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author chris
 */
public class StartUp {
 //2.) Next, create and initialize four Movie objects, but this time make sure at least two
//are duplicates (based on equals). Now add them to a HashMap (does not sort,
//does not maintain entry order). What key will you use? How will you retrieve
//individual items? Use put(key, value) to add items; use get(key) to retrieve items.
//Demonstrate a solution. How will you loop through the keys or values?
//Demonstrate this too. 
    
    public static void main(String[] args) {
        Movie movieOne = new Movie("Shawshank Redemption" , "Frank Darabont");
        Movie movieTwo = new Movie("Harry Potter" , "David Yates");
        Movie movieThree = new Movie("Star Trek" , "JJ Abrams");
        Movie movieFour = new Movie("Star Trek" , "JJ Abrams");
        
        if(movieThree.equals(movieFour)){
            System.out.println("Yes");
        }
        
        //Simply use integers as key values
        Map movies = new HashMap();
        movies.put(1, movieOne);
        movies.put(2, movieTwo);
        movies.put(3, movieThree);
        movies.put(4, movieFour);
        
        //Pull the movie keys and put them into a set
        Set<Integer> movieKeys = movies.keySet();
        
        System.out.println("All movies in HashMap:");
        //Loop through that set and pull all the movies associated with each key
        for(int i : movieKeys){ 
            System.out.println(movies.get(i));
        }
        
//3.) Store the same four Movie objects in a TreeMap. Demonstrate that sorting
//works, but only the keys are sorted. How can you sort the values? Retrieve a
//Collection of the values using the values() method of your map. Now use the
//Collections.sort() method to sort those values by the default sort order.
        Map<Integer, Movie> movieMap = new TreeMap<>();
        movieMap.put(1, movieOne);
        movieMap.put(2, movieTwo);
        movieMap.put(3, movieThree);
        movieMap.put(4, movieFour); 
        
        Set<Integer> movieKeysTwo = movieMap.keySet();
        
        Collection<Movie> values = movieMap.values();
// Now put in List because Collections.sort reuquires it...
        List<Movie> sortedList = new ArrayList<>(values);
        
// Now use the utility class to perform the sort using the
// natural order (Comparable) of the entity object
        Collections.sort(sortedList);
        for(Movie m : sortedList) {
            System.out.println(m);
        }
  
//4.) Now, using the same collection in #3 above, try creating and using a Comparator
//to produce an alternate sort order for the Movie objects and sort by director.    
        List<Movie> sortedListTwo = new ArrayList<>();
        
        Collections.sort(sortedListTwo , new MovieByDirector());
        for(Movie m : sortedListTwo){
            System.out.println(m);
        }
        
        
        
        
//5.) Store the same four Movie objects in a TreeSet. Demonstrate that sorting works
//(default order) AND that duplicates are removed by looping through the set and
//outputting the toString() value to the console 
        Set<Movie> movieSet = new TreeSet<>();
        movieSet.add(movieOne);
        movieSet.add(movieTwo);
        movieSet.add(movieThree);
        movieSet.add(movieFour);

        
        for(Movie m : movieSet){
            System.out.println(m.toString());
        }
        
        
        
    }

}
