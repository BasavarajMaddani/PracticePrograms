import java.util.HashMap;
import java.util.Map;


public class FindDuplicatecharacter {

    public static void main (String[] args)
    {
    String str = "aaabbccdd";

   Map<Character, Integer> charmap = new HashMap<>();
   for(char ch : str.toCharArray())
   {
       charmap.put(ch, charmap.getOrDefault(ch, 0) + 1);
   }

   for(Map.Entry<Character, Integer> Testmap : charmap.entrySet())
   {
       System.out.println(Testmap.getKey() + " : " + Testmap.getValue());
   }

    }
}
