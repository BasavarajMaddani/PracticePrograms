import java.sql.SQLOutput;

public class Smallest_largest {
    public static void main(String[] args) {

        int[] A = {3, 4, 6, 9, 1, 100, 0, 6, 7, 78};

        int smaller = Smallofarray(A);
        int larger = Largeofarray(A);
        System.out.println("smaller " + smaller);
        System.out.println("larger " + larger);
    }


    public static int Smallofarray(int[] A) {
        int small = A[0];
        for (int num : A) {
            if (num < small) {
                small = num;
            }

           // System.out.println("Small " + small);

        }
        return small;
    }

        public static int Largeofarray (int[] A)
        {
            int Large = A[0];
            for (int num : A) {
                if (num > Large) {
                    Large = num;
                }

            }
           // System.out.println("Large " + Large);
            return Large;
        }
    }
