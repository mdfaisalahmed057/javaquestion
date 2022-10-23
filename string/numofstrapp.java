
    
public class numofstrapp{
    public static void main(String[] args) {
      String   patterns[] = {"happy","sad","good"};
      String word   = "good";
        System.out.println(numOfStrings(patterns, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
         int count=0;

             for(String elem:patterns){
                if(word.contains(elem)){
                    count++;
               

               }
                }
        
        return count;
        }
    }
