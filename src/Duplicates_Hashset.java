import java.util.HashSet;
public class Duplicates_Hashset {
    public static void main(String[] args) {
    int[] A = {1,2,3,4,5,6,6,1};
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for(int num :A )
    {
                if (!seen.add(num)) {
                    duplicates.add(num);
                }

    }
            System.out.println(duplicates);
}
}
