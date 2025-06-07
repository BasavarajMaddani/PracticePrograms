public class ReverseInteger {

    public static void main (String[] args)
    {
        int A = 123456;
        int reversed = reversenumber(A);
        System.out.println("reversed number is " + reversed);

    }

    public static int reversenumber(int A)
    {
        int reverse =0;
        int D;
        //for(int i =A.lenght();i>=0;i++) {
        while(A > 0)
        {
            D = A % 10;
            reverse = (reverse*10) + D;
            A = A / 10;

            // System.out.println(E);

        }
        System.out.println(reverse);
        return reverse;
    }


}
