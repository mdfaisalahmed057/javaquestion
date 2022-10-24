// putAbsent() Return Value
// returns the value associated with the key, if the specified key is already present in the hashmap
// returns null, if the specified key is already not present in the hashmap


// custom sort explanation:
// .stream(nums)
// iterates through the nums array

// .boxed()
// converts each int to Integer object, this is because .sorted() can only operate on objects
// .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
// if frequency of two numbers are not the same, sort by ascending frequency. If frequencies are the same, sort by decending numeric value

// .mapToInt(n -> n)
// converts Integer to int

// .toArray()
// returns array


// The getOrDefault(Object key, V defaultValue) method of Map interface, implemented by HashMap class is used to get the value mapped 
// with specified key. If no value is mapped with the provided key then the default value is returned.
import java.util.*;

 
public class absent {
  public static void main(String[] args){

    // create a HashMap
    HashMap<Integer, String> languages = new HashMap<>();

    // add mappings to HashMap
    languages.put(1, "Python");
    languages.put(2, "C");
    languages.put(3, "Java");
    languages.put(5, null);

    System.out.println("Languages: " + languages);
     languages.get(languages);
    System.out.println(languages);

    // key already not present in HashMap
    languages.putIfAbsent(5, "JavaScript");

    // key already present in HashMap
    languages.putIfAbsent(6, "c");
    System.out.println("Updated Languages: " + languages);
  }
}
