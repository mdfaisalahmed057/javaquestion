// putAbsent() Return Value
// returns the value associated with the key, if the specified key is already present in the hashmap
// returns null, if the specified key is already not present in the hashmap
import java.util.*;

import java.util.HashMap;

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

    // key already not present in HashMap
    languages.putIfAbsent(5, "JavaScript");

    // key already present in HashMap
    languages.putIfAbsent(6, "c");
    System.out.println("Updated Languages: " + languages);
  }
}
